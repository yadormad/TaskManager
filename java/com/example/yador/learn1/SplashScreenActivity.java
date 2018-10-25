package com.example.yador.learn1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
public class SplashScreenActivity extends AppCompatActivity {

    private static final int SPLASH_TIMEOUT = 2000;

    private ImageView splashLogoImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash_screen);

        splashLogoImageView = findViewById(R.id.imageView);

        Animation animationRotateCenter = AnimationUtils.loadAnimation(
                this, R.anim.splash_rotate);
        splashLogoImageView.startAnimation(animationRotateCenter);

        new Handler().postDelayed(new Runnable() {

            /*
             * Showing splash screen with a timer. This will be useful when you
             * want to show case your app logo / company
             */

            @Override
            public void run() {
                // This method will be executed once the timer is over
                // Start your app main activity
                Intent i = new Intent(SplashScreenActivity.this, SideBarActivity.class);
                startActivity(i);

                // close this activity
                finish();
            }
        }, SPLASH_TIMEOUT);
    }
}
