package com.example.Alias;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TeamsMenu extends Activity {
    private static final String TEAM_CHOICE="teamChoice";
    private Button mTeamChoiceButton2;
    private Button mTeamChoiceButton3;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teams_count);

        mTeamChoiceButton2 = (Button) findViewById(R.id.teams_count_button2);
        mTeamChoiceButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent intent2 = new Intent(TeamsMenu.this, MainActivity.class);
                intent2.putExtra(TEAM_CHOICE, 2);
                startActivity(intent2);
            }
        });
        mTeamChoiceButton3 = (Button) findViewById(R.id.teams_count_button3);
        mTeamChoiceButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                Intent intent3 = new Intent(TeamsMenu.this, MainActivity.class);
                intent3.putExtra(TEAM_CHOICE, 3);
                startActivity(intent3);
            }
        });
    }

}
