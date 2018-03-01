package com.goodsure.yinghuoim;

import android.app.Application;
import android.content.Context;

import com.goodsure.john.utils.AppUitls;
import com.goodsure.john.utils.ContextHolder;
import com.goodsure.john.utils.sp.SharedInfo;
import com.goodsure.yinghuoim.utils.AppConfig;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Author: John
 * E-mail：634930172@qq.com
 * Date: 2018/3/1 15:43
 * Description:MyApplication启动初始化
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppUitls.syncIsDebug(this);
        ContextHolder.init(this);
        SharedInfo.init(AppConfig.SP_NAME);
        refWatcher = LeakCanary.install(this);//LeakCanary初始化
    }


    //LeakCanary
    public static RefWatcher getRefWatcher(Context context) {
        MyApplication application = (MyApplication) context.getApplicationContext();
        return application.refWatcher;
    }
    private RefWatcher refWatcher;
}
