package govind.iiita.app.Labels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import govind.iiita.app.R;

public class Geekhaven extends AppCompatActivity {

    WebView myWebView;
    String URL ="https://geekhaven.iiita.ac.in/";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_geekhaven);

        myWebView = (WebView)findViewById(R.id.webviewGeekhaven);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl(URL);
        myWebView.setWebViewClient(new WebViewClient());

    }
}
