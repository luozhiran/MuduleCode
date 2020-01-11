package com.itg.test_module;

import android.util.Log;

import com.itg.common.base.BaseActivity;
import com.itg.test_module.databinding.TestActivityMainBinding;
import com.itg.test_module.retrofitApi.BaiduApi;

import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class MainActivity extends BaseActivity<TestActivityMainBinding> {

    @Override
    public int getLayoutId() {
        return R.layout.test_activity_main;
    }

    @Override
    public void init() {
        mViewId.request.setOnClickListener(v -> {

//            Retrofit retrofit = createRetrofit();
//
//            BaiduApi baiduApi = retrofit.create(BaiduApi.class);
//            Call<String> call = baiduApi.BaiduString();
//
//            call.enqueue(new Callback<String>() {
//                @Override
//                public void onResponse(Call<String> call, Response<String> response) {
//                    Log.e("retrofit", response.body());
//                }
//
//                @Override
//                public void onFailure(Call<String> call, Throwable t) {
//                    Log.e("retrofit",t.getMessage());
//                }
//            });

            OkHttpClient.Builder builder = new OkHttpClient.Builder();

        });
    }

    public Retrofit createRetrofit() {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("http://www.baidu.com/");
        builder.addConverterFactory(ScalarsConverterFactory.create());
        builder.addConverterFactory(GsonConverterFactory.create());
        return builder.build();
    }


}
