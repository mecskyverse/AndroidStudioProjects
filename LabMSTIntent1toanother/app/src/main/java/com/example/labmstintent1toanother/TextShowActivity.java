package com.example.labmstintent1toanother;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

    public class TextShowActivity extends AppCompatActivity {
        TextView textView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_text_show);
            textView = (TextView)findViewById(R.id.textView2);
            Intent receiverIntent = getIntent();
            String receivedValue = receiverIntent.getStringExtra("KEY_SENDER");
            textView.setText(receivedValue);
        }
    }