package thanjai.it.com.suyamvaram.model;

import android.content.Context;
import android.databinding.BaseObservable;

import java.util.Properties;
import retrofit2.Retrofit;
import thanjai.it.com.suyamvaram.utils.APIService;
import thanjai.it.com.suyamvaram.utils.AssetsPropertyReader;

public class BaseViewModel extends BaseObservable{
    public static String BASE_URL ;
    public Context context;
    public APIService mAPIService;
    public Retrofit mClient;
    public APIService mAPIinterface;
    public static String TAG;
    public AssetsPropertyReader assetsPropertyReader;
    public Properties properties;
}
