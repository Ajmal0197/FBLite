package com.example.fblite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity
{
    private WebView facebook;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook= findViewById(R.id.fb_webview);

        WebSettings webSettings = facebook.getSettings();

        webSettings.setJavaScriptEnabled(true);

        facebook.loadUrl("https://m.facebook.com/");

        facebook.setWebViewClient(new WebViewClient());

    }

    @Override   //enable the back button
    public void onBackPressed()
    {

        if(facebook.canGoBack())
        {
            facebook.goBack();
        }
        else
        {
            super.onBackPressed();
        }
    }
}
