package com.example.shadrach.htc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class epistle_lesson extends AppCompatActivity {

    TextView epi_text;

    int epi_month,epi_year,day_x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epistle_lesson);

        epi_text=(TextView)findViewById(R.id.epistleTextView);

        Calendar e_cal = Calendar.getInstance();

        epi_month = e_cal.get(Calendar.MONTH);
        epi_year = e_cal.get(Calendar.YEAR);
        day_x = e_cal.get(Calendar.DAY_OF_MONTH);

        if(epi_year == 2016) {
            switch (epi_month + 1) {
                case 2: {
                    switch (day_x) {
                        case 21: {
                            epi_text.append("Acts 8\n"+"9 Now for some time a man named Simon had practiced sorcery in the city and amazed all the people of Samaria. He boasted that he was someone great, 10 and all the people, both high and low, gave him their attention and exclaimed, “This man is rightly called the Great Power of God.” 11 They followed him because he had amazed them for a long time with his sorcery. 12 But when they believed Philip as he proclaimed the good news of the kingdom of God and the name of Jesus Christ, they were baptized, both men and women. 13 Simon himself believed and was baptized. And he followed Philip everywhere, astonished by the great signs and miracles he saw.\n" +
                                    "\n" +
                                    "14 When the apostles in Jerusalem heard that Samaria had accepted the word of God, they sent Peter and John to Samaria. 15 When they arrived, they prayed for the new believers there that they might receive the Holy Spirit, 16 because the Holy Spirit had not yet come on any of them; they had simply been baptized in the name of the Lord Jesus. 17 Then Peter and John placed their hands on them, and they received the Holy Spirit.\n" +
                                    "\n" +
                                    "18 When Simon saw that the Spirit was given at the laying on of the apostles’ hands, he offered them money 19 and said, “Give me also this ability so that everyone on whom I lay my hands may receive the Holy Spirit.”\n" +
                                    "\n" +
                                    "20 Peter answered: “May your money perish with you, because you thought you could buy the gift of God with money! 21 You have no part or share in this ministry, because your heart is not right before God. 22 Repent of this wickedness and pray to the Lord in the hope that he may forgive you for having such a thought in your heart. 23 For I see that you are full of bitterness and captive to sin.”\n" +
                                    "\n" +
                                    "24 Then Simon answered, “Pray to the Lord for me so that nothing you have said may happen to me.”\n" +
                                    "\n" +
                                    "25 After they had further proclaimed the word of the Lord and testified about Jesus, Peter and John returned to Jerusalem, preaching the gospel in many Samaritan villages.\n");

                            break;
                        }
                        case 28: {
                            epi_text.append("Acts 10\n"+"24 The following day he arrived in Caesarea. Cornelius was expecting them and had called together his relatives and close friends. 25 As Peter entered the house, Cornelius met him and fell at his feet in reverence. 26 But Peter made him get up. “Stand up,” he said, “I am only a man myself.”\n" +
                                    "\n" +
                                    "27 While talking with him, Peter went inside and found a large gathering of people. 28 He said to them: “You are well aware that it is against our law for a Jew to associate with or visit a Gentile. But God has shown me that I should not call anyone impure or unclean. 29 So when I was sent for, I came without raising any objection. May I ask why you sent for me?”\n" +
                                    "\n" +
                                    "30 Cornelius answered: “Three days ago I was in my house praying at this hour, at three in the afternoon. Suddenly a man in shining clothes stood before me 31 and said, ‘Cornelius, God has heard your prayer and remembered your gifts to the poor. 32 Send to Joppa for Simon who is called Peter. He is a guest in the home of Simon the tanner, who lives by the sea.’ 33 So I sent for you immediately, and it was good of you to come. Now we are all here in the presence of God to listen to everything the Lord has commanded you to tell us.”");
                            break;

                        }
                        default: {
                            Toast.makeText(epistle_lesson.this,"you will receive only sunday Scripture readings ",Toast.LENGTH_LONG).show();
                            break;

                        }
                    }
                    break;

                }
                case 3: {
                    switch (day_x) {

                        case 6: {
                            epi_text.append("Acts 4\n"+"32 All the believers were one in heart and mind. No one claimed that any of their possessions was their own, but they shared everything they had. 33 With great power the apostles continued to testify to the resurrection of the Lord Jesus. And God’s grace was so powerfully at work in them all 34 that there were no needy persons among them. For from time to time those who owned land or houses sold them, brought the money from the sales 35 and put it at the apostles’ feet, and it was distributed to anyone who had need.\n" +
                                    "\n" +
                                    "36 Joseph, a Levite from Cyprus, whom the apostles called Barnabas (which means “son of encouragement”), 37 sold a field he owned and brought the money and put it at the apostles’ feet.\n");
                            break;

                        }


                        case 13: {
                            epi_text.append("II Cor 11\n"+"21 To my shame I admit that we were too weak for that!\n" +
                                    "\n" +
                                    "Whatever anyone else dares to boast about—I am speaking as a fool—I also dare to boast about. 22 Are they Hebrews? So am I. Are they Israelites? So am I. Are they Abraham’s descendants? So am I. 23 Are they servants of Christ? (I am out of my mind to talk like this.) I am more. I have worked much harder, been in prison more frequently, been flogged more severely, and been exposed to death again and again. 24 Five times I received from the Jews the forty lashes minus one. 25 Three times I was beaten with rods, once I was pelted with stones, three times I was shipwrecked, I spent a night and a day in the open sea, 26 I have been constantly on the move. I have been in danger from rivers, in danger from bandits, in danger from my fellow Jews, in danger from Gentiles; in danger in the city, in danger in the country, in danger at sea; and in danger from false believers. 27 I have labored and toiled and have often gone without sleep; I have known hunger and thirst and have often gone without food; I have been cold and naked. 28 Besides everything else, I face daily the pressure of my concern for all the churches. 29 Who is weak, and I do not feel weak? Who is led into sin, and I do not inwardly burn?\n" +
                                    "\n" +
                                    "30 If I must boast, I will boast of the things that show my weakness. 31 The God and Father of the Lord Jesus, who is to be praised forever, knows that I am not lying.");
                            break;

                        }


                        case 20: {
                            epi_text.append("1 Timothy 4\n"+"6 If you point these things out to the brothers and sisters,[a] you will be a good minister of Christ Jesus, nourished on the truths of the faith and of the good teaching that you have followed. 7 Have nothing to do with godless myths and old wives’ tales; rather, train yourself to be godly. 8 For physical training is of some value, but godliness has value for all things, holding promise for both the present life and the life to come. 9 This is a trustworthy saying that deserves full acceptance. 10 That is why we labor and strive, because we have put our hope in the living God, who is the Savior of all people, and especially of those who believe.\n" +
                                    "\n" +
                                    "11 Command and teach these things. 12 Don’t let anyone look down on you because you are young, but set an example for the believers in speech, in conduct, in love, in faith and in purity. 13 Until I come, devote yourself to the public reading of Scripture, to preaching and to teaching. 14 Do not neglect your gift, which was given you through prophecy when the body of elders laid their hands on you.\n" +
                                    "\n" +
                                    "15 Be diligent in these matters; give yourself wholly to them, so that everyone may see your progress. 16 Watch your life and doctrine closely. Persevere in them, because if you do, you will save both yourself and your hearers.\n");
                            break;

                        }


                        case 27: {
                            epi_text.append("1 Corinthians 15\n"+"20 But Christ has indeed been raised from the dead, the firstfruits of those who have fallen asleep. 21 For since death came through a man, the resurrection of the dead comes also through a man. 22 For as in Adam all die, so in Christ all will be made alive. 23 But each in turn: Christ, the firstfruits; then, when he comes, those who belong to him. 24 Then the end will come, when he hands over the kingdom to God the Father after he has destroyed all dominion, authority and power. 25 For he must reign until he has put all his enemies under his feet. 26 The last enemy to be destroyed is death. 27 For he “has put everything under his feet.”[c] Now when it says that “everything” has been put under him, it is clear that this does not include God himself, who put everything under Christ. 28 When he has done this, then the Son himself will be made subject to him who put everything under him, so that God may be all in all.\n" +
                                    "\n");
                            break;

                        }

                        default: {
                            Toast.makeText(epistle_lesson.this,"you will receive only sunday Scripture readings ",Toast.LENGTH_LONG).show();
                            break;

                        }


                    }
                    break;
                }

                case 4: {
                    switch (day_x) {

                        case 3: {
                            epi_text.append("Acts 20\n"+"7 On the first day of the week we came together to break bread. Paul spoke to the people and, because he intended to leave the next day, kept on talking until midnight. 8 There were many lamps in the upstairs room where we were meeting. 9 Seated in a window was a young man named Eutychus, who was sinking into a deep sleep as Paul talked on and on. When he was sound asleep, he fell to the ground from the third story and was picked up dead. 10 Paul went down, threw himself on the young man and put his arms around him. “Don’t be alarmed,” he said. “He’s alive!” 11 Then he went upstairs again and broke bread and ate. After talking until daylight, he left. 12 The people took the young man home alive and were greatly comforted.\n");
                            break;

                        }

                        case 10: {
                            epi_text.append("Acts 8\n"+"26 Now an angel of the Lord said to Philip, “Go south to the road—the desert road—that goes down from Jerusalem to Gaza.” 27 So he started out, and on his way he met an Ethiopian[a] eunuch, an important official in charge of all the treasury of the Kandake (which means “queen of the Ethiopians”). This man had gone to Jerusalem to worship, 28 and on his way home was sitting in his chariot reading the Book of Isaiah the prophet. 29 The Spirit told Philip, “Go to that chariot and stay near it.”\n" +
                                    "\n" +
                                    "30 Then Philip ran up to the chariot and heard the man reading Isaiah the prophet. “Do you understand what you are reading?” Philip asked.\n" +
                                    "\n" +
                                    "31 “How can I,” he said, “unless someone explains it to me?” So he invited Philip to come up and sit with him.\n" +
                                    "\n" +
                                    "32 This is the passage of Scripture the eunuch was reading:\n" +
                                    "\n" +
                                    "“He was led like a sheep to the slaughter,\n" +
                                    "    and as a lamb before its shearer is silent,\n" +
                                    "    so he did not open his mouth.\n" +
                                    "33 \n" +
                                    "In his humiliation he was deprived of justice.\n" +
                                    "    Who can speak of his descendants?\n" +
                                    "    For his life was taken from the earth.”[b]\n" +
                                    "\n" +
                                    "34 The eunuch asked Philip, “Tell me, please, who is the prophet talking about, himself or someone else?” 35 Then Philip began with that very passage of Scripture and told him the good news about Jesus.\n" +
                                    "\n" +
                                    "36 As they traveled along the road, they came to some water and the eunuch said, “Look, here is water. What can stand in the way of my being baptized?” [37] [c] 38 And he gave orders to stop the chariot. Then both Philip and the eunuch went down into the water and Philip baptized him. 39 When they came up out of the water, the Spirit of the Lord suddenly took Philip away, and the eunuch did not see him again, but went on his way rejoicing. 40 Philip, however, appeared at Azotus and traveled about, preaching the gospel in all the towns until he reached Caesarea.\n");
                            break;

                        }

                        case 17: {
                            epi_text.append("1Timothy 4\n"+"6 If you point these things out to the brothers and sisters,[a] you will be a good minister of Christ Jesus, nourished on the truths of the faith and of the good teaching that you have followed. 7 Have nothing to do with godless myths and old wives’ tales; rather, train yourself to be godly. 8 For physical training is of some value, but godliness has value for all things, holding promise for both the present life and the life to come. 9 This is a trustworthy saying that deserves full acceptance. 10 That is why we labor and strive, because we have put our hope in the living God, who is the Savior of all people, and especially of those who believe.\n" +
                                    "\n" +
                                    "11 Command and teach these things. 12 Don’t let anyone look down on you because you are young, but set an example for the believers in speech, in conduct, in love, in faith and in purity. 13 Until I come, devote yourself to the public reading of Scripture, to preaching and to teaching. 14 Do not neglect your gift, which was given you through prophecy when the body of elders laid their hands on you.\n" +
                                    "\n" +
                                    "15 Be diligent in these matters; give yourself wholly to them, so that everyone may see your progress. 16 Watch your life and doctrine closely. Persevere in them, because if you do, you will save both yourself and your hearers.\n");
                            break;

                        }

                        case 24: {
                            epi_text.append("Ephesians 4\n"+
                                                "7 But to each one of us grace has been given as Christ apportioned it. 8 This is why it[a] says:\n" +
                                    "\n" +
                                    "“When he ascended on high,\n" +
                                    "    he took many captives\n" +
                                    "    and gave gifts to his people.”[b]\n" +
                                    "\n" +
                                    "9 (What does “he ascended” mean except that he also descended to the lower, earthly regions[c]? 10 He who descended is the very one who ascended higher than all the heavens, in order to fill the whole universe.) 11 So Christ himself gave the apostles, the prophets, the evangelists, the pastors and teachers, 12 to equip his people for works of service, so that the body of Christ may be built up 13 until we all reach unity in the faith and in the knowledge of the Son of God and become mature, attaining to the whole measure of the fullness of Christ.\n" +
                                    "\n" +
                                    "14 Then we will no longer be infants, tossed back and forth by the waves, and blown here and there by every wind of teaching and by the cunning and craftiness of people in their deceitful scheming. 15 Instead, speaking the truth in love, we will grow to become in every respect the mature body of him who is the head, that is, Christ. 16 From him the whole body, joined and held together by every supporting ligament, grows and builds itself up in love, as each part does its work.\n");
                            break;

                        }

                        default: {
                            Toast.makeText(epistle_lesson.this,"you will receive only sunday Scripture readings ",Toast.LENGTH_LONG).show();
                            break;

                        }
                    }
                    break;
                }

                default: {
                    Toast.makeText(epistle_lesson.this,"you need to update the app to receive daily scripture readings",Toast.LENGTH_LONG).show();
                    break;
                }

            }
        }

            }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_epistle_lesson, menu);
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
