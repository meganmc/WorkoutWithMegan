package hometrainer.workoutwithmegan;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

/**
 * Created by meganmcdonald on 4/20/16.
 */
public class login extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        EditText usernameText = (EditText)findViewById(R.id.usernameText);
        usernameText.getText();
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

}

