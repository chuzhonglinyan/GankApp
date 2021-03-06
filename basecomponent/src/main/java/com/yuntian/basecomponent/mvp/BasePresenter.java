package com.yuntian.basecomponent.mvp;

import javax.inject.Inject;

/**
 * description P层.
 * Created by ChuYingYan on 2018/4/30.
 */
public abstract class BasePresenter<M extends BaseModel, V extends BaseView> implements IBasePresenter {

    protected final String TAG = this.getClass().getSimpleName();

    @Inject
    protected M mModel;
    @Inject
    protected V mView;


    public BasePresenter() {

    }


    @Override
    public void onCreate() {
    }

    @Override
    public void onStart() {

    }


    @Override
    public void onResume() {

    }


    @Override
    public void onPause() {

    }


    @Override
    public void onStop() {

    }

    @Override
    public void onDestroy() {

    }
}
