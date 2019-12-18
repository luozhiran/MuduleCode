package com.itg.test_module.retrofitApi;

import com.itg.test_module.retrofitData.Contributor;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface GitHub {
    @GET("index.html")
    Call<String> listRepos();
}
