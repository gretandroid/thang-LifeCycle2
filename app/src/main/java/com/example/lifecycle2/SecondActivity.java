package com.example.lifecycle2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends LogableActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        String chain = intent.getStringExtra(MainActivity.KEY);
        Toast.makeText(this, chain, Toast.LENGTH_LONG).show();
    }

}