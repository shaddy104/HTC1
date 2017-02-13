package com.example.shadrach.htc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class gospel_lesson extends AppCompatActivity {

    int gos_month,gos_year,day_x;
    TextView gos_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gospel_lesson);

        gos_text = (TextView)findViewById(R.id.textView82);

        Calendar gos_cal = Calendar.getInstance();

        gos_month = gos_cal.get(Calendar.MONTH);
        gos_year = gos_cal.get(Calendar.YEAR);
        day_x = gos_cal.get(Calendar.DAY_OF_MONTH);


        if (gos_year == 2016) {
            switch (gos_month + 1) {
                case 2: {
                    switch (day_x) {
                        case 21: {
                            gos_text.append(" Mark 2\n" +
                                    "Jesus Forgives and Heals a Paralyzed Man\n" +
                                    "\n" +
                                    "2 A few days later, when Jesus again entered Capernaum, the people heard that he had come home. 2 They gathered in such large numbers that there was no room left, not even outside the door, and he preached the word to them. 3 Some men came, bringing to him a paralyzed man, carried by four of them. 4 Since they could not get him to Jesus because of the crowd, they made an opening in the roof above Jesus by digging through it and then lowered the mat the man was lying on. 5 When Jesus saw their faith, he said to the paralyzed man, “Son, your sins are forgiven.”\n" +
                                    "\n" +
                                    "6 Now some teachers of the law were sitting there, thinking to themselves, 7 “Why does this fellow talk like that? He’s blaspheming! Who can forgive sins but God alone?”\n" +
                                    "\n" +
                                    "8 Immediately Jesus knew in his spirit that this was what they were thinking in their hearts, and he said to them, “Why are you thinking these things? 9 Which is easier: to say to this paralyzed man, ‘Your sins are forgiven,’ or to say, ‘Get up, take your mat and walk’? 10 But I want you to know that the Son of Man has authority on earth to forgive sins.” So he said to the man, 11 “I tell you, get up, take your mat and go home.” 12 He got up, took his mat and walked out in full view of them all. This amazed everyone and they praised God, saying, “We have never seen anything like this!”\n");

                            break;
                        }
                        case 28: {
                            gos_text.append("Matthew 15\n"+"The Faith of a Canaanite Woman\n" +
                                    "\n" +
                                    "21 Leaving that place, Jesus withdrew to the region of Tyre and Sidon. 22 A Canaanite woman from that vicinity came to him, crying out, “Lord, Son of David, have mercy on me! My daughter is demon-possessed and suffering terribly.”\n" +
                                    "\n" +
                                    "23 Jesus did not answer a word. So his disciples came to him and urged him, “Send her away, for she keeps crying out after us.”\n" +
                                    "\n" +
                                    "24 He answered, “I was sent only to the lost sheep of Israel.”\n" +
                                    "\n" +
                                    "25 The woman came and knelt before him. “Lord, help me!” she said.\n" +
                                    "\n" +
                                    "26 He replied, “It is not right to take the children’s bread and toss it to the dogs.”\n" +
                                    "\n" +
                                    "27 “Yes it is, Lord,” she said. “Even the dogs eat the crumbs that fall from their master’s table.”\n" +
                                    "\n" +
                                    "28 Then Jesus said to her, “Woman, you have great faith! Your request is granted.” And her daughter was healed at that moment.\n");
                            break;

                        }
                        default: {
                            Toast.makeText(gospel_lesson.this,"you will get only sunday Scripture readings",Toast.LENGTH_LONG).show();
                            break;

                        }
                    }
                    break;

                }
                case 3: {
                    switch (day_x) {

                        case 6: {
                            gos_text.append("Luke 13\n"+"Jesus Heals a Crippled Woman on the Sabbath\n" +
                                    "\n" +
                                    "10 On a Sabbath Jesus was teaching in one of the synagogues, 11 and a woman was there who had been crippled by a spirit for eighteen years. She was bent over and could not straighten up at all. 12 When Jesus saw her, he called her forward and said to her, “Woman, you are set free from your infirmity.” 13 Then he put his hands on her, and immediately she straightened up and praised God.\n" +
                                    "\n" +
                                    "14 Indignant because Jesus had healed on the Sabbath, the synagogue leader said to the people, “There are six days for work. So come and be healed on those days, not on the Sabbath.”\n" +
                                    "\n" +
                                    "15 The Lord answered him, “You hypocrites! Doesn’t each of you on the Sabbath untie your ox or donkey from the stall and lead it out to give it water? 16 Then should not this woman, a daughter of Abraham, whom Satan has kept bound for eighteen long years, be set free on the Sabbath day from what bound her?”\n" +
                                    "\n" +
                                    "17 When he said this, all his opponents were humiliated, but the people were delighted with all the wonderful things he was doing.\n");
                            break;

                        }


                        case 13: {
                            gos_text.append("Mark 10\n"+"Blind Bartimaeus Receives His Sight\n" +
                                    "\n" +
                                    "46 Then they came to Jericho. As Jesus and his disciples, together with a large crowd, were leaving the city, a blind man, Bartimaeus (which means “son of Timaeus”), was sitting by the roadside begging. 47 When he heard that it was Jesus of Nazareth, he began to shout, “Jesus, Son of David, have mercy on me!”\n" +
                                    "\n" +
                                    "48 Many rebuked him and told him to be quiet, but he shouted all the more, “Son of David, have mercy on me!”\n" +
                                    "\n" +
                                    "49 Jesus stopped and said, “Call him.”\n" +
                                    "\n" +
                                    "So they called to the blind man, “Cheer up! On your feet! He’s calling you.” 50 Throwing his cloak aside, he jumped to his feet and came to Jesus.\n" +
                                    "\n" +
                                    "51 “What do you want me to do for you?” Jesus asked him.\n" +
                                    "\n" +
                                    "The blind man said, “Rabbi, I want to see.”\n" +
                                    "\n" +
                                    "52 “Go,” said Jesus, “your faith has healed you.” Immediately he received his sight and followed Jesus along the road.\n");
                            break;

                        }


                        case 20: {
                            gos_text.append("Luke 19\n"+"29 As he approached Bethphage and Bethany at the hill called the Mount of Olives, he sent two of his disciples, saying to them, 30 “Go to the village ahead of you, and as you enter it, you will find a colt tied there, which no one has ever ridden. Untie it and bring it here. 31 If anyone asks you, ‘Why are you untying it?’ say, ‘The Lord needs it.’”\n" +
                                    "\n" +
                                    "32 Those who were sent ahead went and found it just as he had told them. 33 As they were untying the colt, its owners asked them, “Why are you untying the colt?”\n" +
                                    "\n" +
                                    "34 They replied, “The Lord needs it.”\n" +
                                    "\n" +
                                    "35 They brought it to Jesus, threw their cloaks on the colt and put Jesus on it. 36 As he went along, people spread their cloaks on the road.\n" +
                                    "\n" +
                                    "37 When he came near the place where the road goes down the Mount of Olives, the whole crowd of disciples began joyfully to praise God in loud voices for all the miracles they had seen:\n" +
                                    "\n" +
                                    "38 \n" +
                                    "“Blessed is the king who comes in the name of the Lord!”[b]\n" +
                                    "\n" +
                                    "“Peace in heaven and glory in the highest!”\n" +
                                    "\n" +
                                    "39 Some of the Pharisees in the crowd said to Jesus, “Teacher, rebuke your disciples!”\n" +
                                    "\n" +
                                    "40 “I tell you,” he replied, “if they keep quiet, the stones will cry out.”\n" +
                                    "\n");
                            break;

                        }


                        case 27: {
                            gos_text.append(" Mark 16\n" +
                                    "Jesus Has Risen\n" +
                                    "\n" +
                                    "16 When the Sabbath was over, Mary Magdalene, Mary the mother of James, and Salome bought spices so that they might go to anoint Jesus’ body. 2 Very early on the first day of the week, just after sunrise, they were on their way to the tomb 3 and they asked each other, “Who will roll the stone away from the entrance of the tomb?”\n" +
                                    "\n" +
                                    "4 But when they looked up, they saw that the stone, which was very large, had been rolled away. 5 As they entered the tomb, they saw a young man dressed in a white robe sitting on the right side, and they were alarmed.\n" +
                                    "\n" +
                                    "6 “Don’t be alarmed,” he said. “You are looking for Jesus the Nazarene, who was crucified. He has risen! He is not here. See the place where they laid him. 7 But go, tell his disciples and Peter, ‘He is going ahead of you into Galilee. There you will see him, just as he told you.’”\n" +
                                    "\n" +
                                    "8 Trembling and bewildered, the women went out and fled from the tomb. They said nothing to anyone, because they were afraid.[a]\n" +
                                    "\n" +
                                    "[The earliest manuscripts and some other ancient witnesses do not have verses 9–20.]\n" +
                                    "\n" +
                                    "9 When Jesus rose early on the first day of the week, he appeared first to Mary Magdalene, out of whom he had driven seven demons. 10 She went and told those who had been with him and who were mourning and weeping. 11 When they heard that Jesus was alive and that she had seen him, they did not believe it.\n" +
                                    "\n");
                            break;

                        }

                        default: {
                            Toast.makeText(gospel_lesson.this,"you will get only sunday Scripture readings",Toast.LENGTH_LONG).show();
                            break;

                        }


                    }
                    break;
                }

                case 4: {
                    switch (day_x) {

                        case 3: {
                            gos_text.append("John 20\n"+"Jesus Appears to Mary Magdalene\n" +
                                    "\n" +
                                    "11 Now Mary stood outside the tomb crying. As she wept, she bent over to look into the tomb 12 and saw two angels in white, seated where Jesus’ body had been, one at the head and the other at the foot.\n" +
                                    "\n" +
                                    "13 They asked her, “Woman, why are you crying?”\n" +
                                    "\n" +
                                    "“They have taken my Lord away,” she said, “and I don’t know where they have put him.” 14 At this, she turned around and saw Jesus standing there, but she did not realize that it was Jesus.\n" +
                                    "\n" +
                                    "15 He asked her, “Woman, why are you crying? Who is it you are looking for?”\n" +
                                    "\n" +
                                    "Thinking he was the gardener, she said, “Sir, if you have carried him away, tell me where you have put him, and I will get him.”\n" +
                                    "\n" +
                                    "16 Jesus said to her, “Mary.”\n" +
                                    "\n" +
                                    "She turned toward him and cried out in Aramaic, “Rabboni!” (which means “Teacher”).\n" +
                                    "\n" +
                                    "17 Jesus said, “Do not hold on to me, for I have not yet ascended to the Father. Go instead to my brothers and tell them, ‘I am ascending to my Father and your Father, to my God and your God.’”\n" +
                                    "\n" +
                                    "18 Mary Magdalene went to the disciples with the news: “I have seen the Lord!” And she told them that he had said these things to her.\n");
                            break;

                        }

                        case 10: {
                            gos_text.append("Luke 24\n"+"On the Road to Emmaus\n" +
                                    "\n" +
                                    "13 Now that same day two of them were going to a village called Emmaus, about seven miles[a] from Jerusalem. 14 They were talking with each other about everything that had happened. 15 As they talked and discussed these things with each other, Jesus himself came up and walked along with them; 16 but they were kept from recognizing him.\n" +
                                    "\n" +
                                    "17 He asked them, “What are you discussing together as you walk along?”\n" +
                                    "\n" +
                                    "They stood still, their faces downcast. 18 One of them, named Cleopas, asked him, “Are you the only one visiting Jerusalem who does not know the things that have happened there in these days?”\n" +
                                    "\n" +
                                    "19 “What things?” he asked.\n" +
                                    "\n" +
                                    "“About Jesus of Nazareth,” they replied. “He was a prophet, powerful in word and deed before God and all the people. 20 The chief priests and our rulers handed him over to be sentenced to death, and they crucified him; 21 but we had hoped that he was the one who was going to redeem Israel. And what is more, it is the third day since all this took place. 22 In addition, some of our women amazed us. They went to the tomb early this morning 23 but didn’t find his body. They came and told us that they had seen a vision of angels, who said he was alive. 24 Then some of our companions went to the tomb and found it just as the women had said, but they did not see Jesus.”\n" +
                                    "\n" +
                                    "25 He said to them, “How foolish you are, and how slow to believe all that the prophets have spoken! 26 Did not the Messiah have to suffer these things and then enter his glory?” 27 And beginning with Moses and all the Prophets, he explained to them what was said in all the Scriptures concerning himself.\n" +
                                    "\n");
                            break;

                        }

                        case 17: {
                            gos_text.append("John 20\n"+"Jesus Appears to His Disciples\n" +
                                    "\n" +
                                    "19 On the evening of that first day of the week, when the disciples were together, with the doors locked for fear of the Jewish leaders, Jesus came and stood among them and said, “Peace be with you!” 20 After he said this, he showed them his hands and side. The disciples were overjoyed when they saw the Lord.\n" +
                                    "\n" +
                                    "21 Again Jesus said, “Peace be with you! As the Father has sent me, I am sending you.” 22 And with that he breathed on them and said, “Receive the Holy Spirit. 23 If you forgive anyone’s sins, their sins are forgiven; if you do not forgive them, they are not forgiven.”\n");
                            break;

                        }

                        case 24: {
                            gos_text.append("John 17\n"+"Jesus Prays for His Disciples\n" +
                                    "\n" +
                                    "6 “I have revealed you[a] to those whom you gave me out of the world. They were yours; you gave them to me and they have obeyed your word. 7 Now they know that everything you have given me comes from you. 8 For I gave them the words you gave me and they accepted them. They knew with certainty that I came from you, and they believed that you sent me. 9 I pray for them. I am not praying for the world, but for those you have given me, for they are yours. 10 All I have is yours, and all you have is mine. And glory has come to me through them. 11 I will remain in the world no longer, but they are still in the world, and I am coming to you. Holy Father, protect them by the power of[b] your name, the name you gave me, so that they may be one as we are one. 12 While I was with them, I protected them and kept them safe by[c] that name you gave me. None has been lost except the one doomed to destruction so that Scripture would be fulfilled.\n" +
                                    "\n" +
                                    "13 “I am coming to you now, but I say these things while I am still in the world, so that they may have the full measure of my joy within them. 14 I have given them your word and the world has hated them, for they are not of the world any more than I am of the world. 15 My prayer is not that you take them out of the world but that you protect them from the evil one. 16 They are not of the world, even as I am not of it. 17 Sanctify them by[d] the truth; your word is truth. 18 As you sent me into the world, I have sent them into the world. 19 For them I sanctify myself, that they too may be truly sanctified.\n");
                            break;

                        }

                        default: {
                            Toast.makeText(gospel_lesson.this,"you will get only sunday Scripture readings",Toast.LENGTH_LONG).show();
                            break;

                        }
                    }
                    break;
                }
                default:{
                    Toast.makeText(gospel_lesson.this,"App needs to be updated , please support us",Toast.LENGTH_LONG).show();
                }

            }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gospel_lesson, menu);
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
