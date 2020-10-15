package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private Button bn;
    private String[] names = {
            "jinal", "milin", "shikha", "gargi", "kritika"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bn=(Button)findViewById(R.id.send);
        bn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code
                Random random=new Random();
                String n=names[random.nextInt()];
                Intent intent = new Intent(MainActivity.this, com.example.arraylist.nextactivity.class);
                intent.putExtra("friend",n);
                startActivity(intent);

            }
        });
    }

    public void gotosecondactivity(View view) {


    }
}