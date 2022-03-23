package com.example.lifecycle2;

import android.app.Application;

public class MyApplication extends Application {

    private String chain = "Thang";


    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }
}
