package com.example.shadrach.htc;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;


public class youth_log_in extends Activity {

    ImageView image_main,image_1,image_2,image_3;
    EditText y_login;
    EditText y_password;
    int count=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_youth_log_in);

        image_main = (ImageView)findViewById(R.id.imageView4);
        image_1 = (ImageView)findViewById(R.id.imageView5);
        image_2 = (ImageView)findViewById(R.id.imageView6);
        image_3 = (ImageView)findViewById(R.id.imageView7);

        image_main.setImageResource(R.drawable.youth_htc);
        image_1.setImageResource(R.drawable.youth_htc11);
        image_2.setImageResource(R.drawable.youth_7);
        image_3.setImageResource(R.drawable.youth_htc12);

        Toast.makeText(youth_log_in.this,"We are glad to invite you to join us for youth fellowship\npress login to know more",Toast.LENGTH_LONG).show();

    }

    public void OnClickJoinUs(View view){
        startActivity(new Intent(youth_log_in.this,youth_leader.class));
    }

    public void OnClickYouthLogInListener(View view){

        y_login = (EditText)findViewById(R.id.editText8);
        y_password=(EditText)findViewById(R.id.editText9);

        if(y_login.getText().toString().equals("")&&y_password.getText().toString().equals("")){
            Intent intent = new Intent(youth_log_in.this,youth_main.class);
            startActivity(intent);
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_youth_log_in, menu);
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
