package com.example.Alias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class IntermediateMenu extends Activity {
    private static final String TAG="IntermediateMenu";
    private static final String A_POINTS="aPoints";
    private static final String B_POINTS="bPoints";
    private static final String C_POINTS="cPoints";
    private static final String TEAM_CHOICE="teamChoice";
    private TextView mResultTextView;
    private Button mStartButton;
    private static int aPoints;
    private static int bPoints;
    private static int cPoints;
    private static int teamChoice;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intermediate_result);
        mResultTextView=(TextView)findViewById(R.id.result_text_view);
        aPoints=getIntent().getIntExtra(A_POINTS, aPoints);
        bPoints=getIntent().getIntExtra(B_POINTS, bPoints);
        cPoints=getIntent().getIntExtra(C_POINTS, cPoints);
        teamChoice=getIntent().getIntExtra(TEAM_CHOICE, teamChoice);
        if(teamChoice==2) {
            mResultTextView.setText("The points of a-team is:" + aPoints + ". The points of b-team is:" + bPoints);
        }
        if(teamChoice==3) {
            mResultTextView.setText("The points of a-team is:" + aPoints + ". The points of b-team is:" + bPoints + ". The points of c-team is:" + cPoints);
        }

        mStartButton=(Button)findViewById(R.id.start_button);
        mStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(IntermediateMenu.this,
                        R.string.start_toast,
                        Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(IntermediateMenu.this,  MainActivity.class);
            startActivity(intent);
            }
        });
        if (savedInstanceState != null) {
            aPoints=savedInstanceState.getInt(A_POINTS);
            bPoints=savedInstanceState.getInt(B_POINTS);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState");
        savedInstanceState.putInt(A_POINTS, aPoints);
        savedInstanceState.putInt(B_POINTS, bPoints);
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
}

