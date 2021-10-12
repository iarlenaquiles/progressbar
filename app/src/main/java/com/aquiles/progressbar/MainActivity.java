package com.aquiles.progressbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity {

    private ProgressBar progressBarHorizontal, progressBarCircular;
    private int progress = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        progressBarCircular = findViewById(R.id.progressBarCircular);
        progressBarHorizontal = findViewById(R.id.progressBarHorizontal);

        progressBarCircular.setVisibility(View.GONE);
    }

    public void carregarProgress(View view) {
        this.progress += 1;
        progressBarHorizontal.setProgress(this.progress);
        progressBarCircular.setVisibility(View.VISIBLE);

        if(this.progress >= 10) {
            progressBarCircular.setVisibility(View.GONE);
        }
    }
}