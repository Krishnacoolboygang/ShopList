package com.example.krishna.shoppinglist;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class Frag extends Fragment {

    private int Position;


    int[] image = {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5};
    ImageView img;
    TextView caption;//= new TextView(getActivity());
    String[] captn = {"SHOPPING TIME!","Never Forget Anything","Easy to Organise","All at your fingertips!","Everything at one place"};
    //String[] TxtSize = {"25dp","25dp","25dp","25dp","25dp"};
    String[] TxtColor = {"#FF040C","#ffdede","#d3e7ff","#ffe8d3","#fdc17d"};


    public Frag(int position) {
        // Required empty public constructor
        Position = position;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.frag, container, false);
        init(v);
        img.setImageResource(image[Position]);
        caption.setText(captn[Position]);
        //caption.setTextSize(Float.parseFloat(TxtSize[Position]));
        //TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 10, getResources().getDisplayMetrics())
        caption.setTextColor(Color.parseColor(TxtColor[Position]));

       /*switch (Position){
            case 0:
                caption.setTextSize(Float.parseFloat("25dp"));
                break;
            case 1:
                caption.setTextColor(Color.parseColor("#ffdede"));
                caption.setTextSize(Float.parseFloat("25dp"));

                break;

            case 2:
                caption

                break;

            case 3:

                break;

            case 4:

                break;
        }*/


        return v;

    }

    void init(View v){
        img = (ImageView) v.findViewById(R.id.Bimage);
        caption = (TextView)v.findViewById(R.id.Caption);
    }


}
