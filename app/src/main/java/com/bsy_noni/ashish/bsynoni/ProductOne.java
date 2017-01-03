package com.bsy_noni.ashish.bsynoni;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 500039306 on 6/21/2016.
 */
public class ProductOne extends AppCompatActivity {
     /**
     * Created by 500039306 on 6/26/2016.
     */
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.product_one);

            Button buy = (Button)findViewById(R.id.buy_now);
            buy.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent();
                    intent.setAction(Intent.ACTION_VIEW);
                    intent.addCategory(Intent.CATEGORY_BROWSABLE);
                    intent.setData(Uri.parse("http://www.priisindia.com/product-details/MQ%3D%3D/BSY-Noni-Black-Hair-Magic-20-mL#priis"));
                    startActivity(intent);
                }
            });

            TextView description = (TextView) findViewById(R.id.product_description);
            description.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent des = new Intent(ProductOne.this, ProductOne_description.class);
                    startActivity(des);
                }
            });

            TextView usage = (TextView) findViewById(R.id.product_usage);
            usage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent use = new Intent(ProductOne.this, ProductOne_usage.class);
                    startActivity(use);
                }
            });

            TextView advantage = (TextView) findViewById(R.id.product_advantage);
            advantage.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent adv = new Intent(ProductOne.this, ProductOne_advantage.class);
                    startActivity(adv);
                }
            });

            TextView ingredients = (TextView)findViewById(R.id.product_ingredients);
            ingredients.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent ing = new Intent(ProductOne.this, ProductOne_ingredients.class);
                    startActivity(ing);
                }
            });

            TextView faq = (TextView)findViewById(R.id.product_faq);
            faq.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent FAQ = new Intent(ProductOne.this, ProductOne_faq.class);
                    startActivity(FAQ);
                }
            });
        }
    }

