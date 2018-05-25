package com.example.muhtamimnahid.parsonalinformation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name,email,age,country,education;
    Button submit;
    String nametxt,emailtxt,agetxt,countrytxt,educationtxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.inputname);
        email = (EditText) findViewById(R.id.Emailinput);
        age = (EditText) findViewById(R.id.Ageinput);
        education = (EditText) findViewById(R.id.educationinput);
        country = (EditText) findViewById(R.id.countyinput);
        submit = (Button) findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                nametxt = name.getText().toString();
                emailtxt = email.getText().toString();
                agetxt = age.getText().toString();
                educationtxt = education.getText().toString();
                countrytxt = country.getText().toString();

                Intent intent = new Intent(MainActivity.this,Main2Activity.class);
                intent.putExtra("name",nametxt);
                intent.putExtra("email",emailtxt);
                intent.putExtra("age",agetxt);
                intent.putExtra("education",educationtxt);
                intent.putExtra("country",countrytxt);
                startActivity(intent);
            }
        });

    }
}
