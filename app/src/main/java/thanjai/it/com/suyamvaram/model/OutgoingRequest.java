
package thanjai.it.com.suyamvaram.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OutgoingRequest implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("status")
    @Expose
    private String status;
    public final static Parcelable.Creator<OutgoingRequest> CREATOR = new Creator<OutgoingRequest>() {


        @SuppressWarnings({
            "unchecked"
        })
        public OutgoingRequest createFromParcel(Parcel in) {
            return new OutgoingRequest(in);
        }

        public OutgoingRequest[] newArray(int size) {
            return (new OutgoingRequest[size]);
        }

    }
    ;

    protected OutgoingRequest(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public OutgoingRequest() {
    }

    /**
     * 
     * @param id
     * @param status
     */
    public OutgoingRequest(String id, String status) {
        super();
        this.id = id;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(id);
        dest.writeValue(status);
    }

    public int describeContents() {
        return  0;
    }

}
