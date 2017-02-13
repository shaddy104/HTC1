package com.example.shadrach.htc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class YouthSplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_youth_splash);

        final ImageView y_iv = (ImageView)findViewById(R.id.imageView);
        final Animation y_an = AnimationUtils.loadAnimation(getBaseContext(),R.anim.rotate);
        final Animation y_an2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.abc_fade_out);

        y_iv.startAnimation(y_an);

        y_an.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                y_iv.startAnimation(y_an2);
                finish();
                Intent i = new Intent(getBaseContext(),youth_log_in.class);
                startActivity(i);

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
    }


}
