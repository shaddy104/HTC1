package com.example.shadrach.htc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class EnglishThePreparation extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_the_preparation);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_english_the_preparation, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        if  (id == R.id.tencommandments)    {
            Intent intent = new Intent(EnglishThePreparation.this,the_ten_commandments.class);
            startActivity(intent);
        }

        if (id == R.id.theLaw)  {
            Intent intent = new Intent(EnglishThePreparation.this,the_law_and_the_prophets.class);
            startActivity(intent);
        }

        if(id==R.id.wordofgod){
            Intent intent = new Intent(EnglishThePreparation.this,word_of_god.class);
            startActivity(intent);
        }

        if(id==R.id.thenicenecreed){
            Intent intent = new Intent(EnglishThePreparation.this,The_Nicene_creed.class);
            startActivity(intent);

        }
        if(id==R.id.theapostlescreed){
            Intent intent = new Intent(EnglishThePreparation.this,the_apostles_creed.class);
            startActivity(intent);

        }
        if(id==R.id.intercessaryprayers){
            Intent intent = new Intent(EnglishThePreparation.this,intercesssary_prayers.class);
            startActivity(intent);

        }
        if(id==R.id.thesecondlitany){
            Intent intent = new Intent(EnglishThePreparation.this,the_second_litany.class);
            startActivity(intent);

        }
        if(id==R.id.anexhortation){
            Intent intent = new Intent(EnglishThePreparation.this,an_exhortation.class);
            startActivity(intent);

        }
        if(id==R.id.thebreakingofthebread){
            Intent intent = new Intent(EnglishThePreparation.this,the_breaking_of_the_bread.class);
            startActivity(intent);

        }

        return super.onOptionsItemSelected(item);
    }
}
