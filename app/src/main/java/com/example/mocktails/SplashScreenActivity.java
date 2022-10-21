package com.example.mocktails;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import org.jetbrains.annotations.Nullable;

import kotlin.Metadata;

@SuppressLint("CustomSplashScreen")
@Metadata(
        mv = {1, 7, 1},
        k = 1,
        d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0014¨\u0006\u0007"},
        d2 = {"Lcom/example/midterm_exam/SplashScreenActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"}
)
public final class SplashScreenActivity extends AppCompatActivity {
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_splashscreen);

        MediaPlayer appIntro;
        appIntro = MediaPlayer.create(SplashScreenActivity.this,R.raw.androidaudio);
        appIntro.start();


        ActionBar var10000 = this.getSupportActionBar();
        if (var10000 != null) {
            var10000.hide();
        }

        Handler handler = new Handler(Looper.getMainLooper());
        handler.postDelayed((Runnable) new Runnable() {
            public final void run() {
                Intent intent = new Intent((Context)SplashScreenActivity.this, MainActivity.class);
                SplashScreenActivity.this.startActivity(intent);
                appIntro.stop();
                SplashScreenActivity.this.finish();
            }
        }, 5000L);
    }
}
