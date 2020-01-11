package com.itg.mudulecode;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Person;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.itg.annotionlib.SPI;
import com.itg.common.base.BaseActivity;
import com.itg.module_main.SplashActivity;
import com.itg.mudulecode.databinding.ActivityMainBinding;
import com.itg.mudulecode.test.Persion;

public class MainActivity extends BaseActivity<ActivityMainBinding> {

    @Override
    public void init() {

        mViewId.btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressAnnotation();
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }


    private void progressAnnotation() {
        Class<Persion> clzss = Persion.class;
        if (clzss.isAnnotationPresent(SPI.class)) {
            Log.e("MainActivity", "Persion你是用了SPI Annotation");
        }
    }
}
