
package thanjai.it.com.suyamvaram.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class IncomingRequest implements Parcelable
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("status")
    @Expose
    private String status;
    public final static Parcelable.Creator<IncomingRequest> CREATOR = new Creator<IncomingRequest>() {


        @SuppressWarnings({
            "unchecked"
        })
        public IncomingRequest createFromParcel(Parcel in) {
            return new IncomingRequest(in);
        }

        public IncomingRequest[] newArray(int size) {
            return (new IncomingRequest[size]);
        }

    }
    ;

    protected IncomingRequest(Parcel in) {
        this.id = ((String) in.readValue((String.class.getClassLoader())));
        this.status = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public IncomingRequest() {
    }

    /**
     * 
     * @param id
     * @param status
     */
    public IncomingRequest(String id, String status) {
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
