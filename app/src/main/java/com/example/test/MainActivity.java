package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button yes_btn;
    Button not_btn;
    String username;
    TextView usernameView;
    Button backBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.textView = (TextView) findViewById(R.id.hello_text);
        this.yes_btn = (Button) findViewById(R.id.hello_btn);
        this.not_btn = (Button) findViewById(R.id.not_ready_btn);
        this.usernameView = (TextView) findViewById(R.id.hello_name_text);
        this.backBtn = (Button) findViewById(R.id.backBtn2);

        // get TestActivity's username, show it on the page, if it's empty, show Unknown as username
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        username = bundle.getString("username");
        if ("".equals(username)){
            username = "Unknown";
        }

        String text = "Hello " + username;
        usernameView.setText(text);

        // get to the next page
        yes_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, HelloActivity.class);
                startActivity(intent);
            }
        });

        // get to the goodbye page
        not_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NotReadyActivity.class);
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