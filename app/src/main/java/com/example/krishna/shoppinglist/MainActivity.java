package com.example.krishna.shoppinglist;

import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String[] name={"","first","second","third"};
    //String[] name= new String[4];
    int[] price={0,200,10,500};
    int[] qty={0,1,2,1};
    int i=0;
    TextView dots[] = new TextView[5];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intron);

        initDots();
        initPager();
    }

    private void initPager() {
        ViewPager pager = (ViewPager) findViewById(R.id.mypager);
        MyPagerAdapter madapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(madapter);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<5;i++)
                {
                    dots[i].setTextColor(Color.WHITE);
                }
                dots[position].setTextColor(Color.BLACK);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initDots() {         // Initialise Dots
        dots[0] = (TextView) findViewById(R.id.dot1);
        dots[1] = (TextView) findViewById(R.id.dot2);
        dots[2] = (TextView) findViewById(R.id.dot3);
        dots[3] = (TextView) findViewById(R.id.dot4);
        dots[4] = (TextView) findViewById(R.id.dot5);


    }


}
