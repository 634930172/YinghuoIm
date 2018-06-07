package com.goodsure.yinghuoim.moduel.main.presenter;


import com.goodsure.john.base.BasePresenter;
import com.goodsure.yinghuoim.moduel.main.model.MainModel;
import com.goodsure.yinghuoim.moduel.main.model.MainModelImp;
import com.goodsure.yinghuoim.moduel.main.view.MainView;

/**
 * Author: John
 * E-mail：634930172@qq.com
 * Date: 2018/3/2 9:57
 * Description:
 */

public class MainPresenter extends BasePresenter<MainView> {

    private MainModel mMainModelImp;

    public MainPresenter(){
        mMainModelImp=new MainModelImp();
    }


    public void fech(){
        mMainModelImp.getData(new MainModel.LoadingCallBack() {
            @Override
            public void LoadingCompleted(String data) {
                mMvpView.get().DataCallBack(data);
            }
        });
    }



}
