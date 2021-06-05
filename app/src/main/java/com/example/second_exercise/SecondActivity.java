package com.example.second_exercise;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        if (getIntent().hasExtra("com.example.second_exercise.SOMETHING")){
            TextView text = (TextView) findViewById(R.id.textView);
            String hello = getIntent().getExtras().getString("com.example.second_exercise.SOMETHING");
            System.out.println("TOIMIIKOOO");
            text.setText(hello);
        }
    }
}
