package com.example.relativelayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onAbsoluteButton(View V){
        Intent senderIntent = new Intent(this, AbsoluteLayout.class);
        startActivity(senderIntent);
    }
    public void onTableButton(View V){
        Intent senderIntent = new Intent(this, TableLayout.class);
        startActivity(senderIntent);
    }

}