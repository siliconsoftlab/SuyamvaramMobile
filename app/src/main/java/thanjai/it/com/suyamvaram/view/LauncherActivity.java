package thanjai.it.com.suyamvaram.view;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;

import thanjai.it.com.suyamvaram.R;
import thanjai.it.com.suyamvaram.databinding.ActivityLauncherBinding;
import thanjai.it.com.suyamvaram.model.LauncherModel;
import thanjai.it.com.suyamvaram.viewmodel.LauncherViewModel;

public class LauncherActivity extends AppCompatActivity implements LauncherResultCallbacks {

    private static final String TAG = "LoginActivity";

    public LauncherActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        init();
    }

    private void init() {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActivityLauncherBinding activityLauncherBinding = DataBindingUtil.setContentView(this, R.layout.activity_launcher);
        LauncherModel launcherModel = new LauncherModel();
        LauncherViewModel launcherViewModel = new LauncherViewModel(launcherModel, this, this);
        activityLauncherBinding.setLauncherModel(launcherViewModel);
    }

    @Override
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        super.addContentView(view, params);
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    public void onFBLoginSuccess() {

    }

    @Override
    public void onFBLoginFailed() {

    }

    @Override
    public void onGoogleLoginSuccess() {

    }

    @Override
    public void onGoogleLoginFailed() {

    }

    @Override
    public void onSingupClicked() {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    @Override
    public void onLoginClicked() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
