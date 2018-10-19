package govind.iiita.app.Labels;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import govind.iiita.app.R;

public class Registration_IIITA extends AppCompatActivity {

    WebView myWebView;
    String URL ="https://apply.iiita.ac.in/unified_login/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration__iiita);

        myWebView = findViewById(R.id.webviewRegistration_IIITA);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl(URL);
        myWebView.setWebViewClient(new WebViewClient());
    }
}
