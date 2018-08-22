package com.hualing.mvptest.internet.presenter;

/**
 * 时间: 2018/8/22 15:02
 * 描述：mvp p
 *
 * @author Alex Kate
 */
public interface IDuckPresenter {
    /**
     * 子类实现 开始逻辑操作
     */
    void start();

    /**
     * 从model里获取数据的回调
     * @param data
     */
    void onModelFinish(String data);
}
