package com.example.clubphoto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class sp extends AppCompatActivity {

    int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sp);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
      final   Timer t =new Timer();
        TimerTask tt =  new TimerTask() {
            @Override
            public void run() {
                counter++;
                progressBar.setProgress(counter);
if (counter == 100)
    t.cancel();
            }
        };
        t.schedule(tt,0,100);
        progressBar.getProgress();
        Handler handler=new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
               startActivity(new Intent(sp.this,MainActivity.class));
               finish();
            }
        },10000);


    }
}