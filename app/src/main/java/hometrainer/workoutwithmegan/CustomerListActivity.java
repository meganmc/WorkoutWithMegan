package hometrainer.workoutwithmegan;

import android.app.Activity;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import hometrainer.workoutwithmegan.database.Customer;

public class CustomerListActivity extends FragmentActivity {


    Button newCustomer;
    ListView customers;
    ArrayList<Customer> customerDB;
/*
    private SQLiteDatabase db;
    private Context context;


    private CustomerListActivity (Context context) {
        context = context.getApplicationContext();
        db = new CustomerListHelper(context).getWritableDatabase();
        customers =  new ListView(context);
    }

  public void addCustomer() {
        ContentValues values = getContentValues(newCustomer);

        db.insert(CustomerListHelper.FULL_NAME, null, values);
    }

    public ListView getCustomers () {
        return new ListView(context);
    }

    public void setCustomers(ListView customers) {
        customers = customers;

    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.customerlist);
        populateUsersList();
        android.support.v4.app.FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentLogin);
/*
        customerDB = new ArrayList<>();

        //bind array list to adapter

        ArrayAdapter<String> customerAdapter = new ArrayList<String>(this, android.R.layout.list_view, customerDB);
        ListView listView = (ListView) findViewById(R.id.customerlist);
        listView.setAdapter(customerAdapter);

        setContentView(R.layout.customerlist);*/
        customers = (ListView) findViewById(R.id.customerlist);
        newCustomer = (Button) findViewById(R.id.newCustomerBtn);

        newCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomerListActivity.this, new_customer_activity.class);
                startActivity(intent);

            }
        });}

    private void populateUsersList() {
        ArrayList<Customers> arrayofCustomers = Customers.getCustomers();
        CustomerAdapter adapter = new CustomerAdapter(this, arrayofCustomers);
        ListView listView = (ListView) findViewById(R.id.customerlist);
        listView.setAdapter(adapter);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_options_menu, menu);
        // menu.findItem(R.menu.main_options_menu).setIntent(
        //        new Intent(login.this, SettingsActivity.class));
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.log_off_menu_item) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onPause(){
        super.onPause();
    }


}
