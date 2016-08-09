package com.example.krishna.shoppinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /*
        setContentView(R.layout.activity_home);
        LinearLayout MyList = (LinearLayout) findViewById(R.id.MyList);

        MyList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this,Shoplist.class);
                startActivity(intent);

                EditText editText= (EditText)findViewById(R.id.edit_query);
                name[i]=editText.getText().toString();
                //editText.addTextChangedListener(new );
//                editText.addTextChangedListener(new );
                i++;
                ListView listView = (ListView)findViewById(R.id.list);
                MyAdapter adapter=new MyAdapter(getApplicationContext(),name , qty ,price );
                listView.setAdapter(adapter);
            }
        });*/
    }
}
