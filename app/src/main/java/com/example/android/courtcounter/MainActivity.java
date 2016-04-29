package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int teamAScore = 0;
    private int teamBScore = 0;

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
     * Displays the given score for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(teamBScore));
    }

    /***
     * For +3 button.
     */
    public void add3Points(View view) {
        teamAScore += 3;
        displayForTeamA(teamAScore);
    }

    /***
     * For +2 button.
     */
    public void add2Points(View view) {
        teamAScore += 2;
        displayForTeamA(teamAScore);
    }

    /***
     * For Free Throw.
     */
    public void freeThrow(View view) {
        teamAScore += 1;
        displayForTeamA(teamAScore);
    }

    /***
     * For +3 button.
     */
    public void add3PointsForTeamB(View view) {
        teamBScore += 3;
        displayForTeamB(teamAScore);
    }

    /***
     * For +2 button.
     */
    public void add2PointsForTeamB(View view) {
        teamBScore += 2;
        displayForTeamB(teamAScore);
    }

    /***
     * For Free Throw.
     */
    public void freeThrowForTeamB(View view) {
        teamBScore += 1;
        displayForTeamB(teamBScore);
    }


    }
