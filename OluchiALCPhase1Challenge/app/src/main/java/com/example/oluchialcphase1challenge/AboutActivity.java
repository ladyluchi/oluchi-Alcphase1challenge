package com.example.oluchialcphase1challenge;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("About ALC");
        actionBar.setDisplayHomeAsUpEnabled(true);
        WebView wvAbout = findViewById(R.id.wvAbout);

        wvAbout.getSettings().setBuiltInZoomControls(true);
        wvAbout.getSettings().setDisplayZoomControls(false);
        wvAbout.getSettings().setUseWideViewPort(true);
        wvAbout.getSettings().setDomStorageEnabled(true);
        wvAbout.getSettings().setPluginState(WebSettings.PluginState.ON);
        wvAbout.getSettings().setJavaScriptEnabled(true);
        wvAbout.getSettings().setSupportMultipleWindows(true);

        wvAbout.loadUrl(getResources().getString(R.string.andela_url));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        finish();
        return true;
    }
}
