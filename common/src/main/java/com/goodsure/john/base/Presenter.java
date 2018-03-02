package com.goodsure.john.base;

public interface Presenter<V> {

    void attachView(V view);

    void detachView();

}
