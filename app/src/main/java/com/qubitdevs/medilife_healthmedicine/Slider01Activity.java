package com.qubitdevs.medilife_healthmedicine;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.ContextParams;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Slider01Activity extends AppCompatActivity {

    Button nextBtn, backBtn;
    TextView skipBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slider01_activity);

        nextBtn = findViewById(R.id.nextBtn);
        backBtn = findViewById(R.id.backBtn);
        skipBtn = findViewById(R.id.skipBtn);



        nextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Slider01Activity.this, Slider02Activity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });

        skipBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ActivityUtils.skippable(Slider01Activity.this);

                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

            }
        });


    }
    //==============================================






}