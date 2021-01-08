package com.example.quizeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Objects;

public class second extends AppCompatActivity {
    public TextView t1,t2,t3;
    public RadioGroup myradigroup;
    public RadioButton myradiobutton;
    public Button next;
    public static final String newnextra=" second activity information";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        t1=findViewById(R.id.t1);
        t2=findViewById(R.id.t2);
        t3=findViewById(R.id.t3);
        next=findViewById(R.id.nextb);
        myradigroup=findViewById(R.id.radiogroupid);
        Intent mygetIntent=getIntent();
        String sectionttext=mygetIntent.getStringExtra(MainActivity.spinnerofsection);
        String id =mygetIntent.getStringExtra(MainActivity.edittext1);
        String name=mygetIntent.getStringExtra(MainActivity.edittext2);
        t1.setText("id is:"+id);
        t2.setText(" name is:"+name);
       t3.setText("section is:"+sectionttext);

    }

    public void nextbutton(View view) {
        int number=0;
        int radioid=myradigroup.getCheckedRadioButtonId();
        myradiobutton=findViewById(radioid);
        String text= myradiobutton.getText().toString();
        if (text.equals("Start Activity For result()")) {
            number=5;
        }
        Intent myIntent=new Intent(this,thrid.class);
        myIntent.putExtra(newnextra,number);
        startActivity(myIntent);
    }
}