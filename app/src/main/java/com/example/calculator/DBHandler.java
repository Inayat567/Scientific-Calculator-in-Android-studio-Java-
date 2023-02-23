package com.example.calculator;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {
    public static final String DBNAME = "History.db";
    public static final int VERSION = 1;
    public static final String TABLENAME = "CalcHis";
    public static final String COL1 = "id";
    public static final String COL2 = "numericExpression";

    public DBHandler(Context context) {
        super(context, DBNAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String create = "CREATE TABLE " + TABLENAME + "(" + COL1 + " INTEGER PRIMARY KEY AUTOINCREMENT, " + COL2 + " TEXT)";
        db.execSQL(create);
    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLENAME);
        onCreate(db);
    }
    public boolean saveExpression(String Expression){
        try {
            SQLiteDatabase db = this.getWritableDatabase();
            ContentValues value = new ContentValues();
            value.put(COL2, Expression);
            db.insert(TABLENAME, null, value);
            db.close();
            return true;
        }
        catch (Exception e){
            return false;
        }
    }
    public Cursor fetchExpression(){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("SELECT * FROM "+ TABLENAME +" ORDER BY "+COL1+" DESC LIMIT 30", null);
        return cursor;
    }
}
