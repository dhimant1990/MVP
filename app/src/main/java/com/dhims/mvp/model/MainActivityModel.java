package com.dhims.mvp.model;

import com.dhims.mvp.contract.MainActivityContract;

/**
 * Created by dhimant on 14/4/18.
 */
public class MainActivityModel implements MainActivityContract.Model {

    @Override
    public String getData() {
        return "Hello World";
    }

}