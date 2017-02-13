package com.example.shadrach.htc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class sunday_theme extends AppCompatActivity {


    TextView Scripture_reading,Theme,Hymns;
    int day_x,month_x,year_x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunday_theme);

        final Calendar theme_cal = Calendar.getInstance();


        Theme = (TextView)findViewById(R.id.textView161);
        Scripture_reading = (TextView)findViewById(R.id.textView163);
        Hymns = (TextView)findViewById(R.id.textView165);

        day_x = theme_cal.get(Calendar.DAY_OF_MONTH);
        month_x = theme_cal.get(Calendar.MONTH);
        year_x = theme_cal.get(Calendar.YEAR);

        if(year_x == 2016){
            switch (month_x + 1){
                case 2:{
                    switch (day_x) {
                        case 21: {
                            Theme.append("RELEASING FROM THE BURDEN OF SIN");
                            Scripture_reading.append("OLD TESTAMENT LESSON : 2SAM 12: 1-14\n" +
                                "RESPONSIVE READING : PS 32\n" +
                                "EPISTLE LESSON : ACTS 8: 9-25\n" +
                                "GOSPEL LESSON : MARK 2: 1-12");
                            break;
                        }
                        case 28: {
                            Theme.append("ACKNOWLEDGING FAITH BEYOND BOUNDARIES");
                            Scripture_reading.append("OLD TESTAMENT LESSON : ISA 44: 28-45-8\n" + "RESPONSIVE READING : Ps  125\n" + "EPISTLE LESSON : ACTS 10:24-33\n" + "GOSPEL LESSON : MATT 15: 21-28");
                            break;
                        }
                        default: {
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();
                            break;
                        }
                    }
                    break;

                }
                case 3:{
                    switch (day_x){

                        case 6:{
                            Theme.append("TRANSFORMING THE OPPRESSIVE STRUCTURE");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Nah 1: 1-15\n" +
                                    "RESPONSIVE READING : Ps 113\n" +
                                    "EPISTLE LESSON : Acts 4: 32-37\n" +
                                    "GOSPEL LESSON : Luke 13: 10-17");
                            break;

                        }


                        case 13:{
                            Theme.append("CROSS AND A NEW PARADIGM TO DISCIPLESHIP");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 26: 12-33\n" +
                                    "RESPONSIVE READING : Ps 92\n" +
                                    "EPISTLE LESSON : II Cor 11: 21-31\n" +
                                    "GOSPEL LESSON : Mark 10: 46-52");
                            break;

                        }


                        case 20:{
                            Theme.append("HOSANNA: LORD SAVE US");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Zech 9: 1-12\n" +
                                    "RESPONSIVE READING : Ps 118: 19-29\n" +
                                    "EPISTLE LESSON : 1 TIM 4: 6-16\n" +
                                    "GOSPEL LESSON : Luke 19: 29-40");
                            break;

                        }


                        case 27:{
                            Theme.append("RESURRECTION: CELEBRATING BOUNDLESS TRANSFORMATION");
                            Scripture_reading.append("OLD TESTAMENT LESSON : II Sam 22: 1-20\n" +
                                    "RESPONSIVE READING : Ps 16\n" +
                                    "EPISTLE LESSON : I Cor 15: 20-28\n" +
                                    "GOSPEL LESSON : Mark 16: 1-11");
                            break;

                        }

                        default:{
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();

                            break;
                        }


                    }
                    break;
                }

                case 4:{
                    switch (day_x){

                        case 3:{
                            Theme.append("EMPOWERED BY THE RISEN LORD");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 28: 10-22\n" +
                                    "RESPONSIVE READING : Ps 29\n" +
                                    "EPISTLE LESSON : Acts 20: 7-12\n" +
                                    "GOSPEL LESSON : John 20: 11-18");
                            break;

                        }

                        case 10:{
                            Theme.append("RE-READING THE SCRIPTURE WITH THE RISEN LORD");
                            Scripture_reading.append("OLD TESTAMENT LESSON : 2 Chr 34: 29-33\n" +
                                    "RESPONSIVE READING : Ps 19: 7-14\n" +
                                    "EPISTLE LESSON : Acts 8: 26-40\n" +
                                    "GOSPEL LESSON : Luke 24: 13-27");
                            break;

                        }

                        case 17:{
                            Theme.append("COMMISSIONING BY THE RISEN LORD");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Jer 9: 1-10\n" +
                                    "RESPONSIVE READING : Ps 47\n" +
                                    "EPISTLE LESSON : 1Tim 4: 6-16\n" +
                                    "GOSPEL LESSON : John 20: 19-23");
                            break;

                        }

                        case 24:{
                            Theme.append("BELIEVING IN CHRIST: THE TRUTH");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Exo 34: 1-9\n" +
                                    "RESPONSIVE READING : Ps 47\n" +
                                    "EPISTLE LESSON : Eph 4: 7-16\n" +
                                    "GOSPEL LESSON : John 17: 6-19");
                            break;

                        }

                        default:{
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();

                            break;
                        }
                    }
                    break;
                }

                case 5:{
                    switch (day_x){

                        case 1:{
                            Theme.append("MISSION WITH CHRIST'S SPIRIT");
                            Scripture_reading.append("OLD TESTAMENT LESSON : 2 Kin 2: 9-16\n" +
                                    "RESPONSIVE READING : Ps 105: 1-11\n" +
                                    "EPISTLE LESSON : Acts 7: 54-60\n" +
                                    "GOSPEL LESSON : Matt 28: 16-20");
                            break;

                        }

                        case 8:{
                            Theme.append("LEAD BY THE HOLY SPIRIT");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Exo 36: 1-7\n" +
                                    "RESPONSIVE READING : Ps 107: 1-22\n" +
                                    "EPISTLE LESSON : Rom 8: 12-17\n" +
                                    "GOSPEL LESSON : John 14: 25-31");
                            break;

                        }

                        case 15:{
                            Theme.append("COME HOLY SPIRIT SET US FREE");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Isa 61: 1-11\n" +
                                    "RESPONSIVE READING : Ps 107: 31-43\n" +
                                    "EPISTLE LESSON : Acts 2: 1-13\n" +
                                    "GOSPEL LESSON : Luke 4: 16-21");
                            break;

                        }

                        case 22:{
                            Theme.append("TRINITY: COMMUNITY OF LOVE");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 18: 1-15\n" +
                                    "RESPONSIVE READING : Ps 97\n" +
                                    "EPISTLE LESSON : 2 Cor 13: 5-14\n" +
                                    "GOSPEL LESSON : Mark 1: 1-11");
                            break;

                        }

                        case 29:{
                            Theme.append("REVELATION OF GOD IN WORSHIP");
                            Scripture_reading.append("OLD TESTAMENT LESSON : 1 King 8: 22-30\n" +
                                    "RESPONSIVE READING : Ps 148\n" +
                                    "EPISTLE LESSON : Rev 14: 1-7\n" +
                                    "GOSPEL LESSON : Mark 3: 1-6");
                            break;

                        }

                        default:{
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();

                            break;
                        }
                    }
                    break;

                }

                case 6:{
                    switch (day_x){

                        case 5:{
                            Theme.append("FEAR OF THE LORD IS THE BEGINNING OF WISDOM");
                            Scripture_reading.append("OLD TESTAMENT LESSON : 1 KinG 3: 3-14\n" +
                                    "RESPONSIVE READING : Ps 14\n" +
                                    "EPISTLE LESSON : 1 John 5: 13-21\n" +
                                    "GOSPEL LESSON : Luke 10: 21-24");
                            Toast.makeText(sunday_theme.this,"Today is STUDENTS Sunday",Toast.LENGTH_LONG).show();
                            break;

                        }

                        case 12:{
                            Theme.append("NURTURING GOD'S CREATION");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 1: 28-31\n" +
                                    "RESPONSIVE READING : Ps 104: 1-23\n" +
                                    "EPISTLE LESSON : Rev 22: 1-5\n" +
                                    "GOSPEL LESSON : Luke 1: 22-31");
                            Toast.makeText(sunday_theme.this,"Today is Environmental Sunday",Toast.LENGTH_LONG).show();
                            break;

                        }

                        case 19:{
                            Theme.append("MAKE DISCIPLES");
                            Scripture_reading.append("OLD TESTAMENT LESSON : 1 King 19: 11-21\n" +
                                    "RESPONSIVE READING : Ps 34: 11-22\n" +
                                    "EPISTLE LESSON : Rom 16: 3-16\n" +
                                    "GOSPEL LESSON : John 1: 35-42");
                            break;

                        }

                        case 26:{
                            Theme.append("PEOPLE OF GOD: FLOCK OF CHRIST");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 35: 1-15\n" +
                                    "RESPONSIVE READING : Ps 95\n" +
                                    "EPISTLE LESSON : Acts 16: 11-15\n" +
                                    "GOSPEL LESSON : John 10: 1-6");
                            break;

                        }

                        default:{
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();

                            break;
                        }
                    }
                    break;
                }

                case 7:{
                    switch (day_x){

                        case 3:{
                            Theme.append("GIVING WITHOUT COUNTING THE COST");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 13: 8-18\n" +
                                    "RESPONSIVE READING : Ps 15\n" +
                                    "EPISTLE LESSON : II Cor 8: 1-15\n" +
                                    "GOSPEL LESSON : Mark 14: 3-11");
                            Toast.makeText(sunday_theme.this,"STEWARDSHIP SUNDAY",Toast.LENGTH_LONG).show();
                            break;

                        }

                        case 10:{
                            Theme.append("THEOLOGICAL EDUCATION MAKING OF THE FAITHFUL");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Jos 4: 1-9\n" +
                                    "RESPONSIVE READING : Ps 1\n" +
                                    "EPISTLE LESSON : 1 Tim 6: 11-16\n" +
                                    "GOSPEL LESSON : Matt 13: 1-9");
                            Toast.makeText(sunday_theme.this,"THEOLOGICAL EDUCATION Sunday",Toast.LENGTH_LONG).show();
                            break;

                        }

                        case 17:{
                            Theme.append("ORDAINED MINISTRY: FRAGRANCE OF CHRIST");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Exo 29: 1-9\n" +
                                    "RESPONSIVE READING : Ps 99\n" +
                                    "EPISTLE LESSON : Eph 5: 1-14\n" +
                                    "GOSPEL LESSON : Luke 10: 1-11");
                            break;

                        }

                        case 24:{
                            Theme.append("MARRIAGE: LASTING LIFE OF LOVE");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 29: 1-20\n" +
                                    "RESPONSIVE READING : Ps 128\n" +
                                    "EPISTLE LESSON : Heb 13: 1-6\n" +
                                    "GOSPEL LESSON : Matthew 19: 3-9");
                            break;

                        }

                        case 31:{
                            Theme.append("BAPTISM: BORN FROM ABOVE");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 8: 1-14\n" +
                                    "RESPONSIVE READING : Ps 25\n" +
                                    "EPISTLE LESSON : Col 13: 1-11\n" +
                                    "GOSPEL LESSON : John 3: 1-8");
                            break;

                        }

                        default:{
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();

                            break;
                        }
                    }
                    break;
                }

                case 8:{
                    switch (day_x){

                        case 7:{
                            Theme.append("MISSION: FROM EVERYWHERE TO EVERYWHERE");
                            Scripture_reading.append("OLD TESTAMENT LESSON : 1 King 17: 1-16\n" +
                                    "RESPONSIVE READING : Ps 107: 1-15\n" +
                                    "EPISTLE LESSON : Gal 2: 1-10\n" +
                                    "GOSPEL LESSON : Matthew 13: 47-52");
                            break;

                        }

                        case 14:{
                            Theme.append("SACRAMENT OF HOLY COMMUNION");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Exo 12: 1-14\n" +
                                    "RESPONSIVE READING : Ps 42\n" +
                                    "EPISTLE LESSON : 1 Cor 10: 14-22\n" +
                                    "GOSPEL LESSON : Luke 22: 7-20");
                            break;

                        }

                        case 21:{
                            Theme.append("GOD AND PEOPLE OF ALL FAITHS");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Amos 9: 1-12\n" +
                                    "RESPONSIVE READING : Ps 66\n" +
                                    "EPISTLE LESSON : Rom 2: 17-29\n" +
                                    "GOSPEL LESSON : John 10: 14-18");
                            break;

                        }

                        case 28:{
                            Theme.append("PEACE IN THE CONTEXT OF VIOLENCE");
                            Scripture_reading.append("OLD TESTAMENT LESSON : 1Sam 24: 1-12\n" +
                                    "RESPONSIVE READING : Ps 52\n" +
                                    "EPISTLE LESSON : Rom 12: 14-21\n" +
                                    "GOSPEL LESSON : Matthew 5: 38-48");
                            break;

                        }

                        default:{
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();

                            break;
                        }
                    }
                    break;
                }

                case 9:{
                    switch (day_x){

                        case 4:{
                            Theme.append("EDUCATION AS A MINISTRY OF THE CHURCH");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Neh 8: 1-8\n" +
                                    "RESPONSIVE READING : Ps 119: 41-48\n" +
                                    "EPISTLE LESSON : Acts 18: 24-28\n" +
                                    "GOSPEL LESSON : Matthew 5: 1-12");
                            break;

                        }

                        case 11:{
                            Theme.append("REMEMBERING AND CELEBRATING WOMEN'S MINISTRY");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Judg 4: 4-16\n" +
                                    "RESPONSIVE READING : Ps 132\n" +
                                    "EPISTLE LESSON : Phil 4: 1-7\n" +
                                    "GOSPEL LESSON : Luke 8: 1-3");
                            break;

                        }

                        case 18:{
                            Theme.append("CHRISTIAN RESPONSE TO CONSUMERISM");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 3: 1-7\n" +
                                    "RESPONSIVE READING : Ps 37\n" +
                                    "EPISTLE LESSON : Phil 3: 17-21\n" +
                                    "GOSPEL LESSON : Matthew 6: 25-34");
                            break;

                        }

                        case 25:{
                            Theme.append("CARING AND ACCEPTING THE ELDERLY");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 46: 28-47\n" +
                                    "RESPONSIVE READING : Ps 21\n" +
                                    "EPISTLE LESSON : 1 Tim 5: 1-10\n" +
                                    "GOSPEL LESSON : Luke 2: 25-35");
                            break;

                        }

                        default:{
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();

                            break;
                        }
                    }
                    break;
                }

                case 10:{
                    switch (day_x){

                        case 2:{
                            Theme.append("PRIESTHOOD OF ALL BELIEVERS");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Isa 61: 1-11\n" +
                                    "RESPONSIVE READING : Ps 135: 12-21\n" +
                                    "EPISTLE LESSON : 1 Pet 2: 1-10\n" +
                                    "GOSPEL LESSON : John 17: 1-8");
                            break;

                        }

                        case 9:{
                            Theme.append("DISABLE: CARE AND HONOUR");
                            Scripture_reading.append("OLD TESTAMENT LESSON : II Sam 9: 1-13\n" +
                                    "RESPONSIVE READING : Ps 146\n" +
                                    "EPISTLE LESSON : Acts 9: 32-35\n" +
                                    "GOSPEL LESSON : Mark 3: 1-6");
                            break;

                        }

                        case 16:{
                            Theme.append("YOUTH WITH CHRIST IN ACTION");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Dan 1: 1-17\n" +
                                    "RESPONSIVE READING : Ps 98\n" +
                                    "EPISTLE LESSON : Acts 6: 1-7\n" +
                                    "GOSPEL LESSON : John 1: 35-42");
                            break;

                        }

                        case 23:{
                            Theme.append("COMING OF THE LORD AND JUDGMENT");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Gen 19: 14-25\n" +
                                    "RESPONSIVE READING : Ps 94\n" +
                                    "EPISTLE LESSON : II Pet 3: 1-10\n" +
                                    "GOSPEL LESSON : Matthew 25: 31-46");
                            break;

                        }

                        case 30:{
                            Theme.append("CELEBRATION OF GOD'S SOVEREIGNTY JUSTICE AND PEACE");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Exo 7: 1-7\n" +
                                    "RESPONSIVE READING : Ps 89: 1-18\n" +
                                    "EPISTLE LESSON : Rom 13: 1-7\n" +
                                    "GOSPEL LESSON : John 18: 33-38");
                            break;

                        }

                        default:{
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();

                            break;
                        }
                    }
                    break;
                }

                case 11:{
                    switch (day_x){


                        case 6:{
                            Theme.append("WHAT THIS CHILD IS GOING TO BE ?");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Judg 13: 1-14\n" +
                                    "RESPONSIVE READING : Ps 119: 9-16\n" +
                                    "EPISTLE LESSON : Eph 6: 1-4\n" +
                                    "GOSPEL LESSON : Luke 1: 57-66");
                            break;

                        }

                        case 13:{
                            Theme.append("VINE AND BRANCHES");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Eze 37: 15-23\n" +
                                    "RESPONSIVE READING : Ps 133\n" +
                                    "EPISTLE LESSON : 1 Cor 12: 12-27\n" +
                                    "GOSPEL LESSON : John 15: 1-8");
                            break;

                        }

                        case 20:{
                            Theme.append("AFFIEMING THE WORTH OF THE GIRL CHILD");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Num 27: 1-11\n" +
                                    "RESPONSIVE READING : Ps 71: 1-12\n" +
                                    "EPISTLE LESSON : Acts 21: 7-14\n" +
                                    "GOSPEL LESSON : Mark 5: 35-43");
                            break;

                        }

                        case 27:{
                            Theme.append("MEETING OF MARY WITH ELIZABETH CELEBRATING THE PROMISES OF GOD");
                            Scripture_reading.append("OLD TESTAMENT LESSON : 1 Sam 2: 1-10\n" +
                                    "RESPONSIVE READING : Ps 66\n" +
                                    "EPISTLE LESSON : Heb 11: 29-40\n" +
                                    "GOSPEL LESSON : Luke 1: 39-45");
                            break;

                        }

                        default:{
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();

                            break;
                        }
                    }
                    break;
                }

                case 12:{
                    switch (day_x){

                        case 4:{
                            Theme.append("BIRTH OF JOHN THE BAPTIST WORD OF GOD: DOUBLE EDGED SWORD ");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Jer 36: 1-10\n" +
                                    "RESPONSIVE READING : Ps 119: 89-96\n" +
                                    "EPISTLE LESSON : Heb 4: 11-13\n" +
                                    "GOSPEL LESSON : Luke 1: 5-17");
                            Toast.makeText(sunday_theme.this,"today is BIBLE Sunday",Toast.LENGTH_LONG).show();
                            break;

                        }

                        case 11:{
                            Theme.append("PROMISE OF IMMANUEL");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Isa 7: 10-17\n" +
                                    "RESPONSIVE READING : Ps 98\n" +
                                    "EPISTLE LESSON : 1 Pet 3: 8-16\n" +
                                    "GOSPEL LESSON : Matthew 1: 18-25");
                            break;

                        }

                        case 18:{
                            Theme.append("PREPARATION: THE LORD IS COMING");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Mic 4: 1-5\n" +
                                    "RESPONSIVE READING : Ps 126\n" +
                                    "EPISTLE LESSON : 1 John 4: 7-21\n" +
                                    "GOSPEL LESSON : John 4: 21-37");
                            break;

                        }

                        case 25:{
                            Theme.append("CHRISTMAS: GRACE UPON GRACE");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Deut 6: 1-9\n" +
                                    "RESPONSIVE READING : Ps 20\n" +
                                    "EPISTLE LESSON : Eph 2: 4-9\n" +
                                    "GOSPEL LESSON : Matthew 2: 13-23");
                            Toast.makeText(sunday_theme.this,"WISH YOU ALL A HAPPY CHRISTMAS",Toast.LENGTH_LONG).show();
                            break;

                        }

                        case 31:{
                            Theme.append("WATCH NIGHT SERVICE COME THE LORD IS GOOD");
                            Scripture_reading.append("OLD TESTAMENT LESSON : Nah 1: 1-5\n" +
                                    "RESPONSIVE READING : Ps 34: 1-10\n" +
                                    "EPISTLE LESSON : 1 Pet 2: 1-10\n" +
                                    "GOSPEL LESSON : John 7: 37-39");
                            Toast.makeText(sunday_theme.this,"WISH YOU ALL A HAPPY NEW YEAR",Toast.LENGTH_LONG).show();
                            break;
                        }

                        default:{
                            Toast.makeText(sunday_theme.this, " you will only get sunday Themes and scripture readings", Toast.LENGTH_LONG).show();
                            break;

                        }
                    }
                    break;
                }

                default:{
                    Toast.makeText(sunday_theme.this,"Invalid month",Toast.LENGTH_LONG).show();
                    break;
                }

            }


        }





    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sunday_theme, menu);
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
