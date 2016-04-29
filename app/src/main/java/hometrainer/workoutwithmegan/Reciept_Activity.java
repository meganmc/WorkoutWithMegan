package hometrainer.workoutwithmegan;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by meganmcdonald on 4/20/16.
 */
public class Reciept_Activity extends Activity {

    TextView thanks;
    EditText emailInsert;
    Button emailBtn, home, print;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.receipt);
        thanks = (TextView) findViewById(R.id.ThankYouTextView);
        emailInsert = (EditText) findViewById(R.id.emailEditText);
        emailBtn = (Button) findViewById(R.id.EmailReceipt);
        home = (Button) findViewById(R.id.returnHome);
        print = (Button) findViewById(R.id.PrintReceipt);



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
