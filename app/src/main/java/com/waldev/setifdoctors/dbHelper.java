package com.waldev.setifdoctors;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class dbHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME = "setif_doctors.db";
    public static final String TABLE_NAME = "doctors";
    public static final String COL_1 = "id";
    public static final String COL_2 = "fname";
    public static final String COL_3 = "lname";
    public static final String COL_4 = "phone";
    public static final String COL_5 = "address";
    public static final String COL_6 = "price";
    public static final String COL_7 = "category";

    public dbHelper(Context context) {
        super(context, DATABASE_NAME, null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
