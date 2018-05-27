
package thanjai.it.com.suyamvaram.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Address implements Parcelable
{

    @SerializedName("doorNo")
    @Expose
    private String doorNo;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("place")
    @Expose
    private String place;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("pincode")
    @Expose
    private String pincode;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("countryCode")
    @Expose
    private Object countryCode;
    @SerializedName("mobileNo")
    @Expose
    private String mobileNo;
    @SerializedName("whatsappNo")
    @Expose
    private String whatsappNo;
    public final static Parcelable.Creator<Address> CREATOR = new Creator<Address>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Address createFromParcel(Parcel in) {
            return new Address(in);
        }

        public Address[] newArray(int size) {
            return (new Address[size]);
        }

    }
    ;

    protected Address(Parcel in) {
        this.doorNo = ((String) in.readValue((String.class.getClassLoader())));
        this.street = ((String) in.readValue((String.class.getClassLoader())));
        this.place = ((String) in.readValue((String.class.getClassLoader())));
        this.city = ((String) in.readValue((String.class.getClassLoader())));
        this.district = ((String) in.readValue((String.class.getClassLoader())));
        this.state = ((String) in.readValue((String.class.getClassLoader())));
        this.country = ((String) in.readValue((String.class.getClassLoader())));
        this.pincode = ((String) in.readValue((String.class.getClassLoader())));
        this.email = ((String) in.readValue((String.class.getClassLoader())));
        this.countryCode = ((Object) in.readValue((Object.class.getClassLoader())));
        this.mobileNo = ((String) in.readValue((String.class.getClassLoader())));
        this.whatsappNo = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Address() {
    }

    /**
     * 
     * @param pincode
     * @param whatsappNo
     * @param email
     * @param street
     * @param doorNo
     * @param countryCode
     * @param state
     * @param district
     * @param place
     * @param mobileNo
     * @param country
     * @param city
     */
    public Address(String doorNo, String street, String place, String city, String district, String state, String country, String pincode, String email, Object countryCode, String mobileNo, String whatsappNo) {
        super();
        this.doorNo = doorNo;
        this.street = street;
        this.place = place;
        this.city = city;
        this.district = district;
        this.state = state;
        this.country = country;
        this.pincode = pincode;
        this.email = email;
        this.countryCode = countryCode;
        this.mobileNo = mobileNo;
        this.whatsappNo = whatsappNo;
    }

    public String getDoorNo() {
        return doorNo;
    }

    public void setDoorNo(String doorNo) {
        this.doorNo = doorNo;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Object getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(Object countryCode) {
        this.countryCode = countryCode;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getWhatsappNo() {
        return whatsappNo;
    }

    public void setWhatsappNo(String whatsappNo) {
        this.whatsappNo = whatsappNo;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(doorNo);
        dest.writeValue(street);
        dest.writeValue(place);
        dest.writeValue(city);
        dest.writeValue(district);
        dest.writeValue(state);
        dest.writeValue(country);
        dest.writeValue(pincode);
        dest.writeValue(email);
        dest.writeValue(countryCode);
        dest.writeValue(mobileNo);
        dest.writeValue(whatsappNo);
    }

    public int describeContents() {
        return  0;
    }

    @Override
    public String toString() {
        return "Address{" +
                "doorNo='" + doorNo + '\'' +
                ", street='" + street + '\'' +
                ", place='" + place + '\'' +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pincode='" + pincode + '\'' +
                ", email='" + email + '\'' +
                ", countryCode=" + countryCode +
                ", mobileNo='" + mobileNo + '\'' +
                ", whatsappNo='" + whatsappNo + '\'' +
                '}';
    }
}
