package com.example.experiment14;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText myEditText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myEditText = (EditText)findViewById(R.id.mainActivityText);
    }
    public void submitClick(View V){
        Intent senderIntent = new Intent(this, TextView_Activity.class);
        String Name = "KEY_SENDER";
        senderIntent.putExtra(Name, myEditText.getText().toString());
        startActivity(senderIntent);
    }




}