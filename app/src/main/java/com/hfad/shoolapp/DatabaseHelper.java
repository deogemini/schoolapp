package com.hfad.shoolapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper  extends SQLiteOpenHelper {
    //Logcat tag
    private static final String LOG = "DatabaseHelper";
    // Database Version
    private static final int DATABASE_VERSION = 1;

    // Database Name
    private static final String DATABASE_NAME = "SchoolApp.db";

    // Table Names
    private static final String TABLE_NAME = "registerStudent";
    private static final String TABLE_NAME1 = "registerLecture";
    private static final String TABLE_NAME2 = "registerCourse";

    //Common column names
    private static final

//    public static final String DATABASE_NAME = "schoolApp.db";
//    public static final String TABLE_NAME = " registerstaff";
//    public static final String COL_1 = "fname";
//  public static final String COL_2 = "mname";
//  public static final String COL_3 = "lname";
//  public static final String COL_4 = "email";
//  public static final String COL_5 = "phoneNo";
//  public static final String COL_6 = "gender";
//    public static final String COL_7 = "code";
////
//
//    public DatabaseHelper(@Nullable Context context) {
//        super(context, DATABASE_NAME, null, 2);    }
//
//    @Override
//    public void onCreate(SQLiteDatabase db) {
//       db.execSQL("CREATE TABLE "+TABLE_NAME+"(fname TEXT, mname TEXT, lname TEXT, email TEXT, PHONENO INTEGER, gender TEXT, code TEXT )");
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//     onCreate(db);
//
//    }
//
//    public boolean insertData(String firstname, String middlename, String lastname, String email, String phonenu,
//                              String gender, String code) {
//
//        SQLiteDatabase db = this.getReadableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(COL_1,firstname );
//        contentValues.put(COL_2,middlename );
//        contentValues.put(COL_3,lastname );
//        contentValues.put(COL_4,email );
//        contentValues.put(COL_5,phonenu );
//        contentValues.put(COL_6,gender );
//        contentValues.put(COL_7,code );
////        contentValues.put(COL_9,psd);
////        // contentValues.put(COL_9,gender );
//
//        long result = db.insert(TABLE_NAME,null, contentValues);
//        if(result >0)
//            return true;
//        else
//            return false;
//    }
//    public static final String TABLE_NAME = "registerstudent_table";
//    public static final String COL_1 = "ID";
//    public static final String COL_2 = "fname";
//    public static final String COL_3 = "mname";
//    public static final String COL_4 = "lname";
//    public static final String COL_5 = "email";
//    public static final String COL_6 = "phoneNo";
//    public static final String COL_7 = "Program";
//    public static final String COL_8 = "year_of_study";
//    public static final String COL_9 = "Password";
////    public static final String COL_9 = "Gender";
//
//
//    public DatabaseHelper(Context context) {
//        super(context, DATABASE_NAME, null, 1);
//    }
//
//    @Override
////    public void onCreate(SQLiteDatabase db) {
////        db.execSQL("CREATE TABLE "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, FIRSTNAME TEXT, MIDDLENAME TEXT, LASTNAME, EMAIL TEXT, PHONENO INTEGER, PROGRAM TEXT, " +
////                "YEAR_OF_STUDY INTERGER)");
////
////    }
//
//    public void onCreate(SQLiteDatabase db) {
//        db.execSQL("CREATE TABLE "+TABLE_NAME+"(ID INTEGER PRIMARY KEY AUTOINCREMENT, fname TEXT, mname TEXT, lname, email TEXT, phoneNo INTEGER, program TEXT, " +
//                "year_of_study INTERGER, Password TEXT)");
//
//    }
//
//    @Override
//    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
//        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
//        onCreate(db);
//    }
//
//    public boolean insertData(String firstname, String middlename, String lastname, String emailstudent, String phonenu,
//                              String Programstud, String yearstudy, String psd) {
//
//    SQLiteDatabase db = this.getReadableDatabase();
//        ContentValues contentValues = new ContentValues();
//        contentValues.put(COL_2,firstname );
//        contentValues.put(COL_3,middlename );
//        contentValues.put(COL_4,lastname );
//        contentValues.put(COL_5,emailstudent );
//        contentValues.put(COL_6,phonenu );
//        contentValues.put(COL_7,Programstud );
//        contentValues.put(COL_8,yearstudy );
//        contentValues.put(COL_9,psd);
//       // contentValues.put(COL_9,gender );
//
//long result = db.insert(TABLE_NAME,null, contentValues);
//if(result >0)
//    return true;
//else
//    return false;
//    }
//
//
////    public long insertData(String firstname, String middlename, String lastname, String emailstudent, String phonenu, String programstud, String yearstudy) {
////
////        SQLiteDatabase db = this.getReadableDatabase();
////        ContentValues contentValues = new ContentValues();
////        contentValues.put("fname",firstname );
////        contentValues.put("mname",middlename );
////        contentValues.put("lname",lastname );
////        contentValues.put("email",emailstudent );
////        contentValues.put("phoneNo",phonenu );
////        contentValues.put("Program",programstud);
////        contentValues.put("Year of Study",yearstudy );
////        // contentValues.put(COL_9,gender );
////
////        long res= db.insert(TABLE_NAME,null, contentValues);
////       db.close();
////       return res;
////    }
}