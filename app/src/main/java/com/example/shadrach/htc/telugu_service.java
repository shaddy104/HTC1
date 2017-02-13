package com.example.shadrach.htc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Calendar;

public class telugu_service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telugu_service);
    }

    public void OnClickTeluguNiceenCreed(View view){
        startActivity(new Intent(telugu_service.this, TeluguNiceneCreed.class));
    }

    public void OnClickTeluguApostlesCreed(View view){
        startActivity(new Intent(telugu_service.this, TeluguApostlesCreed.class));
    }

    public void OnClickTeluguLordPrayer(View view){
        startActivity(new Intent(telugu_service.this,TeluguLordPrayer.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_telugu_service, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        Calendar ser_cal = Calendar.getInstance();


        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        //noinspection SimplifiableIfStatement

        return super.onOptionsItemSelected(item);
    }
}
