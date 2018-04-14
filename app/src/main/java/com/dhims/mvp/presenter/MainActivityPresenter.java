package com.dhims.mvp.presenter;

import com.dhims.mvp.contract.MainActivityContract;
import com.dhims.mvp.model.MainActivityModel;
import com.dhims.mvp.view.MainActivity;

/**
 * Created by dhimant on 14/4/18.
 */
public class MainActivityPresenter implements MainActivityContract.Presenter {

    private MainActivity mView;
    private MainActivityContract.Model mModel;

    public MainActivityPresenter(MainActivity view) {
        mView = view;
        initPresenter();
    }

    private void initPresenter() {
        mModel = new MainActivityModel();
        mView.initView();
    }

    @Override
    public void onClick(android.view.View view) {
        String data = mModel.getData();
        mView.setViewData(data);
    }

}
