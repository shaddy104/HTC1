package com.example.shadrach.htc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class responsive_reading extends AppCompatActivity {

    int b_month,b_year,day_x;
    TextView rr_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_responsive_reading);

        rr_text=(TextView)findViewById(R.id.textView81);
        Calendar b_cal = Calendar.getInstance();
        day_x = b_cal.get(Calendar.DAY_OF_MONTH);
        b_month = b_cal.get(Calendar.MONTH);
        b_year = b_cal.get(Calendar.YEAR);




        if(b_year == 2016){
            switch (b_month + 1){
                case 2:{
                    switch (day_x) {
                        case 21: {

                            rr_text.append("Psalm 32\n" +
                                    "Of David. A maskil.[a]\n" +
                                    "\n" +
                                    "1 \n" +
                                    "Blessed is the one\n" +
                                    "    whose transgressions are forgiven,\n" +
                                    "    whose sins are covered.\n" +
                                    "2 \n" +
                                    "Blessed is the one\n" +
                                    "    whose sin the Lord does not count against them\n" +
                                    "    and in whose spirit is no deceit.\n" +
                                    "\n" +
                                    "3 \n" +
                                    "When I kept silent,\n" +
                                    "    my bones wasted away\n" +
                                    "    through my groaning all day long.\n" +
                                    "4 \n" +
                                    "For day and night\n" +
                                    "    your hand was heavy on me;\n" +
                                    "my strength was sapped\n" +
                                    "    as in the heat of summer.[b]\n" +
                                    "\n" +
                                    "5 \n" +
                                    "Then I acknowledged my sin to you\n" +
                                    "    and did not cover up my iniquity.\n" +
                                    "I said, “I will confess\n" +
                                    "    my transgressions to the Lord.”\n" +
                                    "And you forgave\n" +
                                    "    the guilt of my sin.\n" +
                                    "\n" +
                                    "6 \n" +
                                    "Therefore let all the faithful pray to you\n" +
                                    "    while you may be found;\n" +
                                    "surely the rising of the mighty waters\n" +
                                    "    will not reach them.\n" +
                                    "7 \n" +
                                    "You are my hiding place;\n" +
                                    "    you will protect me from trouble\n" +
                                    "    and surround me with songs of deliverance.\n" +
                                    "\n" +
                                    "8 \n" +
                                    "I will instruct you and teach you in the way you should go;\n" +
                                    "    I will counsel you with my loving eye on you.\n" +
                                    "9 \n" +
                                    "Do not be like the horse or the mule,\n" +
                                    "    which have no understanding\n" +
                                    "but must be controlled by bit and bridle\n" +
                                    "    or they will not come to you.\n" +
                                    "10 \n" +
                                    "Many are the woes of the wicked,\n" +
                                    "    but the Lord’s unfailing love\n" +
                                    "    surrounds the one who trusts in him.\n" +
                                    "\n" +
                                    "11 \n" +
                                    "Rejoice in the Lord and be glad, you righteous;\n" +
                                    "    sing, all you who are upright in heart!");

                            break;
                        }
                        case 28: {
                            rr_text.append("\n" +
                                    "Psalm 125\n" +
                                    "A song of ascents.\n" +
                                    "\n" +
                                    "1 \n" +
                                    "Those who trust in the Lord are like Mount Zion,\n" +
                                    "    which cannot be shaken but endures forever.\n" +
                                    "2 \n" +
                                    "As the mountains surround Jerusalem,\n" +
                                    "    so the Lord surrounds his people\n" +
                                    "    both now and forevermore.\n" +
                                    "\n" +
                                    "3 \n" +
                                    "The scepter of the wicked will not remain\n" +
                                    "    over the land allotted to the righteous,\n" +
                                    "for then the righteous might use\n" +
                                    "    their hands to do evil.\n" +
                                    "\n" +
                                    "4 \n" +
                                    "Lord, do good to those who are good,\n" +
                                    "    to those who are upright in heart.\n" +
                                    "5 \n" +
                                    "But those who turn to crooked ways\n" +
                                    "    the Lord will banish with the evildoers.\n" +
                                    "\n" +
                                    "Peace be on Israel.");
                            break;
                        }
                        default: {
                            Toast.makeText(responsive_reading.this,"only sunday Scripture readings will be shown",Toast.LENGTH_LONG).show();
                            break;

                        }
                    }
                        break;

                }
                case 3:{
                    switch (day_x){

                        case 6:{

                            rr_text.append("Psalm 113\n" +
                                    "\n" +
                                    "1 \n" +
                                    "Praise the Lord.[a]\n" +
                                    "\n" +
                                    "Praise the Lord, you his servants;\n" +
                                    "    praise the name of the Lord.\n" +
                                    "2 \n" +
                                    "Let the name of the Lord be praised,\n" +
                                    "    both now and forevermore.\n" +
                                    "3 \n" +
                                    "From the rising of the sun to the place where it sets,\n" +
                                    "    the name of the Lord is to be praised.\n" +
                                    "\n" +
                                    "4 \n" +
                                    "The Lord is exalted over all the nations,\n" +
                                    "    his glory above the heavens.\n" +
                                    "5 \n" +
                                    "Who is like the Lord our God,\n" +
                                    "    the One who sits enthroned on high,\n" +
                                    "6 \n" +
                                    "who stoops down to look\n" +
                                    "    on the heavens and the earth?\n" +
                                    "\n" +
                                    "7 \n" +
                                    "He raises the poor from the dust\n" +
                                    "    and lifts the needy from the ash heap;\n" +
                                    "8 \n" +
                                    "he seats them with princes,\n" +
                                    "    with the princes of his people.\n" +
                                    "9 \n" +
                                    "He settles the childless woman in her home\n" +
                                    "    as a happy mother of children.\n" +
                                    "\n" +
                                    "Praise the Lord.\n");

                            break;

                        }


                        case 13:{
                            rr_text.append("Psalm 92[a]\n" +
                                    "A psalm. A song. For the Sabbath day.\n" +
                                    "\n" +
                                    "1 \n" +
                                    "It is good to praise the Lord\n" +
                                    "    and make music to your name, O Most High,\n" +
                                    "2 \n" +
                                    "proclaiming your love in the morning\n" +
                                    "    and your faithfulness at night,\n" +
                                    "3 \n" +
                                    "to the music of the ten-stringed lyre\n" +
                                    "    and the melody of the harp.\n" +
                                    "\n" +
                                    "4 \n" +
                                    "For you make me glad by your deeds, Lord;\n" +
                                    "    I sing for joy at what your hands have done.\n" +
                                    "5 \n" +
                                    "How great are your works, Lord,\n" +
                                    "    how profound your thoughts!\n" +
                                    "6 \n" +
                                    "Senseless people do not know,\n" +
                                    "    fools do not understand,\n" +
                                    "7 \n" +
                                    "that though the wicked spring up like grass\n" +
                                    "    and all evildoers flourish,\n" +
                                    "    they will be destroyed forever.\n" +
                                    "\n" +
                                    "8 \n" +
                                    "But you, Lord, are forever exalted.\n" +
                                    "\n" +
                                    "9 \n" +
                                    "For surely your enemies, Lord,\n" +
                                    "    surely your enemies will perish;\n" +
                                    "    all evildoers will be scattered.\n" +
                                    "10 \n" +
                                    "You have exalted my horn[b] like that of a wild ox;\n" +
                                    "    fine oils have been poured on me.\n" +
                                    "11 \n" +
                                    "My eyes have seen the defeat of my adversaries;\n" +
                                    "    my ears have heard the rout of my wicked foes.\n" +
                                    "\n" +
                                    "12 \n" +
                                    "The righteous will flourish like a palm tree,\n" +
                                    "    they will grow like a cedar of Lebanon;\n" +
                                    "13 \n" +
                                    "planted in the house of the Lord,\n" +
                                    "    they will flourish in the courts of our God.\n" +
                                    "14 \n" +
                                    "They will still bear fruit in old age,\n" +
                                    "    they will stay fresh and green,\n" +
                                    "15 \n" +
                                    "proclaiming, “The Lord is upright;\n" +
                                    "    he is my Rock, and there is no wickedness in him.”\n");

                            break;

                        }


                        case 20:{
                            rr_text.append("19 \n" +
                                    "Open for me the gates of the righteous;\n" +
                                    "    I will enter and give thanks to the Lord.\n" +
                                    "20 \n" +
                                    "This is the gate of the Lord\n" +
                                    "    through which the righteous may enter.\n" +
                                    "21 \n" +
                                    "I will give you thanks, for you answered me;\n" +
                                    "    you have become my salvation.\n" +
                                    "\n" +
                                    "22 \n" +
                                    "The stone the builders rejected\n" +
                                    "    has become the cornerstone;\n" +
                                    "23 \n" +
                                    "the Lord has done this,\n" +
                                    "    and it is marvelous in our eyes.\n" +
                                    "24 \n" +
                                    "The Lord has done it this very day;\n" +
                                    "    let us rejoice today and be glad.\n" +
                                    "\n" +
                                    "25 \n" +
                                    "Lord, save us!\n" +
                                    "    Lord, grant us success!\n" +
                                    "\n" +
                                    "26 \n" +
                                    "Blessed is he who comes in the name of the Lord.\n" +
                                    "    From the house of the Lord we bless you.[b]\n" +
                                    "27 \n" +
                                    "The Lord is God,\n" +
                                    "    and he has made his light shine on us.\n" +
                                    "With boughs in hand, join in the festal procession\n" +
                                    "    up[c] to the horns of the altar.\n" +
                                    "\n" +
                                    "28 \n" +
                                    "You are my God, and I will praise you;\n" +
                                    "    you are my God, and I will exalt you.\n" +
                                    "\n" +
                                    "29 \n" +
                                    "Give thanks to the Lord, for he is good;\n" +
                                    "    his love endures forever.\n");

                            break;

                        }


                        case 27:{

                            rr_text.append("Psalm 16\n" +
                                    "A miktam[a] of David.\n" +
                                    "\n" +
                                    "1 \n" +
                                    "Keep me safe, my God,\n" +
                                    "    for in you I take refuge.\n" +
                                    "\n" +
                                    "2 \n" +
                                    "I say to the Lord, “You are my Lord;\n" +
                                    "    apart from you I have no good thing.”\n" +
                                    "3 \n" +
                                    "I say of the holy people who are in the land,\n" +
                                    "    “They are the noble ones in whom is all my delight.”\n" +
                                    "4 \n" +
                                    "Those who run after other gods will suffer more and more.\n" +
                                    "    I will not pour out libations of blood to such gods\n" +
                                    "    or take up their names on my lips.\n" +
                                    "\n" +
                                    "5 \n" +
                                    "Lord, you alone are my portion and my cup;\n" +
                                    "    you make my lot secure.\n" +
                                    "6 \n" +
                                    "The boundary lines have fallen for me in pleasant places;\n" +
                                    "    surely I have a delightful inheritance.\n" +
                                    "7 \n" +
                                    "I will praise the Lord, who counsels me;\n" +
                                    "    even at night my heart instructs me.\n" +
                                    "8 \n" +
                                    "I keep my eyes always on the Lord.\n" +
                                    "    With him at my right hand, I will not be shaken.\n" +
                                    "\n" +
                                    "9 \n" +
                                    "Therefore my heart is glad and my tongue rejoices;\n" +
                                    "    my body also will rest secure,\n" +
                                    "10 \n" +
                                    "because you will not abandon me to the realm of the dead,\n" +
                                    "    nor will you let your faithful[b] one see decay.\n" +
                                    "11 \n" +
                                    "You make known to me the path of life;\n" +
                                    "    you will fill me with joy in your presence,\n" +
                                    "    with eternal pleasures at your right hand.\n");

                            break;

                        }

                        default:{
                            Toast.makeText(responsive_reading.this,"only sunday Scripture readings will be shown",Toast.LENGTH_LONG).show();
                            break;

                        }


                    }
                        break;
                }

                case 4:{
                    switch (day_x){

                        case 3:{

                            rr_text.append("Psalm 29\n" +
                                    "A psalm of David.\n" +
                                    "\n" +
                                    "1 \n" +
                                    "Ascribe to the Lord, you heavenly beings,\n" +
                                    "    ascribe to the Lord glory and strength.\n" +
                                    "2 \n" +
                                    "Ascribe to the Lord the glory due his name;\n" +
                                    "    worship the Lord in the splendor of his[a] holiness.\n" +
                                    "\n" +
                                    "3 \n" +
                                    "The voice of the Lord is over the waters;\n" +
                                    "    the God of glory thunders,\n" +
                                    "    the Lord thunders over the mighty waters.\n" +
                                    "4 \n" +
                                    "The voice of the Lord is powerful;\n" +
                                    "    the voice of the Lord is majestic.\n" +
                                    "5 \n" +
                                    "The voice of the Lord breaks the cedars;\n" +
                                    "    the Lord breaks in pieces the cedars of Lebanon.\n" +
                                    "6 \n" +
                                    "He makes Lebanon leap like a calf,\n" +
                                    "    Sirion[b] like a young wild ox.\n" +
                                    "7 \n" +
                                    "The voice of the Lord strikes\n" +
                                    "    with flashes of lightning.\n" +
                                    "8 \n" +
                                    "The voice of the Lord shakes the desert;\n" +
                                    "    the Lord shakes the Desert of Kadesh.\n" +
                                    "9 \n" +
                                    "The voice of the Lord twists the oaks[c]\n" +
                                    "    and strips the forests bare.\n" +
                                    "And in his temple all cry, “Glory!”\n" +
                                    "\n" +
                                    "10 \n" +
                                    "The Lord sits enthroned over the flood;\n" +
                                    "    the Lord is enthroned as King forever.\n" +
                                    "11 \n" +
                                    "The Lord gives strength to his people;\n" +
                                    "    the Lord blesses his people with peace.\n");

                            break;

                        }

                        case 10:{

                            rr_text.append("7 \n" +
                                    "The law of the Lord is perfect,\n" +
                                    "    refreshing the soul.\n" +
                                    "The statutes of the Lord are trustworthy,\n" +
                                    "    making wise the simple.\n" +
                                    "8 \n" +
                                    "The precepts of the Lord are right,\n" +
                                    "    giving joy to the heart.\n" +
                                    "The commands of the Lord are radiant,\n" +
                                    "    giving light to the eyes.\n" +
                                    "9 \n" +
                                    "The fear of the Lord is pure,\n" +
                                    "    enduring forever.\n" +
                                    "The decrees of the Lord are firm,\n" +
                                    "    and all of them are righteous.\n" +
                                    "\n" +
                                    "10 \n" +
                                    "They are more precious than gold,\n" +
                                    "    than much pure gold;\n" +
                                    "they are sweeter than honey,\n" +
                                    "    than honey from the honeycomb.\n" +
                                    "11 \n" +
                                    "By them your servant is warned;\n" +
                                    "    in keeping them there is great reward.\n" +
                                    "12 \n" +
                                    "But who can discern their own errors?\n" +
                                    "    Forgive my hidden faults.\n" +
                                    "13 \n" +
                                    "Keep your servant also from willful sins;\n" +
                                    "    may they not rule over me.\n" +
                                    "Then I will be blameless,\n" +
                                    "    innocent of great transgression.\n" +
                                    "\n" +
                                    "14 \n" +
                                    "May these words of my mouth and this meditation of my heart\n" +
                                    "    be pleasing in your sight,\n" +
                                    "    Lord, my Rock and my Redeemer.\n");

                            break;

                        }

                        case 17:{

                            rr_text.append("Psalm 47[a]\n" +
                                    "For the director of music. Of the Sons of Korah. A psalm.\n" +
                                    "\n" +
                                    "1 \n" +
                                    "Clap your hands, all you nations;\n" +
                                    "    shout to God with cries of joy.\n" +
                                    "\n" +
                                    "2 \n" +
                                    "For the Lord Most High is awesome,\n" +
                                    "    the great King over all the earth.\n" +
                                    "3 \n" +
                                    "He subdued nations under us,\n" +
                                    "    peoples under our feet.\n" +
                                    "4 \n" +
                                    "He chose our inheritance for us,\n" +
                                    "    the pride of Jacob, whom he loved.[b]\n" +
                                    "\n" +
                                    "5 \n" +
                                    "God has ascended amid shouts of joy,\n" +
                                    "    the Lord amid the sounding of trumpets.\n" +
                                    "6 \n" +
                                    "Sing praises to God, sing praises;\n" +
                                    "    sing praises to our King, sing praises.\n" +
                                    "7 \n" +
                                    "For God is the King of all the earth;\n" +
                                    "    sing to him a psalm of praise.\n" +
                                    "\n" +
                                    "8 \n" +
                                    "God reigns over the nations;\n" +
                                    "    God is seated on his holy throne.\n" +
                                    "9 \n" +
                                    "The nobles of the nations assemble\n" +
                                    "    as the people of the God of Abraham,\n" +
                                    "for the kings[c] of the earth belong to God;\n" +
                                    "    he is greatly exalted.\n");

                            break;

                        }

                        case 24:{

                            rr_text.append("89 \n" +
                                    "Your word, Lord, is eternal;\n" +
                                    "    it stands firm in the heavens.\n" +
                                    "90 \n" +
                                    "Your faithfulness continues through all generations;\n" +
                                    "    you established the earth, and it endures.\n" +
                                    "91 \n" +
                                    "Your laws endure to this day,\n" +
                                    "    for all things serve you.\n" +
                                    "92 \n" +
                                    "If your law had not been my delight,\n" +
                                    "    I would have perished in my affliction.\n" +
                                    "93 \n" +
                                    "I will never forget your precepts,\n" +
                                    "    for by them you have preserved my life.\n" +
                                    "94 \n" +
                                    "Save me, for I am yours;\n" +
                                    "    I have sought out your precepts.\n" +
                                    "95 \n" +
                                    "The wicked are waiting to destroy me,\n" +
                                    "    but I will ponder your statutes.\n" +
                                    "96 \n" +
                                    "To all perfection I see a limit,\n" +
                                    "    but your commands are boundless.");

                            break;

                        }

                        default:{

                            Toast.makeText(responsive_reading.this,"only sunday Scripture readings will be shown",Toast.LENGTH_LONG).show();
                            break;

                        }

                    }
                        break;
                }



                default:{

                    Toast.makeText(responsive_reading.this,"App needs to be UPDATED for further usage , please support us",Toast.LENGTH_LONG).show();

                        break;
                }

            }


        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_responsive_reading, menu);
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
