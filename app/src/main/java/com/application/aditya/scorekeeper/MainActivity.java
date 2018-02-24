package com.application.aditya.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreteamA = 0;
    int foulteamA = 0;

    int scoreteamB = 0;
    int foulteamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displaygoalForTeamA(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_a_score);
        scoreview.setText(String.valueOf(score));
    }

    public void displayfoulForTeamA(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_a_fouls);
        scoreview.setText(String.valueOf(score));
    }

    public void addonegoaltoa(View v) {
        scoreteamA += 1;
        displaygoalForTeamA(scoreteamA);

    }

    public void addonefoultoa(View view) {
        foulteamA += 1;
        displayfoulForTeamA(foulteamA);
    }


    public void displaygoalForTeamB(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_b_score);
        scoreview.setText(String.valueOf(score));
    }

    public void displayfoulForTeamB(int score) {
        TextView scoreview = (TextView) findViewById(R.id.team_b_fouls);
        scoreview.setText(String.valueOf(score));
    }

    public void addonegoaltob(View v) {
        scoreteamB += 1;
        displaygoalForTeamB(scoreteamB);

    }

    public void addonefoultob(View view) {
        foulteamB += 1;
        displayfoulForTeamB(foulteamB);
    }
    public void resetscore(View view)
    {
        scoreteamA = 0;
        foulteamA = 0;
        scoreteamB = 0;
        foulteamB = 0;

        displayfoulForTeamA(foulteamA);
        displayfoulForTeamB(foulteamB);
        displaygoalForTeamA(scoreteamA);
        displaygoalForTeamB(scoreteamB);

    }

}
