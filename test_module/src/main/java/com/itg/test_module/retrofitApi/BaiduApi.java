package com.itg.test_module.retrofitApi;

import retrofit2.Call;
import retrofit2.http.GET;

public interface BaiduApi {
    @GET("index.html")
    Call<String> BaiduString();
}
