package com.example.realmstudent;

import io.realm.RealmObject;

public class PersonDetailsModel extends RealmObject {
    private String Name;
    private String Classa;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getClassa() {
        return Classa;
    }

    public void setClassa(String classa) {
        Classa = classa;
    }

    public String getAge() {
        return Age;
    }

    public void setAge(String age) {
        Age = age;
    }

    private String Age;


}
