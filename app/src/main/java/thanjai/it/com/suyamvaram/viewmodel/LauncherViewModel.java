package thanjai.it.com.suyamvaram.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.util.Log;
import android.view.View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import thanjai.it.com.suyamvaram.model.CUser;
import thanjai.it.com.suyamvaram.model.LauncherModel;
import thanjai.it.com.suyamvaram.model.User;
import thanjai.it.com.suyamvaram.utils.APIService;
import thanjai.it.com.suyamvaram.utils.RetrofitClient;
import thanjai.it.com.suyamvaram.view.LauncherResultCallbacks;

public class LauncherViewModel extends BaseObservable {
    private LauncherModel launcherModel;
    private Context context;
    private LauncherResultCallbacks launcherResultCallbacks;
    private static final String TAG = "LauncherViewModel";
    private APIService mAPIService;
    private Retrofit mClient;
    private APIService mAPIinterface;
    public LauncherViewModel(LauncherModel launcherModel, Context context, LauncherResultCallbacks launcherResultCallbacks) {
        this.launcherModel = launcherModel;
        this.context = context;
        this.launcherResultCallbacks = launcherResultCallbacks;
    }

    public View.OnClickListener onSingUpClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                launcherResultCallbacks.onSingupClicked();
            }
        };
    }

    public View.OnClickListener onLoginClicked() {
        return new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.i(TAG, "@@@@@@@@@@@@@@@ inside click");
                        mClient = RetrofitClient.getClient("http://192.168.1.20:8080");
                        mAPIinterface = mClient.create(APIService.class);
                        mAPIinterface.getUser().enqueue(new Callback<User>() {
                            @Override
                            public void onResponse(Call<User> call, Response<User> response) {
                                Log.i(TAG, "******** Response");
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


                        // loginResultCallbacks.onLoginSuccess();
                    }
                };
                launcherResultCallbacks.onLoginClicked();
            }
        };
    }
}
