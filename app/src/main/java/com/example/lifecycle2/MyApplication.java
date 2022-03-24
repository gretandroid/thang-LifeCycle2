package com.example.lifecycle2;

import android.app.Application;

public class MyApplication extends Application {

    private String chain = "Thang";
    private String connection;


    public String getChain() {
        return chain;
    }

    public void setChain(String chain) {
        this.chain = chain;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }
}
