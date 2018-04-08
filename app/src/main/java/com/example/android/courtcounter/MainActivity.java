package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeam1 = 0;
    int scoreTeam2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team 1 by 1 points.
     */
    public void addOneForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 1;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Increase the score for Team 1 by 2 points.
     */
    public void addTwoForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 2;
        displayForTeam1(scoreTeam1);
    }

    /**
     * Increase the score for Team 1 by 3 point.
     */
    public void addThreeForTeam1(View v) {
        scoreTeam1 = scoreTeam1 + 3;
        displayForTeam1(scoreTeam1);
    }

    //    Team 2 starts here
    /**
     * Increase the score for Team 2 by 1 points.
     */
    public void addOneForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 1;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Increase the score for Team 2 by 2 points.
     */
    public void addTwoForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 2;
        displayForTeam2(scoreTeam2);
    }

    /**
     * Increase the score for Team 2 by 3 point.
     */
    public void addThreeForTeam2(View v) {
        scoreTeam2 = scoreTeam2 + 3;
        displayForTeam2(scoreTeam2);
    }


    /*Resets the score for both Teams back to zero */
    public void resetScore(View v) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        displayForTeam1(scoreTeam1);
        displayForTeam2(scoreTeam2);
    }

    /**
     * Displays the given score for Team 1.
     */
    public void displayForTeam1(int score) {
        TextView scoreView = findViewById(R.id.team_1_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team 2.
     */
    public void displayForTeam2(int score) {
        TextView scoreView = findViewById(R.id.team_2_score);
        scoreView.setText(String.valueOf(score));
    }
}
