package com.bsy_noni.ashish.bsynoni;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

/**
 * Created by 500039306 on 7/19/2016.
 */
public class BuyOne extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buy_one);

        WebView wv = (WebView) findViewById(R.id.webView);
       // wv.setWebViewClient(new MyBrowser());
        wv.loadUrl("http://www.priisindia.com/product-details/MQ%3D%3D/BSY-Noni-Black-Hair-Magic-20-mL#priis");
        reload();
    }

    /*private class MyBrowser extends WebViewClient{
        @Override
        public boolean shouldOverrideUrlLoading( WebView view, String url){
            url = "http://www.priisindia.com/product-details/MQ%3D%3D/BSY-Noni-Black-Hair-Magic-20-mL#priis";
            view.loadUrl(url);
            return true;
        }
    }*/

    public void reload() {
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Do something after 5s = 5000ms
                WebView wv = (WebView) findViewById(R.id.webView);
                // wv.setWebViewClient(new MyBrowser());
                wv.loadUrl("http://www.priisindia.com/product-details/MQ%3D%3D/BSY-Noni-Black-Hair-Magic-20-mL#priis");
                reload();
                // mWebview.loadUrl("http://www.google.com");
            }
        }, 5000);
    }

}
