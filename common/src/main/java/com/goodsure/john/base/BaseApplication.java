package com.goodsure.john.base;

import android.app.Application;
import android.content.Context;

import com.goodsure.john.utils.AppUtil;
import com.goodsure.john.utils.ContextHolder;
import com.goodsure.john.utils.sp.SharedInfo;
import com.goodsure.john.utils.BaseConfig;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

/**
 * Author: John
 * E-mail：634930172@qq.com
 * Date: 2018/3/1 15:43
 * Description:MyApplication启动初始化
 */

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppUtil.syncIsDebug(this);
        ContextHolder.init(this);
        SharedInfo.init(BaseConfig.SP_NAME);
        refWatcher = LeakCanary.install(this);//LeakCanary初始化
    }


    //LeakCanary
    public static RefWatcher getRefWatcher(Context context) {
        BaseApplication application = (BaseApplication) context.getApplicationContext();
        return application.refWatcher;
    }
    private RefWatcher refWatcher;
}
