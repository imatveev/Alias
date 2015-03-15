package com.example.Alias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity {
    private static final String TAG="MyActivity";
    private static final String KEY_INDEX="index";
    private static final String A_POINTS="aPoints";
    private static final String B_POINTS="bPoints";
    private static final String C_POINTS="cPoints";
    private static final String COMMAND="command";
    private static final String TEAM_CHOICE="teamChoice";
    private Button mTrueButton;
    private Button mFalseButton;
    private static int aPoints;
    private static int bPoints;
    private static int cPoints;
    private static int command;
    private static int teamChoice;
    private Handler handler;
    private static int limit=60;
    private static int count;
    private TextView mQuestionTextView;
    private Question[] mQuestionBank = {
            new Question(com.example.Alias.R.string.q1),
            new Question(com.example.Alias.R.string.q2),
            new Question(com.example.Alias.R.string.q3),
            new Question(com.example.Alias.R.string.q4),
            new Question(com.example.Alias.R.string.q5),
            new Question(com.example.Alias.R.string.q6),
            new Question(com.example.Alias.R.string.q7),
            new Question(com.example.Alias.R.string.q8),
            new Question(com.example.Alias.R.string.q9),
            new Question(com.example.Alias.R.string.q10),
            new Question(com.example.Alias.R.string.q11),
            new Question(com.example.Alias.R.string.q12),
            new Question(com.example.Alias.R.string.q13),
            new Question(com.example.Alias.R.string.q14),
            new Question(com.example.Alias.R.string.q15),
            new Question(com.example.Alias.R.string.q16),
            new Question(com.example.Alias.R.string.q17),
            new Question(com.example.Alias.R.string.q18),
            new Question(com.example.Alias.R.string.q19),
            new Question(com.example.Alias.R.string.q20),
            new Question(com.example.Alias.R.string.q21),
            new Question(com.example.Alias.R.string.q22),
            new Question(com.example.Alias.R.string.q23),
            new Question(com.example.Alias.R.string.q24),
            new Question(com.example.Alias.R.string.q25),
            new Question(com.example.Alias.R.string.q26),
            new Question(com.example.Alias.R.string.q27),
            new Question(com.example.Alias.R.string.q28),
            new Question(com.example.Alias.R.string.q29),
            new Question(com.example.Alias.R.string.q30),
            new Question(com.example.Alias.R.string.q31),
            new Question(com.example.Alias.R.string.q32),
            new Question(com.example.Alias.R.string.q33),
            new Question(com.example.Alias.R.string.q34),
            new Question(com.example.Alias.R.string.q35),
            new Question(com.example.Alias.R.string.q36),
            new Question(com.example.Alias.R.string.q37),
            new Question(com.example.Alias.R.string.q38),
            new Question(com.example.Alias.R.string.q39),
            new Question(com.example.Alias.R.string.q40),
            new Question(com.example.Alias.R.string.q41),
            new Question(com.example.Alias.R.string.q42),
            new Question(com.example.Alias.R.string.q43),
            new Question(com.example.Alias.R.string.q44),
            new Question(com.example.Alias.R.string.q45),
            new Question(com.example.Alias.R.string.q46),
            new Question(com.example.Alias.R.string.q47),
            new Question(com.example.Alias.R.string.q48),
            new Question(com.example.Alias.R.string.q49),
            new Question(com.example.Alias.R.string.q50),
            new Question(com.example.Alias.R.string.q51),
            new Question(com.example.Alias.R.string.q52),
            new Question(com.example.Alias.R.string.q53),
            new Question(com.example.Alias.R.string.q54),
            new Question(com.example.Alias.R.string.q55),
            new Question(com.example.Alias.R.string.q56),
            new Question(com.example.Alias.R.string.q57),
            new Question(com.example.Alias.R.string.q58),
            new Question(com.example.Alias.R.string.q59),
            new Question(com.example.Alias.R.string.q60),
            new Question(com.example.Alias.R.string.q61),
            new Question(com.example.Alias.R.string.q62),
            new Question(com.example.Alias.R.string.q63),
            new Question(com.example.Alias.R.string.q64),
            new Question(com.example.Alias.R.string.q65),
            new Question(com.example.Alias.R.string.q66),
            new Question(com.example.Alias.R.string.q67),
            new Question(com.example.Alias.R.string.q68),
            new Question(com.example.Alias.R.string.q69),
            new Question(com.example.Alias.R.string.q70),
            new Question(com.example.Alias.R.string.q71),
            new Question(com.example.Alias.R.string.q72),
            new Question(com.example.Alias.R.string.q73),
            new Question(com.example.Alias.R.string.q74),
            new Question(com.example.Alias.R.string.q75),
            new Question(com.example.Alias.R.string.q76),
            new Question(com.example.Alias.R.string.q77),
            new Question(com.example.Alias.R.string.q78),
            new Question(com.example.Alias.R.string.q79),
            new Question(com.example.Alias.R.string.q80),
            new Question(com.example.Alias.R.string.q81),
            new Question(com.example.Alias.R.string.q82),
            new Question(com.example.Alias.R.string.q83),
            new Question(com.example.Alias.R.string.q84),
            new Question(com.example.Alias.R.string.q85),
            new Question(com.example.Alias.R.string.q86),
            new Question(com.example.Alias.R.string.q87),
            new Question(com.example.Alias.R.string.q88),
            new Question(com.example.Alias.R.string.q89),
            new Question(com.example.Alias.R.string.q90),
            new Question(com.example.Alias.R.string.q91),
            new Question(com.example.Alias.R.string.q92),
            new Question(com.example.Alias.R.string.q93),
            new Question(com.example.Alias.R.string.q94),
            new Question(com.example.Alias.R.string.q95),
            new Question(com.example.Alias.R.string.q96),
            new Question(com.example.Alias.R.string.q97),
            new Question(com.example.Alias.R.string.q98),
            new Question(com.example.Alias.R.string.q99),
            new Question(com.example.Alias.R.string.q100),
            new Question(com.example.Alias.R.string.q101),
            new Question(com.example.Alias.R.string.q102),
            new Question(com.example.Alias.R.string.q103),
            new Question(com.example.Alias.R.string.q104),
            new Question(com.example.Alias.R.string.q105),
            new Question(com.example.Alias.R.string.q106),
            new Question(com.example.Alias.R.string.q107),
            new Question(com.example.Alias.R.string.q108),
            new Question(com.example.Alias.R.string.q109),
            new Question(com.example.Alias.R.string.q110),
            new Question(com.example.Alias.R.string.q111),
            new Question(com.example.Alias.R.string.q112),
            new Question(com.example.Alias.R.string.q113),
            new Question(com.example.Alias.R.string.q114),
            new Question(com.example.Alias.R.string.q115),
            new Question(com.example.Alias.R.string.q116),
            new Question(com.example.Alias.R.string.q117),
            new Question(com.example.Alias.R.string.q118),
            new Question(com.example.Alias.R.string.q119),
            new Question(com.example.Alias.R.string.q120),
            new Question(com.example.Alias.R.string.q121),
            new Question(com.example.Alias.R.string.q122),
            new Question(com.example.Alias.R.string.q123),
            new Question(com.example.Alias.R.string.q124),
            new Question(com.example.Alias.R.string.q125),
            new Question(com.example.Alias.R.string.q126),
            new Question(com.example.Alias.R.string.q127),
            new Question(com.example.Alias.R.string.q128),
            new Question(com.example.Alias.R.string.q129),
            new Question(com.example.Alias.R.string.q130),
            new Question(com.example.Alias.R.string.q131),
            new Question(com.example.Alias.R.string.q132),
            new Question(com.example.Alias.R.string.q133),
            new Question(com.example.Alias.R.string.q134),
            new Question(com.example.Alias.R.string.q135),
            new Question(com.example.Alias.R.string.q136),
            new Question(com.example.Alias.R.string.q137),
            new Question(com.example.Alias.R.string.q138),
            new Question(com.example.Alias.R.string.q139),
            new Question(com.example.Alias.R.string.q140),
            new Question(com.example.Alias.R.string.q141),
            new Question(com.example.Alias.R.string.q142),
            new Question(com.example.Alias.R.string.q143),
            new Question(com.example.Alias.R.string.q144),
            new Question(com.example.Alias.R.string.q145),
            new Question(com.example.Alias.R.string.q146),
            new Question(com.example.Alias.R.string.q147),
            new Question(com.example.Alias.R.string.q148),
            new Question(com.example.Alias.R.string.q149),
            new Question(com.example.Alias.R.string.q150),
            new Question(com.example.Alias.R.string.q151),
            new Question(com.example.Alias.R.string.q152),
            new Question(com.example.Alias.R.string.q153),
            new Question(com.example.Alias.R.string.q154),
            new Question(com.example.Alias.R.string.q155),
            new Question(com.example.Alias.R.string.q156),
            new Question(com.example.Alias.R.string.q157),
            new Question(com.example.Alias.R.string.q158),
            new Question(com.example.Alias.R.string.q159),
            new Question(com.example.Alias.R.string.q160),
            new Question(com.example.Alias.R.string.q161),
            new Question(com.example.Alias.R.string.q162),
            new Question(com.example.Alias.R.string.q163),
            new Question(com.example.Alias.R.string.q164),
            new Question(com.example.Alias.R.string.q165),
            new Question(com.example.Alias.R.string.q166),
            new Question(com.example.Alias.R.string.q167),
            new Question(com.example.Alias.R.string.q168),
            new Question(com.example.Alias.R.string.q169),
            new Question(com.example.Alias.R.string.q170),
            new Question(com.example.Alias.R.string.q171),
            new Question(com.example.Alias.R.string.q172),
            new Question(com.example.Alias.R.string.q173),
            new Question(com.example.Alias.R.string.q174),
            new Question(com.example.Alias.R.string.q175),
            new Question(com.example.Alias.R.string.q176),
            new Question(com.example.Alias.R.string.q177),
            new Question(com.example.Alias.R.string.q178),
            new Question(com.example.Alias.R.string.q179),
            new Question(com.example.Alias.R.string.q180),
            new Question(com.example.Alias.R.string.q181),
            new Question(com.example.Alias.R.string.q182),
            new Question(com.example.Alias.R.string.q183),
            new Question(com.example.Alias.R.string.q184),
            new Question(com.example.Alias.R.string.q185),
            new Question(com.example.Alias.R.string.q186),
            new Question(com.example.Alias.R.string.q187),
            new Question(com.example.Alias.R.string.q188),
            new Question(com.example.Alias.R.string.q189),
            new Question(com.example.Alias.R.string.q190),
            new Question(com.example.Alias.R.string.q191),
            new Question(com.example.Alias.R.string.q192),
            new Question(com.example.Alias.R.string.q193),
            new Question(com.example.Alias.R.string.q194),
            new Question(com.example.Alias.R.string.q195),
            new Question(com.example.Alias.R.string.q196),
            new Question(com.example.Alias.R.string.q197),
            new Question(com.example.Alias.R.string.q198),
            new Question(com.example.Alias.R.string.q199),
            new Question(com.example.Alias.R.string.q200)
    };
    private int myindex=(int)(Math.random()*mQuestionBank.length);


    private void updateQuestion(){
        int question = mQuestionBank[myindex].getmQuestion();
        mQuestionTextView.setText(question);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate(Bundle) called");
        setContentView(com.example.Alias.R.layout.main);
        teamChoice=getIntent().getIntExtra(TEAM_CHOICE, teamChoice);
        final Chronometer timer=(Chronometer)findViewById(R.id.chronometer);
        timer.start();
            mQuestionTextView = (TextView) findViewById(com.example.Alias.R.id.question_text_view);

            mTrueButton = (Button) findViewById(com.example.Alias.R.id.true_button);
            mTrueButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    Toast.makeText(MainActivity.this,
                            R.string.correct_toast,
                            Toast.LENGTH_SHORT).show();
                    myindex = (int) (Math.random() * mQuestionBank.length);
                    updateQuestion();
                    if(teamChoice==2){
                        if (command % 2 != 0) {
                            aPoints++;
                        }
                        if (command % 2 == 0) {
                            bPoints++;
                        }
                    }
                    if(teamChoice==3) {
                        if (command % 3 == 0) {
                            cPoints++;
                        }
                        if (command % 2 != 0 && command % 3 != 0) {
                            aPoints++;
                        }
                        if (command % 2 == 0 && command % 3 != 0) {
                            bPoints++;
                        }
                    }
                }
            });
            mFalseButton = (Button) findViewById(R.id.false_button);
            mFalseButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View V) {
                    Toast.makeText(MainActivity.this,
                            R.string.incorrect_toast,
                            Toast.LENGTH_SHORT).show();
                    myindex = (int) (Math.random() * mQuestionBank.length);
                    updateQuestion();
                    if(teamChoice==2){
                        if (command % 2 != 0) {
                            aPoints--;
                        }
                        if (command % 2 == 0) {
                            bPoints--;
                        }
                    }
                    if (teamChoice == 3) {
                        if (command % 3 == 0) {
                            cPoints--;
                        }
                        if (command % 2 != 0 && command % 3 != 0) {
                            aPoints--;
                        }
                        if (command % 2 == 0 && command % 3 != 0) {
                            bPoints--;
                        }
                    }
                }

            });
            if (savedInstanceState != null) {
                myindex = savedInstanceState.getInt(KEY_INDEX);
                aPoints=savedInstanceState.getInt(A_POINTS);
                bPoints=savedInstanceState.getInt(B_POINTS);
                command=savedInstanceState.getInt(COMMAND);
                teamChoice=savedInstanceState.getInt(TEAM_CHOICE);
            }
            updateQuestion();
        handler=new Handler();
        count=0;
        getDelay.run();
        command++;
    }
    Runnable getDelay = new Runnable() {
        @Override
        public void run() {
            count++;
            if(count==limit) {
                Intent intent = new Intent(MainActivity.this, IntermediateMenu.class);
                intent.putExtra(A_POINTS, aPoints);
                intent.putExtra(B_POINTS, bPoints);
                intent.putExtra(C_POINTS, cPoints);
                intent.putExtra(TEAM_CHOICE, teamChoice);
                startActivity(intent);
            }
            else {handler.postDelayed(getDelay, 1000);}
        }
    };

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState");
        savedInstanceState.putInt(KEY_INDEX, myindex);
        savedInstanceState.putInt(A_POINTS, aPoints);
        savedInstanceState.putInt(B_POINTS, bPoints);
        savedInstanceState.putInt(C_POINTS, cPoints);
        savedInstanceState.putInt(COMMAND, command);
        savedInstanceState.putInt(TEAM_CHOICE, teamChoice);
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d(TAG, "onStart()called");
    }
    @Override
     public void onPause(){
        super.onPause();
        Log.d(TAG, "onPause()called");
    }
    @Override
    public void onResume(){
        super.onResume();
        Log.d(TAG, "onResume()called");
    }
    @Override
    public void onStop(){
        super.onStop();
        Log.d(TAG, "onStop()called");
    }
    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy()called");
    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MainActivity.this, Menu.class);
        startActivity(intent);
    }
}
