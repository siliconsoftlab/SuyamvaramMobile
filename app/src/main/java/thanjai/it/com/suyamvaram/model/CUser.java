
package thanjai.it.com.suyamvaram.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/*import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;*/

public class CUser {

    @SerializedName("id")
    @Expose
    private Object id;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("password")
    @Expose
    private String password;
    @SerializedName("gender")
    @Expose
    private Object gender;
    @SerializedName("dob")
    @Expose
    private Object dob;
    @SerializedName("religion")
    @Expose
    private Object religion;
    @SerializedName("motherTongue")
    @Expose
    private Object motherTongue;
    @SerializedName("address")
    @Expose
    private Object address;
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
    private List<Object> incomingRequest = null;
    @SerializedName("outgoingRequest")
    @Expose
    private List<Object> outgoingRequest = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public CUser() {
    }

    public CUser(String username, String password) {
        this.username = username;
        this.password = password;
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
    public CUser(Object id, String username, String password, Object gender, Object dob, Object religion, Object motherTongue, Object address, Object maritalStatus, Object caste, Boolean havingDosham, Object currentLocation, Object height, Object physicalStatus, Object education, Object occupation, Object employedIn, Object salary, List<Object> incomingRequest, List<Object> outgoingRequest) {
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

    public Object getId() {
        return id;
    }

    public void setId(Object id) {
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

    public Object getGender() {
        return gender;
    }

    public void setGender(Object gender) {
        this.gender = gender;
    }

    public Object getDob() {
        return dob;
    }

    public void setDob(Object dob) {
        this.dob = dob;
    }

    public Object getReligion() {
        return religion;
    }

    public void setReligion(Object religion) {
        this.religion = religion;
    }

    public Object getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(Object motherTongue) {
        this.motherTongue = motherTongue;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
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

    public List<Object> getIncomingRequest() {
        return incomingRequest;
    }

    public void setIncomingRequest(List<Object> incomingRequest) {
        this.incomingRequest = incomingRequest;
    }

    public List<Object> getOutgoingRequest() {
        return outgoingRequest;
    }

    public void setOutgoingRequest(List<Object> outgoingRequest) {
        this.outgoingRequest = outgoingRequest;
    }


    @Override
    public String toString() {
        return "CUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", dob=" + dob +
                ", religion=" + religion +
                ", motherTongue=" + motherTongue +
                ", address=" + address +
                ", maritalStatus=" + maritalStatus +
                ", caste=" + caste +
                ", havingDosham=" + havingDosham +
                ", currentLocation=" + currentLocation +
                ", height=" + height +
                ", physicalStatus=" + physicalStatus +
                ", education=" + education +
                ", occupation=" + occupation +
                ", employedIn=" + employedIn +
                ", salary=" + salary +
                ", incomingRequest=" + incomingRequest +
                ", outgoingRequest=" + outgoingRequest +
                '}';
    }
}
