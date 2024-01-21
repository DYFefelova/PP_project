package com.example.myapplication;

import android.app.Application;

import androidx.room.Room;

import com.example.myapplication.data.Database;
import com.example.myapplication.data.NoteDao;

public class App extends Application {

    private Database database;
    private NoteDao noteDao;

    private static App instance;

    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        database = Room.databaseBuilder(getApplicationContext(),
                        Database.class, "app-db-name")
                .allowMainThreadQueries()
                .build();

        noteDao = database.noteDao();
    }

    public Database getDatabase() {
        return database;
    }

    public void setDatabase(Database database) {
        this.database = database;
    }

    public NoteDao getNoteDao() {
        return noteDao;
    }

    public void setNoteDao(NoteDao noteDao) {
        this.noteDao = noteDao;
    }
}