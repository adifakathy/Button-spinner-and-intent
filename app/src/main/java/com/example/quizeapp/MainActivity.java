package com.example.quizeapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    public EditText ed1,ed2;
    public Spinner myspinner;
    public Button b1;
    public static final String edittext1=" editext1 information";
    public static final String spinnerofsection="spinner information";
    public static final String edittext2="edittext2 information";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ed1=findViewById(R.id.ideditextid);
        ed2=findViewById(R.id.nameedittextid);
        myspinner=findViewById(R.id.spinnerid);
        b1=findViewById(R.id.b1id);
        ArrayAdapter<CharSequence> adpater=ArrayAdapter.createFromResource(this,R.array.SECTION,android.R.layout.simple_spinner_item);
        adpater.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        myspinner.setAdapter(adpater);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String id=ed1.getText().toString();
                String selectsection=myspinner.getSelectedItem().toString();
                String name=ed2.getText().toString();
                Intent i= new Intent(MainActivity.this,second.class);
                i.putExtra(edittext1,id);
               i.putExtra(edittext2,name);
                i.putExtra(spinnerofsection,selectsection);
                startActivity(i);
            }
        });

    }
}