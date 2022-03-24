package com.example.lifecycle2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends LogableActivity {

    public static final String KEY = "key";

    private MyApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app = (MyApplication) getApplication();
//        Toast.makeText(this, app.getChain(), Toast.LENGTH_LONG).show();
    }

    public void onClickButton(View view) {
//        app.setChain("Mai") ;
//        Log.d("chain", app.getChain());

        // Create an intent, i.e. a signal
        Intent intent = new Intent(this, SecondActivity.class);

        // init message
        intent.putExtra(KEY, "Hello Thang");

        startActivity(intent);
    }

}