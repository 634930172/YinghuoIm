package com.goodsure.yinghuoim.moduel.main.model;

import com.goodsure.john.base.BaseModule;
import com.goodsure.john.network.client.HttpClient;
import com.goodsure.john.network.callback.RxRequestCallBack;
import com.goodsure.john.network.entity.HttpResult;
import com.goodsure.yinghuoim.common.AppService;

/**
 * Author: John
 * E-mail：634930172@qq.com
 * Date: 2018/3/2 9:54
 * Description:逻辑请求示例
 */

public class MainModelImp extends BaseModule implements MainModel {


    @Override
    public void getData(final LoadingCallBack callBack) {
        addSubscribe(HttpClient.getService(AppService.class).simpleGet(), new RxRequestCallBack<String>() {
            @Override
            public void onSuccess(HttpResult<String> httpResult) {
                callBack.LoadingCompleted(httpResult.getData());
            }
        });
    }
}
