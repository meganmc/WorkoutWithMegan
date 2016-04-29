package hometrainer.workoutwithmegan;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by meganmcdonald on 4/20/16.
 */


public class Payment_Activity extends Activity {

    TextView price, payment_info;
    EditText name, number, securityCode, billing;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.payment);
        price = (TextView) findViewById(R.id.paymentInfo);
        payment_info = (TextView) findViewById(R.id.CreditPayment);
        name = (EditText) findViewById(R.id.CreditCardName);
        number = (EditText) findViewById(R.id.CardNumber);
        securityCode = (EditText) findViewById(R.id.SecurityCode);
        billing = (EditText) findViewById(R.id.BillingAddress);
        submit = (Button) findViewById(R.id.submitPayment);



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
    public void onPause() {
        super.onPause();
    }


}
