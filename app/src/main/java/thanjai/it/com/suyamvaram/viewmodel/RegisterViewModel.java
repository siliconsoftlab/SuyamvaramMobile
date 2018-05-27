package thanjai.it.com.suyamvaram.viewmodel;

import android.content.Context;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import thanjai.it.com.suyamvaram.BR;
import thanjai.it.com.suyamvaram.model.Address;
import thanjai.it.com.suyamvaram.model.BaseViewModel;
import thanjai.it.com.suyamvaram.model.IncomingRequest;
import thanjai.it.com.suyamvaram.model.OutgoingRequest;
import thanjai.it.com.suyamvaram.model.User;
import thanjai.it.com.suyamvaram.utils.APIService;
import thanjai.it.com.suyamvaram.utils.AssetsPropertyReader;
import thanjai.it.com.suyamvaram.utils.RetrofitClient;
import thanjai.it.com.suyamvaram.view.RegisterResultCallbacks;

public class RegisterViewModel extends BaseViewModel {

    private User registerModel;
    private Address address = new Address();
    private RegisterResultCallbacks registerResultCallbacks;
    private boolean allFiled;


    public RegisterViewModel(User registerModel, Context context, RegisterResultCallbacks registerResultCallbacks) {
        this.registerModel = registerModel;
        this.registerModel.setAddress(address);
        this.context = context;
        this.registerResultCallbacks = registerResultCallbacks;
        assetsPropertyReader = new AssetsPropertyReader(context);
        properties = assetsPropertyReader.getProperties("suymavaram.properties");
        BASE_URL = properties.getProperty("BASE_URL");
    }

    public View.OnClickListener onRegisterClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(isAllFiled()){
                   Log.i(TAG, "********************* onRegisterSuccess ");
                   Log.i(TAG, " " + registerModel.toString());
                   Log.i(TAG, " " + registerModel.getAddress().toString());
                   mClient = RetrofitClient.getClient(BASE_URL);
                   mAPIinterface = mClient.create(APIService.class);
                   mAPIinterface.register(registerModel).enqueue(new Callback<User>() {
                       @Override
                       public void onResponse(Call<User> call, Response<User> response) {
                           if (response.code() == 200) {
                               registerResultCallbacks.onRegisterSuccess();
                           } else {

                               Log.e(TAG, "******** Register Error Response ****************");
                               Log.e(TAG, "******** " + response.toString());

                           }
                       }

                       @Override
                       public void onFailure(Call<User> call, Throwable t) {
                           registerResultCallbacks.onRegisterFailed("Error");
                           Log.e(TAG, "******** Register Error Response **************** ");
                           Log.e(TAG, "" + t.getCause());

                       }
                   });

               }else{
                   registerResultCallbacks.onRegisterFailed("Enter all the values");
               }


            }
        };
    }

    public View.OnClickListener onClickedMandatoryFailed() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                registerResultCallbacks.onRegisterMandatoryError();
            }
        };
    }

    @Bindable
    public boolean isAllFieldHasValues() {

        if (registerModel.getUsername() == "" || registerModel.getPassword() == "" || registerModel.getGender() == "" || registerModel.getDob() == "" || registerModel.getAddress().getCountryCode() == "" || registerModel.getAddress().getMobileNo() == "" || registerModel.getAddress().getEmail() == "" || registerModel.getPassword() == "") {
            return false;
        } else {
            return true;
        }

    }

    @Bindable
    public String getUsername() {
        return registerModel.getUsername();
    }

    public void setUsername(String username) {
        registerModel.setUsername(username);
        notifyPropertyChanged(BR.username);
    }

    @Bindable
    public String getPassword() {
        return registerModel.getPassword();
    }

    public void setPassword(String password) {
        registerModel.setPassword(password);
        notifyPropertyChanged(BR.password);
    }

    @Bindable
    public String getGender() {
        return registerModel.getGender();

    }

    public void setGender(String gender) {
        registerModel.setGender(gender);
        notifyPropertyChanged(BR.gender);
    }

    @Bindable
    public String getDob() {
        return registerModel.getDob();
    }

    public void setDob(String dob) {
        registerModel.setDob(dob);
        notifyPropertyChanged(BR.dob);
    }

    @Bindable
    public Address getAddress() {
        return registerModel.getAddress();
    }

    public void setAddress(Address address) {
        registerModel.setAddress(address);
        notifyPropertyChanged(BR.address);
    }

    @Bindable
    public Object getCountryCode() {
        return registerModel.getAddress().getCountryCode();
    }

    public void setCountryCode(Object countryCode) {
        registerModel.getAddress().setCountryCode(countryCode);
        notifyPropertyChanged(BR.countryCode);
    }

    @Bindable
    public String getMobileNo() {
        return registerModel.getAddress().getMobileNo();
    }

    public void setMobileNo(String mobileNo) {
        registerModel.getAddress().setMobileNo(mobileNo);
    }

    @Bindable
    public String getEmail() {
        return registerModel.getAddress().getEmail();
    }

    public void setEmail(String email) {
        registerModel.getAddress().setEmail(email);
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public boolean isAllFiled() {
        Log.e(TAG, "********************* isAllFieldHasValues " + registerModel.toString());
        Log.i(TAG, "********************* isAllFieldHasValues " + registerModel.toString());
        Log.d(TAG, "********************* isAllFieldHasValues " + registerModel.toString());
        Log.w(TAG, "********************* isAllFieldHasValues " + registerModel.toString());
        if (registerModel != null && registerModel.getUsername() != null) {
            if (registerModel.getUsername() == "" || registerModel.getPassword() == "" || registerModel.getGender() == "" || registerModel.getDob() == "" || registerModel.getAddress().getCountryCode() == "" || registerModel.getAddress().getMobileNo() == "" || registerModel.getAddress().getEmail() == "" || registerModel.getPassword() == "") {
                return false;
            } else {
                return true;
            }
        }

        return false;
    }

    public void setAllFiled(boolean allFiled) {
        this.allFiled = allFiled;
        notifyPropertyChanged(BR.allFiled);
    }
/*  public String getReligion() {
        return religion;
    }

    public void setReligion(String religion) {
        this.religion = religion;
    }
*/
   /* public String getMotherTongue() {
        return motherTongue;
    }

    public void setMotherTongue(String motherTongue) {
        this.motherTongue = motherTongue;
    }*/

  /*  public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
*/
  /*  public Object getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(Object maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
*/
   /* public Object getCaste() {
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
*/
    /*public Object getHeight() {
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
    }*/

}
