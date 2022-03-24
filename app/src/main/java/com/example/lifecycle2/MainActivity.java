package com.example.lifecycle2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends LogableActivity {

    public static final String KEY = "key";

    private MyApplication app;
    private DataModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        app = (MyApplication) getApplication();
        app.setConnection("Connection MyApplication");
//        Toast.makeText(this, app.getChain(), Toast.LENGTH_LONG).show();

        // object model is managed by ViewModelProvider for the persistence
        // NOTE : avoid instantiate directly by new DataModel() to ensure model
        // is not destroyed with activity
        model = new ViewModelProvider(this).get(DataModel.class);
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