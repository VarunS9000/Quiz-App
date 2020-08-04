package com.know.kbc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button buttonswitch;
    Button option1;
    Button option2;
    Button option3;
    Button option4;
    Button start;
    Button next;
    //ImageButton buttonswitch1;
    RelativeLayout rl;

    int QuestionIndex = 0;
    int OptionIndex = 0;
    int j ;
    int amount ;
    int count ;
    int set;
    int flagPoll;
    int flagFifty;
    int[] Ans = new int[]{4,3,2,1,3,3,4,3,2,2,1,3,1,2,1,4,3,2,2,1,1,1,3,1,3,2,1,4,4,2,3,3,4,2,1,3,1,4,4,4,3,4,1,3,3,3,2,2,2,4,4,2,2,2,2,2,1,3,3,2};





    Random r = new Random();
    String[] Questions;


    String[] Options;

    public MainActivity() {
        Questions = new String[]{"Which of these places is not located in Mumbai?"," Which living bird lays the world's largest egg?","The Dronacharya award is given to which of the below?"," What is the name of our galaxy?","What was Balrama's weapon in Mahabharata?","Emperor Shah Jahan built Taj Mahal in the memory of whom?","From where does Veeru propose to Basanti in the movie Sholay","OS abbreviation in Computer means","What do you call Indian ice-cream?","Where was India's first civilization settled?","Which animal can look two ways at the same time?","Which bird can fly straight,up,down and backward?","Whom does Salman want to marry in Hum Aapke Hain Kaun?","A major ingredient in Indian cooking is ghee.What is ghee?","Which state is known as India's spice garden?","What kind of animal is Shera, the mascot of 2010 Delhi commonwealth games?","Which of these films has the tagline 'Every child  is different'?","The plant bearing which of these fruits is a vine?","Where was Lord Ram and Laxman's sasural?","What is the colour of Octopus blood?","Where was the BRICS summit held in 2014?","Which of these planets has a solid surface?","With respect to economics what is the full form of GDP?","Emulsion, primer and undercoat are all terms connected to what?","Which of these is the name for a kind of shot in badminton?","In which of these sports do players try to hit the ball to make it touch the surface of the rival team's court to earn piano?","Lakshman, Bharat and Shatrughan are also known by which name?","In which state did the BJP form their government for the first time?","During which of these legendary events did Lord Vishnu take the form of Kurma?","Whose autobiography is titled 'Man of Everest' also published as 'Tiger of the snow'?","Whose Persian translation of several Upanishads is known as Sirrs - e- Akbar?","Which of these temples in Gujarat is the 3 day dance festival 'Uttarardh Mahotsav' celebrated","According to legend, which scholar cut away the very branch of the tree on which he sat?","Which of these athletes won their Olympic medal first?","According to Valmiki Ramayana, who was the wife of Vibheeshan?","Who wrote the introduction to the English translation of Rabindranath Tagore's Gitanjali?","Which of these leaders was a recipient of a gallantry award in 1987 by a state government for saving two girls from drowning?","The wife of which of these famous sports persons was once the captain of the Indian Volleyball team?","Who invented plastic?","Bahubali festival is related to which religion?","Who was declared as the winner of Nobel award for the best actress in 2018?","Which of these is the name of a real chemical element in the periodical table?","Which of these viruses take its name from a place in Malaysia?","Which of these is the first domestic debit and credit payment network of India?","Which film personality was awarded the 2018 Dadasaheb Phalke award posthumously?","Which city hosted more than a lakh of people to perform yoga together and created a Guinness World Record on the occasion of International Day of Yoga,2018?","According to Hindu mythology which of these plants waa brought up during the churning of the milk ocean?","Who is the author of the Hindi Poetic Work 'Himkar' and 'Urvashi'?","Who among the following has been the first career diplomat to become the External affairs minister of India?","What was the name of the raga composed by Pandit Ravi Shankar as a tribute to Mahatma Gandhi?","The fragments of which of the following comet systems collided with Jupiter in July 1994?","Who led the one-man commission which inquired into the assassination of Smt.Indira Gandhi?","Who is the author of the book 'Amrit ki ore'?","Which of the following years was celebrated as the World Communication year?","Who has written the book 'My frozen Turbulence in Kashmir'?","Among whom does the Indian constitution permit to take part in the proceedings of the parliament?","Who in 1978 became the first person to be born in the continent of Antarctica?","What was the name given to the super cluster of galaxies discovered by a team of Indian astronomers in 2017?","Which of the following forts was not built by the European colonial powers in India?","Who is the first cricketer to score two T20 international fifties on the same day in two different matches?"};



        Options = new String[]{"Gateway of India","Kamala Nehru Park","Juhu Beach","Charminar","Vulture","Iwl","Ostrich","Eagle","Sportsmen","Coaches","Umpires","Sports Editor","The Milky Way","The Murky Way","The Mars Way","The Only Way","Dpear","Mace","Plough","Sword","Jahani Mahal","Farida Mahal","Mumtaz Mahal","Toba Begum","Top of roof","Top of ladder","Top of hill","Top of tank","Order Significance","Open Software","Operating System","Optical Sensor","Suji ka halwa","Kulfi","Gajar ka halwa","Kheer","Deccan","Indus Valley","Ganges Plain","Kashmir","chameleon","lizard","snake","tortoise","pigeon","sparrow","hummingbird","eagle","bhabhis sister","mamas daughter","friends sister","friend"," a type of chutney","clarified butter","chickpeas flour","melted cheese","Kerala","Karnataka","Bihar","Uttarakhand","bear","leopard","lion","tiger","Paa","Koi mil Gaya","Taare Zameen par","Paathshala","mango","watermelon","apple","banana","Hastinapur","Mithila","Ayodhya","Mathura","blue","white","red","yellow","Brazil","India","Russia","China","Mars","Saturn","Jupiter","Uranus","Gross Domestic Progress","Gross Domestic Process","Gross Domestic Product","Gross Domestic Program","painting","knitting","sewing","cooking","bounce","Yorker","drop","bout","baseball","volleyball","basketball","polo","Ramanuja","Ramcharan","Ramakant","Ramapati","Himachal Pradesh","Sikkim","Tripura","Assam","Kurukshetra Yuddh","Hiranyakashipu Sanhar","Kaaliya Naagmardan","Samudra manthan","Sir Edmund Hillary","Tenzing Norway","George Mallory","Major HPS Aluhwalia","Abu Fazl","Shah Waliullah Dehlvi","Dara Shukoh","Ahmad al Sir Hindi","Rukmini temple, Dwarka","Somnath temple, Somnath","Sun temple,Modhera","Bhalka Tirth, Somnath","Tulsidas","Ramdase","Surdas","Kalidas","Sakshi Malik","Leander Paes","Karnam Malleshwari","Rajyavardhan Singh Rathore","Sarama","Trijata","Sulochana","Lankini","P.B.Shelley","AlfredTennyson","W.B.Yeats","T.SElliot","Anandiben Patel","Vasundhara  Raje Scindia","Uma Bharti","Mamata Banerjee","K.D.Jadav","Dhyan Chand","Prakash Padukone","Milkha Singh","Bakelite","Polythene","Celluloid","Parkesine","Islam","Hinduism","Buddhism","Jainism","Tabu","Shabana Azmi","Sridevi","Sonam Kapoor","Africum","Asium","Australium","Europium","Nipah","Ebola","Influenza","HIV","Paytm","PayPal","RuPay","Pasay","Shashi Kapoor","Om Puri","Vinod Khanna","Lekh Tandon","Jaipur","Jodhpur","Kota","Udaipur","Kamal","Parijat","Gulaab","Tulsi","Malthi Sharan Gupta","Ramdhan Singh Dinkar","Bhartendu Harishchandra","Makhanlal Chaturvedi","S.Jaishankar","K.Natwar Singh","Meira Kumar","Manishankar Aiyar","Gandhi Malhar","Mohan Kauns","Mohanam","Bapu Kauns","Shbutring-Levy 9","Levy 9","Shoemaker-Levy 7","Shoemaker-Levy9","Rangnath Mishra","M.P .Thakkar","R.S. Sarkatia","K.K. Mathew","Mukesh Kumar","Narendra Mohan","Upendra Nath","Nirad C Choudhary","1981","1983","1985","1987","M.J. Akbar","Jagmohan","Anees Jung","Nissim Ezekiel","Solicitor general","Attorney general","Cabinet secretary","Chief Justice","Emilio Palma","James Weddell","Junko Tabei","Charles Wilkes","Laxmi","Parvati","Saraswati","Durga","Fort Danaborg","Fort Naarden","Fort Chambray","Fort Santa Katherina","Nawroz Mangal","Mohammad Hafeez","Mohammad Shahzad","Shakib Al Hasan"};
        }




    public void yes(View view){
        setContentView(R.layout.activity_main);
    }

    public void no(View view){
        setContentView(R.layout.activity_main2);
        Button poll = (Button) findViewById(R.id.button9);
        Button ff = (Button) findViewById(R.id.button10);

        if(flagPoll==1){
            poll.setVisibility(View.GONE);


        }

        if(flagFifty==1){
            ff.setVisibility(View.GONE);

        }

        String amount1 = "Reward=" + "₹" + String.valueOf(amount);
        //System.arraycopy(Options, OptionIndex , CurrentOptions, 0, 4);
        final TextView q = (TextView) findViewById(R.id.textView4);
        final TextView w = (TextView) findViewById(R.id.textView5);
        q.setText(Questions[QuestionIndex]);
        w.setText(amount1);
        next = (Button) findViewById(R.id.button);
        option1 = (Button) findViewById(R.id.button2);
        option2 = (Button) findViewById(R.id.button3);
        option3 = (Button) findViewById(R.id.button4);
        option4 = (Button) findViewById(R.id.button5);
        option1.setText(Options[OptionIndex]);
        option2.setText(Options[OptionIndex + 1]);
        option3.setText(Options[OptionIndex + 2]);
        option4.setText(Options[OptionIndex + 3]);

    }


    public void back(View view) {
       //buttonswitch1 = (ImageButton) findViewById(R.id.imageButton3);
        //count=0;
        setContentView(R.layout.activity_main5);



    }

    public void back2(View view){
        setContentView(R.layout.activity_main);
    }
    public void wallet(View view){
        setContentView(R.layout.activity_main3);
        int amountearned;
        if(amount==1250000){
            amountearned=640000;
        }
        else if(amount==5000){
            amountearned=0;
        }
        else{
            amountearned=amount/2;
        }
        final TextView e = (TextView) findViewById(R.id.textView6);
        String amountearned1 =  "₹" + String.valueOf(amountearned);
        e.setText(amountearned1);

    }
    public void back1(View view){
        setContentView(R.layout.activity_main2);
        Button poll = (Button) findViewById(R.id.button9);
        Button ff = (Button) findViewById(R.id.button10);

        if(flagPoll==1){
            poll.setVisibility(View.GONE);


        }

        if(flagFifty==1){
            ff.setVisibility(View.GONE);

        }
        option1.setBackgroundColor(0xFF3700B3);
        option1.setTextColor(0xFFCDDC39);
        option2.setBackgroundColor(0xFF3700B3);
        option2.setTextColor(0xFFCDDC39);
        option3.setBackgroundColor(0xFF3700B3);
        option3.setTextColor(0xFFCDDC39);
        option4.setBackgroundColor(0xFF3700B3);
        option4.setTextColor(0xFFCDDC39);
        String amount1 = "Reward=" + "₹" + String.valueOf(amount);
        //System.arraycopy(Options, OptionIndex , CurrentOptions, 0, 4);
        final TextView q = (TextView) findViewById(R.id.textView4);
        final TextView w = (TextView) findViewById(R.id.textView5);
        q.setText(Questions[QuestionIndex]);
        w.setText(amount1);
        next = (Button) findViewById(R.id.button);
        option1 = (Button) findViewById(R.id.button2);
        option2 = (Button) findViewById(R.id.button3);
        option3 = (Button) findViewById(R.id.button4);
        option4 = (Button) findViewById(R.id.button5);
        option1.setText(Options[OptionIndex]);
        option2.setText(Options[OptionIndex + 1]);
        option3.setText(Options[OptionIndex + 2]);
        option4.setText(Options[OptionIndex + 3]);
    }

    public void play(View view) {



        setContentView(R.layout.activity_main2);


         count=0;
         set=0;
         j=0;
         amount=5000;
         flagPoll=0;
         flagFifty=0;


        QuestionIndex = r.nextInt(5)+j ;
        OptionIndex = QuestionIndex * 4;
        final TextView q = (TextView) findViewById(R.id.textView4);
        q.setText(Questions[QuestionIndex]);
        final TextView w = (TextView) findViewById(R.id.textView5);
        String amount1 = "Reward=" + "₹" + String.valueOf(amount);
        w.setText(amount1);
        option1 = (Button) findViewById(R.id.button2);
        option2 = (Button) findViewById(R.id.button3);
        option3 = (Button) findViewById(R.id.button4);
        option4 = (Button) findViewById(R.id.button5);
        //start = (Button) findViewById(R.id.button7);
        next = (Button) findViewById(R.id.button);
        option1.setText(Options[OptionIndex]);
        option2.setText(Options[OptionIndex + 1]);
        option3.setText(Options[OptionIndex + 2]);
        option4.setText(Options[OptionIndex + 3]);



    }

    public void btn1(View view) {
        if(set==1) {

            count++;

            if (amount == 640000) {
                amount = amount + 610000;
            } else {
                amount = 2 * amount;

            }


            j = j + 5;
            QuestionIndex = r.nextInt(5) + j;
            OptionIndex = QuestionIndex * 4;

            option1.setBackgroundColor(0xFF3700B3);
            option1.setTextColor(0xFFCDDC39);
            option2.setBackgroundColor(0xFF3700B3);
            option2.setTextColor(0xFFCDDC39);
            option3.setBackgroundColor(0xFF3700B3);
            option3.setTextColor(0xFFCDDC39);
            option4.setBackgroundColor(0xFF3700B3);
            option4.setTextColor(0xFFCDDC39);
            String amount1 = "Reward=" + "₹" + String.valueOf(amount);
            //System.arraycopy(Options, OptionIndex , CurrentOptions, 0, 4);
            final TextView q = (TextView) findViewById(R.id.textView4);
            final TextView w = (TextView) findViewById(R.id.textView5);
            q.setText(Questions[QuestionIndex]);
            w.setText(amount1);
            next = (Button) findViewById(R.id.button);
            option1 = (Button) findViewById(R.id.button2);
            option2 = (Button) findViewById(R.id.button3);
            option3 = (Button) findViewById(R.id.button4);
            option4 = (Button) findViewById(R.id.button5);
            option1.setText(Options[OptionIndex]);
            option2.setText(Options[OptionIndex + 1]);
            option3.setText(Options[OptionIndex + 2]);
            option4.setText(Options[OptionIndex + 3]);
            set=0;
        }
        else if(set==0) {
            String warning="Please select an answer";
            Toast.makeText(this,warning,Toast.LENGTH_LONG).show();

        }



    }

    public void poll(View view) {
        //setContentView(R.layout.activity_main2);
        int correct = r.nextInt(20) + 30;
        int wrong1 = r.nextInt(20);
        int wrong2 = r.nextInt(20);
        int wrong3 = r.nextInt(20);
        String correctnew = String.valueOf(correct);
        String wrong1new = String.valueOf(wrong1);
        String wrong2new = String.valueOf(wrong2);
        String wrong3new = String.valueOf(wrong3);
        String polldisplaycorrect;
        String polldisplayWrong1;
        String polldisplayWrong2;
        String polldisplayWrong3;
        Button poll = findViewById(R.id.button9);

        if (Ans[QuestionIndex] == 1) {
            polldisplaycorrect = Options[OptionIndex] + " " + correctnew + "%";
            polldisplayWrong1 = Options[OptionIndex + 1] + " " + wrong1new + "%";
            polldisplayWrong2 = Options[OptionIndex + 2] + " " + wrong2new + "%";
            polldisplayWrong3 = Options[OptionIndex + 3] + " " + wrong3new + "%";
            option1.setText(polldisplaycorrect);
            option2.setText(polldisplayWrong1);
            option3.setText(polldisplayWrong2);
            option4.setText(polldisplayWrong3);
        } else if (Ans[QuestionIndex] == 2) {
            polldisplayWrong1 = Options[OptionIndex] + " " + wrong1new + "%";
            polldisplaycorrect = Options[OptionIndex + 1] + " " + correctnew + "%";
            polldisplayWrong2 = Options[OptionIndex + 2] + " " + wrong2new + "%";
            polldisplayWrong3 = Options[OptionIndex + 3] + " " + wrong3new + "%";
            option1.setText(polldisplayWrong1);
            option2.setText(polldisplaycorrect);
            option3.setText(polldisplayWrong2);
            option4.setText(polldisplayWrong3);

        } else if (Ans[QuestionIndex] == 3) {
            polldisplaycorrect = Options[OptionIndex + 2] + " " + correctnew + "%";
            polldisplayWrong1 = Options[OptionIndex + 1] + " " + wrong1new + "%";
            polldisplayWrong2 = Options[OptionIndex] + " " + wrong2new + "%";
            polldisplayWrong3 = Options[OptionIndex + 3] + " " + wrong3new + "%";
            option1.setText(polldisplayWrong2);
            option2.setText(polldisplayWrong1);
            option3.setText(polldisplaycorrect);
            option4.setText(polldisplayWrong3);
        } else if (Ans[QuestionIndex] == 4) {
            polldisplaycorrect = Options[OptionIndex + 3] + " " + correctnew + "%";
            polldisplayWrong1 = Options[OptionIndex + 1] + " " + wrong1new + "%";
            polldisplayWrong2 = Options[OptionIndex + 2] + " " + wrong2new + "%";
            polldisplayWrong3 = Options[OptionIndex] + " " + wrong3new + "%";
            option1.setText(polldisplayWrong3);
            option2.setText(polldisplayWrong1);
            option3.setText(polldisplayWrong2);
            option4.setText(polldisplaycorrect);
        }
        flagPoll=1;
        poll.setVisibility(View.GONE);


    }

    public void ff(View view) {

        Button ff = findViewById(R.id.button10);
        String x = "wrong";
        if (Ans[QuestionIndex] == 1) {
            option2.setText(x);
            option3.setText(x);
            option2.setBackgroundColor(Color.RED);
            option3.setBackgroundColor(Color.RED);
        } else if (Ans[QuestionIndex] == 2) {
            option1.setText(x);
            option4.setText(x);
            option1.setBackgroundColor(Color.RED);
            option4.setBackgroundColor(Color.RED);

        } else if (Ans[QuestionIndex] == 3) {
            option1.setText(x);
            option4.setText(x);
            option1.setBackgroundColor(Color.RED);
            option4.setBackgroundColor(Color.RED);


        } else if (Ans[QuestionIndex] == 4) {
            option2.setText(x);
            option3.setText(x);
            option2.setBackgroundColor(Color.RED);
            option3.setBackgroundColor(Color.RED);

        }
        flagFifty=1;
        ff.setVisibility(View.GONE);

    }


    public void op1(View view) {

        int answer = 1;
        set=1;

        if (answer == Ans[QuestionIndex]) {
            option1.setBackgroundColor(Color.GREEN);
            option1.setTextColor(Color.BLACK);
            String response = "Correct Answer";
            final TextView q = (TextView) findViewById(R.id.textView4);
            q.setText(response);

            if (count == 11) {
                setContentView(R.layout.activity_main4);
                String amountwon="₹ 1 Crore";
                String winner = "Congratulations you have won";
                final TextView o = (TextView) findViewById(R.id.textView2);
                final TextView p = (TextView) findViewById(R.id.textView9);
                p.setText(amountwon);
                o.setText(winner);

            }


        } else {
            option1.setBackgroundColor(Color.RED);
            option1.setTextColor(Color.BLACK);
            setContentView(R.layout.activity_main4);
            int amountearned;
            if(amount==1250000){
                amountearned=640000;
            }
            else if(amount==5000){
                amountearned=0;
            }
            else{
                amountearned=amount/2;
            }
            String response = "Wrong answer";
            String amountearned1;
            amountearned1="₹" + String.valueOf(amountearned);
            final TextView o = (TextView) findViewById(R.id.textView2);
            final TextView p = (TextView) findViewById(R.id.textView9);
            p.setText(amountearned1);
            o.setText(response);
        }


    }


    public void op2(View view) {

        int answer = 2;
        set=1;

        if (answer == Ans[QuestionIndex]) {
            option2.setBackgroundColor(Color.GREEN);
            option2.setTextColor(Color.BLACK);
            String response = "Correct Answer";
            final TextView q = (TextView) findViewById(R.id.textView4);
            q.setText(response);

            if (count == 11) {
                setContentView(R.layout.activity_main4);
                String amountwon="₹ 1 Crore";
                String winner = "Congratulations you have won";
                final TextView o = (TextView) findViewById(R.id.textView2);
                final TextView p = (TextView) findViewById(R.id.textView9);
                p.setText(amountwon);
                o.setText(winner);
            }


        } else {
            option2.setBackgroundColor(Color.RED);
            option2.setTextColor(Color.BLACK);

            setContentView(R.layout.activity_main4);
            int amountearned;
            if(amount==1250000){
                amountearned=640000;
            }
            else if(amount==5000){
                amountearned=0;
            }
            else{
                amountearned=amount/2;
            }
            String response = "Wrong answer";
            String amountearned1;
            amountearned1="₹" + String.valueOf(amountearned);
            final TextView o = (TextView) findViewById(R.id.textView2);
            final TextView p = (TextView) findViewById(R.id.textView9);
            p.setText(amountearned1);
            o.setText(response);


        }

    }

    public void op3(View view) {

        int answer = 3;
        set=1;

        if (answer == Ans[QuestionIndex]) {
            option3.setBackgroundColor(Color.GREEN);
            option3.setTextColor(Color.BLACK);
            String response = "Correct Answer";
            final TextView q = (TextView) findViewById(R.id.textView4);
            q.setText(response);

            if (count == 11) {

                setContentView(R.layout.activity_main4);
                String amountwon="₹ 1 Crore";
                String winner = "Congratulations you have won";
                final TextView o = (TextView) findViewById(R.id.textView2);
                final TextView p = (TextView) findViewById(R.id.textView9);
                p.setText(amountwon);
                o.setText(winner);
            }


        } else {
            option3.setBackgroundColor(Color.RED);
            option3.setTextColor(Color.BLACK);
            setContentView(R.layout.activity_main4);
            int amountearned;
            if(amount==1250000){
                amountearned=640000;
            }
            else if(amount==5000){
                amountearned=0;
            }
            else{
                amountearned=amount/2;
            }
            String response = "Wrong answer";
            String amountearned1;
            amountearned1="₹" + String.valueOf(amountearned);
            final TextView o = (TextView) findViewById(R.id.textView2);
            final TextView p = (TextView) findViewById(R.id.textView9);
            p.setText(amountearned1);
            o.setText(response);


        }

    }

    public void op4(View view) {

        int answer = 4;
        set=1;

        if (answer == Ans[QuestionIndex]) {
            option4.setBackgroundColor(Color.GREEN);
            option4.setTextColor(Color.BLACK);
            String response = "Correct Answer";
            final TextView q = (TextView) findViewById(R.id.textView4);
            q.setText(response);

            if (count == 11) {
                setContentView(R.layout.activity_main4);
                String amountwon="₹ 1 Crore";
                String winner = "Congratulations you have won";
                final TextView o = (TextView) findViewById(R.id.textView2);
                final TextView p = (TextView) findViewById(R.id.textView9);
                p.setText(amountwon);
                o.setText(winner);
            }

        } else {
            option4.setBackgroundColor(Color.RED);
            option4.setTextColor(Color.BLACK);
            setContentView(R.layout.activity_main4);
            String amountearned1;
            setContentView(R.layout.activity_main4);
            int amountearned;
            if(amount==1250000){
                amountearned=640000;
            }
            else if(amount==5000){
                amountearned=0;
            }
            else{
                amountearned=amount/2;
            }
            amountearned1="₹" + String.valueOf(amountearned);
            String response = "Wrong answer";
            final TextView o = (TextView) findViewById(R.id.textView2);
            final TextView p = (TextView) findViewById(R.id.textView9);
            p.setText(amountearned1);
            o.setText(response);


        }

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //buttonswitch = (Button) findViewById(R.id.button6);
        //buttonswitch.setOnClickListener(new View.OnClickListener() {
        //@Override
        //public void onClick(View v) {


        //}
        //});
        // }
    /*public void openMain2Activity(){
        //Intent intent = new Intent(this,Main2Activity.class);
        //startActivity(intent);
        setContentView(R.layout.activity_main2);
        QuestionIndex = r.nextInt(3) + j;
        OptionIndex = QuestionIndex * 4;
        final TextView q = (TextView) findViewById(R.id.editText);
        q.setText(Questions[QuestionIndex]);
        final TextView w = (TextView) findViewById(R.id.editText2);
        String amount1 = "Reward=" + "₹" + String.valueOf(amount);
        w.setText(amount1);
        option1 = (Button) findViewById(R.id.button2);
        option2 = (Button) findViewById(R.id.button3);
        option3 = (Button) findViewById(R.id.button4);
        option4 = (Button) findViewById(R.id.button5);
        start = (Button) findViewById(R.id.button7);
        next = (Button) findViewById(R.id.button);
        option1.setText(Options[OptionIndex]);
        option2.setText(Options[OptionIndex + 1]);
        option3.setText(Options[OptionIndex + 2]);
        option4.setText(Options[OptionIndex + 3]);
    }*/

    }
}

