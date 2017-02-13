package com.example.shadrach.htc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class BurialHymns extends AppCompatActivity {

    TextView hymn_txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burial_hymns);

        hymn_txt = (TextView)findViewById(R.id.textView212);
        hymn_txt.setText("select song from the top navigation bar");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_burial_hymns, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.safe_in_the_arms){
            hymn_txt.setText("1\t\tSAFE in the arms of Jesus,\n" +
                    "Safe on His gentle breast, \nThere by His love O\'ershaded,\n" +
                    "Sweetly my soul shall rest!\n" +
                    "Hark! tis the voice of angels\n" +
                    "Borne in a song to me\n" +
                    "Over the field of glory,\n" +
                    "Over the jasper sea.\n" +
                    "Safe in the arms of Jesus,\n" +
                    "Safe on His gentle breast.\n" +
                    "There by His love O'ershaded,\n" +
                    "Sweetly my soul shall rest.\n" +
                    "\n" +
                    "2\t\tSafe in the arms of Jesus,\n" +
                    "Safe from corroding care\n" +
                    "Safe from the world's temptations.\n" +
                    "Sin cannot harm me there:\n" +
                    "Free from the blight of sorrow;\n" +
                    "Free from my doubts and fears;\n" +
                    "Only a few more trials\n" +
                    "Only a few more tears\n" +
                    "CHORUS\n\n" +
                    "3\t\tJesus my heart's dear Refuge,\n" +
                    "Jesus has died for me;\n" +
                    "Firm on the Rock of Ages\n" +
                    "Ever my trust shall be:\n" +
                    "Here let me wait with patience,\n" +
                    "Wait till the night is O'er;\n" +
                    "Wait till I see the morning\n" +
                    "Break on the golden shore\n" +
                    "CHORUS");
        }

        if (id == R.id.when_all_my_labours){
            hymn_txt.setText("1034\n" +
                    "1.\tWhen all my labours and trials are o\\’er\n" +
                    "And I am safe on the beautiful shore\n" +
                    "Just to be near the dear Lord I adore,\n" +
                    "Will through the ages be glory for me.\n" +
                    "\n" +
                    "CHORUS\n" +
                    "\n" +
                    "Oh, that will be.. glory for me…\n" +
                    "Glory for me… glory for me…\n" +
                    "When by His grace I shall look on His face.\n" +
                    "That will be glory. Be glory for me!\n" +
                    "\n" +
                    "1.\tWhen by the gift of His infinite grace,\n" +
                    "I am accorded in heaven a place,\n" +
                    "Just to be there and to look on His face\n" +
                    "Will through the ages be glory for me\n" +
                    "\n" +
                    "CHORUS\n" +
                    "\n" +
                    "2.\tFriends will be there I have long ago;\n" +
                    "Joy like a river around me will flow;\n" +
                    "Yet just a smile from my Saviour I know\n" +
                    "Will through the ages be glory for me.\n" +
                    "\n" +
                    "CHORUS\n");
        }

        if (id == R.id.when_the_trumpet){
            hymn_txt.setText("1.\tWhen the trumpet of the Lord shall sound,\n" +
                    "And time shall be no more,\n" +
                    "And the morning breaks,\n" +
                    "Eternal bright ad fair,\n" +
                    "When the saved of earth shall gather over on the other shore,\n" +
                    "And the roll is called up yonder I’LL be there,\n" +
                    "\n" +
                    "CHORUS\n" +
                    "\n" +
                    "When the roll… is called up,\n" +
                    "Yon- -der,\n" +
                    "When the roll… is called up,\n" +
                    "Yon- -der,\n" +
                    "When the roll… is called up,\n" +
                    "Yon- -der,\n" +
                    "When the roll… is called up,\n" +
                    "Yon- -der, I’LL be there,\n" +
                    "2.\tOn that bright and cloudless morning when the dead in Christ shall rise,\n" +
                    "And the glory of His resurrection share;\n" +
                    "When His chosen ones shall gather to their home beyond the skies,\n" +
                    "And the roll is calledup yonder, I’LL be there,\n" +
                    "\n" +
                    "CHORUS\n" +
                    "\n" +
                    "3.\tLet me labour for the Master from the dawn till setting sun,\n" +
                    "Let me talk of all His wondrous love and care;\n" +
                    "Then when all of life is over,\n" +
                    "And my work on earth is done\n" +
                    "And the roll is called up yonder I’LL be there,\n");
        }

        if (id == R.id.abide_with_me){
            hymn_txt.setText("948 \n" +
                    "1.\tABIDE with me; fast falls the eventide; \n" +
                    "The darkness deepens; Lord, with me abide!\n" +
                    "When other helpers fall, and comforts flee,\n" +
                    "Help of the helpless, O abide with me.\n" +
                    "\n" +
                    "2.\tSwift to its close ebbs out life’s little day;\n" +
                    "Earth’s Joys grow dim, its glories pass away;\n" +
                    "Change and decay in all around I see;\n" +
                    "O Thou who changes tot, abide with me!\n" +
                    "\n" +
                    "3.\tI need Thy presence every passing hour;\n" +
                    "What but Thy grace can foil the tempter’s power?\n" +
                    "Who like Thyself my guide and stay can be?\n" +
                    "Through cloud and sunshine, O abide with me.\n" +
                    "\n" +
                    "4.\tI fear no foe, with Thee at hand to bless;\n" +
                    "ILLs have no weight , and tears no bitterness;\n" +
                    "Where is death’s sting? Where, grave, thy victory?\n" +
                    "I triumph still, if Thou abide with me.\n" +
                    "\n" +
                    "5.\tHold Thou Thy Cross before my closing eyes;\n" +
                    "Shine through the gloom, and point me to the skies;\n" +
                    "Heaven’s morning breaks, and earth’s vain shadows flee :\n" +
                    "In life, in death, O Lord, abide with me!\n");
        }

        if (id == R.id.rejoice_for){
            hymn_txt.setText("973\n" +
                    "1.\tREJOICE for a brother deceased, Our loss is his infinite gain;\n" +
                    "A soul out of prison released, And freed from its bodily chain;\n" +
                    "With songs let us follow his flight, And mount with his spirit above,\n" +
                    "Escaped to the mansions of light, And lodged in the Eden of love.\n" +
                    "\n" +
                    "2.\tOur brother the haven hath gained, Out-flying the tempest and wind,\n" +
                    "His rest he hath sooner obtained, And left his companions behind,\n" +
                    "Still tossed o a sea of distress, Hard toiling to make the blest shore,\n" +
                    "Where all is assurance and peace, And sorrow and sin are no more,\n" +
                    "\n" +
                    "3.\tThere all the ship’s company meet Who sailed with the Saviour beneath,\n" +
                    "With shouting each other they greet, And triumph o’er trouble and death:\n" +
                    "The voyage of life’s at an end, The mortal affliction is past;\n" +
                    "The age that in heaven they spend For ever and ever shall last.  \n");
        }

        if (id == R.id.god_of_the_living){
            hymn_txt.setText("974 \n" +
                    "1.\tGOD of the living. In whose eyes Unvelied Thy whole creation lies,\n" +
                    "All souls are Thine; we must not say\n" +
                    "That those are dead who pass away;\n" +
                    "From this our world of flesh set free,\n" +
                    "We know them living unto thee.\n" +
                    "\n" +
                    "2.\tReleased from earthly toil and strife,\n" +
                    "With Thee is hidden still their life;\n" +
                    "Thine are their thoughts, their works, their powers,\n" +
                    "All Thine, and yet most truly ours;\n" +
                    "For well we know, where’er they be,\n" +
                    "Our dead are living unto Thee.\n" +
                    "\n" +
                    "3.\tThy word is true, Thy will is just :\n" +
                    "To Thee we leave them, Lord, in trust;\n" +
                    "And bless Thee for the love which gave\n" +
                    "Thy Son to fill a human grave,\n" +
                    "That none might fear that world to see\n" +
                    "Where all are living unto Thee.\n" +
                    "\n" +
                    "4.\tO Giver unto man of breath,\n" +
                    "O Holder of the keys of death,\n" +
                    "O Quickener of the life within,\n" +
                    "Save us from death, the death of sin;\n" +
                    "That body, soul, and spirit be For ever living unto Thee!\n" +
                    "                                                                                              Amen.\n");
        }

        if (id == R.id.when_the_day){
            hymn_txt.setText("975\n" +
                    "1.\tWhen the day of toil is done,\n" +
                    "When the race of life is run,\n" +
                    "Father, grant Thy wearied one\n" +
                    "Rest for evermore.\n" +
                    "\n" +
                    "2.\tWhen the strife of sin is stilled,\n" +
                    "When the foe within is killed,\n" +
                    "Be Thy gracious word fulfilled Peace for evermore.\n" +
                    "\n" +
                    "3.\tWhen the darkness melts away\n" +
                    "At the breaking of the day,\n" +
                    "Bid us hail the cheering ray Light for evermore.\n" +
                    "\n" +
                    "4.\tWhen the heart by sorrow tried\n" +
                    "Feels at length its throbs subside,\n" +
                    "Bring us, where all tears are dried,\n" +
                    "Joy for evermore.\n" +
                    "\n" +
                    "5.\tWhen for vanished days we yearn,\n" +
                    "Days that never can return,\n" +
                    "Teach us in Thy love to learn\n" +
                    "Love for evermore.\n" +
                    "\n" +
                    "6.\tWhen the breath of life is flown,\n" +
                    "When the grave must claim its own,\n" +
                    "Lord of life, be ours Thy crown Life for evermore. \n" +
                    "                                                                                  Amen.\n");
        }

        if (id == R.id.now_the_labourers_task){
            hymn_txt.setText("976\n" +
                    "1.\tNow the labourer’s task is o’er,\n" +
                    "Now the battle-day is past;\n" +
                    "Now upon the farther shore Lands the voyager at last.\n" +
                    "Father, in Thy gracious keeping\n" +
                    "Leave we now Thy servant sleeping.\n" +
                    "\n" +
                    "2.\tThere the tears of earth are dried;\n" +
                    "There its hidden things are clear;\n" +
                    "There the work of life is tried\n" +
                    "By a juster Judge than here.\n" +
                    "\n" +
                    "3.\tThere the Shepherd, bringing home\n" +
                    "Many a lamb forlorn and strayed,\n" +
                    "Shelters each, no more to roam,\n" +
                    "Where the wolf can ne’er invade.\n" +
                    "\n" +
                    "4.\tThere the penitents who turn\n" +
                    "To the Cross their dying eyes\n" +
                    "All the love of Jesus learn\n" +
                    "At His feet in paradise.\n" +
                    "\n" +
                    "5.\tThere no more the powers of hell\n" +
                    "Can prevail to mar their peace;\n" +
                    "Christ the Lord shall guard them well,\n" +
                    "He who died for their release.\n" +
                    "\n" +
                    "6.\tEarth to earth, and dust to dust !\n" +
                    "Calmly now the words we say;\n" +
                    "Left behind, we wait in trust\n" +
                    "For the resurrection day\n");
        }

        if (id == R.id.safe_home_safe_home){
            hymn_txt.setText("977\n" +
                    "1.\tSAFE home, safe home in port !\n" +
                    "Rent cordage, shattered deck,\n" +
                    "Torn sails, provision short,\n" +
                    "And oly not a wreck\n" +
                    "But O the joy upon the shore\n" +
                    "To tell the voyage-perils o\\’er!\n" +
                    "\n" +
                    "2.\tThe prize, the prize secure !\n" +
                    "The athlete nearly fell;\n" +
                    "Bare all he could endure,\n" +
                    "And bare not always well :\n" +
                    "But he may smile at troubles gone\n" +
                    "Who sets the victor-garland on.\n" +
                    "\n" +
                    "3.\tNo more the foe can harm :\n" +
                    "No more of leaguered camp,\n" +
                    "And cry of night alarm,\n" +
                    "And need of ready lamp :\n" +
                    "And yet how nearly had he failed,\n" +
                    "How nearly had that foe prevailed !\n" +
                    "\n" +
                    "4.\tThe exile is at home :\n" +
                    "O nights and days of tears !\n" +
                    "O longings not to roam !\n" +
                    "O sins, and doubts, and fears !\n" +
                    "What matters ow grief’s darkest day?\n" +
                    "The King has wiped those tears away.\n");
        }

        if (id == R.id.when_our_heads){
            hymn_txt.setText("978\n" +
                    "1.\tWhen our heads are bowed with woe,\n" +
                    "When our bitter tears o’erflow,\n" +
                    "Whe we mourn the lost, the dear,\n" +
                    "Jesu, Son of Mary, hear.\n" +
                    "\n" +
                    "2.\tWhen the heart is sad within\n" +
                    "With the thought of all its sin,\n" +
                    "When the spirit shrinks with fear,\n" +
                    "Jesu, Son of Mary, hear.\n" +
                    "\n" +
                    "3.\tThou our throbbing flesh hast worn\n" +
                    "Thou our mortal griefs hast borne,\n" +
                    "Thou hast shed the human tear\n" +
                    "Jesu, Son of Mary, hear.\n" +
                    "\n" +
                    "4.\tThou hast bowed the dying head\n" +
                    "Thou the blood of life hast shed,\n" +
                    "Thou hast filled a mortal bier;\n" +
                    "Jesu, Son of Mary, hear.\n");
        }

        if (id == R.id.jesus_lives){
            hymn_txt.setText("216\n" +
                    "1.\tJesus lives! Thy terrors now\n" +
                    "Can, O death, no more appal us;\n" +
                    "Jesus lives! By this we know\n" +
                    "Thou, O grave, canst not enthral us.\n" +
                    "                                  Hallelujah!\n" +
                    "2.\tJesus lives! To Him the throne\n" +
                    "High o’er heaven and earth is give;\n" +
                    "We may go where He is gone,\n" +
                    "Live and reign with Him in heaven.\n" +
                    "                                   Hallelujah!\n" +
                    "3.\tJesus lives! For us He died;\n" +
                    "Hence may we, to Jesus living,\n" +
                    "Pure in heart and act abide\n" +
                    "Praise to Him and glory giving.\n" +
                    "                                    Hallelujah!\n" +
                    "4.\tJesus lives! Our hearts know well\n" +
                    "Nought from us His love shall sever;\n" +
                    "Life, nor death, nor powers of hell\n" +
                    "Part us now from Christ for ever.\n" +
                    "                                     Hallelujah!\n" +
                    "5.\tJesus lives! Henceforth is death\n" +
                    "Entrance-gate of life immortal;\n" +
                    "This shall calm our trembling breath\n" +
                    "When we pass its gloomy portal.\n" +
                    "                                      Hallelujah!\n");
        }

        if (id == R.id.rock_of_ages){
            hymn_txt.setText("489\n" +
                    "1.\tWORKMAN of God! O lose not heart\n" +
                    "But learn what God is like\n" +
                    "And I the darkest battle-field\n" +
                    "Thou shalt know where to strike.\n" +
                    "\n" +
                    "2.\tThrice blest is he to whom is given\n" +
                    "The instinct that can tell\n" +
                    "That God is on the field when He Is most invisible.\n" +
                    "\n" +
                    "3.\tFor God is other than we think;\n" +
                    "His ways are far above,\n" +
                    "Far beyond reason’s height, and reached\n" +
                    "Only by childlike love.\n" +
                    "\n" +
                    "4.\tThen learn to scorn the praise of man, \n" +
                    "And learn to lose with God;\n" +
                    "For Jesus won the world through shame,\n" +
                    "And beckons thee His road.\n" +
                    "\n" +
                    "5.\tFor right is right, since God is God\n" +
                    "And right the day must win;\n" +
                    "To doubt would be disloyalty\n" +
                    "To falter would be sin.\n");
        }

        if (id == R.id.who_fathoms){
            hymn_txt.setText("513\n" +
                    "1.\tWHO fathoms the eternal thought?\n" +
                    "Who talks of scheme and plan?\n" +
                    "The Lord is God ! He needeth not\n" +
                    "The poor device of man.\n" +
                    "\n" +
                    "2.\tHere in the maddening maze of things,\n" +
                    "When tossed by storm and flood,\n" +
                    "To one fixed ground my spirit clings;\n" +
                    "I know that God is good!\n" +
                    "\n" +
                    "3.\tI long for household voice gone,\n" +
                    "For vanished smiles I long;\n" +
                    "But God hath led my dear ones on,\n" +
                    "And He can do no wrong.\n" +
                    "\n" +
                    "4.\tI know not what the future hath\n" +
                    "Of marvel or surprise,\n" +
                    "Assured alone that life and death\n" +
                    "His mercy underlies. \n" +
                    "\n" +
                    "5.\tAnd if my heart and flesh are weak\n" +
                    "To bear an untried plan,\n" +
                    "The bruised reed he will not break,\n" +
                    "But strengthen and sustain.\n" +
                    "\n" +
                    "6.\tNo offering of my own I have,\n" +
                    "Nor works my faith to prove;\n" +
                    "I can but give the gifts He gave,\n" +
                    "And plead His love for love.\n" +
                    "\n" +
                    "7.\tAnd so beside the silent sea\n" +
                    "I wait the muffled oar;\n" +
                    "No harm from Him can come to me\n" +
                    "On ocean or o shore.\n" +
                    "\n" +
                    "8.\tI know not where His islands lift\n" +
                    "Their fronded palms in air;\n" +
                    "I only know I cannot drift\n" +
                    "Beyond His love and care.\n");
        }

        if (id == R.id.there_is_a_land){
            hymn_txt.setText("649\n" +
                    "1.\tTHERE is a land of pure delight,\n" +
                    "Where saints immortal reign;\n" +
                    "Infinite day excludes the night,\n" +
                    "And pleasures banish pain.\n" +
                    "\n" +
                    "2.\tThere everlasting spring abides,\n" +
                    "And never-withering flowers;\n" +
                    "Death, like a narrow sea, divides\n" +
                    "This heavenly land from ours.\n" +
                    "\n" +
                    "3.\tSweet fields beyond the swelling flood\n" +
                    "Stand dressed I living green;\n" +
                    "So to the jews old canaan stood,\n" +
                    "While Jordan rolled betwee.\n" +
                    "\n" +
                    "4.\tBut timorous mortals start and shrink\n" +
                    "To cross this narrow sea,\n" +
                    "And linger, shivering on the brink,\n" +
                    "And fear to launch away.\n" +
                    "\n" +
                    "5.\tO could we make our doubts remove,\n" +
                    "Those gloomy thoughts that rise,\n" +
                    "And see the canaan that we love\n" +
                    "With unbeclouded eyes:\n" +
                    "\n" +
                    "6.\tCould we but climb where Moses stood\n" +
                    "And view the landscape o’er,\n" +
                    "Not Jordan’s stream, nor death’s cold flood,\n" +
                    "Should fright us from the shore!\n");
        }

        if (id == R.id.for_ever_with_the_lord){
            hymn_txt.setText("658\n" +
                    "1.\tFor ever with the Lord!\n" +
                    "Amen; so let it be:\n" +
                    "Life from the dead is in that word,\n" +
                    "‘Tis immortality.\n" +
                    "Here in the body pent,\n" +
                    "Absent from Him I roam,\n" +
                    "Yet nightly pitch my moving tent\n" +
                    " A day’s march nearer home.\n" +
                    "\n" +
                    "2.\tMy Father’s house on high,\n" +
                    "Home of my soul, how near\n" +
                    "At times, to faith’s foreseeing eye,\n" +
                    "Thy golden gates appear!\n" +
                    "Ah! then my spirit faints\n" +
                    "To reach the land I love,\n" +
                    "The bright inheritance of saints,\n" +
                    "Jerusalem above\n" +
                    "\n" +
                    "3.\tFor ever with the Lord!\n" +
                    "Father, if ‘tis Thy will,\n" +
                    "The promise of that faithful word\n" +
                    "Even here to me fulfil.\n" +
                    "Be Thou at my right hand,\n" +
                    "Then can I never fail;\n" +
                    "Uphold Thou me, and I shall stand;\n" +
                    "Fight, and I must prevail.\n" +
                    "\n" +
                    "4.\tSo when my latest breath\n" +
                    "Shall rend the veil in twain,\n" +
                    "By death I shall escape from death\n" +
                    "And life eternal gain.\n" +
                    "Knowing as I am known,\n" +
                    "How shall I love that word,\n" +
                    "And oft repeat before the throne:\n" +
                    "For ever with the Lord!\n");
        }

        if (id == R.id.the_saints_of_god){
            hymn_txt.setText("825\n" +
                    "1.\tTHE saints of God, their conflict past,\n" +
                    "And life’s log battle won at last,\n" +
                    "No more they need the shield or sword;\n" +
                    "They cast them down before their Lord:\n" +
                    "O happy saints! For ever blest,\n" +
                    "At Jesu’s feet how safe their rest.\n" +
                    "\n" +
                    "2.\tThe saints of God, their wanderings done,\n" +
                    "No more their weary course they run,\n" +
                    "O more they faint, no more they fall,\n" +
                    "No foes oppress, no fears appal :\n" +
                    "O happy saints! For ever blest,\n" +
                    "In that dear home, how sweet their rest.\n" +
                    "\n" +
                    "3.\tThe saints of God, life’s voyage o’er,\n" +
                    "Safe landed on that blissful shore,\n" +
                    "O stormy tempests ow they dread,\n" +
                    "No roaring billows lift their head\n" +
                    "O happy saints! For ever blest,\n" +
                    "In that calm haven of their rest.\n" +
                    "\n" +
                    "4.\tO God of saints, to Thee we cry;\n" +
                    "O Saviour, plead for us on high;\n" +
                    "O Holy Ghost, our Guide and Friend,\n" +
                    "Grant us Thy grace till life shall end :\n" +
                    "That with all saints our rest may be\n" +
                    "In that bright paradise with Thee.    Amen.\n");
        }

        if (id == R.id.o_god_to_whom){
            hymn_txt.setText("826\n" +
                    "1.\tO GOD, to whom the faithful dead\n" +
                    "Still live, united to their Head,\n" +
                    "Their Lord and ours the same\n" +
                    "For all Thy saints, to memory dear,\n" +
                    "Departed in Thy faith ad fear,\n" +
                    "We bless Thy holy name.\n" +
                    "\n" +
                    "2.\tBy the same grace upheld, may we\n" +
                    "So follow those who followed Thee,\n" +
                    "As with them to partake\n" +
                    "The full reward of heavenly bliss:\n" +
                    "Merciful Father, grant us this\n" +
                    "For our Redeemer’s sake.\n" +
                    "                                              Amen.\n");
        }

        if (id == R.id.for_all_the_saints){
            hymn_txt.setText("832\n" +
                    "1.\tFOR all the saints who from their labours rest,\n" +
                    "Who Thee by faith before the world confessed,\n" +
                    "Thy name, O Jesu, be for ever blest.\n" +
                    "                                                                    Alleluia!\n" +
                    "\n" +
                    "2.\tThou wast their Rock, their Fortress, and their Might;\n" +
                    "Thou, Lord, their captain I the well fought fight\n" +
                    "Thou in the darkness drear their one true Light.\n" +
                    "                                                                    Alleluia!\n" +
                    "\n" +
                    "3.\tO may Thy soldiers, faithful, true, and bold,\n" +
                    "Fight as the saints who nobly fought of old,\n" +
                    "And win, with them, the victor’s crown of gold!\n" +
                    "                                                                    Alleluia!\n" +
                    "\n" +
                    "4.\tO blest communion, fellowship divine!\n" +
                    "We feebly struggle; they in glory shine,\n" +
                    "Yet all are one in Thee, for all are Thine.\n" +
                    "                                                                    Alleluia!\n" +
                    "\n" +
                    "5.\tAnd when the strife is fierce, the warfare long,\n" +
                    "Steals on the ear the distant triumph song,\n" +
                    "And hearts are brave again, and arms are strong.\n" +
                    "                                                                     Alleluia!\n" +
                    "\n" +
                    "6.\tThe golden evening brightens in the west;\n" +
                    "Soon, soon to faithful warriors cometh rest;\n" +
                    "Sweet is the calm of paradise the blest.\n" +
                    "                                                                      Alleluia!\n" +
                    "\n" +
                    "7.\tBut lo! There breaks a yet more glorious day:\n" +
                    "The saints triumphant rise in bright array;\n" +
                    "The King of Glory passes on His way.\n" +
                    "                                                                      Alleluia!\n" +
                    "\n" +
                    "8.\tFrom earth’s wide bounds, from ocean’s farthest coast,\n" +
                    "Through gates of pearl streams in the countless host,\n" +
                    "\tSingling to Father, Son, and Holy Ghost:\n" +
                    "                                                                              Alleluia!\n");
        }

        if (id == R.id.what_are_these){
            hymn_txt.setText("833\n" +
                    "1.\tWHAT are these arrayed in white,\n" +
                    "Brighter than the noonday sun?\n" +
                    "Foremost of the sons of lighyt,\n" +
                    "Nearest the eternal throne?\n" +
                    "These are they that bore the cross,\n" +
                    "Nobly for their Master stood;\n" +
                    "Sufferers in His righteous cause,\n" +
                    "Followers of the dying God.\n" +
                    "\n" +
                    "2.\tOut of great distress they came,\n" +
                    "Washed their robes by faith below\n" +
                    "In the blood of yonder Lamb,\n" +
                    "Blood that washes white as snow:\n" +
                    "Therefore are they next the throne,\n" +
                    "Serve their Maker day and night;\n" +
                    "God doth in His saints delight.\n" +
                    "\n" +
                    "3.\tMore than conquerors at last,\n" +
                    "Here they find their trials o’er;\n" +
                    "They have all their sufferings past,\n" +
                    "Hunger now and thirst no more;\n" +
                    "No excessive heat they feel\n" +
                    "From the sun’s director ray,\n" +
                    "In a milder clime they dwell,\n" +
                    "Region of eternal day.\n" +
                    "\n" +
                    "4.\t He that on the throne doth reign,\n" +
                    "Them the Lamb shall always feed,\n" +
                    "With the tree of life sustain,\n" +
                    "To the living fountains lead;\n" +
                    "He shall all their sorrows chase,\n" +
                    "All their sorrows chase,\n" +
                    "All their wants at once remove,\n" +
                    "Wipe the tears from every face,\n" +
                    "Fill up every soul with love.\n");
        }

        if (id == R.id.thou_gracious_god){
            hymn_txt.setText("873\n" +
                    "1.\tTHOU gracious God, whose mercy lends\n" +
                    "The light of home, the smile of friends,\n" +
                    "Our gathered flock Thine arms enfold,\n" +
                    "As in the peaceful days of old.\n" +
                    "\n" +
                    "2.\tWilt Thou not hear us while we raise,\n" +
                    "In sweet accord of solemn praise,\n" +
                    "The voices that have mingled long\n" +
                    "In joyous flow of mirth ad song?\n" +
                    "\n" +
                    "3.\tFor all the blessings life has brought,\n" +
                    "For all its sorrowing hours have taught,\n" +
                    "For all we mourn, for all we keep,\n" +
                    "The hands we clasp, the loved that sleep.\n" +
                    "\n" +
                    "4.\tThe noontide sunshine of the past,\n" +
                    "These brief, bright moments fading fast,\n" +
                    "The stars that gild our darkening years,\n" +
                    "The twilight ray from holier spheres.\n" +
                    "\n" +
                    "5.\tWe thank Thee, Father; let Thy grace\n" +
                    "Our loving circle still embrace,\n" +
                    "Thy mercy shed its heavenly store,\n" +
                    "Thy peace be with us evermore.\n" +
                    "                                                     Amen.\n");
        }

        if (id == R.id.o_god_our_help){
            hymn_txt.setText("878\n" +
                    "1.\tO GOD, our help in ages past,\n" +
                    "Our hope for years to come,\n" +
                    "Our shelter from the stormy blast,\n" +
                    "And our eternal home:\n" +
                    "\n" +
                    "2.\tUnder the shadow of Thy throne\n" +
                    "Thy saints have dwelt secure;\n" +
                    "Sufficient is Thine arm alone,\n" +
                    "And our defence is sure.\n" +
                    "\n" +
                    "3.\tBefore the hills in order stood,\n" +
                    "Or earth received her frame,\n" +
                    "From everlasting Thou art God,\n" +
                    "To endless years the same.\n" +
                    "\n" +
                    "4.\tA thousand ages in Thy sight\n" +
                    "Are like a evening gone;\n" +
                    "Short as the watch that ends the night\n" +
                    "Before the rising sun.\n" +
                    "\n" +
                    "5.\tThe busy tribes of flesh and blood,\n" +
                    "With all their cares and fears,\n" +
                    "Are carried downward by the flood,\n" +
                    "And lost in following years.\n" +
                    "\n" +
                    "6.\tTime, like an ever-rolling stream,\n" +
                    "Bears all its sons away;\n" +
                    "They fly forgotten, as a dream\n" +
                    "Dies at the opening day.\n" +
                    "\n" +
                    "7.\tO God, our help in ages past,\n" +
                    "Our hope for years to come,\n" +
                    "Be Thou our guard while troubles last,\n" +
                    "And our eternal home.   Amen.\n");
        }

        if (id == R.id.blessed_lord){
            hymn_txt.setText("1043\n" +
                    "\t\tPRAISE THE LAMB\n" +
                    "1.\tBlessed Lord, our hallelujahs\n" +
                    "Now to Thee we raise;\n" +
                    "Never could we fully utter\n" +
                    "All Thy worth and praise!\n" +
                    "\n" +
                    "Refrain:\n" +
                    "Praise the Lamb, for He is worthy!\n" +
                    "Sweet eternal strain.\n" +
                    "Hallelujah! Hallelujah!\n" +
                    "Praise the Lord! Amen.\n" +
                    "\n" +
                    "2.\tPraise the Lamb! Yes, Thou art worthy,\n" +
                    "Who didst shed Thy blood,\n" +
                    "To redeem Thy saints, and make us\n" +
                    "Kings and priests to God!     Refrain\n" +
                    "\n" +
                    "3.\tYes! We praise thee, for Thou lov’st us;\n" +
                    "And we bless Thee, Lord,\n" +
                    "For Thy ceaseless intercession,\n" +
                    "And Thy precious Word.        Refrain\n" +
                    "\n" +
                    "4.\tHallelujah, Thou, Lord Jesus,\n" +
                    "Canst not cease to love;\n" +
                    "Thine we are, and Thine forever,\n" +
                    "One with Thee above.             Refrain\n" +
                    "\n" +
                    "5.\tPraise the Lord! Yes, hallelujah!\n" +
                    "Who could hush the song?\n" +
                    "Join with saints from every nation,\n" +
                    "Every tribe ad tongue.             Refrain\n");
        }

        if (id == R.id.have_thine_own_way){
            hymn_txt.setText("1044\n" +
                    "\n" +
                    "1.\tHAVE Thine own way, Lord!\n" +
                    "Have Thine own way!\n" +
                    "Thou art the Potter, I am the clay.\n" +
                    "Mold me and make me after Thy will,\n" +
                    "While I am waiting, yielded and still.\n" +
                    "\n" +
                    "2.\tHAVE Thine own way, Lord!\n" +
                    "Have Thine own way!\n" +
                    "Search me and try me, Master, today!\n" +
                    "Whither than snow, Lord,\n" +
                    "Wash me just now,\n" +
                    "As in Thy presence humbly I bow.\n" +
                    "\n" +
                    "3.\tHAVE Thine own way, Lord!\n" +
                    "Have Thine own way!\n" +
                    "Wounded and weary, help me, I pray!\n" +
                    "Power, all power, surely is Thine!\n" +
                    "Touch me ad heal me, Savior divine.\n" +
                    "\n" +
                    "4.\tHAVE Thine own way, Lord!\n" +
                    "Have Thine own way!\n" +
                    "Hold o’er my being absolute sway!\n" +
                    "Fill with Thy Spirit ‘till all shall see\n" +
                    "Christ only, always, living in me.\n");
        }

        return super.onOptionsItemSelected(item);
    }
}
