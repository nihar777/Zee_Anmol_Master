package com.serialslivetvanmol1.zeeanmolhd2022.zeeanmol;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.serialslivetvanmol1.zeeanmolhd2022.zeeanmol.Ads.Ad_Constant;
import com.serialslivetvanmol1.zeeanmolhd2022.zeeanmol.Ads.AdmobAdsTemplete;


public class ThirdActivity extends AppCompatActivity {

    public static ZeeAnmolProgressView dialogView;
    private static int loader_color = Color.parseColor("#D81B60");
    private ImageView imgBack;
    private LinearLayout btn_guid;
    private LinearLayout btn_suscription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        btn_guid = (LinearLayout) findViewById(R.id.btn_guidelines);
        btn_suscription = (LinearLayout) findViewById(R.id.btn_subscription);


        LinearLayout linearLayout = findViewById(R.id.banner_ad);
        AdmobAdsTemplete.loadBanner(this, linearLayout);

        FrameLayout frameLayout = findViewById(R.id.native_add);
        AdmobAdsTemplete.loadNativeAds(this, frameLayout);

        dialogView = new ZeeAnmolProgressView(this, loader_color);
        ImageView imageView = (ImageView) findViewById(R.id.imgBack);
        this.imgBack = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ThirdActivity.this.onBackPressed();
            }
        });


        btn_guid.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(),FourthActivity.class);
                AdmobAdsTemplete.interstitialAds(ThirdActivity.this,intent);
            }
        });


        btn_suscription.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                ZeeAnmolConstant.position = 9;

                Intent intent = new Intent(getApplicationContext(),subscriptionPage.class);
                AdmobAdsTemplete.interstitialAds(ThirdActivity.this,intent);
            }
        });
    }

    public void onBackPressed() {
        dialogView.show();

        ThirdActivity.this.finish();
    }


    @SuppressLint("ResourceType")
    @RequiresApi(api = Build.VERSION_CODES.M)


    public void qureka2(View view) {

        view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.parseColor(getString(R.color.colorPrimary))).setShowTitle(true);
        CustomTabsIntent build = builder.build();
        build.intent.setPackage("com.android.chrome");
        build.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        build.launchUrl(getApplicationContext(), Uri.parse(Ad_Constant.qureka_url));
    }

    @SuppressLint("ResourceType")
    public void mgl2(View view) {

        view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.parseColor(getString(R.color.colorPrimary))).setShowTitle(true);
        CustomTabsIntent build = builder.build();
        build.intent.setPackage("com.android.chrome");
        build.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        build.launchUrl(getApplicationContext(), Uri.parse("http://117.go.mglgamez.com"));
    }
}