package thanjai.it.com.suyamvaram.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.UUID;

public class UserOld implements Parcelable{
    private UUID Id;
    private String fname;
    private String lname;
    private String dob;
    private String pwd;
    private Address address;

    public UserOld(){
        this.Id=UUID.randomUUID();
        this.fname="Saravanan";
        this.lname="Chinnadurai";
        this.dob="21/11/1989";
    }

    public static final Parcelable.Creator CREATOR = new Parcelable.Creator() {
        public UserOld createFromParcel(Parcel in) {
            return new UserOld(in);
        }
        public UserOld[] newArray(int size) {
            return new UserOld[size];
        }
    };

    public UserOld(Parcel in){
        this.Id= in.readParcelable(UUID.class.getClassLoader());
        this.fname= in.readString();
        this.lname= in.readString();
        this.dob= in.readString();
        this.pwd= in.readString();
        this.address = (Address) in.readParcelable(Address.class.getClassLoader());
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeValue(Id);
        dest.writeString(fname);
        dest.writeString(lname);
        dest.writeString(dob);
        dest.writeString(pwd);
        dest.writeParcelable(address, flags);
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID id) {
        Id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public static Creator getCREATOR() {
        return CREATOR;
    }
}
