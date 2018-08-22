package com.hualing.mvptest.internet.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.hualing.mvptest.R;
import com.hualing.mvptest.internet.presenter.InternetPresenter;

public class MainActivity extends AppCompatActivity implements IDuckView {

    private TextView tv;
    private Button bt;
    private InternetPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = findViewById(R.id.tv);
        bt = findViewById(R.id.bt);
        init();
        bt.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {

                mPresenter.start();
            }
        });
    }
    private void init() {
        mPresenter = new InternetPresenter(this);
    }
    @Override public void showData(String data) {
        tv.setText(data);
    }
}
