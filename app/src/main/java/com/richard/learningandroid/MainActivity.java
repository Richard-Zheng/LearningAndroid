package com.richard.learningandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startHelloToast(View view) {
        Intent intent = new Intent(MainActivity.this, HelloToastActivity.class);
        startActivity(intent);
    }

    public void startScrollingText(View view) {
        Intent intent = new Intent(this, ScrollingTextActivity.class);
        startActivity(intent);
    }

    public void startTemplateBasicActivity(View view) {
        Intent intent = new Intent(this, TemplateBasicActivity.class);
        startActivity(intent);
    }

    public void startSendActivity(View view) {
        Intent intent = new Intent(this, SendActivity.class);
        startActivity(intent);
    }
}
