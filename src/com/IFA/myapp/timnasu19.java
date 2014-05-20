package com.IFA.myapp;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/**
 * Created by user on 18/05/2014.
 */
public class timnasu19 extends Activity {

    @Override
    protected void onCreate(bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.timnasu19);

        button butt1 = (butt1) findViewById(R.id.buttonhome);
        butt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(timnasu19.this, home.class);
                startActivity(i);
            }
        });
        button butt2 = (butt2) findViewById(R.id.buttontimnas);
        butt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(timnasu19.this, timnas.class);
                startActivity(i);
            }
        });
        button butt3 = (butt3) findViewById(R.id.buttonformasi);
        butt3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(timnasu19.this, profilu19.class);
                startActivity(i);
            }
        });
    }