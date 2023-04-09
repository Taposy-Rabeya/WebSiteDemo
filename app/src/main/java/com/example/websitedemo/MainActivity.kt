package com.example.websitedemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    private val webView: WebView? = null

    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.webView)
        webView.webViewClient = WebViewClient()
        webView.loadUrl("https://www.addressbazar.com/book-stationery/library/area/Uttara")
        val webSettings = webView.settings
        webSettings.javaScriptEnabled = true

    }

    @Deprecated("Deprecated in Java")
    override fun onBackPressed() {
        if (webView!!.canGoBack()) {
            webView.goBack()
        } else {
            super.onBackPressed()
        }
    }
}
