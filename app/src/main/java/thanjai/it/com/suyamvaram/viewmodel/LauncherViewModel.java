package thanjai.it.com.suyamvaram.viewmodel;

import android.content.Context;
import android.databinding.BaseObservable;
import android.util.Log;
import android.view.View;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import thanjai.it.com.suyamvaram.model.BaseViewModel;
import thanjai.it.com.suyamvaram.model.LauncherModel;
import thanjai.it.com.suyamvaram.model.User;
import thanjai.it.com.suyamvaram.utils.APIService;
import thanjai.it.com.suyamvaram.utils.RetrofitClient;
import thanjai.it.com.suyamvaram.view.LauncherResultCallbacks;

public class LauncherViewModel extends BaseViewModel {

    private static final String TAG = "LauncherViewModel";
    private LauncherModel launcherModel;
    private Context context;
    private LauncherResultCallbacks launcherResultCallbacks;

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
                launcherResultCallbacks.onLoginClicked();
            }
        };
    }
}