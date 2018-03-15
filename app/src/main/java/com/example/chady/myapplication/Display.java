package com.example.chady.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


/**
 * Created by Chady on 3/12/2018.
 */

public class Display extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.display);

        String username = getIntent().getStringExtra("Username");

        TextView tv = (TextView)findViewById(R.id.TVusername);

        tv.setText(username);
    }

}
