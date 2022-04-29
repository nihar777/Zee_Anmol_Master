package com.freegetapps.fantacy.guideforlulubox7777;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class anyGoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_any_good);


        Intent Intent =new Intent(getApplicationContext(),qurekaFullScreen.class);
        startActivity(Intent);
    }
}