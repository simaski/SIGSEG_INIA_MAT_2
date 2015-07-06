package com.cenatel.desarrollo.sigseg_inia_mat;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by root on 06/07/15.
 */
public class DBSigseg extends SQLiteOpenHelper {

    private static final String DB_NAME = "CenatelSigsegIniaPortuguesa";
    private static final int DB_VERSION = 1;
    private SQLiteDatabase db;

    public DBSigseg(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        db.execSQL(DBreSigseg.CREATE_DB_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
