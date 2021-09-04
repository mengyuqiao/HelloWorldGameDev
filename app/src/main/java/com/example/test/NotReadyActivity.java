package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class NotReadyActivity extends AppCompatActivity {
    Button returnBtn;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_not_ready);

        this.returnBtn = (Button) findViewById(R.id.leave_btn);
        this.backBtn = (Button) findViewById(R.id.backBtn3);

        returnBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(NotReadyActivity.this, MainMenuActivity.class);
                startActivity(intent);
            }
        });

        // get back
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}