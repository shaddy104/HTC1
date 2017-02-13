package com.example.shadrach.htc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Sunday_Service extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday__service);
    }

    public void OnClickEnglishServiceListener(View view){
        startActivity(new Intent(Sunday_Service.this, EnglishService.class));
    }

    public void OnClickPastorateCommitteeListener(View view){
        startActivity(new Intent(Sunday_Service.this,logInPastorateComite.class));
    }

    public void OnClickThemeListener(View view){
        startActivity(new Intent(Sunday_Service.this,sunday_theme.class));
    }

    public void OnClickTeluguSevice(View view){
        startActivity(new Intent(Sunday_Service.this,telugu_service.class));
    }

    public void OnClickChurchHistory(View view){
        startActivity(new Intent(Sunday_Service.this,church_history.class));
    }

    public void OnClickYouthListener(View view){
        startActivity(new Intent(Sunday_Service.this,YouthSplashActivity.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sunday_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement

        if(id == R.id.other_services_button){
            Intent intent = new Intent(Sunday_Service.this,MainActivity.class);
            startActivity(intent);
        }

        if(id == R.id.sunday_school_button){
            Intent intent = new Intent(Sunday_Service.this,Special_events.class);
            startActivity(intent);
        }

        if(id == R.id.DeveloperBlog_button){
            Intent intent = new Intent(Sunday_Service.this,developers_blog.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }
}
