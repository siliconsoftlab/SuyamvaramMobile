package thanjai.it.com.suyamvaram.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.util.Log;
import android.view.View;

import java.util.List;
import java.util.Properties;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import thanjai.it.com.suyamvaram.BR;
import thanjai.it.com.suyamvaram.model.LoginModel;
import thanjai.it.com.suyamvaram.model.MatchCondition;
import thanjai.it.com.suyamvaram.model.ProgressBarState;
import thanjai.it.com.suyamvaram.model.User;
import thanjai.it.com.suyamvaram.utils.APIService;
import thanjai.it.com.suyamvaram.utils.AssetsPropertyReader;
import thanjai.it.com.suyamvaram.utils.RetrofitClient;
import thanjai.it.com.suyamvaram.view.LoginResultCallbacks;

public class LoginViewModel extends BaseObservable {
    private static final String TAG = "LoginViewModel";
    public static String BASE_URL;
    private LoginModel loginModel;
    private Context context;
    private LoginResultCallbacks loginResultCallbacks;
    private APIService mAPIService;
    private Retrofit mClient;
    private APIService mAPIinterface;
    private AssetsPropertyReader assetsPropertyReader;
    private Properties properties;


    public LoginViewModel(LoginModel loginModel, Context context, LoginResultCallbacks loginResultCallbacks) {
        this.loginModel = loginModel;
        this.context = context;
        this.loginResultCallbacks = loginResultCallbacks;
        assetsPropertyReader = new AssetsPropertyReader(context);
        properties = assetsPropertyReader.getProperties("suymavaram.properties");
        BASE_URL = properties.getProperty("BASE_URL");

    }

    public View.OnClickListener onLoginClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "************ onLoginClicked *************");
                Log.d(TAG, "Username " + loginModel.getUsernanme());
                Log.d(TAG, "Password " + loginModel.getPassword());

                login();

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

    @Bindable
    public ProgressBarState getProgressBarState() {
        return loginModel.getProgressBarState();

    }

    public void setProgressBarState(ProgressBarState progressBarState) {
        loginModel.setProgressBarState(progressBarState);
        notifyPropertyChanged(BR.progressBarState);
    }

    public void login() {
        mClient = RetrofitClient.getClient(BASE_URL);
        mAPIinterface = mClient.create(APIService.class);
        mAPIinterface.login(new User(loginModel.getUsernanme(), loginModel.getPassword())).enqueue(new Callback<User>() {
            @Override
            public void onResponse(Call<User> call, Response<User> response) {
                if (response.code() == 200) {
                    Log.d(TAG, "************ Login Success *************");

                    MatchCondition matchCondition = new MatchCondition();
                    User curUser = response.body();
                    if (curUser.getGender().equalsIgnoreCase("male")) {
                        matchCondition.setSexCondition("Female");

                    } else if (curUser.getGender().equalsIgnoreCase("female")) {
                        matchCondition.setSexCondition("Male");
                    }
                    getMatches(matchCondition);
                } else {
                    loginResultCallbacks.onLoginError("Username or Password is not correct");
                    Log.d(TAG, "************ Login Error Check response code *************"+"response.code() "+response.code());



                }
            }

            @Override
            public void onFailure(Call<User> call, Throwable t) {
                loginResultCallbacks.onLoginError("Could not connect to server ");
                Log.e(TAG, "******** Login Error server not connected **************** ");
                Log.e(TAG, "" + t.getCause());

            }
        });
    }

    public void getMatches(MatchCondition matchCondition) {

        mAPIinterface.getMatches(matchCondition).enqueue(new Callback<List<User>>() {
            @Override
            public void onResponse(Call<List<User>> call, Response<List<User>> response) {
                Log.d(TAG, "************ Get Matches Success *************");
                if (response.code() == 200) {
                    List<User> matches = response.body();
                    Log.d(TAG, "************ Users *************");
                    Log.d(TAG, "Match size "+matches.size());
                    loginResultCallbacks.onLoginSuccess(response.body());
                }else{
                    Log.e(TAG, "GetMatches Error Check response code response.code() "+response.code());

                }
            }

            @Override
            public void onFailure(Call<List<User>> call, Throwable t) {
                Log.d(TAG, "************ Get Matches Error server not connected *************");
            }
        });

    }
}
