package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private String[] names = {
            "jinal",
            "milin",
            "shikha",
            "gargi",
            "kritika"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void secondactivity(View view) {

        Intent intent = new Intent(this, com.example.arraylist.Secondactivity.class);
        startActivity(intent);
        Random r=new Random();
        String n=names[r.nextInt()];
        intent.putExtra("friend",n);
    }
}