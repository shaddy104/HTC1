package com.example.shadrach.htc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class TeluguNiceneCreed extends AppCompatActivity {
    TextView nictxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telugu_nicene_creed);
        nictxt = (TextView)findViewById(R.id.textView84);

        nictxt.append("NICENE CREED\n" +
                "భూమ్యాకాశములను  ధృశ్యాధ్యశ్యమగు  సమస్తమును  శ్రుజించిన సర్వ శక్తి గల తండ్రియగు ఏక దేవుని నేను నమ్ముచున్నాను.\n" +
                "అయన  ఏకైక , కుమారుడును , అద్వితీయుదునగు ప్రభువైన యేసు క్రీస్తును నమ్ము చున్నాను.\n" +
                "ఈయన జగములన్నింటికి ముందు తండ్రి నుండి కలిగిన వాడును, దేవుని నుండి దేవుడును, వెలుగునుండి  వెలుగును, నిజమైన దేవునినుండి నిజమైన దేవుడును శ్రుజింపబడక జన్మించినవాడును, తండ్రితో ఏకతత్వము గలవాడును, సమస్తమును కలుగజేసినవాడునై యున్నాడు.\n" +
                "ఈయన మానవులమగు మనకొరకును, మన రక్షణ కొరకును పరలోకమునుండి దిగి, కన్యయగు మరియ నుండి పరిశుద్ధాత్మ  వలన అవతరించి పుట్టి,  మనుష్యుడాయేననియు, పొంతి పిలాతు అధికారము క్రింద మనకొరకు సిలువ వేయబడి, శ్రమనోంది, సమాధి చేయబడెననియు లేఖనముల ప్రకారము మూడవ దినమున తిరిగి లేచి, పరలోకమున కెక్కి తండ్రి యొక్క కుడిచేతి వైపున కూర్చుండి యున్నాడనియు.\n" +
                "సజీవులకును, మ్రుతులకును తీర్పు చేయుటకు తిరిగి మహిమతో వచ్చునవియు, ఆయన రాజ్యమునకు అంతము లేదనియు నమ్ము చున్నాను.\n" +
                "తండ్రినుండియు, కుమారునినుండియు బయులు వెడలుచు తండ్రి తోను, కుమారునితోను ఏకముగా ఆరాధింపబడుచు మహిమ పరుపబడుచు  ప్రవక్తల ద్వారా   మాట్లడినవాడును, జీవమునకు దాతయు, ప్రభువునగు పరిశుద్ధాత్మను నమ్ముచున్నాను. మరియు పరిశుద్ధమైన క్రైస్తవ అపోస్తలుల యొక సంఘమును నమ్ముచున్నాను. పాప పరిహరమునకైన ఒకే బాప్తిసము వొప్పుకొనుచు మృతుల ప్రునరుద్ధానము కొరకును రాబోవు లోక సంబంధమగు బ్రతుకు కొరకును నిరీక్షించుచున్నాను ఆమెన్ \n");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_telugu_nicene_creed, menu);
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
