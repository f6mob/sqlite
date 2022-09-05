package com.kozolovich.sqlite;

import androidx.room.Database;

import java.util.List;

@Database(entities = {Person.class},version = 1)
public abstract class PersonLocalDB extends Person {
    public abstract PersonDB getPersonDAO();
    

}
