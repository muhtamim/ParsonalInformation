package com.example.muhtamimnahid.parsonalinformation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView name,email,age,country,education;
    String namerecive,emailrecive,agerecive,countryrecive,educationrecive;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name =(TextView) findViewById(R.id.name);
        email = (TextView) findViewById(R.id.email);
        age = (TextView) findViewById(R.id.age);
        education =(TextView) findViewById(R.id.education);
        country =(TextView) findViewById(R.id.country);

        namerecive = getIntent().getStringExtra("name").toString();
        emailrecive = getIntent().getStringExtra("email").toString();
        agerecive =  getIntent().getStringExtra("age").toString();
        educationrecive = getIntent().getStringExtra("education").toString();
        countryrecive = getIntent().getStringExtra("country").toString();

        name.setText("Name:   "+namerecive);
        email.setText("Email: "+emailrecive);
        age.setText("age:     "+agerecive);
        education.setText("Education:  "+educationrecive);
        country.setText("Country:  "+countryrecive);
    }
}
