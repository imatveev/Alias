package com.example.Alias;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class Menu extends Activity {
    private static final String TAG="Menu";
    private Button mMenuStartButton;
    private Button mMenuAboutButton;
    private Button mMenuExitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);


        mMenuStartButton = (Button) findViewById(R.id.menu_start);
        mMenuStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent intent = new Intent(Menu.this, TeamsMenu.class);
                startActivity(intent);
            }
        });
        mMenuAboutButton = (Button) findViewById(R.id.menu_about);
        mMenuAboutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent about = new Intent(Menu.this, About.class);
                startActivity(about);
            }
        });
        mMenuExitButton = (Button) findViewById(R.id.menu_exit);
        mMenuExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                finishAfterTransition();
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
    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setTitle("Exit from game")
                .setMessage("Are you sure?")
                .setNegativeButton(android.R.string.no, null)
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface arg0, int arg1) {
                        Menu.super.onBackPressed();
                    }
                }).create().show();
    }
}

