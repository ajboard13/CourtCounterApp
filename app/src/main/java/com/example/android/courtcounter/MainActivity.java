package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int teamAScore;
    private int teamBScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void threePointerTeamA(View view) {
        this.teamAScore += 3;
        displayForTeamA(this.teamAScore);
    }

    public void twoPointerTeamA(View view) {
        this.teamAScore += 2;
        displayForTeamA(this.teamAScore);
    }

    public void freeThrowTeamA(View view) {
        this.teamAScore += 1;
        displayForTeamA(this.teamAScore);
    }

    public void threePointerTeamB(View view) {
        this.teamBScore += 3;
        displayForTeamB(this.teamBScore);
    }

    public void twoPointerTeamB(View view) {
        this.teamBScore += 2;
        displayForTeamB(this.teamBScore);
    }

    public void freeThrowTeamB(View view) {
        this.teamBScore += 1;
        displayForTeamB(this.teamBScore);
    }

    public void resetScore(View view) {
        this.teamBScore = 0;
        this.teamAScore = 0;
        displayForTeamA(this.teamAScore);
        displayForTeamB(this.teamBScore);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
