
package thanjai.it.com.suyamvaram.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MatchCondition implements Parcelable
{

    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("ageCondition")
    @Expose
    private String ageCondition;
    @SerializedName("sexCondition")
    @Expose
    private String sexCondition;
    public final static Creator<MatchCondition> CREATOR = new Creator<MatchCondition>() {


        @SuppressWarnings({
            "unchecked"
        })
        public MatchCondition createFromParcel(Parcel in) {
            return new MatchCondition(in);
        }

        public MatchCondition[] newArray(int size) {
            return (new MatchCondition[size]);
        }

    }
    ;

    protected MatchCondition(Parcel in) {
        this.age = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.ageCondition = ((String) in.readValue((String.class.getClassLoader())));
        this.sexCondition = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public MatchCondition() {
    }

    /**
     * 
     * @param ageCondition
     * @param age
     * @param sexCondition
     */
    public MatchCondition(Integer age, String ageCondition, String sexCondition) {
        super();
        this.age = age;
        this.ageCondition = ageCondition;
        this.sexCondition = sexCondition;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAgeCondition() {
        return ageCondition;
    }

    public void setAgeCondition(String ageCondition) {
        this.ageCondition = ageCondition;
    }

    public String getSexCondition() {
        return sexCondition;
    }

    public void setSexCondition(String sexCondition) {
        this.sexCondition = sexCondition;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(age);
        dest.writeValue(ageCondition);
        dest.writeValue(sexCondition);
    }

    public int describeContents() {
        return  0;
    }

    @Override
    public String toString() {
        return "MatchCondition{" +
                "age=" + age +
                ", ageCondition='" + ageCondition + '\'' +
                ", sexCondition='" + sexCondition + '\'' +
                '}';
    }
}
