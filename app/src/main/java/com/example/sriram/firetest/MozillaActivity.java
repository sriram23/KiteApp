package com.example.sriram.firetest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class MozillaActivity extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Activity mActivity = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mozilla);
        webview = (WebView) findViewById(R.id.webView1);
        //webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://mozillatn.github.io/KiTE");
        webview.setWebChromeClient(new WebChromeClient()
        {
            public void onProgressChanged(WebView view, int progress)
            {
                //Make the bar disappear after URL is loaded, and changes string to Loading...
                mActivity.setTitle(R.string.loading);
                mActivity.setProgress(progress * 100); //Make the bar disappear after URL is loaded

                // Return the app name after finish loading
                if(progress == 100)
                {
                    mActivity.setTitle(R.string.club_moz);
                }
            }
        });
    }
}
