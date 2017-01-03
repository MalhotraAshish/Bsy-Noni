package com.bsy_noni.ashish.bsynoni;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * Created by 500039306 on 6/26/2016.
 */
public class ProductOneFruit extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_two);
        TextView description = (TextView) findViewById(R.id.fruit_description);
        description.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent des = new Intent(ProductOneFruit.this, ProductTwo_description.class);
                startActivity(des);
            }
        });

        TextView usage = (TextView) findViewById(R.id.fruit_usage);
        usage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent use = new Intent(ProductOneFruit.this, ProductTwo_usage.class);
                startActivity(use);
            }
        });


    }
}
