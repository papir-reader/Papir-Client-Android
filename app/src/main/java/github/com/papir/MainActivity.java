package github.com.papir;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

import github.com.papir.R;

public class MainActivity extends Activity {

    private WebView wbMain;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wbMain = (WebView) findViewById(R.id.webViewMain);
        wbMain.loadUrl("file:///android_asset/index.html");
        wbMain.getSettings().setJavaScriptEnabled(true);
        wbMain.getSettings().setAllowFileAccessFromFileURLs(true);
        wbMain.getSettings().setAllowUniversalAccessFromFileURLs(true);
        wbMain.getSettings().setDomStorageEnabled(true);

    }

    @Override
    public void onBackPressed() {

        if (wbMain.canGoBack()) {
            wbMain.goBack();
        } else {
            super.onBackPressed();
        }

    }


}
