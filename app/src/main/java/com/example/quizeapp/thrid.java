package com.example.quizeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.Objects;

public class thrid extends AppCompatActivity {
    public RadioGroup myradigroup;
    public RadioButton myradiobutton;
    public Button submit;
    public int num=0;
    public static final String newextrainformation=" third activity information";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrid);
        submit=findViewById(R.id.submit);
        myradigroup=findViewById(R.id.radiogroupid2);
        Intent mygetIntent=getIntent();
          num=mygetIntent.getIntExtra(second.newnextra,0);



    }

    public void submitbutton(View view) {
        int newnum=0;
        int radioid=myradigroup.getCheckedRadioButtonId();
        myradiobutton=findViewById(radioid);
        String text= myradiobutton.getText().toString();
        if (text.equals("Android packaging kit")){
            newnum=5;
        }
        num=num+newnum;
        Intent myintent= new Intent(this,fourth.class);
        myintent.putExtra(newextrainformation,num);
        startActivity(myintent);
    }
}