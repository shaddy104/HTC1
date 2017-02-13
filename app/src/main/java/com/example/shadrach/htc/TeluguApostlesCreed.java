package com.example.shadrach.htc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TeluguApostlesCreed extends AppCompatActivity {
    TextView apostxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telugu_apostles_creed);
        apostxt = (TextView)findViewById(R.id.textView213);

        apostxt.append("Apostles Creed – విశ్వాస సంగ్రహము\n" +
                "పరలోకమును, భూలోకమును సృష్టించిన\n" +
                "సర్వశక్తిగల పితయైన సర్వేశ్వరుని విశ్వసించుచున్నాను.\n" +
                "అతని యొక్క ఏకసుతుడును మన యొక్క నాధుడునైన\n" +
                "యేసు క్రీస్తును విశ్వసించుచున్నాను.\n" +
                "ఇతడు పవిత్రాత్మ వలన గర్భవతి అయిన కన్య మరియమ్మ నుండి పుట్టెను.\n" +
                "పో౦స్యు పిలాతుని అధికారమునకు లోనై, పాటుబడి, స్లీవ మీద\n" +
                "కొట్టబడి, మరణము పొంది, సమాధిలో ఉ౦చబడెను.\n" +
                "పాతాళమునకు దిగి, మూడవనాడు చనిపోయిన వారలలో నుండి లేచెను.\n" +
                "పరలోకమునకు ఎక్కి సర్వశక్తిగల పితయైన\n" +
                "సర్వేశ్వరుని కుడిప్రక్కన కూర్చొని ఉన్నాడు.\n" +
                "అక్కడనుండి జీవించువారలకును, చనిపోయినవారలకును\n" +
                "తీర్పు చేయుటకు వచ్చును.\n" +
                "పవిత్రాత్మను విశ్వసించుచున్నాను.\n" +
                "పరిశుద్ధ కతోలిక సభను, పునీతుల సంబంధ ప్రయోజనమును\n" +
                "విశ్వసించుచున్నాను.\n" +
                "పాపముల మన్నింపును విశ్వసించుచున్నాను.\n" +
                "శరీరము యొక్క ఉత్ధానమును విశ్వసించుచున్నాను.\n" +
                "నిత్య జీవమును విశ్వసించుచున్నాను. ఆమెన్.\n");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_telugu_apostles_creed, menu);
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
