package com.example.krishna.shoppinglist;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


public class OnBoardingFragment extends Fragment {

    private int Position;


    int[] image = {R.drawable.f1,R.drawable.f2,R.drawable.f3,R.drawable.f4,R.drawable.f5};
    ImageView img = new ImageView(getActivity());
    TextView caption = new TextView(getActivity());
    String[] captn = {"SHOPPING TIME!","Never Forget Anything","Easy to Organise","All at your fingertips!","Everything at one place"};
    public OnBoardingFragment(int position) {
        // Required empty public constructor
        Position = position;
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.onboarding_fragment, container, false);
        init(v);
        img.setImageResource(image[Position]);
        caption.setText(captn[Position]);


        return v;

    }

    void init(View v){
        img = (ImageView) v.findViewById(R.id.background);
        caption = (TextView)v.findViewById(R.id.Caption);
    }


}
