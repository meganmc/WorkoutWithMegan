package hometrainer.workoutwithmegan;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;

import hometrainer.workoutwithmegan.Customers;

/**
 * Created by meganmcdonald on 4/22/16.
 */
public class new_customer_activity extends Activity {

    Button addNewCustomer, backBtn;
    ImageButton photoBtn;
    EditText name;
    EditText address;
    EditText phone;
    EditText email;
    ImageView profilePhoto;
    SharedPreferences savedContact;
    static final int REQUEST_IMAGE_CAPTURE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_customer);
        name = (EditText) findViewById(R.id.newCustomerName);
        address = (EditText) findViewById(R.id.newCustomerAddress);
        phone = (EditText) findViewById(R.id.newCustomerPhone);
        email = (EditText) findViewById(R.id.newEmail);
        addNewCustomer = (Button) findViewById(R.id.addNewCustomerButton);
        profilePhoto = (ImageView) findViewById(R.id.profileimage);
        savedContact = getSharedPreferences("New Customer", MODE_PRIVATE);
        backBtn = (Button) findViewById(R.id.backBtn);
        photoBtn = (ImageButton) findViewById(R.id.photoBtn);



        addNewCustomer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //saveNewContact(getApplicationContext(), name, address, phone, email);
                Intent intent = new Intent(new_customer_activity.this, CustomerListActivity.class);
                Toast.makeText(getApplicationContext(), "Saving to Customer List...", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                Intent backIntent = new Intent(new_customer_activity.this, CustomerListActivity.class);
                startActivity(backIntent);
            }
        });


        //click on picture to take photo
        photoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
                takePicture();
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);


            }
        });}





   private void takePicture() {
       Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
       if(takePictureIntent.resolveActivity(getPackageManager()) != null) {
           startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
       }
 /*

        if (getApplicationContext().getPackageManager().hasSystemFeature(
                PackageManager.FEATURE_CAMERA)) {

            fileUri = Uri.fromFile(filePicture);
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            if (intent.resolveActivity(getPackageManager()) != null) {
                intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile());
                startActivityForResult(intent, TAKE_PICTURE);
            }
            // start the image capture Intent
            startActivityForResult(intent, 100);
        } else {
            Toast.makeText(getApplication(), "Camera not supported", Toast.LENGTH_SHORT).show();
        }*/
    }


    public static void saveNewContact(Context context, String name, String address, String phone, String email) {
        SharedPreferences prefs = context.getSharedPreferences("hometrainer", 0);
        SharedPreferences.Editor editor = prefs.edit();

        Customers newCustomer = new Customers(name, address, phone, email);
        editor.putString(name, newCustomer.toString());

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
