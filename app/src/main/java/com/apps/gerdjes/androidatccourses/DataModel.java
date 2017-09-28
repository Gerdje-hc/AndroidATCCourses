package com.apps.gerdjes.androidatccourses;

/**
 * Created by vdabcursist on 28/09/2017.
 * Model class is used to pass data between interface and database or backend of the applicatio in modular form
 */

public class DataModel {

    private String name;
    private int id_;

    public DataModel(String name, int id_) {
        this.name = name;
        this.id_ =id_;

    }
    public String getName() {
        return name;
    }

    public int getId(){
        return id_;
    }

}
