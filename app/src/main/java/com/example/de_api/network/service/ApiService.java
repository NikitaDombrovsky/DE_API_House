package com.example.de_api.network.service;

import com.example.de_api.network.Auth.LoginData.LoginResponce;
import com.example.de_api.network.Auth.RegisterData.RegisterResponce;
import com.example.de_api.network.Mobile.MobileGet.MobileGetResponce;
import com.example.de_api.network.Mobile.MobilePatch.MobilePatchResponce;
import com.example.de_api.network.Mobile.MobilePost.MobilePostBody;
import com.example.de_api.network.Mobile.MobilePost.MobilePostResponce;
import com.example.de_api.network.Rooms.RoomsDelete.RoomsDeleteResponce;
import com.example.de_api.network.Rooms.RoomsGet.RoomsGetResponce;
import com.example.de_api.network.Rooms.RoomsPatch.RoomsPatchResponce;
import com.example.de_api.network.Rooms.RoomsPost.RoomsPostResponce;
import com.example.de_api.network.SmartHome.RegisterMain.RegisterMainBody;
import com.example.de_api.network.SmartHome.RegisterMain.RegisterMainResponce;
import com.example.de_api.network.SmartHome.RegisterMainGet.RegisterMainGetResponce;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    // APP
    @POST("/app")
    Call<RegisterMainResponce> doResponce (@Body RegisterMainBody registerMainBody);
    @GET("/app")
    Call<List<RegisterMainGetResponce>> doResponceGet(@Query("competitor") String competitor);

    // Mobile
    @POST("/mobile")
    Call<MobilePostResponce> doMobilePostResponce (@Body MobilePostBody mobilePostBody);
    @GET("/mobile")
    Call<List<MobileGetResponce>> doMobileGetResponce(@Query("appId") String appId);
    @PATCH("/mobile")
    Call<MobilePatchResponce> doMobilePatchResponce(@Query("uuid") String uuid);

    //Auth
    @POST("/user")
    Call<RegisterResponce> doRegResponce (@Header("email") String email, @Header("name") String name, @Header("password") String password, @Header("uuid") String uuid);
    @OPTIONS("/user")
    Call<LoginResponce> doLogResponce (@Header("email") String email, @Header("password") String password, @Header("uuid") String uuid);

    //Rooms
    @POST("/rooms")
    Call<RoomsPostResponce> doRoomsPostResponce (@Header("name") String name, @Header("type") String type, @Header("token") String token, @Header("uuid") String uuid);
    @GET("/rooms")
    Call<RoomsGetResponce> doRoomsGetResponce (@Header("token") String token, @Header("uuid") String uuid);
    @PATCH("/rooms/{id}")
    Call<RoomsPatchResponce> doRoomsPatchResponce (@Header("id") String id, @Header("name") String name,@Header("type") String type,@Header("token") String token,@Header("uuid") String uuid);
    @DELETE("/rooms/{id}")
    Call<RoomsDeleteResponce> doRoomsDeleteResponce (@Header("id") String id, @Header("token") String token,@Header("uuid") String uuid);
}
