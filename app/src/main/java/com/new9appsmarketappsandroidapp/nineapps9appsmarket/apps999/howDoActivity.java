package com.new9appsmarketappsandroidapp.nineapps9appsmarket.apps999;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class howDoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_how_do);

        Intent Intent =new Intent(getApplicationContext(),qurekaFullScreen.class);
        startActivity(Intent);
    }
}