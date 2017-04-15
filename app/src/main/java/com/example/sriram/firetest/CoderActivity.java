package com.example.sriram.firetest;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class CoderActivity extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final Activity sActivity = this;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coder);
        webview = (WebView) findViewById(R.id.webView2);
        //webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://sriram23.github.io/CoderDojoTN");
        webview.setWebChromeClient(new WebChromeClient()
        {
            public void onProgressChanged(WebView view, int progress)
            {
                //Make the bar disappear after URL is loaded, and changes string to Loading...
                sActivity.setTitle(R.string.loading);
                sActivity.setProgress(progress * 100); //Make the bar disappear after URL is loaded

                // Return the app name after finish loading
                if(progress == 100)
                {
                    sActivity.setTitle(R.string.club_cdc);
                }
            }
        });
    }
}
