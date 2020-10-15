package com.example.arraylist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class nextactivity extends AppCompatActivity {
    private Button b;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextactivity);
        b=(Button)findViewById(R.id.display);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code
                Intent intent = new Intent(nextactivity.this, com.example.arraylist.MainActivity.class);
                startActivity(intent);

            }
        });
        Intent intent=getIntent();
        String m=intent.getStringExtra("friend");
        textView=findViewById(R.id.msg);
        textView.setText(m);
    }


    }