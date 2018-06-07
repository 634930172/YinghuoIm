package com.goodsure.yinghuoim.moduel.main;

import android.view.View;
import android.widget.Button;

import com.goodsure.john.base.BaseAct;
import com.goodsure.john.base.BaseWebAct;
import com.goodsure.john.utils.BaseConfig;
import com.goodsure.john.utils.JumpUtil;
import com.goodsure.john.utils.LogUtil;
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
    @BindView(R.id.bt3)
    Button bt3;

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
        LogUtil.e("数据是>>>>>" + str);
        //设置忽略提交文件 配置项目姓名和邮箱
    }


    @OnClick({R.id.bt, R.id.bt2, R.id.bt3})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt:
                //MVP获取数据
                mPresenter.fech();
                break;
            case R.id.bt2:
                //动态加载本地html
                StringBuilder sb = new StringBuilder();
                sb.append("<html>");
                sb.append("<head>");
                sb.append("<title> 动态加载获取的格式 </title>");
                sb.append("</head>");
                sb.append("<body>");
                sb.append(BaseConfig.WEB_DATA);
                sb.append("</body>");
                sb.append("</html>");
                LogUtil.d(sb.toString());
                JumpUtil.lunch(this, BaseWebAct.class, sb.toString());
                break;

            case R.id.bt3:
                JumpUtil.lunch(this, BaseWebAct.class);
                break;
        }
    }
}
