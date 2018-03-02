package com.goodsure.yinghuoim.common;

import com.goodsure.john.network.entity.HttpResult;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Author: John
 * E-mail：634930172@qq.com
 * Date: 2018/3/2 10:11
 * Description:请求接口类
 */

public interface AppService {

    @GET("https://www.mrallen.cn/test.php")
    Observable<HttpResult<String>> simpleGet();

}
