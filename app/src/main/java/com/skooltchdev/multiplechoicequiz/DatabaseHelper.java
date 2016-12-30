package com.skooltchdev.multiplechoicequiz;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Admin on 29/12/2016.
 */

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME="names.db";
    private static final String TABLE_NAME="names_table";
    private static final String COLUMN_ID = "ID";
    private static final String COLUMN_NAME ="Player";
    private static final String COLUMN_SCORE ="Score";
    //private static final String TABLE_CREATE = "create table names (id integer primary key not null increment , " + "name text not null);";

    SQLiteDatabase db;

    public DatabaseHelper(Context context) {
        super(context , DATABASE_NAME , null , DATABASE_VERSION);

    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table " + TABLE_NAME + " (ID INTEGER PRIMARY KEY AUTOINCREMENT,NAME TEXT, SCORE INTEGER)");


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        String query = "DROP TABLE IF EXISTS" + TABLE_NAME;
        db.execSQL(query);
        this.onCreate(db);

    }

    public boolean insertData(String name, String score) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(COLUMN_NAME, name);
        contentValues.put(COLUMN_SCORE, score);
        db.insert(TABLE_NAME, null, contentValues);
        long result = db.insert(TABLE_NAME, null, contentValues);
        if (result == -1) {
            return false;
        } else {
            return true;
        }


    }
}


