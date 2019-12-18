package com.itg.test_module;

import android.view.View;

import com.itg.common.base.BaseActivity;
import com.itg.common.utils.StatusBarUtil;
import com.itg.test_module.databinding.TestActivityMainBinding;
import com.itg.test_module.retrofitApi.GitHub;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends BaseActivity<TestActivityMainBinding> {
    public static final String API_URL = "https://api.github.com";

    @Override
    public int getLayoutId() {
        return R.layout.test_activity_main;
    }


    @Override
    public void init() {
        mViewId.request.setOnClickListener(v -> {
            Retrofit retrofit = createRetrofit();
           String string = retrofit.create(String.class);


        });
    }

    public Retrofit createRetrofit() {
        Retrofit.Builder builder = new Retrofit.Builder();
        builder.baseUrl("http://www.baidu.com/");
        builder.addConverterFactory(GsonConverterFactory.create());
        return builder.build();
    }

    @Override
    public void statusColor() {
        StatusBarUtil.setStatusBarTransparent(this, getResources().getColor(R.color.white), 1);
    }
}
