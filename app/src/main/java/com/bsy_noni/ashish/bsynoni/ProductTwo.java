package com.bsy_noni.ashish.bsynoni;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by 500039306 on 6/26/2016.
 */
public class ProductTwo extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_two);

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

        TextView description = (TextView) findViewById(R.id.fruit_description);
        description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent des = new Intent(ProductTwo.this, ProductTwo_description.class);
                startActivity(des);
            }
        });

        TextView usage = (TextView) findViewById(R.id.fruit_usage);
        usage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent use = new Intent(ProductTwo.this, ProductOne_usage.class);
                startActivity(use);
            }
        });


    }
}