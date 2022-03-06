package com.serialslivetvanmol.zeeanmolhd2022.zeeanmol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

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

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    public static ZeeAnmolProgressView dialogView;
    private static int loader_color = Color.parseColor("#D81B60");
    private ImageView imgBack;
    private LinearLayout btn_all_live_tv_show;
    private LinearLayout btnLAtestGame,Btn_PlaQuiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        LinearLayout linearLayout = findViewById(R.id.banner_ad);
        AdmobAdsTemplete.loadBanner(this, linearLayout);

        FrameLayout frameLayout = findViewById(R.id.native_add);
        AdmobAdsTemplete.loadNativeAds(this, frameLayout);

        dialogView = new ZeeAnmolProgressView(this, loader_color);
        ImageView imageView = (ImageView) findViewById(R.id.imgBack);
        this.imgBack = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                HomeActivity.this.onBackPressed();
            }
        });
        linearLayout = (LinearLayout) findViewById(R.id.btn_play_quiz);

        linearLayout.setOnClickListener(new View.OnClickListener() {
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
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.btn_latest_game);
        this.btnLAtestGame = linearLayout2;
        linearLayout2.setOnClickListener(new View.OnClickListener() {
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
        LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.btn_all_live_tv_show);
        this.btn_all_live_tv_show = linearLayout3;
        linearLayout3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
//                AxieGuide_SecondActivity.this.startActivity(new Intent(AxieGuide_SecondActivity.this, AxieGuideActivity.class));

                Intent intent = new Intent(getApplicationContext(),ThirdActivity.class);
                AdmobAdsTemplete.interstitialAds(HomeActivity.this,intent);
            }
        });



    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(HomeActivity.this, ThirdActivity.class);
        startActivity(intent);
        AdmobAdsTemplete.interstitialAds(HomeActivity.this,intent);


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