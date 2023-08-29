package com.qubitdevs.medilife_healthmedicine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Slider03Activity extends AppCompatActivity {


    Button nextBtn;
    TextView backBtn, skipBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider03_activity);

        nextBtn = findViewById(R.id.nextBtn);
        backBtn = findViewById(R.id.backBtn);
        skipBtn = findViewById(R.id.skipBtn);




        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Slider03Activity.this, Slider02Activity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right);

            }
        });


        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ActivityUtils.skippable(Slider03Activity.this);

                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });


        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ActivityUtils.skippable(Slider03Activity.this);

                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);


            }
        });




    }
}