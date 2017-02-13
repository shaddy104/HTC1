package com.example.shadrach.htc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class EnglishService extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_service);
    }


    public void OnClickThePreparationListener(View view){
        startActivity(new Intent(EnglishService.this, EnglishThePreparation.class));
    }

    public void OnClickTenCommandmentsListener(View view){
        startActivity(new Intent(EnglishService.this, the_ten_commandments.class));
    }

    public void OnClickTheLawAndTheProphetsListener(View view){
        startActivity(new Intent(EnglishService.this,the_law_and_the_prophets.class));
    }

    public void OnClickWordOfGodListener(View view){
        startActivity(new Intent(EnglishService.this,word_of_god.class));
    }

    public void OnClickTheNiceneCreed(View view){
        startActivity(new Intent(EnglishService.this,The_Nicene_creed.class));
    }

    public void OnClickTheApostlesCreedListener(View view){
        startActivity(new Intent(EnglishService.this,the_apostles_creed.class));
    }

    public void OnClickIntercessaryPrayersListener(View view){
        startActivity(new Intent(EnglishService.this,intercesssary_prayers.class));
    }

    public void OnClickSecondLitanyListener(View view){
        startActivity(new Intent(EnglishService.this,the_second_litany.class));
    }

    public void OnClickAnExhortationListener(View view){
        startActivity(new Intent(EnglishService.this,an_exhortation.class));
    }

    public void OnClickTheBreakingOfTheBreadListener(View view){
        startActivity(new Intent(EnglishService.this,the_breaking_of_the_bread.class));
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_english, menu);
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
