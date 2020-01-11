package com.itg.mudulecode;

import android.view.View;

import com.itg.common.base.BaseActivity;
import com.itg.mudulecode.databinding.ActivityMainBinding;

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

    }
}
