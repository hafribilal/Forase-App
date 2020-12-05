package ma.forase.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    WebView wv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // hide header bar
        getSupportActionBar().hide();
        wv = findViewById(R.id.mainWebView);
        WebSettings ws= wv.getSettings();
        ws.setJavaScriptEnabled(true);
        wv.loadUrl(getString(R.string.url));
        wv.setWebViewClient(new WebViewClient());
        //show the activity in full screen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    @Override
    public void onBackPressed() {
        if (wv.canGoBack()){
            wv.goBack();
        }else{
            super.onBackPressed();
        }
    }
}
