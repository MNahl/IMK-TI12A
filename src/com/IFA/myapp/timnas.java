package com.IFA.myapp;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/**
 * Created by user on 18/05/2014.
 */
public class timnas extends Activity {

    @Override
    protected void onCreate(bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timnas);

        button butt1 = (butt1) findViewById(R.id.buttonu19);
        butt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(timnas.this, timnasu19.class);
                startActivity(i);
            }
        });

    }