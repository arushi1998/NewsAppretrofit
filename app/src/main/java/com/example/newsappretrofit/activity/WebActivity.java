package com.example.newsappretrofit.activity;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.newsappretrofit.R;

public class WebActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        final String url = getIntent().getStringExtra("url");

        WebView webView = findViewById(R.id.activity_web_wv);
        webView.loadUrl(url);
    }
}
