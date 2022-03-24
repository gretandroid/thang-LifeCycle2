package com.example.lifecycle2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.lifecycle.ViewModelProvider;

public class MainActivity extends LogableActivity {

    public static final String KEY = "key";

    private MyApplication app;
    private DataModel model;
    private TextView nameTextView, firstNameTextView, ageTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nameTextView = findViewById(R.id.nameTextView);
        firstNameTextView = findViewById(R.id.firstNameTextView);
        ageTextView = findViewById(R.id.ageTextView);

        app = (MyApplication) getApplication();
        app.setConnection("Connection MyApplication");
//        Toast.makeText(this, app.getChain(), Toast.LENGTH_LONG).show();

        // object model is managed by ViewModelProvider for the persistence
        // NOTE : avoid instantiate directly by new DataModel() to ensure model
        // is not destroyed with activity
        model = new ViewModelProvider(this).get(DataModel.class);
//        String name = model.getName();
//        if (name != null) {
//            Toast.makeText(this, name, Toast.LENGTH_LONG).show();
//        }

//        show();

        // On met en place des observers qui vont observer les modifs sur
        // les MutableLiveData, qui indique comment MAJ les TextView
        model.getName().observe(this, value -> nameTextView.setText(value));
        model.getFirstName().observe(this, value -> firstNameTextView.setText(value));
        model.getAge().observe(this, value -> ageTextView.setText(String.valueOf(value)));
    }

    public void onClickButton(View view) {
//        app.setChain("Mai") ;
//        Log.d("chain", app.getChain());

        // Create an intent, i.e. a signal
//        Intent intent = new Intent(this, SecondActivity.class);

        // init message
//        intent.putExtra(KEY, "Hello Thang");

//        startActivity(intent);

        // ViewModel
        model.process();
//        show();

    }

    public void show() {

//        nameTextView.setText(model.getName().getValue());
//        firstNameTextView.setText(model.getFirstName().getValue());
//        ageTextView.setText(String.valueOf(model.getAge().getValue()));
    }

}