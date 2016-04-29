package hometrainer.workoutwithmegan.database;

/**
 * Created by meganmcdonald on 4/28/16.
 */
public class Customer {

    private int _ID;
    private String FULL_NAME;
    private String ADDRESS;
    private String EMAIL;
    private String PHONE;
    private int SESSIONS;

    public Customer() {

    }

    public Customer(int id, String fullname, String address, String email, String phone, int sessions) {
        this._ID = id;
        this.FULL_NAME = fullname;
        this.ADDRESS= address;
        this.EMAIL = email;
        this.PHONE = phone;
        this.SESSIONS = sessions;
    }

    public Customer(String fullname, String address, String email, String phone, int sessions) {
        this.FULL_NAME = fullname;
        this.ADDRESS = address;
        this.EMAIL = email;
        this.PHONE = phone;
        this.SESSIONS = sessions;
    }

    public void set_ID(int id) {
        this._ID = id;
    }

    public int get_ID() {
        return this._ID;
    }

    public void setFullName(String fullname) {
        this.FULL_NAME = fullname;
    }

    public String getFullName() {
        return this.FULL_NAME;
    }

    public void setAddress(String address) {
        this.ADDRESS = address;
    }

    public String getAddress() {
        return this.ADDRESS;
    }

    public void setEmail(String email) {
        this.EMAIL = email;
    }
    public String getEmail() {
        return this.EMAIL;
    }
    public void setPhone(String phone) {
        this.PHONE = phone;
    }
    public String getPhone() {
        return this.PHONE;
    }
    public void setSessions(int sessions) {
        this.SESSIONS = sessions;
    }
    public int getSessions() {
        return this.SESSIONS;
    }
}
