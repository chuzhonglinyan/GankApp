package com.yuntian.basecomponent.mvvm;

import android.databinding.ViewDataBinding;

import com.yuntian.basecomponent.databinding.BaseDataBindingActivity;
import com.yuntian.basecomponent.dragger.DraggerApp;
import com.yuntian.basecomponent.dragger.AppComponent;
import com.yuntian.basecomponent.mvp.BaseViewMode;

import javax.inject.Inject;

/**
 * description  .
 * Created by ChuYingYan on 2018/4/30.
 */
public abstract class BaseMvvMActivity<VM extends BaseViewMode,B extends ViewDataBinding> extends BaseDataBindingActivity<B> {

    @Inject
    protected VM  mViewMode;


    @Override
    protected void init() {
        super.init();
        setupActivityComponent(getApplicationComponent());
        if (mViewMode != null) {
            mViewMode.onAttach();
        }
    }

    protected AppComponent getApplicationComponent() {
        return ((DraggerApp) getApplication()).component();
    }

    /**
     * 依赖注入的入口
     */
    protected abstract void setupActivityComponent(AppComponent appComponent);

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mViewMode != null) mViewMode.onDetach();
    }


}
