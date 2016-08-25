package com.example.krishna.shoppinglist;

import android.content.Intent;
import android.graphics.Color;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView dots[] = new TextView[5];
    TextView next,skip;
    ViewPager pager;

   /* public void setCurrentItem (int item, boolean smoothScroll) {
        pager.setCurrentItem(item, smoothScroll);
    }*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_intron);

        initDots();
        initPager();
    }

    private void initPager() {
        pager = (ViewPager) findViewById(R.id.mypager);
        MyPagerAdapter madapter = new MyPagerAdapter(getSupportFragmentManager());
        pager.setAdapter(madapter);




        next = (TextView) findViewById(R.id.next);
        skip = (TextView) findViewById(R.id.skip);

        pager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i=0;i<5;i++)
                {
                    dots[i].setTextColor(Color.parseColor("#9f1313"));
                }
                dots[position].setTextColor(Color.parseColor("#FFE7CA"));
                if(position==4){
                    next.setText("Done");

                }
                else {
                    next.setText("Next");
                }

                next.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Log.d("abc","" + pager.getCurrentItem());
                        if(pager.getCurrentItem()<4) {

                            pager.setCurrentItem(pager.getCurrentItem() + 1);
                        }
                        if(pager.getCurrentItem()==4){
                            Intent i = new Intent(MainActivity.this, Home.class);
                            startActivity(i);
                            finish();
                        }
                    }
                });
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }

        });



        skip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //setContentView(R.layout.activity_home);
                Intent i = new Intent(MainActivity.this,Home.class);
                startActivity(i);
                finish();
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
