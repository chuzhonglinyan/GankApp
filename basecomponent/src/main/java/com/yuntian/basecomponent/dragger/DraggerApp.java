package com.yuntian.basecomponent.dragger;

import com.yuntian.baselibs.base.BaseApp;

/**
 * description  .
 * Created by ChuYingYan on 2018/4/29.
 */
public class DraggerApp extends BaseApp {

    private AppComponent appComponent;


    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder() //DaggerAppComponent具体实现类
                      .appModule(new AppModule(this))
                      .build();
    }

    public AppComponent component() {
        return appComponent;
    }


}
