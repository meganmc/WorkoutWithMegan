package hometrainer.workoutwithmegan;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

/**
 * Created by meganmcdonald on 4/22/16.
 */
public class new_customer_activity extends Activity {

    Button addNewCustomer;
    EditText name, address, phone, email;
    ImageView profilePhoto;
    SharedPreferences savedContact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_customer);
       // name = (EditText) findViewById(R.id.newCustomerName);
        //address = (EditText) findViewById(R.id.newCustomerAddress);
        //phone = (EditText) findViewById(R.id.newCustomerPhone);
        //email = (EditText) findViewById(R.id.newEmail);
       // addNewCustomer = (Button) findViewById(R.id.addNewCustomerButton);
        //profilePhoto = (ImageView) findViewById(R.id.profileimage);
        //savedContact = getSharedPreferences("New Customer", MODE_PRIVATE);

        //addNewCustomer.setOnClickListener(saveListener);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_options_menu, menu);
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
    public void onPause() {
        super.onPause();
    }
}



   /* public void createNewCustomer(View view) {
        Intent intent = new Intent(new_customer_activity.this, )
    }*/
//}
