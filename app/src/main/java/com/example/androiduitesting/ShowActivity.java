package com.example.androiduitesting;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ShowActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show_activity);

        Button backButton = findViewById(R.id.back_button);
        String selectedCity = getIntent().getStringExtra("selectedCity");
        TextView showCity = findViewById(R.id.show_city);
        showCity.setText(selectedCity);


        backButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finish();
            }
        });
    }
}
