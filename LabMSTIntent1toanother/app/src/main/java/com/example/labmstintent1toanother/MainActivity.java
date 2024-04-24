package com.example.labmstintent1toanother;

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
    public void onSubmitButton(View V){
        Intent senderIntent = new Intent(this, TextShowActivity.class);
        String Name = "KEY_SENDER";
        senderIntent.putExtra(Name, myEditText.getText().toString());
        startActivity(senderIntent);
    }
}