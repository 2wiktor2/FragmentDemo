package com.wiktor.fragmentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends FragmentActivity implements View.OnClickListener {
Button buttonToNextActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonToNextActivity = findViewById(R.id.button_to_next_activity);

        buttonToNextActivity.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent1 = new Intent(this, SecondActivity.class);
        startActivity(intent1);

    }
}
