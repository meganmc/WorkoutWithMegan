package hometrainer.workoutwithmegan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import hometrainer.workoutwithmegan.database.Customer;

/**
 * Created by meganmcdonald on 4/29/16.
 */
public class CustomerAdapter extends ArrayAdapter<Customers> {
    public CustomerAdapter (Context context, ArrayList<Customers> customers) {
        super(context, 0, customers);
    }

    @Override
    public View getView(int postion, View convertView, ViewGroup parent) {
        Customers customers = getItem(postion);
        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
        }

        TextView LVname = (TextView) convertView.findViewById(R.id.LVname);
        TextView LVaddress = (TextView) convertView.findViewById(R.id.LVaddress);
        TextView LVphone = (TextView) convertView.findViewById(R.id.LVphone);
        TextView LVemail = (TextView) convertView.findViewById(R.id.LVemail);
        LVname.setText(customers.name);
        LVaddress.setText(customers.address);
        LVphone.setText(customers.phone);
        LVemail.setText(customers.email);

        return convertView;
    }

}
