package com.dhims.mvp.contract;

/**
 * Created by dhimant on 14/4/18.
 */
public interface MainActivityContract {

    interface View {
        void initView();
        void setViewData(String data);
    }

    interface Model {
        String getData();
    }

    interface Presenter {
        void onClick(android.view.View view);
    }

}