package com.goodsure.yinghuoim.base;

public interface Presenter<V> {

    void attachView(V view);

    void detachView();

}
