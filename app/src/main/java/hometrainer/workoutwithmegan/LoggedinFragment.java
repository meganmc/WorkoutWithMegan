package hometrainer.workoutwithmegan;

import android.app.Activity;
import android.app.Fragment;
import android.app.ListFragment;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.w3c.dom.Text;

import hometrainer.workoutwithmegan.R;

/**
 * Created by meganmcdonald on 4/20/16.
 */
public class LoggedinFragment extends Fragment {
   // private User mUser;
    private TextView loggedIn;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //mUser = new User();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        //reference the parent activity
    }



    @Override
    public View onCreateView(LayoutInflater inflater,
                             ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.loggedin_fragment,
                container, false);
        loggedIn = (TextView) v.findViewById(R.id.fragmentLogin);

        return v;
        //inflate view that fragment contains - UI and return it
        //get reference to any UI components
        //bind data
        //if no UI components, return null


    }

    @Override
    public void onActivityCreated (Bundle savedInstanceState) {
       super.onActivityCreated(savedInstanceState);
        //fired once parent activity is completely loaded
        //avoid if you can
    }

    @Override
    public void onStart() {
        super.onStart();
        //apply any required UI change now that fragment is visible

    }

    @Override
    public void onResume(){
        super.onResume();
        //resume any paused UI updates, processes or threads required by fragment when became inactive

    }

    @Override
    public void onPause(){
        super.onPause();
        //any processes, etc that do not need to be updated when the Activity isn't the active activity
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onStop(){
        super.onStop();
    }

    @Override
    public void onDestroyView(){
        super.onDestroyView();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
