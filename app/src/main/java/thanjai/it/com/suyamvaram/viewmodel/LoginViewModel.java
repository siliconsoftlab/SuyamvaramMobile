package thanjai.it.com.suyamvaram.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import thanjai.it.com.suyamvaram.BR;
import thanjai.it.com.suyamvaram.model.CUser;
import thanjai.it.com.suyamvaram.model.LoginModel;
import thanjai.it.com.suyamvaram.model.User;
import thanjai.it.com.suyamvaram.utils.APIService;
import thanjai.it.com.suyamvaram.utils.RetrofitClient;
import thanjai.it.com.suyamvaram.view.LoginResultCallbacks;

public class LoginViewModel extends BaseObservable {

    public static final String BASE_URL = "http://52.77.220.7:8080/suyamvaram-1.0/suyamvaram/v1/";
    private LoginModel loginModel;
    private Context context;
    private LoginResultCallbacks loginResultCallbacks;
    private APIService mAPIService;
    private Retrofit mClient;
    private APIService mAPIinterface;
    private static final String TAG = "LoginViewModel";

    public LoginViewModel(LoginModel loginModel, Context context, LoginResultCallbacks loginResultCallbacks) {
        this.loginModel = loginModel;
        this.context = context;
        this.loginResultCallbacks = loginResultCallbacks;
    }

    public View.OnClickListener onLoginClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "************ OnClick *************");
                Log.e(TAG, "Username "+ loginModel.getUsernanme());
                Log.e(TAG, "Password "  +loginModel.getPassword());
                mClient = RetrofitClient.getClient("http://192.168.1.20:8080");
                mAPIinterface = mClient.create(APIService.class);
                mAPIinterface.login(new User(loginModel.getUsernanme(),loginModel.getPassword())).enqueue(new Callback<User>() {
                    @Override
                    public void onResponse(Call<User> call, Response<User> response) {
                        if (response.code() == 200 )
                        {
                            loginResultCallbacks.onLoginSuccess();
                        }
                        Log.i(TAG, "******** Response ****************");
                        int code = response.code();
                        Log.e(TAG, "&&&&&&&&&&&&&&&&&&&&&&&&&& " + code);
                        Log.e(TAG, "&&&&&&&&&&&&&&&&&&&&&&&&&& " + response.toString());
                        Log.e(TAG, "&&&&&&&&&&&&&&&&&&&&&&&&&& " + response.body().toString());
                    }

                    @Override
                    public void onFailure(Call<User> call, Throwable t) {
                        Log.e(TAG, "********onFailure");
                    }
                });


              /*  mAPIinterface.getUser().enqueue(new Callback<CUser>() {
                    @Override
                    public void onResponse(Call<CUser> call, Response<CUser> response) {
                        Log.i(TAG, "******** Response");
                        int code = response.code();
                        Log.e(TAG, "&&&&&&&&&&&&&&&&&&&&&&&&&& " + code);
                        Log.e(TAG, "&&&&&&&&&&&&&&&&&&&&&&&&&& " + response.toString());
                        Log.e(TAG, "&&&&&&&&&&&&&&&&&&&&&&&&&& " + response.body().toString());
                    }

                    @Override
                    public void onFailure(Call<CUser> call, Throwable t) {
                        Log.e(TAG, "********onFailure");

                    }
                });*/


                // loginResultCallbacks.onLoginSuccess();
            }
        };
    }
    @Bindable
    public String getUsernanme() {
        return loginModel.getUsernanme();
    }

    public void setUsernanme(String usernanme) {
        loginModel.setUsernanme(usernanme);
        notifyPropertyChanged(BR.usernanme);
    }
    @Bindable
    public String getPassword() {
        return loginModel.getPassword();
    }

    public void setPassword(String password) {
        loginModel.setPassword(password);
        notifyPropertyChanged(BR.password);
    }
}
