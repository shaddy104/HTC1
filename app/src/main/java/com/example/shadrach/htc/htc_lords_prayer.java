package com.example.shadrach.htc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class htc_lords_prayer extends Activity {
    
    int day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_htc_lords_prayer);
    }

    public void OnClickAtTheHome(View view){
        startActivity(new Intent(htc_lords_prayer.this, BurialAtHome.class));
    }

    public void OnClickBurialHymn(View view){
        startActivity(new Intent(htc_lords_prayer.this, BurialHymns.class));
    }

    public void OnClickAtTheChurch(View view){
        startActivity(new Intent(htc_lords_prayer.this, BurialAtChurch.class));
    }

    public void OnClickAtTheCemetry(View view){
        startActivity(new Intent(htc_lords_prayer.this,BurialAtCemetry.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_htc_lords_prayer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}
