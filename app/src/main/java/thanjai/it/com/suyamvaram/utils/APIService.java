package thanjai.it.com.suyamvaram.utils;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import thanjai.it.com.suyamvaram.model.MatchCondition;
import thanjai.it.com.suyamvaram.model.User;
import retrofit2.Call;

public interface APIService {


    @GET("/suyamvaram/v1/test")
    Call<User> getUser();

    @POST("/suyamvaram-1.0/suyamvaram/v1/login")
    Call<User> login(@Body User user);

    @PUT("/suyamvaram-1.0/suyamvaram/v1/register")
    Call<User> register(@Body User user);


    @POST("/suyamvaram-1.0/suyamvaram/v1/getMatches")
    Call<List<User>> getMatches(@Body MatchCondition condition);

}
