package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /***
     * For +3 button.
     */
    public void add3Points() {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    /***
     * For +2 button.
     */
    public void add2Pints() {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    /***
     * For Free Throw.
     */
    public void freeThrow() {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }
}
