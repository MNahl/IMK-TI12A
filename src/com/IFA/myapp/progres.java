package com.imk.RamaLampung;

import android.app.Activity;
import com.IFA.myapp.R;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ProgressBar;


public class progres extends Activity {
    ProgressBar pgr;
    int progress=0;
    Handler h=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progres);
        pgr=(ProgressBar)findViewById(R.id.progressBar1);
        new Thread(new Runnable() {

            @Override
            public void run() {
                // TODO Auto-generated method stub
                for (int i=0;i<10;i++)
                {
                    progress +=20;
                    h.post(new Runnable() {

                        @Override
                        public void run() {
                            // TODO Auto-generated method stub
                            pgr.setProgress(progress);
                            if (progress==pgr.getMax()){
                                //pgr.setVisibility(4);
                                Intent in=new Intent(getApplicationContext(),home.class);
                                startActivity(in);
                            }

                        }
                    });
                    try {
                        Thread.sleep(2000);

                    } catch (InterruptedException e) {
                        // TODO: handle exception
                    }
                }

            }
        }).start();



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.progres, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */


}
