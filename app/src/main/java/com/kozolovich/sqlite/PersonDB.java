package com.kozolovich.sqlite;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface PersonDB {
    @Insert()
    public void insert(Person person);

    @Delete
    public void delete(Person person);

    @Query("select * from person")
    List<Person> getAllPersons();

    @Query("select * from person where Name like :name")
    List<Person> getAllPersonsWithName(String name);
}
