package com.example.zachery.androidlabs;



import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class ChatDatabaseHelper extends SQLiteOpenHelper {

    static String DATABASE_NAME = "Chats.db";
    static int VERSION_NUM = 1;
    final static String KEY_ID = "_id";
    final static String KEY_MESSAGE = "message";
    final static String TABLE_NAME = "CHAT_TABLE";

    private static final String CREATE_TABLE_CHAT = "create table"
            +TABLE_NAME + "(" + KEY_ID
            +"integer primary key autoincrement," + KEY_MESSAGE + "text not null" +");";

    public ChatDatabaseHelper(Context ctx) {
        super(ctx, DATABASE_NAME, null, VERSION_NUM);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

       db.execSQL(CREATE_TABLE_CHAT);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_NAME);
        onCreate(db);
    }
}
