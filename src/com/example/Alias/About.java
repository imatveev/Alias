package com.example.Alias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class About extends Activity {
    private static final String TAG="About";
    private Button mBackAboutButton;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);

        mBackAboutButton = (Button) findViewById(R.id.about_back);
        mBackAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent intent = new Intent(About.this, Menu.class);
                startActivity(intent);
            }
        });
    }
    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
        Log.i(TAG, "onSaveInstanceState");
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