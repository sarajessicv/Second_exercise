package com.example.second_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.secondbutton);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                intent.putExtra("com.example.second_exercise.SOMETHING", "HELLO WORLD!");
                startActivity(intent);
            }
        });

        Button buttongoogle = (Button) findViewById(R.id.googlebutton);
        buttongoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.google.fi";
                Uri address = Uri.parse(url);
                Intent googleIntent = new Intent(Intent.ACTION_VIEW, address);
                if (googleIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(googleIntent);
                }
                else{
                    System.out.println("eipä taida toimia");
                }
            }
        });

    }
}