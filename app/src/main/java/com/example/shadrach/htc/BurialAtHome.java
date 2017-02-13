package com.example.shadrach.htc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class BurialAtHome extends AppCompatActivity {
    TextView burial_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burial_at_home);
        burial_text = (TextView)findViewById(R.id.textView210);
    }

    public void Psalm90(View view){
        burial_text.setText("Psalm 90: 1-6,10,,12,14,16\n" +
                "Lord, You have been our dwelling place in all generation." +
                "Before the mountains were brought forth, or ever You had formed the earth and the world, from everlasting to everlasting You are God.\n" +
                "\n" +
                "You turn us back to dust, and say, \'Turn back, you mortals\'\n" +
                "For a thousand years in Your sight are like yesterday when it is past, or like a watch in the night.\n" +
                "\n" +
                "You sweep them away they are like a dream, like grass that is renewed in the morning;\n" +
                "In the morning it flourishes and is renewed; in the evening it fades and withers.\n" +
                "\n" +
                "The days our life are seventy years, or perhaps eighty, if we are strong even then their span is only toil and trouble; they are soon gone, and we fly away.\n" +
                "So teach us to count our days that we may gain a wise heart\n" +
                "\n" +
                "Satisfy us in the morning with your steadfast love, so that we may rejoice and be glad all our days." +
                "Let Your work be manifest to Your servants, and Your glorious power to their children.\n\n");
    }

    public void Psalm23(View view){
        burial_text.setText("Psalm 23\n" +
                "The Lord is my Shepherd, I shall not want.\n" +
                "He makes me lie down in green pastures; He leads me beside still waters\n" +
                "\n" +
                "He restores my soul. He leads me in right paths for His name\'s sake.\n" +
                "Even though I walk through the darkest valley, I fear no evil, for You are with me; Your rod and Your staff - they comfort me.\n" +
                "\n" +
                "You prepare a table before me in the presence of my enemies, You anoint my head with oil; my cup overflows.\n" +
                "Surely goodness and mercy shall follow me all the days of my life, and I shall dwell in the house of the Lord my whole life long\n\n");
    }

    public void Psalm130(View view){
        burial_text.setText("Psalm 130\n" +
                "Out of the depths I cry to You, O Lord.\n" +
                "Lord, hear my voice! Let Your ears be attentive to the voice of my supplications\n" +
                "\n" +
                "If You, O Lord, should mark iniquities, Lord, who could stand?\n" +
                "But there is forgiveness with you, so that you may be revered.\n" +
                "\n" +
                "I wait for the Lord, my soul waits, and in His word I hope\n" +
                "My soul waits for the Lord more than those who watch for the morning.\n" +
                "\n" +
                "O Israel, hope in the Lord! For with the Lord there is steadfast love, and with him is great power to redeem.\n" +
                "It is He who will redeem Israel from all its iniquities.\n\n");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_burial_at_home, menu);
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
