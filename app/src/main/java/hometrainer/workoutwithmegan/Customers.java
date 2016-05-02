package hometrainer.workoutwithmegan;

import android.widget.EditText;

import java.util.ArrayList;

/**
 * Created by meganmcdonald on 4/29/16.
 */
public class Customers {

    public String name;
    public String address;
    public String email;
    public String phone;

    public Customers(String name, String address, String email, String phone) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.phone = phone;
    }

    public static ArrayList<Customers> getCustomers() {
        ArrayList<Customers> customers = new ArrayList<Customers>();
        customers.add(new Customers("Anthony Burke", "123 Main Street, Safety Harbor, FL, 34695", "aburke999@aol.com", "727-333-4455"));
        customers.add(new Customers("Rachel White", "3001 Garden Blvd., St. Petersburg, FL, 33710", "RachelWhite2@yahoo.com", "813-908-5543"));
        customers.add(new Customers("Hannah Little", "21 55th Ave. N., St. Petersburg, FL, 33701", "LilHannah@gmail.com", "727-444-3321"));
        //customers.add(new new_customer_activity(saveNewContact));
        return customers;
    }


}
