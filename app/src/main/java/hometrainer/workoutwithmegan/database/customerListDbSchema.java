package hometrainer.workoutwithmegan.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.BaseColumns;

import java.net.ContentHandler;

import static java.security.AccessController.getContext;

/**
 * Created by meganmcdonald on 4/22/16.
 */
public class customerListDbSchema {
public customerListDbSchema(){}


    }






    /*//DB open/upgrade helper
    private cus

    private static class CustomerListHelper extends SQLiteOpenHelper {
        private static final int VERSION = 1;
        private static final String DATABASE_NAME = "customerList.db";
        private static final String DATABASE_TABLE = "CustomerList";

        //SQL statement to create a new database
        private static String DATABASE_CREATE = "create table " + DATABASE_TABLE + " (" + KEY_ID + " integer primary key autoincrement, " +

        public CustomerListHelper(Context context) {
            super(context, DATABASE_NAME, null, VERSION);
        }

        @Override
        public onCreate(SQLiteDatabase db){
            db.execSQL("create table " + CustomerTable.NAME + "\n" + CustomerTable.Cols.NAME + CustomerTable.Cols.PHONE + CustomerTable.Cols.ADDRESS, CustomerTable.Cols.EMAIL, CustomerTable.Cols.SESSIONS);

        }

        @Override
        public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){

        }
    }

}
*/