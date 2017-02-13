package com.example.shadrach.htc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class old_testament_lesson extends AppCompatActivity {

    int old_month,old_year,day_x;
    TextView old_text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_old_testament_lesson);

        old_text = (TextView)findViewById(R.id.textView80);

        Calendar cal = Calendar.getInstance();

        old_month = cal.get(Calendar.MONTH);
        old_year = cal.get(Calendar.YEAR);
        day_x = cal.get(Calendar.DAY_OF_MONTH);


        if (old_year == 2016) {
            switch (old_month + 1) {
                case 2: {
                    switch (day_x) {
                        case 21: {
                            old_text.append(" 2 Samuel 12\n" +
                                    "Nathan Rebukes David\n" +
                                    "\n" +
                                    "12 The Lord sent Nathan to David. When he came to him, he said, “There were two men in a certain town, one rich and the other poor. 2 The rich man had a very large number of sheep and cattle, 3 but the poor man had nothing except one little ewe lamb he had bought. He raised it, and it grew up with him and his children. It shared his food, drank from his cup and even slept in his arms. It was like a daughter to him.\n" +
                                    "\n" +
                                    "4 “Now a traveler came to the rich man, but the rich man refrained from taking one of his own sheep or cattle to prepare a meal for the traveler who had come to him. Instead, he took the ewe lamb that belonged to the poor man and prepared it for the one who had come to him.”\n" +
                                    "\n" +
                                    "5 David burned with anger against the man and said to Nathan, “As surely as the Lord lives, the man who did this must die! 6 He must pay for that lamb four times over, because he did such a thing and had no pity.”\n" +
                                    "\n" +
                                    "7 Then Nathan said to David, “You are the man! This is what the Lord, the God of Israel, says: ‘I anointed you king over Israel, and I delivered you from the hand of Saul. 8 I gave your master’s house to you, and your master’s wives into your arms. I gave you all Israel and Judah. And if all this had been too little, I would have given you even more. 9 Why did you despise the word of the Lord by doing what is evil in his eyes? You struck down Uriah the Hittite with the sword and took his wife to be your own. You killed him with the sword of the Ammonites. 10 Now, therefore, the sword will never depart from your house, because you despised me and took the wife of Uriah the Hittite to be your own.’\n" +
                                    "\n" +
                                    "11 “This is what the Lord says: ‘Out of your own household I am going to bring calamity on you. Before your very eyes I will take your wives and give them to one who is close to you, and he will sleep with your wives in broad daylight. 12 You did it in secret, but I will do this thing in broad daylight before all Israel.’”\n" +
                                    "\n" +
                                    "13 Then David said to Nathan, “I have sinned against the Lord.”\n" +
                                    "\n" +
                                    "Nathan replied, “The Lord has taken away your sin. You are not going to die. 14 But because by doing this you have shown utter contempt for[a] the Lord, the son born to you will die.”\n" +
                                    "\n");
                            break;
                        }
                        case 28: {
                            old_text.append("Isaiah 44\n" +
                                    "28 \n" +
                                    "who says of Cyrus, ‘He is my shepherd\n" +
                                    "    and will accomplish all that I please;\n" +
                                    "he will say of Jerusalem, “Let it be rebuilt,”\n" +
                                    "    and of the temple, “Let its foundations be laid.”’\n"+" Isaiah 45\n" +
                                    "\n" +
                                    "45 “This is what the Lord says to his anointed,\n" +
                                    "    to Cyrus, whose right hand I take hold of\n" +
                                    "to subdue nations before him\n" +
                                    "    and to strip kings of their armor,\n" +
                                    "to open doors before him\n" +
                                    "    so that gates will not be shut:\n" +
                                    "2 \n" +
                                    "I will go before you\n" +
                                    "    and will level the mountains[a];\n" +
                                    "I will break down gates of bronze\n" +
                                    "    and cut through bars of iron.\n" +
                                    "3 \n" +
                                    "I will give you hidden treasures,\n" +
                                    "    riches stored in secret places,\n" +
                                    "so that you may know that I am the Lord,\n" +
                                    "    the God of Israel, who summons you by name.\n" +
                                    "4 \n" +
                                    "For the sake of Jacob my servant,\n" +
                                    "    of Israel my chosen,\n" +
                                    "I summon you by name\n" +
                                    "    and bestow on you a title of honor,\n" +
                                    "    though you do not acknowledge me.\n" +
                                    "5 \n" +
                                    "I am the Lord, and there is no other;\n" +
                                    "    apart from me there is no God.\n" +
                                    "I will strengthen you,\n" +
                                    "    though you have not acknowledged me,\n" +
                                    "6 \n" +
                                    "so that from the rising of the sun\n" +
                                    "    to the place of its setting\n" +
                                    "people may know there is none besides me.\n" +
                                    "    I am the Lord, and there is no other.\n" +
                                    "7 \n" +
                                    "I form the light and create darkness,\n" +
                                    "    I bring prosperity and create disaster;\n" +
                                    "    I, the Lord, do all these things.\n" +
                                    "\n" +
                                    "8 \n" +
                                    "“You heavens above, rain down my righteousness;\n" +
                                    "    let the clouds shower it down.\n" +
                                    "Let the earth open wide,\n" +
                                    "    let salvation spring up,\n" +
                                    "let righteousness flourish with it;\n" +
                                    "    I, the Lord, have created it.\n" +
                                    "\n");
                            break;
                        }
                        default: {
                            Toast.makeText(old_testament_lesson.this,"you will only get sunday scripture readings ",Toast.LENGTH_LONG).show();
                            break;
                        }
                    }
                    break;

                }
                case 3: {
                    switch (day_x) {

                        case 6: {
                            old_text.append(" Nahum 1\n" +
                                    "\n" +
                                    "1 A prophecy concerning Nineveh. The book of the vision of Nahum the Elkoshite.\n" +
                                    "The Lord’s Anger Against Nineveh\n" +
                                    "\n" +
                                    "2 \n" +
                                    "The Lord is a jealous and avenging God;\n" +
                                    "    the Lord takes vengeance and is filled with wrath.\n" +
                                    "The Lord takes vengeance on his foes\n" +
                                    "    and vents his wrath against his enemies.\n" +
                                    "3 \n" +
                                    "The Lord is slow to anger but great in power;\n" +
                                    "    the Lord will not leave the guilty unpunished.\n" +
                                    "His way is in the whirlwind and the storm,\n" +
                                    "    and clouds are the dust of his feet.\n" +
                                    "4 \n" +
                                    "He rebukes the sea and dries it up;\n" +
                                    "    he makes all the rivers run dry.\n" +
                                    "Bashan and Carmel wither\n" +
                                    "    and the blossoms of Lebanon fade.\n" +
                                    "5 \n" +
                                    "The mountains quake before him\n" +
                                    "    and the hills melt away.\n" +
                                    "The earth trembles at his presence,\n" +
                                    "    the world and all who live in it.\n" +
                                    "6 \n" +
                                    "Who can withstand his indignation?\n" +
                                    "    Who can endure his fierce anger?\n" +
                                    "His wrath is poured out like fire;\n" +
                                    "    the rocks are shattered before him.\n" +
                                    "\n" +
                                    "7 \n" +
                                    "The Lord is good,\n" +
                                    "    a refuge in times of trouble.\n" +
                                    "He cares for those who trust in him,\n" +
                                    "8 \n" +
                                    "    but with an overwhelming flood\n" +
                                    "he will make an end of Nineveh;\n" +
                                    "    he will pursue his foes into the realm of darkness.\n" +
                                    "\n" +
                                    "9 \n" +
                                    "Whatever they plot against the Lord\n" +
                                    "    he will bring[a] to an end;\n" +
                                    "    trouble will not come a second time.\n" +
                                    "10 \n" +
                                    "They will be entangled among thorns\n" +
                                    "    and drunk from their wine;\n" +
                                    "    they will be consumed like dry stubble.[b]\n" +
                                    "11 \n" +
                                    "From you, Nineveh, has one come forth\n" +
                                    "    who plots evil against the Lord\n" +
                                    "    and devises wicked plans.\n" +
                                    "\n" +
                                    "12 This is what the Lord says:\n" +
                                    "\n" +
                                    "“Although they have allies and are numerous,\n" +
                                    "    they will be destroyed and pass away.\n" +
                                    "Although I have afflicted you, Judah,\n" +
                                    "    I will afflict you no more.\n" +
                                    "13 \n" +
                                    "Now I will break their yoke from your neck\n" +
                                    "    and tear your shackles away.”\n" +
                                    "\n" +
                                    "14 \n" +
                                    "The Lord has given a command concerning you, Nineveh:\n" +
                                    "    “You will have no descendants to bear your name.\n" +
                                    "I will destroy the images and idols\n" +
                                    "    that are in the temple of your gods.\n" +
                                    "I will prepare your grave,\n" +
                                    "    for you are vile.”\n" +
                                    "\n" +
                                    "15 \n" +
                                    "Look, there on the mountains,\n" +
                                    "    the feet of one who brings good news,\n" +
                                    "    who proclaims peace!\n" +
                                    "Celebrate your festivals, Judah,\n" +
                                    "    and fulfill your vows.\n" +
                                    "No more will the wicked invade you;\n" +
                                    "    they will be completely destroyed.[c]\n");

                            break;
                        }


                        case 13: {
                            old_text.append("Genesis 26\n"+"12 Isaac planted crops in that land and the same year reaped a hundredfold, because the Lord blessed him. 13 The man became rich, and his wealth continued to grow until he became very wealthy. 14 He had so many flocks and herds and servants that the Philistines envied him. 15 So all the wells that his father’s servants had dug in the time of his father Abraham, the Philistines stopped up, filling them with earth.\n" +
                                    "\n" +
                                    "16 Then Abimelek said to Isaac, “Move away from us; you have become too powerful for us.”\n" +
                                    "\n" +
                                    "17 So Isaac moved away from there and encamped in the Valley of Gerar, where he settled. 18 Isaac reopened the wells that had been dug in the time of his father Abraham, which the Philistines had stopped up after Abraham died, and he gave them the same names his father had given them.\n" +
                                    "\n" +
                                    "19 Isaac’s servants dug in the valley and discovered a well of fresh water there. 20 But the herders of Gerar quarreled with those of Isaac and said, “The water is ours!” So he named the well Esek,[c] because they disputed with him. 21 Then they dug another well, but they quarreled over that one also; so he named it Sitnah.[d] 22 He moved on from there and dug another well, and no one quarreled over it. He named it Rehoboth,[e] saying, “Now the Lord has given us room and we will flourish in the land.”\n" +
                                    "\n" +
                                    "23 From there he went up to Beersheba. 24 That night the Lord appeared to him and said, “I am the God of your father Abraham. Do not be afraid, for I am with you; I will bless you and will increase the number of your descendants for the sake of my servant Abraham.”\n" +
                                    "\n" +
                                    "25 Isaac built an altar there and called on the name of the Lord. There he pitched his tent, and there his servants dug a well.\n" +
                                    "\n" +
                                    "26 Meanwhile, Abimelek had come to him from Gerar, with Ahuzzath his personal adviser and Phicol the commander of his forces. 27 Isaac asked them, “Why have you come to me, since you were hostile to me and sent me away?”\n" +
                                    "\n" +
                                    "28 They answered, “We saw clearly that the Lord was with you; so we said, ‘There ought to be a sworn agreement between us’—between us and you. Let us make a treaty with you 29 that you will do us no harm, just as we did not harm you but always treated you well and sent you away peacefully. And now you are blessed by the Lord.”\n" +
                                    "\n" +
                                    "30 Isaac then made a feast for them, and they ate and drank. 31 Early the next morning the men swore an oath to each other. Then Isaac sent them on their way, and they went away peacefully.\n" +
                                    "\n" +
                                    "32 That day Isaac’s servants came and told him about the well they had dug. They said, “We’ve found water!” 33 He called it Shibah,[f] and to this day the name of the town has been Beersheba.[g]\n");

                            break;
                        }


                        case 20: {
                            old_text.append(" Zechariah 9\n" +
                                    "Judgment on Israel’s Enemies\n" +
                                    "\n" +
                                    "9 A prophecy:\n" +
                                    "\n" +
                                    "The word of the Lord is against the land of Hadrak\n" +
                                    "    and will come to rest on Damascus—\n" +
                                    "for the eyes of all people and all the tribes of Israel\n" +
                                    "    are on the Lord—[a]\n" +
                                    "2 \n" +
                                    "and on Hamath too, which borders on it,\n" +
                                    "    and on Tyre and Sidon, though they are very skillful.\n" +
                                    "3 \n" +
                                    "Tyre has built herself a stronghold;\n" +
                                    "    she has heaped up silver like dust,\n" +
                                    "    and gold like the dirt of the streets.\n" +
                                    "4 \n" +
                                    "But the Lord will take away her possessions\n" +
                                    "    and destroy her power on the sea,\n" +
                                    "    and she will be consumed by fire.\n" +
                                    "5 \n" +
                                    "Ashkelon will see it and fear;\n" +
                                    "    Gaza will writhe in agony,\n" +
                                    "    and Ekron too, for her hope will wither.\n" +
                                    "Gaza will lose her king\n" +
                                    "    and Ashkelon will be deserted.\n" +
                                    "6 \n" +
                                    "A mongrel people will occupy Ashdod,\n" +
                                    "    and I will put an end to the pride of the Philistines.\n" +
                                    "7 \n" +
                                    "I will take the blood from their mouths,\n" +
                                    "    the forbidden food from between their teeth.\n" +
                                    "Those who are left will belong to our God\n" +
                                    "    and become a clan in Judah,\n" +
                                    "    and Ekron will be like the Jebusites.\n" +
                                    "8 \n" +
                                    "But I will encamp at my temple\n" +
                                    "    to guard it against marauding forces.\n" +
                                    "Never again will an oppressor overrun my people,\n" +
                                    "    for now I am keeping watch.\n" +
                                    "The Coming of Zion’s King\n" +
                                    "\n" +
                                    "9 \n" +
                                    "Rejoice greatly, Daughter Zion!\n" +
                                    "    Shout, Daughter Jerusalem!\n" +
                                    "See, your king comes to you,\n" +
                                    "    righteous and victorious,\n" +
                                    "lowly and riding on a donkey,\n" +
                                    "    on a colt, the foal of a donkey.\n" +
                                    "10 \n" +
                                    "I will take away the chariots from Ephraim\n" +
                                    "    and the warhorses from Jerusalem,\n" +
                                    "    and the battle bow will be broken.\n" +
                                    "He will proclaim peace to the nations.\n" +
                                    "    His rule will extend from sea to sea\n" +
                                    "    and from the River[b] to the ends of the earth.\n" +
                                    "11 \n" +
                                    "As for you, because of the blood of my covenant with you,\n" +
                                    "    I will free your prisoners from the waterless pit.\n" +
                                    "12 \n" +
                                    "Return to your fortress, you prisoners of hope;\n" +
                                    "    even now I announce that I will restore twice as much to you.\n");

                            break;
                        }


                        case 27: {

                            old_text.append(" 2 Samuel 22\n" +
                                    "David’s Song of Praise\n" +
                                    "\n" +
                                    "22 David sang to the Lord the words of this song when the Lord delivered him from the hand of all his enemies and from the hand of Saul. 2 He said:\n" +
                                    "\n" +
                                    "“The Lord is my rock, my fortress and my deliverer;\n" +
                                    "3 \n" +
                                    "    my God is my rock, in whom I take refuge,\n" +
                                    "    my shield[a] and the horn[b] of my salvation.\n" +
                                    "He is my stronghold, my refuge and my savior—\n" +
                                    "    from violent people you save me.\n" +
                                    "\n" +
                                    "4 \n" +
                                    "“I called to the Lord, who is worthy of praise,\n" +
                                    "    and have been saved from my enemies.\n" +
                                    "5 \n" +
                                    "The waves of death swirled about me;\n" +
                                    "    the torrents of destruction overwhelmed me.\n" +
                                    "6 \n" +
                                    "The cords of the grave coiled around me;\n" +
                                    "    the snares of death confronted me.\n" +
                                    "\n" +
                                    "7 \n" +
                                    "“In my distress I called to the Lord;\n" +
                                    "    I called out to my God.\n" +
                                    "From his temple he heard my voice;\n" +
                                    "    my cry came to his ears.\n" +
                                    "8 \n" +
                                    "The earth trembled and quaked,\n" +
                                    "    the foundations of the heavens[c] shook;\n" +
                                    "    they trembled because he was angry.\n" +
                                    "9 \n" +
                                    "Smoke rose from his nostrils;\n" +
                                    "    consuming fire came from his mouth,\n" +
                                    "    burning coals blazed out of it.\n" +
                                    "10 \n" +
                                    "He parted the heavens and came down;\n" +
                                    "    dark clouds were under his feet.\n" +
                                    "11 \n" +
                                    "He mounted the cherubim and flew;\n" +
                                    "    he soared[d] on the wings of the wind.\n" +
                                    "12 \n" +
                                    "He made darkness his canopy around him—\n" +
                                    "    the dark[e] rain clouds of the sky.\n" +
                                    "13 \n" +
                                    "Out of the brightness of his presence\n" +
                                    "    bolts of lightning blazed forth.\n" +
                                    "14 \n" +
                                    "The Lord thundered from heaven;\n" +
                                    "    the voice of the Most High resounded.\n" +
                                    "15 \n" +
                                    "He shot his arrows and scattered the enemy,\n" +
                                    "    with great bolts of lightning he routed them.\n" +
                                    "16 \n" +
                                    "The valleys of the sea were exposed\n" +
                                    "    and the foundations of the earth laid bare\n" +
                                    "at the rebuke of the Lord,\n" +
                                    "    at the blast of breath from his nostrils.\n" +
                                    "\n" +
                                    "17 \n" +
                                    "“He reached down from on high and took hold of me;\n" +
                                    "    he drew me out of deep waters.\n" +
                                    "18 \n" +
                                    "He rescued me from my powerful enemy,\n" +
                                    "    from my foes, who were too strong for me.\n" +
                                    "19 \n" +
                                    "They confronted me in the day of my disaster,\n" +
                                    "    but the Lord was my support.\n" +
                                    "20 \n" +
                                    "He brought me out into a spacious place;\n" +
                                    "    he rescued me because he delighted in me.\n" +
                                    "\n");

                            break;
                        }

                        default: {
                            Toast.makeText(old_testament_lesson.this,"you will only get sunday scripture readings ",Toast.LENGTH_LONG).show();

                            break;
                        }


                    }
                    break;
                }

                case 4: {
                    switch (day_x) {

                        case 3: {
                            old_text.append("Genesis 28\n"+"10 Jacob left Beersheba and set out for Harran. 11 When he reached a certain place, he stopped for the night because the sun had set. Taking one of the stones there, he put it under his head and lay down to sleep. 12 He had a dream in which he saw a stairway resting on the earth, with its top reaching to heaven, and the angels of God were ascending and descending on it. 13 There above it[c] stood the Lord, and he said: “I am the Lord, the God of your father Abraham and the God of Isaac. I will give you and your descendants the land on which you are lying. 14 Your descendants will be like the dust of the earth, and you will spread out to the west and to the east, to the north and to the south. All peoples on earth will be blessed through you and your offspring.[d] 15 I am with you and will watch over you wherever you go, and I will bring you back to this land. I will not leave you until I have done what I have promised you.”\n" +
                                    "\n" +
                                    "16 When Jacob awoke from his sleep, he thought, “Surely the Lord is in this place, and I was not aware of it.” 17 He was afraid and said, “How awesome is this place! This is none other than the house of God; this is the gate of heaven.”\n" +
                                    "\n" +
                                    "18 Early the next morning Jacob took the stone he had placed under his head and set it up as a pillar and poured oil on top of it. 19 He called that place Bethel,[e] though the city used to be called Luz.\n" +
                                    "\n" +
                                    "20 Then Jacob made a vow, saying, “If God will be with me and will watch over me on this journey I am taking and will give me food to eat and clothes to wear 21 so that I return safely to my father’s household, then the Lord[f] will be my God 22 and[g] this stone that I have set up as a pillar will be God’s house, and of all that you give me I will give you a tenth.”\n");

                            break;
                        }

                        case 10: {
                            old_text.append("2 Chronicles 34\n"+"29 Then the king called together all the elders of Judah and Jerusalem. 30 He went up to the temple of the Lord with the people of Judah, the inhabitants of Jerusalem, the priests and the Levites—all the people from the least to the greatest. He read in their hearing all the words of the Book of the Covenant, which had been found in the temple of the Lord. 31 The king stood by his pillar and renewed the covenant in the presence of the Lord—to follow the Lord and keep his commands, statutes and decrees with all his heart and all his soul, and to obey the words of the covenant written in this book.\n" +
                                    "\n" +
                                    "32 Then he had everyone in Jerusalem and Benjamin pledge themselves to it; the people of Jerusalem did this in accordance with the covenant of God, the God of their ancestors.\n" +
                                    "\n" +
                                    "33 Josiah removed all the detestable idols from all the territory belonging to the Israelites, and he had all who were present in Israel serve the Lord their God. As long as he lived, they did not fail to follow the Lord, the God of their ancestors.\n");

                            break;
                        }

                        case 17: {
                            old_text.append(" Jeremiah 9\n" +
                                    "\n" +
                                    "9 [a]1 Oh, that my head were a spring of water\n" +
                                    "    and my eyes a fountain of tears!\n" +
                                    "I would weep day and night\n" +
                                    "    for the slain of my people.\n" +
                                    "2 \n" +
                                    "Oh, that I had in the desert\n" +
                                    "    a lodging place for travelers,\n" +
                                    "so that I might leave my people\n" +
                                    "    and go away from them;\n" +
                                    "for they are all adulterers,\n" +
                                    "    a crowd of unfaithful people.\n" +
                                    "\n" +
                                    "3 \n" +
                                    "“They make ready their tongue\n" +
                                    "    like a bow, to shoot lies;\n" +
                                    "it is not by truth\n" +
                                    "    that they triumph[b] in the land.\n" +
                                    "They go from one sin to another;\n" +
                                    "    they do not acknowledge me,”\n" +
                                    "declares the Lord.\n" +
                                    "4 \n" +
                                    "“Beware of your friends;\n" +
                                    "    do not trust anyone in your clan.\n" +
                                    "For every one of them is a deceiver,[c]\n" +
                                    "    and every friend a slanderer.\n" +
                                    "5 \n" +
                                    "Friend deceives friend,\n" +
                                    "    and no one speaks the truth.\n" +
                                    "They have taught their tongues to lie;\n" +
                                    "    they weary themselves with sinning.\n" +
                                    "6 \n" +
                                    "You[d] live in the midst of deception;\n" +
                                    "    in their deceit they refuse to acknowledge me,”\n" +
                                    "declares the Lord.\n" +
                                    "\n" +
                                    "7 Therefore this is what the Lord Almighty says:\n" +
                                    "\n" +
                                    "“See, I will refine and test them,\n" +
                                    "    for what else can I do\n" +
                                    "    because of the sin of my people?\n" +
                                    "8 \n" +
                                    "Their tongue is a deadly arrow;\n" +
                                    "    it speaks deceitfully.\n" +
                                    "With their mouths they all speak cordially to their neighbors,\n" +
                                    "    but in their hearts they set traps for them.\n" +
                                    "9 \n" +
                                    "Should I not punish them for this?”\n" +
                                    "    declares the Lord.\n" +
                                    "“Should I not avenge myself\n" +
                                    "    on such a nation as this?”\n" +
                                    "\n" +
                                    "10 \n" +
                                    "I will weep and wail for the mountains\n" +
                                    "    and take up a lament concerning the wilderness grasslands.\n" +
                                    "They are desolate and untraveled,\n" +
                                    "    and the lowing of cattle is not heard.\n" +
                                    "The birds have all fled\n" +
                                    "    and the animals are gone.");

                            break;
                        }

                        case 24: {
                            old_text.append(" Exodus 34New International Version (NIV)\n" +
                                    "The New Stone Tablets\n" +
                                    "\n" +
                                    "34 The Lord said to Moses, “Chisel out two stone tablets like the first ones, and I will write on them the words that were on the first tablets, which you broke. 2 Be ready in the morning, and then come up on Mount Sinai. Present yourself to me there on top of the mountain. 3 No one is to come with you or be seen anywhere on the mountain; not even the flocks and herds may graze in front of the mountain.”\n" +
                                    "\n" +
                                    "4 So Moses chiseled out two stone tablets like the first ones and went up Mount Sinai early in the morning, as the Lord had commanded him; and he carried the two stone tablets in his hands. 5 Then the Lord came down in the cloud and stood there with him and proclaimed his name, the Lord. 6 And he passed in front of Moses, proclaiming, “The Lord, the Lord, the compassionate and gracious God, slow to anger, abounding in love and faithfulness, 7 maintaining love to thousands, and forgiving wickedness, rebellion and sin. Yet he does not leave the guilty unpunished; he punishes the children and their children for the sin of the parents to the third and fourth generation.”\n" +
                                    "\n" +
                                    "8 Moses bowed to the ground at once and worshiped. 9 “Lord,” he said, “if I have found favor in your eyes, then let the Lord go with us. Although this is a stiff-necked people, forgive our wickedness and our sin, and take us as your inheritance.”\n" +
                                    "\n");

                            break;
                        }

                        default: {
                            Toast.makeText(old_testament_lesson.this,"you will only get sunday scripture readings ",Toast.LENGTH_LONG).show();

                            break;
                        }
                    }
                    break;
                }

                default: {
                    Toast.makeText(old_testament_lesson.this,"you need to update for further usage of scripture readings, please support , thank you",Toast.LENGTH_LONG).show();
                }

            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_old_testament_lesson, menu);
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
