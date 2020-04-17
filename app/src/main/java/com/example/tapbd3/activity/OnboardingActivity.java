package com.example.tapbd3.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;

import com.example.tapbd3.R;;

public class OnboardingActivity extends AppCompatActivity {

    MediaPlayer audiobacground;
    ImageView logo;
    Animation animlogo, progress;
    ProgressBar progressBar;
    private static int splashInterval = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_onboarding);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_onboarding);

        audiobacground = MediaPlayer.create(this, R.raw.bismillah);
        audiobacground.setVolume(1,1);
        audiobacground.start();

        //inisialisasi gambar
        logo = findViewById(R.id.logo);
        progressBar = findViewById(R.id.progressbar);

        //load animation
        animlogo = AnimationUtils.loadAnimation(this, R.anim.muncul);
        progress = AnimationUtils.loadAnimation(this, R.anim.muncul);

        //parsing animasi
        logo.startAnimation(animlogo);
        progressBar.startAnimation(progress);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {

                startActivity(new Intent(OnboardingActivity.this, MainActivity.class));
                finish();
            }
            private void finish(){
                //todo
            }
        }, splashInterval);
    }
}
