package com.example.krishna.shoppinglist;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by Krishna on 03-08-2016.
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyAdapter extends ArrayAdapter<String> {
    private final Context context;
    private String[] name;
    private  int[] price;
    private  int[] qty;
    int i=0;
    //private  int  [] images = {R.drawable.profile,R.drawable.profile};

    public MyAdapter(Context context1, String[] name, int[] qty, int[] price) {
        super(context1, R.layout.list_item, name);
        this.context = context1;
        this.name = name;
        this.price=price;
        this.qty=qty;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if(position==0) {

            View rowView = inflater.inflate(R.layout.list_head, parent, false);
            //ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
            /*TextView textView1 = (TextView) rowView.findViewById(R.id.name);
            TextView textView2 = (TextView) rowView.findViewById(R.id.qty);
            TextView textView3 = (TextView) rowView.findViewById(R.id.price);
            textView1.setText(name[position]);
            textView2.setText("" + qty[position]);
            textView3.setText("" + price[position]);*/
            //imageView.setImageResource(R.drawable.profile);

            return rowView;
        }
        else{
            View rowView = inflater.inflate(R.layout.list_item, parent, false);
            //ImageView imageView = (ImageView) rowView.findViewById(R.id.image);
            TextView textView1 = (TextView) rowView.findViewById(R.id.name);
            TextView textView2 = (TextView) rowView.findViewById(R.id.qty);
            TextView textView3 = (TextView) rowView.findViewById(R.id.price);
            textView1.setText(name[position]);
            textView2.setText("" + qty[position]);
            textView3.setText("" + price[position]);
            //imageView.setImageResource(R.drawable.profile);

            return rowView;

        }
    }
}