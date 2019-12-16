package com.itg.common.base;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.itg.common.BuildConfig;
import com.itg.common.R;
import com.itg.common.utils.StatusBarUtil;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

public abstract class BaseActivity<T extends ViewDataBinding> extends AppCompatActivity {

    private T mViewId;
    /**
     * @hide
     */
    @Override
     protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (BuildConfig.isDataBinding) {
            mViewId = DataBindingUtil.setContentView(this, getLayoutId());
        } else {
            setContentView(getLayoutId());
        }
        statusColor();
    }

    public void statusColor(){
        StatusBarUtil.setStatusBarColor(this, getResources().getColor(R.color.colorPrimary));
    }


    public abstract int getLayoutId();

}
