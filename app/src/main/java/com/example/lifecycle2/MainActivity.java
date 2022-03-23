package com.example.lifecycle2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private MyApplication app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        app = (MyApplication) getApplication();
        Toast.makeText(this, app.getChain(), Toast.LENGTH_LONG).show();
    }

    public void onClickButton(View view) {
        app.setChain("Mai") ;
        Log.d("chain", app.getChain());
    }
}