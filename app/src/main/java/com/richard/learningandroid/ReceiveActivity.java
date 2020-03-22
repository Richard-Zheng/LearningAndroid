package com.richard.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive);

        Intent intent = getIntent();
        String message = intent.getStringExtra(SendActivity.EXTRA_MESSAGE);

        TextView textview = (TextView) findViewById(R.id.text_message);
        textview.setText(message);
    }
}
