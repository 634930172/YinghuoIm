package com.goodsure.yinghuoim.moduel.main.model;

/**
 * Author: John
 * E-mail：634930172@qq.com
 * Date: 2018/3/2 10:01
 * Description:
 */

public interface MainModel {

    void getData( LoadingCallBack callBack);

    interface LoadingCallBack{
        void LoadingCompleted(String data);
    }


}
