package com.bsy_noni.ashish.bsynoni;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private Timer scrollTimer = null;
    private TimerTask scrollerSchedule;
    private int scrollPos = 0;
    private HorizontalScrollView horizontalScrollView;
    private int scrollMax;
    private LinearLayout horizontalOuterLayout;

    private Timer scrollTimer_fruit = null;
    private TimerTask scrollerSchedule_fruit;
    private int scrollPos_fruit = 0;
    private HorizontalScrollView horizontalScrollView_fruit;
    private int scrollMax_fruit;
    private LinearLayout horizontalOuterLayout_fruit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView contact_us = (TextView) findViewById(R.id.contact_us);
        contact_us.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(MainActivity.this, Contact.class);
                startActivity(contact);
            }
        });

        TextView product_one = (TextView) findViewById(R.id.more);
        product_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hair = new Intent(MainActivity.this, ProductOne_description.class);
                startActivity(hair);
            }
        });

        TextView product_two = (TextView) findViewById(R.id.more1);
        product_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent fruit = new Intent(MainActivity.this,ProductTwo_description.class);
                startActivity(fruit);
            }
        });



        TextView productone = (TextView) findViewById(R.id.product1_text);
        productone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent one = new Intent(MainActivity.this, ProductOne.class);
                startActivity(one);
            }
        });

        TextView producttwo = (TextView) findViewById(R.id.product2_text);
        producttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent two = new Intent(MainActivity.this, ProductOneFruit.class);
                startActivity(two);
            }
        });

        Button business = (Button)findViewById(R.id.coursetype1);
        business.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bpo = new Intent(MainActivity.this, BussinessOpporntunity.class);
                startActivity(bpo);
            }
        });

        Button distributor = (Button)findViewById(R.id.coursetype2);
        distributor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dt = new Intent(MainActivity.this, DistributorTalk.class);
                startActivity(dt);
            }
        });

        Button about = (Button)findViewById(R.id.coursetype3);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent au = new Intent(MainActivity.this, AboutUs.class);
                startActivity(au);
            }
        });


        horizontalScrollView = (HorizontalScrollView) findViewById(R.id.hsv1);
        horizontalOuterLayout = (LinearLayout) findViewById(R.id.innerLay1);

        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        ViewTreeObserver vto = horizontalOuterLayout.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                horizontalScrollView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                getScrollMaxAmount();
                startAutoScrolling();
            }
        });

        horizontalScrollView_fruit = (HorizontalScrollView) findViewById(R.id.hsv2);
        horizontalOuterLayout_fruit = (LinearLayout) findViewById(R.id.innerLay2);

        horizontalScrollView_fruit.setHorizontalScrollBarEnabled(false);
        ViewTreeObserver vto1 = horizontalOuterLayout_fruit.getViewTreeObserver();
        vto1.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                horizontalScrollView_fruit.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                getScrollMaxAmount_fruit();
                startAutoScrolling_fruit();
            }
        });
    }

    public void getScrollMaxAmount() {
        int actualWidth = (horizontalOuterLayout.getMeasuredWidth() - 512);
        scrollMax = actualWidth;
    }

    public void startAutoScrolling() {
        if (scrollTimer == null) {
            scrollTimer = new Timer();
            final Runnable Timer_Tick = new Runnable() {
                @Override
                public void run() {
                    moveScrollView();
                }
            };
            if (scrollerSchedule != null) {
                scrollerSchedule.cancel();
                scrollerSchedule = null;
            }
            scrollerSchedule = new TimerTask() {
                @Override
                public void run() {
                    runOnUiThread(Timer_Tick);
                }
            };
            scrollTimer.schedule(scrollerSchedule, 30, 30);
        }
    }

    public void moveScrollView() {
        scrollPos = (int) (horizontalScrollView.getScrollX() + 1.0);
        if (scrollPos >= scrollMax) {
            scrollPos = 0;
        }

        horizontalScrollView.scrollTo(scrollPos, 0);
    }

    public void getScrollMaxAmount_fruit() {
        int actualWidth = (horizontalOuterLayout_fruit.getMeasuredWidth() - 512);
        scrollMax_fruit = actualWidth;
    }

    public void startAutoScrolling_fruit() {
        if (scrollTimer_fruit == null) {
            scrollTimer_fruit = new Timer();
            final Runnable Timer_Tick = new Runnable() {
                @Override
                public void run() {
                    moveScrollView_fruit();
                }
            };
            if (scrollerSchedule_fruit != null) {
                scrollerSchedule_fruit.cancel();
                scrollerSchedule_fruit = null;
            }
            scrollerSchedule_fruit = new TimerTask() {
                @Override
                public void run() {
                    runOnUiThread(Timer_Tick);
                }
            };
            scrollTimer_fruit.schedule(scrollerSchedule_fruit, 30, 30);
        }
    }

    public void moveScrollView_fruit() {
        scrollPos_fruit = (int) (horizontalScrollView_fruit.getScrollX() + 1.0);
        if (scrollPos_fruit >= scrollMax_fruit) {
            scrollPos_fruit = 0;
        }

        horizontalScrollView_fruit.scrollTo(scrollPos_fruit, 0);
    }


}


