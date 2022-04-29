package com.freegetapps.fantacy.guideforlulubox7777;

import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;


import com.freegetapps.fantacy.guideforlulubox7777.Ads.Ad_Constant;

public class qurekaFullScreen extends AppCompatActivity {

    private ImageButton btn_close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qureka_full_screen);

        btn_close=findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @SuppressLint("ResourceType")
    public void mglFull(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.parseColor(getString(R.color.colorPrimary))).setShowTitle(true);
        CustomTabsIntent build = builder.build();
        build.intent.setPackage("com.android.chrome");
        build.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        build.launchUrl(getApplicationContext(), Uri.parse(Ad_Constant.qureka_url));
    }
}