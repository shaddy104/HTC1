package com.example.shadrach.htc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class holy_trinity_church extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_holy_trinity_church);
        Thread displaySplash = new Thread(){
            public void run(){
                try {
                    sleep(5 * 1000);
                    Intent intent = new Intent(getBaseContext(),Sunday_Service.class);
                    startActivity(intent);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                finally {
                    //kill the app
                    finish();
                }
            }
        };

        displaySplash.start();
    }


}
