package com.serialslivetvanmol.zeeanmolhd2022.zeeanmol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.cardview.widget.CardView;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.serialslivetvanmol.zeeanmolhd2022.zeeanmol.Ads.Ad_Constant;
import com.serialslivetvanmol.zeeanmolhd2022.zeeanmol.Ads.AdmobAdsTemplete;
import com.serialslivetvanmol.zeeanmolhd2022.zeeanmol.databinding.ActivityMainBinding;

public class HomeActivity extends AppCompatActivity{

    public static ZeeAnmolProgressView dialogView;
    private static int loader_color = Color.parseColor("#D81B60");
    private ImageView imgBack;
    private LinearLayout btn_all_live_tv_show;
    private LinearLayout btn_latest_game,Btn_PlaQuiz;
    CardView q1,q2,q3,q4,q5,q6,q7,q8,q9,q10,q11,q12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LinearLayout linearLayout = findViewById(R.id.banner_ad);
        AdmobAdsTemplete.loadBanner(this, linearLayout);

        FrameLayout frameLayout = findViewById(R.id.native_add);
        AdmobAdsTemplete.loadNativeAds(this, frameLayout);

        btn_all_live_tv_show = (LinearLayout) findViewById(R.id.btn_all_live_tv_show);
        imgBack = (ImageView) findViewById(R.id.imgBack);
        Btn_PlaQuiz = (LinearLayout) findViewById(R.id.btn_play_quiz);
        btn_latest_game = (LinearLayout) findViewById(R.id.btn_latest_game);

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
        }





        dialogView = new ZeeAnmolProgressView(this, loader_color);
        imgBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.onBackPressed();
            }
        });


        Btn_PlaQuiz.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            public void onClick(View view) {
                view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor(getString(R.color.colorPrimary))).setShowTitle(true);
                CustomTabsIntent build = builder.build();
                build.intent.setPackage("com.android.chrome");
                build.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                build.launchUrl(getApplicationContext(), Uri.parse(Ad_Constant.qureka_url));
            }
        });


        btn_latest_game.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            public void onClick(View view) {

                view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(Color.parseColor(getString(R.color.colorPrimary))).setShowTitle(true);
                CustomTabsIntent build = builder.build();
                build.intent.setPackage("com.android.chrome");
                build.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                build.launchUrl(getApplicationContext(), Uri.parse(Ad_Constant.qureka_url));

            }
        });


        btn_all_live_tv_show.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                AxieGuide_SecondActivity.this.startActivity(new Intent(AxieGuide_SecondActivity.this, AxieGuideActivity.class));

                Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
               startActivity(intent);
            }
        });



    }


    @SuppressLint("ResourceType")
    public void qureka1(View view) {

        view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.parseColor(getString(R.color.colorPrimary))).setShowTitle(true);
        CustomTabsIntent build = builder.build();
        build.intent.setPackage("com.android.chrome");
        build.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        build.launchUrl(getApplicationContext(), Uri.parse(Ad_Constant.qureka_url));

    }

    @SuppressLint("ResourceType")
    public void mgl1(View view) {

        view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.parseColor(getString(R.color.colorPrimary))).setShowTitle(true);
        CustomTabsIntent build = builder.build();
        build.intent.setPackage("com.android.chrome");
        build.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        build.launchUrl(getApplicationContext(), Uri.parse(Ad_Constant.qureka_url));
    }
}