package com.hualing.mvptest.internet.presenter;

import com.hualing.mvptest.internet.model.IDuckModel;
import com.hualing.mvptest.internet.model.InternetModel;
import com.hualing.mvptest.internet.view.IDuckView;

/**
 * 时间: 2018/8/22 15:05
 * 描述：mvp p的实现
 *
 * @author Alex Kate
 */
public class InternetPresenter implements IDuckPresenter {

    private IDuckView mView;
    private IDuckModel model;

    public InternetPresenter(IDuckView mView) {
        this.mView = mView;
        model = new InternetModel(this);
    }

    @Override public void start() {
        model.getData();
    }

    @Override public void onModelFinish(String data) {
        String[] split = data.split("</title></head>", 2);
        String[] split1 = split[0].split("<title>",2);
        String okData = split1[1];

        mView.showData(okData);
    }
}
