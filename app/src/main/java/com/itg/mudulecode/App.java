package com.itg.mudulecode;

import android.app.DownloadManager;
import android.content.Context;

import com.alibaba.android.arouter.launcher.ARouter;
import com.itg.common.base.BaseApplication;

import org.acra.ACRA;
import org.acra.config.CoreConfigurationBuilder;
import org.acra.config.HttpSenderConfigurationBuilder;
import org.acra.config.LimiterConfigurationBuilder;
import org.acra.config.SchedulerConfigurationBuilder;
import org.acra.data.StringFormat;
import org.acra.sender.HttpSender;

import androidx.multidex.MultiDex;


public class App extends BaseApplication {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // dex突破65535的限制
        MultiDex.install(this);
        log();
    }

    private void log() {
        CoreConfigurationBuilder builder = new CoreConfigurationBuilder(this)
                .setBuildConfigClass(BuildConfig.class)
                .setReportFormat(StringFormat.JSON);
        builder.getPluginConfigurationBuilder(HttpSenderConfigurationBuilder.class)
                .setUri("https://yourdomain.com/acra/report")
                .setHttpMethod(HttpSender.Method.POST)
                .setBasicAuthLogin("")
                .setBasicAuthPassword("")
                .setEnabled(true);
        builder.getPluginConfigurationBuilder(SchedulerConfigurationBuilder.class)
//                .setRequiresNetworkType(JobRequest.NetworkType.UNMETERED)
                .setRequiresBatteryNotLow(true)
                .setEnabled(true);
        builder.getPluginConfigurationBuilder(LimiterConfigurationBuilder.class)
                .setEnabled(true);
        ACRA.init(this);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        if (BuildConfig.LOG_DEBUG) {           // 这两行必须写在init之前，否则这些配置在init过程中将无效
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        ARouter.init(this); // 尽可能早，推荐在Application中初始化
    }
}
