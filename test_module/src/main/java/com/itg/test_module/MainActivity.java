package com.itg.test_module;

import com.itg.common.base.BaseActivity;
import com.itg.common.utils.StatusBarUtil;
import com.itg.test_module.databinding.TestActivityMainBinding;

public class MainActivity extends BaseActivity<TestActivityMainBinding> {

    @Override
    public int getLayoutId() {
        return R.layout.test_activity_main;
    }

    @Override
    public void statusColor() {
        StatusBarUtil.setStatusBarTransparent(this,getResources().getColor(R.color.white),1);
    }
}
