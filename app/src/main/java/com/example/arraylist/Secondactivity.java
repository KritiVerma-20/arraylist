package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Intent intent=getIntent();
        String m=intent.getStringExtra("friend");
        TextView textView=findViewById(R.id.msg);
        textView.setText(m);
    }
}