package com.example.krishna.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class Shoplist extends AppCompatActivity {

    //String[] name={"","first","second","third"};
    String[] name= new String[4];
    int[] price={0,200,10,500};
    int[] qty={0,1,2,1};
    int i=0;
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shoplist);

        editText= (EditText)findViewById(R.id.edit_query);
        /*
        editText.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getKeyCode() == KeyEvent.KEYCODE_ENTER) {
                    // intercept the return key
                    name[i]=editText.getText().toString();
                    return true;
                }
                return false;
            }
        });
*/

        //editText.addTextChangedListener(new );
//                editText.addTextChangedListener(new );

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name[i]=editText.getText().toString();
                editText.setText("");
                i++;
            }
        });
        //i++;
        ListView listView = (ListView)findViewById(R.id.list);
        MyAdapter adapter=new MyAdapter(getApplicationContext(),name , qty ,price );
        listView.setAdapter(adapter);
    }
}
