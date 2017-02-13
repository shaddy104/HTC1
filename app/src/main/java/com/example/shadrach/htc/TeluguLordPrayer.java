package com.example.shadrach.htc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TeluguLordPrayer extends AppCompatActivity {
    TextView prayerTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telugu_lord_prayer);
        prayerTxt = (TextView)findViewById(R.id.textView214);

        prayerTxt.append("పరలోకమందున్న మా తండ్రీ, నీ నామము పరిశుద్ధపరచబడునుగాక,\n" +
                "నీ రాజ్యము వచ్చునుగాక, నీ చిత్తము పరలోకమందు నెరవేరుచున్నట్లు భూమియందును నెరవేరును గాక,\n" +
                "మా అనుదినాహారము నేడు మాకు దయచేయుము.\n" +
                "మా యెడల అపరాధములు చేసినవారిని మేము క్షమించియున్న ప్రకారము మా అపరాధములు క్షమించుము.\n" +
                "మమ్మును శోధనలోకి తేక కీడు నుండి మమ్మును తప్పించుము.\n" +
                "రాజ్యము, శక్తియు, మహిమయు నిరంతరము నీవైయున్నవి.\n" +
                "ఆమేన్.");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_telugu_lord_prayer, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
