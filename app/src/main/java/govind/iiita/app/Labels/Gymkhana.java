package govind.iiita.app.Labels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import govind.iiita.app.R;

public class Gymkhana extends AppCompatActivity {
    WebView myWebView;
    String URL ="https://gymkhana.iiita.ac.in/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gymkhana);

        myWebView = (WebView)findViewById(R.id.webviewGymkhana);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl(URL);
        myWebView.setWebViewClient(new WebViewClient());
    }
}
