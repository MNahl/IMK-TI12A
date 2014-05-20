package com.IFA.myapp;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

/**
 * Created by user on 18/05/2014.
 */
public class liga_indonesia extends Activity {

    @Override
    protected void onCreate(bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.liga_indonesia);

        button butt1 = (butt1) findViewById(R.id.buttonhome);
        butt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(liga_indonesia.this, home.class);
                startActivity(i);
            }
        });
        button butt2 = (butt2) findViewById(R.id.buttonkli);
        butt1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(liga_indonesia.this, klasemen.class);
                startActivity(i);
            }
        });
    }
}
{
        } {
}
