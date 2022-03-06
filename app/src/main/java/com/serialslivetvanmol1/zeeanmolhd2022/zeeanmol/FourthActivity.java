package com.serialslivetvanmol1.zeeanmolhd2022.zeeanmol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.serialslivetvanmol1.zeeanmolhd2022.zeeanmol.Ads.AdmobAdsTemplete;

public class FourthActivity extends AppCompatActivity {

    public static ZeeAnmolProgressView dialogView;
    private static int loader_color = Color.parseColor("#D81B60");
    private ImageView imgBack;
    private LinearLayout HowCan;
    private LinearLayout HowMuch;
    private LinearLayout why_is;
    private LinearLayout how_do;
    private LinearLayout is_ZeeAnmol;
    private LinearLayout WhatIs;
    private LinearLayout WhichIs;
    private LinearLayout iSZee5Anygood;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);




        LinearLayout linearLayout = findViewById(R.id.banner_ad);
        AdmobAdsTemplete.loadBanner(this, linearLayout);

        FrameLayout frameLayout = findViewById(R.id.native_add);
        AdmobAdsTemplete.loadNativeAds(this, frameLayout);
//        AxieGuide_NativeUtil.Mopub_NativAds(this, (FrameLayout) findViewById(R.id.fl_adplaceholder));
//        AxieGuide_NativeUtil.Mopub_NativAds(this, (FrameLayout) findViewById(R.id.fl_adplaceholder1));
        dialogView = new ZeeAnmolProgressView(this, loader_color);
        ImageView imageView = (ImageView) findViewById(R.id.imgBack);
        this.imgBack = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                FourthActivity.this.onBackPressed();
            }
        });
        this.HowCan = (LinearLayout) findViewById(R.id.HowCan);
        this.HowMuch = (LinearLayout) findViewById(R.id.how_much);
        this.why_is = (LinearLayout) findViewById(R.id.why_is);
        this.how_do = (LinearLayout) findViewById(R.id.how_do);
        this.is_ZeeAnmol = (LinearLayout) findViewById(R.id.is_ZeeAnmol);
        this.iSZee5Anygood = (LinearLayout) findViewById(R.id.iSZee5Anygood);
        this.WhatIs = (LinearLayout) findViewById(R.id.WhatIs);
        this.WhichIs = (LinearLayout) findViewById(R.id.WhichIs);
        this.HowCan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 1;
//                AxieGuideLinesActivity.this.startActivity(new Intent(AxieGuideLinesActivity.this,AxieGuide_ScriptionActivity.class));

                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);
            }
        });
        this.HowMuch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 2;
//                AxieGuideLinesActivity.this.startActivity(new Intent(AxieGuideLinesActivity.this,AxieGuide_ScriptionActivity.class));

                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);
            }
        });
        this.why_is.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 3;
//                AxieGuideLinesActivity.this.startActivity(new Intent(AxieGuideLinesActivity.this, AxieGuide_ScriptionActivity.class));

                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);
            }
        });
        this.how_do.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 4;
//                AxieGuideLinesActivity.this.startActivity(new Intent(AxieGuideLinesActivity.this, AxieGuide_ScriptionActivity.class));

                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);

            }
        });
        this.is_ZeeAnmol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 5;
//                AxieGuideLinesActivity.this.startActivity(new Intent(AxieGuideLinesActivity.this,AxieGuide_ScriptionActivity.class));

                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);

            }
        });
        this.iSZee5Anygood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 6;
//                AxieGuideLinesActivity.this.startActivity(new Intent(AxieGuideLinesActivity.this, AxieGuide_ScriptionActivity.class));

                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);

            }
        });
        this.WhatIs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 7;
//                AxieGuideLinesActivity.this.startActivity(new Intent(AxieGuideLinesActivity.this,AxieGuide_ScriptionActivity.class));

                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);

            }
        });
        this.WhichIs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 8;
//                AxieGuideLinesActivity.this.startActivity(new Intent(AxieGuideLinesActivity.this,AxieGuide_ScriptionActivity.class));

                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);

            }
        });

    }
}