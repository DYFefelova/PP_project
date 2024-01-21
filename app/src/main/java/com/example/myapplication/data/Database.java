package com.example.myapplication.data;

import androidx.room.RoomDatabase;
import com.example.myapplication.model.Note;
@androidx.room.Database(entities = {Note.class}, version = 1, exportSchema = false)
public abstract class Database extends RoomDatabase {
    public abstract NoteDao noteDao();
}