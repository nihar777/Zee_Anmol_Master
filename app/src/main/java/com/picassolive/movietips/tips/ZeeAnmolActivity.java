package com.picassolive.movietips.tips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ZeeAnmolActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zee_anmol);



        Button btn_withoutads=findViewById(R.id.withoutAds);
        Button btn_How_Much=findViewById(R.id.how_much);
        Button btn_Why_is=findViewById(R.id.why_is);
        Button btn_How_Do=findViewById(R.id.how_do);
        Button btn_is_ZeeAnmol=findViewById(R.id.is_ZeeAnmol);
        Button btn_anyGood=findViewById(R.id.any_good);

        btn_withoutads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ZeeAnmolActivity.this, howCanActivity.class);
                startActivity(intent);
            }
        });

        btn_How_Much.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZeeAnmolActivity.this, HowMuchActivity.class);
                startActivity(intent);

            }
        });


        btn_Why_is.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZeeAnmolActivity.this, WhyIsActivity.class);
                startActivity(intent);

            }
        });

        btn_How_Do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ZeeAnmolActivity.this, howDoActivity.class);
                startActivity(intent);
            }
        });

        btn_is_ZeeAnmol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ZeeAnmolActivity.this, isZeeAnmolActivity.class);
                startActivity(intent);

            }
        });

        btn_anyGood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(ZeeAnmolActivity.this, anyGoodActivity.class);
                startActivity(intent);
            }
        });

    }
}