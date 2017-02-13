package com.example.shadrach.htc;

import android.app.Activity;
import android.app.AlertDialog;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class youth_members extends Activity {

    TextView textView_insert;
    DatabaseHelper myDb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        setContentView(R.layout.activity_youth_members);


        textView_insert = (TextView)findViewById(R.id.textView166);
        myDb = new DatabaseHelper(this);

        Cursor res = myDb.getAllData();
        if (res.getCount()==0){
            showMessage("Error","Nothing found");
            return;
        }

        while (res.moveToNext()){
            textView_insert.append("ID :"+res.getString(0)+"\n");
            textView_insert.append("NAME :"+res.getString(1)+"\n");
            textView_insert.append("Ph.No :"+res.getString(2)+"\n"+"\n");
        }
    }

    public void showMessage(String title,String Message){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);

        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_youth_members, menu);
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
