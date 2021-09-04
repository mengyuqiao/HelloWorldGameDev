package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class HelloActivity extends AppCompatActivity {

    Button backBtn;
    Button homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);

        // animation
        final ImageView hello = (ImageView) findViewById(R.id.hello_img);
        Animation anim = AnimationUtils.loadAnimation(HelloActivity.this, R.anim.scale);
        hello.startAnimation(anim);

        // get back
        this.backBtn = (Button) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        // get to main menu
        this.homeBtn = (Button) findViewById(R.id.homeBtn);
        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HelloActivity.this, MainMenuActivity.class);
                startActivity(intent);
            }
        });
    }
}