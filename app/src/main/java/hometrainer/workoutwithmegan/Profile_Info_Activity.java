package hometrainer.workoutwithmegan;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.CheckedInputStream;

/**
 * Created by meganmcdonald on 4/20/16.
 */
public class Profile_Info_Activity extends Activity {

    TextView profile, name, phoneNumber, address, session;
    Button moreSessions;
    ImageView photo;
    CheckBox one, two, three, four, five;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profileinfo);

        profile = (TextView) findViewById(R.id.ProfileInfoTitle);
        name = (TextView) findViewById(R.id.NameView);
        phoneNumber = (TextView) findViewById(R.id.PhoneNumberView);
        address = (TextView) findViewById(R.id.AddressView);
        session = (TextView) findViewById(R.id.Sessions);
        moreSessions = (Button) findViewById(R.id.sessionBtn);
        photo = (ImageView) findViewById(R.id.profileimage);
        one = (CheckBox) findViewById(R.id.session1);
        two = (CheckBox) findViewById(R.id.Session2);
        three = (CheckBox) findViewById(R.id.Session3);
        four = (CheckBox) findViewById(R.id.Session4);
        five = (CheckBox) findViewById(R.id.Session5);

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
