package com.hualing.mvptest.internet.model;

import android.util.Log;
import com.hualing.mvptest.internet.presenter.IDuckPresenter;
import com.lzy.okgo.OkGo;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.Response;

/**
 * 时间: 2018/8/22 15:10
 * 描述：
 *
 * @author Alex Kate
 */
public class InternetModel implements IDuckModel {
    private IDuckPresenter presenter;

    public InternetModel(IDuckPresenter presenter) {
        this.presenter = presenter;
    }

    @Override public void getData() {

        //获取数据并回调
        OkGo.<String>get("http://www.baidu.com").execute(new StringCallback() {
            @Override public void onSuccess(Response<String> response) {
                Log.i("DuckLing", "数据："+response.body());
                presenter.onModelFinish(response.body());
            }
        });

    }
}
