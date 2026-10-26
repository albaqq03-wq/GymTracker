package com.dani.gymtracker;

import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        WebView webView = new WebView(this);
        setContentView(webView);

        WebSettings webSettings = webView.getSettings();
        // Habilitar JavaScript
        webSettings.setJavaScriptEnabled(true);
        // Habilitar LocalStorage
        webSettings.setDomStorageEnabled(true);
        // Habilitar base de datos para asegurar persistencia
        webSettings.setDatabaseEnabled(true);
        // Permitir acceso a archivos locales
        webSettings.setAllowFileAccess(true);
        
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        
        // Cargar nuestra interfaz HTML definitiva
        webView.loadUrl("file:///android_asset/index.html");
    }
}
