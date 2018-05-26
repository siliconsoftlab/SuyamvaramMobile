package thanjai.it.com.suyamvaram.utils;

import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import thanjai.it.com.suyamvaram.model.CUser;
import thanjai.it.com.suyamvaram.model.User;
import thanjai.it.com.suyamvaram.model.UserOld;
import retrofit2.Call;
public interface APIService {
    @POST("/posts")
    @FormUrlEncoded
    Call<UserOld> savePost(@Body UserOld user);

    @GET("/suyamvaram/v1/test")
    Call<User> getUser();

    @POST("/suyamvaram/v1/login")
    Call<CUser> login(@Body User user);


}
