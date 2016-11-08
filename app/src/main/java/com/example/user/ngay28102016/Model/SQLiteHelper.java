package com.example.user.ngay28102016.Model;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.user.ngay28102016.WiFi;

import java.util.ArrayList;

/**
 * Created by User on 11/3/2016.
 */
public class SQLiteHelper extends SQLiteOpenHelper {
    SQLiteDatabase sqLiteDatabase;

    public SQLiteHelper(Context context) {

        super(context, "wifi_table", null, 1);
    }


    static final String CREATE_TABLE = "create table wifi_table  (id INTEGER PRIMARY KEY AUTOINCREMENT," +
            "wifi_SSID TEXT, wifi_x REAL,  wifi_y REAL,  wifi_z REAL) ";

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS wifi_table ");
        onCreate(sqLiteDatabase);
    }


    public void storeDatabase(ArrayList<WiFi> wiFis) {
        SQLiteDatabase db = this.getWritableDatabase();
        for (WiFi wiFi : wiFis) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("wifi_SSID", wiFi.getSSID());
            contentValues.put("wifi_x",wiFi.getX());
            contentValues.put("wifi_y", wiFi.getY());
            contentValues.put("wifi_z", wiFi.getZ());
            db.insert("wifi_table", null, contentValues);
        }
/**
 public void execute() {
 ArrayList<WifiItemData> wifiItemDataArrayList = new ArrayList<>();
 WifiItemData wifiItemData = new WifiItemData();
 wifiItemDataArrayList.add(wifiItemData);
 storeDatabase(wifiItemDataArrayList);

 */


    }

}
