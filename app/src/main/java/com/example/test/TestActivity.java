package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TestActivity extends AppCompatActivity {
    String username;
    Button submitUsernameBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        this.username = ((EditText)findViewById(R.id.name_edit)).getText().toString();
        this.submitUsernameBtn = (Button) findViewById(R.id.ok_btn);
        submitUsernameBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TestActivity.this, MainActivity.class);
                Bundle usernameBundle = new Bundle();
                usernameBundle.putCharSequence("username", username);
                intent.putExtras(usernameBundle);
                startActivity(intent);
            }
        });
    }
}