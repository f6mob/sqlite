package com.kozolovich.sqlite;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Person {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "Age")
    private int Age;
    @ColumnInfo(name = "Name")
    private String Name;


}
