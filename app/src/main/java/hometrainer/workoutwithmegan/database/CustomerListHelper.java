package hometrainer.workoutwithmegan.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class CustomerListHelper extends SQLiteOpenHelper {
    private static final int VERSION = 1;
    private static final String DATABASE_NAME = "customerList.db";
    private static final String TABLE_NAME = "Customer List";

    public static final String COLUMN_ID = "_id";
    public static final String FULL_NAME = "fullname";
    public static final String PHONE = "phone";
    public static final String ADDRESS = "address";
    public static final String EMAIL = "email";
    public static final String SESSIONS = "sessions";



    public CustomerListHelper(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_CUSTOMERLIST_TABLE = "CREATE TABLE " + TABLE_NAME + " (" + COLUMN_ID + " INTEGER PRIMARY KEY, " + FULL_NAME + " TEXT, " + ADDRESS +" TEXT, " + PHONE + " TEXT, " + EMAIL + " TEXT, " + SESSIONS +
                " INTEGER" + ")";
        db.execSQL(CREATE_CUSTOMERLIST_TABLE);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);

    }

    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }


    public void addCustomer(Customer customer) {
        ContentValues values = new ContentValues();
        values.put(FULL_NAME, customer.getFullName());
        values.put(ADDRESS, customer.getAddress());
        values.put(EMAIL, customer.getEmail());
        values.put(PHONE, customer.getPhone());
        values.put(SESSIONS, customer.getSessions());

        SQLiteDatabase db = this.getWritableDatabase();

        db.insert(TABLE_NAME, null, values);
        db.close();

    }

}