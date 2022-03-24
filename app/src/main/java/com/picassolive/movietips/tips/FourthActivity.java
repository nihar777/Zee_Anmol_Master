package com.picassolive.movietips.tips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.picassolive.movietips.tips.Ads.Ad_Constant;
import com.picassolive.movietips.tips.Ads.AdmobAdsTemplete;

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
    CardView q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12,q13,q14,q15,q16,q17,q18,q19,q20,q21,q22,q23,q24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);




        LinearLayout linearLayout = findViewById(R.id.banner_ad);
        AdmobAdsTemplete.loadBanner(this, linearLayout);

        FrameLayout frameLayout = findViewById(R.id.native_add);
        AdmobAdsTemplete.loadNativeAds(this, frameLayout);

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
                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);
            }
        });
        this.HowMuch.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 2;
                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);
            }
        });
        this.why_is.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 3;
                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);
            }
        });
        this.how_do.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 4;
                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);

            }
        });
        this.is_ZeeAnmol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 5;
                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);

            }
        });
        this.iSZee5Anygood.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 6;
                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);

            }
        });
        this.WhatIs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 7;
                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);

            }
        });
        this.WhichIs.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 8;
                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(FourthActivity.this,intent);

            }
        });


        q1 = (CardView) findViewById(R.id.q1);
        q2 = (CardView) findViewById(R.id.q2);
        q3 = (CardView) findViewById(R.id.q3);
        q4 = (CardView) findViewById(R.id.q4);
        q5 = (CardView) findViewById(R.id.q5);
        q6 = (CardView) findViewById(R.id.q6);
        q7 = (CardView) findViewById(R.id.q7);
        q8 = (CardView) findViewById(R.id.q8);
        q9 = (CardView) findViewById(R.id.q9);
        q10 = (CardView) findViewById(R.id.q10);
        q11 = (CardView) findViewById(R.id.q11);
        q12 = (CardView) findViewById(R.id.q12);
        q13 = (CardView) findViewById(R.id.q13);
        q14 = (CardView) findViewById(R.id.q14);
        q15 = (CardView) findViewById(R.id.q15);
        q16 = (CardView) findViewById(R.id.q16);
        q17 = (CardView) findViewById(R.id.q17);
        q18 = (CardView) findViewById(R.id.q18);
        q19 = (CardView) findViewById(R.id.q19);
        q20 = (CardView) findViewById(R.id.q20);
        q21 = (CardView) findViewById(R.id.q21);
        q22 = (CardView) findViewById(R.id.q22);
        q23 = (CardView) findViewById(R.id.q23);
        q24 = (CardView) findViewById(R.id.q24);


        if (Ad_Constant.qureka == true) {
            q1.setVisibility(View.VISIBLE);
            q2.setVisibility(View.VISIBLE);
            q3.setVisibility(View.VISIBLE);
            q4.setVisibility(View.VISIBLE);
            q5.setVisibility(View.VISIBLE);
            q6.setVisibility(View.VISIBLE);
            q7.setVisibility(View.VISIBLE);
            q8.setVisibility(View.VISIBLE);
            q9.setVisibility(View.VISIBLE);
            q10.setVisibility(View.VISIBLE);
            q11.setVisibility(View.VISIBLE);
            q12.setVisibility(View.VISIBLE);
            q13.setVisibility(View.VISIBLE);
            q14.setVisibility(View.VISIBLE);
            q15.setVisibility(View.VISIBLE);
            q16.setVisibility(View.VISIBLE);
            q17.setVisibility(View.VISIBLE);
            q18.setVisibility(View.VISIBLE);
            q19.setVisibility(View.VISIBLE);
            q20.setVisibility(View.VISIBLE);
            q21.setVisibility(View.VISIBLE);
            q22.setVisibility(View.VISIBLE);
            q23.setVisibility(View.VISIBLE);
            q24.setVisibility(View.VISIBLE);
        } else {
            q1.setVisibility(View.GONE);
            q2.setVisibility(View.GONE);
            q3.setVisibility(View.GONE);
            q4.setVisibility(View.GONE);
            q5.setVisibility(View.GONE);
            q6.setVisibility(View.GONE);
            q7.setVisibility(View.GONE);
            q8.setVisibility(View.GONE);
            q9.setVisibility(View.GONE);
            q10.setVisibility(View.GONE);
            q11.setVisibility(View.GONE);
            q12.setVisibility(View.GONE);
            q13.setVisibility(View.GONE);
            q14.setVisibility(View.GONE);
            q15.setVisibility(View.GONE);
            q16.setVisibility(View.GONE);
            q17.setVisibility(View.GONE);
            q18.setVisibility(View.GONE);
            q19.setVisibility(View.GONE);
            q20.setVisibility(View.GONE);
            q21.setVisibility(View.GONE);
            q22.setVisibility(View.GONE);
            q23.setVisibility(View.GONE);
            q24.setVisibility(View.GONE);
        }



    }
}