package com.goodsure.yinghuoim.moduel.main;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.goodsure.john.base.BaseAct;
import com.goodsure.john.utils.L;
import com.goodsure.yinghuoim.R;
import com.goodsure.yinghuoim.moduel.main.presenter.MainPresenter;
import com.goodsure.yinghuoim.moduel.main.view.MainView;

import butterknife.BindView;
import butterknife.OnClick;


/**
 * Author: John
 * E-mail：634930172@qq.com
 * Date: 2018/3/2 9:55
 * Description:主页面
 */

public class MainAct extends BaseAct<MainView, MainPresenter> implements MainView {


    @BindView(R.id.bt)
    Button bt;
    @BindView(R.id.bt2)
    Button bt2;

    @Override
    protected int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    protected MainPresenter createPresenter() {
        return new MainPresenter();
    }


    @Override
    public void DataCallBack(String str) {
        L.e("数据是>>>>>" + str);
    }


    @OnClick({R.id.bt, R.id.bt2})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt:
                mPresenter.fech();
                break;
            case R.id.bt2:
                break;
        }
    }
}
