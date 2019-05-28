/*
package com.example.realmstudent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

public class Showview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ArrayList<String> Name = new ArrayList<String>();
        ArrayList<String> Class = new ArrayList<String>();
         ArrayList<String> Age = new ArrayList<String>();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showview);
        ListView lv=(ListView)findViewById(R.id.lv);
        ArrayList<String> addArray = new  ArrayList<String>();
        String str[]=new String[]{"A","B","C","s","d"};

       // TextView show = (TextView)findViewById(R.id.show);
        Realm.init(this);
        Realm realm = Realm.getDefaultInstance(); //creating  database oject
        RealmResults<PersonDetailsModel> results = realm.where(PersonDetailsModel.class).findAllAsync();
        //fetching the data
        results.load();
        String output="";




        for(PersonDetailsModel information:results) {
            output += information;
            //addArray.add(String.valueOf(information));
            addArray.add(information.getName());
            addArray.add(information.getClassa());
            addArray.add(information.getAge());


            ArrayAdapter<String> itemsAdapter =
                    new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, addArray.add(information.getName())+addArray.add(information.getClassa())+addArray.add(information.getAge());//show.setText(output);

            lv.setAdapter(itemsAdapter);







        }
        //String[] array = addArray. toArray(new String[0]);
        //System. out. println(Arrays. toString(array));




*/
/*
        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, addArray);//show.setText(output);

        lv.setAdapter(itemsAdapter);
*//*

        //addArray.add(output);



        //  ArrayList<String> cities = (ArrayList<String>) Arrays.asList(output);


    }



}
*/
