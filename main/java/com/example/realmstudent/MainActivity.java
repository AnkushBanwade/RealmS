package com.example.realmstudent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import io.realm.Realm;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
   EditText Name,Class,Age;
    Button btn;
    Realm realm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=(Button)findViewById(R.id.btn);

        Name=(EditText)findViewById(R.id.Name);
        Class=(EditText)findViewById(R.id.Class);
        Age=(EditText)findViewById(R.id.Age);
        String sName=Name.getText().toString();
        String sClass=Class.getText().toString();
        String sAge=Age.getText().toString();
        Realm.init(this);    //initialize to access database for this activity
        realm = Realm.getDefaultInstance();   //create a object for read and write database

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                realm.beginTransaction();  //open the database
                //database operation
                PersonDetailsModel obj = realm.createObject(PersonDetailsModel.class);  //this will create a


                obj.setName(Name.getText().toString());
                obj.setAge(Age.getText().toString());
                obj.setClassa(Class.getText().toString());
                //obj.setMobileno(phoneno.getText().toString());   //inserted all data to database
                realm.commitTransaction(); //close the database
                finish();
                Intent i= new Intent(MainActivity.this,Showview.class);

                startActivity(i);


            }
        });



    }

    @Override
    public void onClick(View v) {

    }

    public void Save(View view) {
    }
}
