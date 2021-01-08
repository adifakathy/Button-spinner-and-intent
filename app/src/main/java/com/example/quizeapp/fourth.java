package com.example.quizeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class fourth extends AppCompatActivity {
    public TextView t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        t1=findViewById(R.id.t1);
        Intent myresultintent=getIntent();
        int result=myresultintent.getIntExtra(thrid.newextrainformation, 0);
        t1.setText("your result is:" + result  + " out of 10");
    }
}