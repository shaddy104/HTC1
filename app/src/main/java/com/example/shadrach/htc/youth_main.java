package com.example.shadrach.htc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class youth_main extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_youth_main);

        final ImageView yl_iv = (ImageView)findViewById(R.id.imageView2);
        final Animation y_an3 = AnimationUtils.loadAnimation(getBaseContext(), R.anim.rotate);

        yl_iv.startAnimation(y_an3);

        y_an3.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        }

    public void OnClickAddContact(View view){
        startActivity(new Intent(youth_main.this, add_member_youth.class));
    }

    public void OnClickBibleYouth(View view){
        startActivity(new Intent(youth_main.this,youth_biblereads.class));
    }

    public void OnClickBirthday(View view){
        startActivity(new Intent(youth_main.this,birthday_youth.class));
    }

    public void OnClickMusic(View view){
        startActivity(new Intent(youth_main.this,music_youth.class));
    }

    public void OnClickViewAll(View view){
        startActivity(new Intent(youth_main.this,youth_members.class));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_youth_main, menu);
        return true;
    }


}
