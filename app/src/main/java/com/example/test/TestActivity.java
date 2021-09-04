package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TestActivity extends AppCompatActivity {
    Button submitUsernameBtn;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        // Get user's input, and send the username to MainActivity to say welcome when user presses the yes button
        this.submitUsernameBtn = (Button) findViewById(R.id.ok_btn);
        submitUsernameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = ((EditText)findViewById(R.id.name_edit)).getText().toString();
                Intent intent = new Intent(TestActivity.this, MainActivity.class);
                Bundle usernameBundle = new Bundle();
                usernameBundle.putCharSequence("username", username);
                intent.putExtras(usernameBundle);
                startActivity(intent);
            }
        });

        // get back
        this.backBtn = (Button) findViewById(R.id.backBtn4);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}