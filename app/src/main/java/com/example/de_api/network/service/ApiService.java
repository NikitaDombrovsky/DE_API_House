package com.example.de_api.network.service;

import com.example.de_api.network.Auth.LoginData.LoginResponce;
import com.example.de_api.network.Auth.RegisterData.RegisterResponce;
import com.example.de_api.network.Device.DeviceGetData.DeviceGetResponce;
import com.example.de_api.network.Device.DevicePatchLEDData.DevicePathchLEDResponce;
import com.example.de_api.network.Device.DevicePatchThermData.DevicePathchThermResponce;
import com.example.de_api.network.Device.DevicePostData.DevicePostResponce;
import com.example.de_api.network.Device.Devices_GetData.Devices_GetResponce;
import com.example.de_api.network.Mobile.MobileGet.MobileGetResponce;
import com.example.de_api.network.Mobile.MobilePatch.MobilePatchResponce;
import com.example.de_api.network.Mobile.MobilePost.MobilePostBody;
import com.example.de_api.network.Mobile.MobilePost.MobilePostResponce;
import com.example.de_api.network.Profile.ProfilePostAvatarData.ProfilePostResponce;
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
import retrofit2.http.Headers;
import retrofit2.http.OPTIONS;
import retrofit2.http.PATCH;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {
    // APP
    @POST("/app")
    Call<RegisterMainResponce> doResponce(@Body RegisterMainBody registerMainBody);
    @GET("/app")
    Call<List<RegisterMainGetResponce>> doResponceGet(@Query("competitor") String competitor);

    // Mobile
    @POST("/mobile")
    Call<MobilePostResponce> doMobilePostResponce(@Body MobilePostBody mobilePostBody);
    @GET("/mobile")
    Call<List<MobileGetResponce>> doMobileGetResponce(@Query("appId") String appId);
    @PATCH("/mobile")
    Call<MobilePatchResponce> doMobilePatchResponce(@Query("uuid") String uuid);

    //Auth
    @POST("/user")
    Call<RegisterResponce> doRegResponce(@Header("email") String email, @Header("name") String name, @Header("password") String password, @Header("uuid") String uuid, @Header("hash") String hash);
    @OPTIONS("/user")
    Call<LoginResponce> doLogResponce(@Header("email") String email, @Header("password") String password, @Header("uuid") String uuid, @Header("hash") String hash);
    @DELETE("/user")
    Call<Void> doDeleteResponce(@Header("token") String token);

    //Profile
    @POST("/profile")
    Call<Void> doProfilePostResponce(@Header("token") String token, @Header("email") String email, @Header("name") String name, @Header("username") String username, @Header("dateOf") String dateOf, @Header("phone") String phone, @Header("uuid") String uuid);
    @GET("/profile")
    Call<ProfilePostResponce> doProfileGetResponce(@Query("token") String token, @Query("uuid") String uuid);
    //Rooms
    @POST("/rooms")
    Call<RoomsPostResponce> doRoomsPostResponce(@Header("name") String name, @Header("type") String type, @Header("token") String token, @Header("uuid") String uuid, @Header("hash") String hash);
    @GET("/rooms")
    Call<RoomsGetResponce> doRoomsGetResponce(@Header("token") String token, @Header("uuid") String uuid, @Header("hash") String hash);
    @PATCH("/rooms/{id}")
    Call<RoomsPatchResponce> doRoomsPatchResponce(@Path("id") String id, @Header("name") String name, @Header("type") String type, @Header("token") String token, @Header("uuid") String uuid, @Header("hash") String hash);
    @DELETE("/rooms/{id}")
    Call<RoomsDeleteResponce> doRoomsDeleteResponce(@Path("id") String id, @Header("token") String token, @Header("uuid") String uuid, @Header("hash") String hash);

    //Device
    @POST("/devices")
    Call<DevicePostResponce> doDevicePostResponce(@Header("type") String type, @Header("room") String room, @Header("token") String token, @Header("uuid") String uuid, @Header("hash") String hash);
    @GET("/devices")
    Call<DeviceGetResponce> doDeviceGetResponce(@Header("room") String room, @Header("token") String token, @Header("uuid") String uuid, @Header("hash") String hash);
    @PATCH("/devices/LED")
    Call<DevicePathchLEDResponce> doDevicePathchLEDResponce(@Header("name") String name, @Header("light_lm") String light_lm, @Header("off") String off, @Header("id") String id, @Header("token") String token, @Header("uuid") String uuid, @Header("hash") String hash);
    @PATCH("/devices/Thermostat")
    Call<DevicePathchThermResponce> doDevicePathchThermResponce(@Path("name") String name, @Header("speed_fan") String speed_fan, @Header("off") String off, @Header("temperature") String temperature, @Header("id") String id, @Header("token") String token, @Header("uuid") String uuid, @Header("hash") String hash);
    @GET("/devices/{id}")
    Call<Devices_GetResponce> doDevices_GetResponce(@Path("id") String id, @Header("token") String token, @Header("uuid") String uuid, @Header("hash") String hash);

}
