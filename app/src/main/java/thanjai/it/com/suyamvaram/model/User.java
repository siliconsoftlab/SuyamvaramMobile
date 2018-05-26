
package thanjai.it.com.suyamvaram.model;

import java.util.List;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class User implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("religion")
    @Expose
    private String religion;
    @SerializedName("motherTongue")
    @Expose
    private String motherTongue;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("maritalStatus")
    @Expose
    private Object maritalStatus;
    @SerializedName("caste")
    @Expose
    private Object caste;
    @SerializedName("havingDosham")
    @Expose
    private Boolean havingDosham;
    @SerializedName("currentLocation")
    @Expose
    private Object currentLocation;
    @SerializedName("height")
    @Expose
    private Object height;
    @SerializedName("physicalStatus")
    @Expose
    private Object physicalStatus;
    @SerializedName("education")
    @Expose
    private Object education;
    @SerializedName("occupation")
    @Expose
    private Object occupation;
    @SerializedName("employedIn")
    @Expose
    private Object employedIn;
    @SerializedName("salary")
    @Expose
    private Object salary;
    @SerializedName("incomingRequest")
    @Expose
    private List<IncomingRequest> incomingRequest = null;
    @SerializedName("outgoingRequest")
    @Expose
    private List<OutgoingRequest> outgoingRequest = null;
    public final static Parcelable.Creator<User> CREATOR = new Creator<User>() {


        @SuppressWarnings({
            "unchecked"
        })
        public User createFromParcel(Parcel in) {
            return new User(in);
        }

        public User[] newArray(int size) {
            return (new User[size]);
        }

    }
    ;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    protected User(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.username = ((String) in.readValue((String.class.getClassLoader())));
        this.password = ((String) in.readValue((String.class.getClassLoader())));
        this.gender = ((String) in.readValue((String.class.getClassLoader())));
        this.dob = ((String) in.readValue((String.class.getClassLoader())));
        this.religion = ((String) in.readValue((String.class.getClassLoader())));
        this.motherTongue = ((String) in.readValue((String.class.getClassLoader())));
        this.address = ((Address) in.readValue((Address.class.getClassLoader())));
        this.maritalStatus = ((Object) in.readValue((Object.class.getClassLoader())));
        this.caste = ((Object) in.readValue((Object.class.getClassLoader())));
        this.havingDosham = ((Boolean) in.readValue((Boolean.class.getClassLoader())));
        this.currentLocation = ((Object) in.readValue((Object.class.getClassLoader())));
        this.height = ((Object) in.readValue((Object.class.getClassLoader())));
        this.physicalStatus = ((Object) in.readValue((Object.class.getClassLoader())));
        this.education = ((Object) in.readValue((Object.class.getClassLoader())));
        this.occupation = ((Object) in.readValue((Object.class.getClassLoader())));
        this.employedIn = ((Object) in.readValue((Object.class.getClassLoader())));
        this.salary = ((Object) in.readValue((Object.class.getClassLoader())));
        in.readList(this.incomingRequest, (thanjai.it.com.suyamvaram.model.IncomingRequest.class.getClassLoader()));
        in.readList(this.outgoingRequest, (thanjai.it.com.suyamvaram.model.OutgoingRequest.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param motherTongue
     * @param occupation
     * @param caste
     * @param education
     * @param maritalStatus
     * @param password
     * @param incomingRequest
     * @param currentLocation
     * @param id
     * @param religion
     * @param username
     * @param height
     * @param address
     * @param dob
     * @param physicalStatus
     * @param gender
     * @param outgoingRequest
     * @param salary
     * @param havingDosham
     * @param employedIn
     */
    public User(String id, String username, String password, String gender, String dob, String religion, String motherTongue, Address address, Object maritalStatus, Object caste, Boolean havingDosham, Object currentLocation, Object height, Object physicalStatus, Object education, Object occupation, Object employedIn, Object salary, List<IncomingRequest> incomingRequest, List<OutgoingRequest> outgoingRequest) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.dob = dob;
        this.religion = religion;
        this.motherTongue = motherTongue;
        this.address = address;
        this.maritalStatus = maritalStatus;
        this.caste = caste;
        this.havingDosham = havingDosham;
        this.currentLocation = currentLocation;
        this.height = height;
        this.physicalStatus = physicalStatus;
        this.education = education;
        this.occupation = occupation;
        this.employedIn = employedIn;
        this.salary = salary;
        this.incomingRequest = incomingRequest;
        this.outgoingRequest = outgoingRequest;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }

    public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Object getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Object maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public Object getCaste() {
        return caste;
    }

    public void setCaste(Object caste) {
        this.caste = caste;
    }

    public Boolean getHavingDosham() {
        return havingDosham;
    }

    public void setHavingDosham(Boolean havingDosham) {
        this.havingDosham = havingDosham;
    }

    public Object getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Object currentLocation) {
        this.currentLocation = currentLocation;
    }

    public Object getHeight() {
        return height;
    }

    public void setHeight(Object height) {
        this.height = height;
    }

    public Object getPhysicalStatus() {
        return physicalStatus;
    }

    public void setPhysicalStatus(Object physicalStatus) {
        this.physicalStatus = physicalStatus;
    }

    public Object getEducation() {
        return education;
    }

    public void setEducation(Object education) {
        this.education = education;
    }

    public Object getOccupation() {
        return occupation;
    }

    public void setOccupation(Object occupation) {
        this.occupation = occupation;
    }

    public Object getEmployedIn() {
        return employedIn;
    }

    public void setEmployedIn(Object employedIn) {
        this.employedIn = employedIn;
    }

    public Object getSalary() {
        return salary;
    }

    public void setSalary(Object salary) {
        this.salary = salary;
    }

    public List<IncomingRequest> getIncomingRequest() {
        return incomingRequest;
    }

    public void setIncomingRequest(List<IncomingRequest> incomingRequest) {
        this.incomingRequest = incomingRequest;
    }

    public List<OutgoingRequest> getOutgoingRequest() {
        return outgoingRequest;
    }

    public void setOutgoingRequest(List<OutgoingRequest> outgoingRequest) {
        this.outgoingRequest = outgoingRequest;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(username);
        dest.writeValue(password);
        dest.writeValue(gender);
        dest.writeValue(dob);
        dest.writeValue(religion);
        dest.writeValue(motherTongue);
        dest.writeValue(address);
        dest.writeValue(maritalStatus);
        dest.writeValue(caste);
        dest.writeValue(havingDosham);
        dest.writeValue(currentLocation);
        dest.writeValue(height);
        dest.writeValue(physicalStatus);
        dest.writeValue(education);
        dest.writeValue(occupation);
        dest.writeValue(employedIn);
        dest.writeValue(salary);
        dest.writeList(incomingRequest);
        dest.writeList(outgoingRequest);
    }

    public int describeContents() {
        return  0;
    }

}
