package com.serialslivetvanmol.zeeanmolhd2022.zeeanmol;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.serialslivetvanmol.zeeanmolhd2022.zeeanmol.Ads.Ad_Constant;


public class SplashScreenActivity extends AppCompatActivity {

    FirebaseRemoteConfig mFirebaseRemoteConfig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handler = new Handler();

        this.mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        this.mFirebaseRemoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(0).build());
        this.mFirebaseRemoteConfig.setDefaultsAsync((int) R.xml.remote_config_defaults);

        FirebaseRemoteConfig firebaseRemoteConfig = this.mFirebaseRemoteConfig;



//        Ad_Constant.flag = firebaseRemoteConfig.getBoolean("isActive");
//        Ad_Constant.admob_native = this.mFirebaseRemoteConfig.getString("Admob_native");
//        Ad_Constant.admob_interstitial = this.mFirebaseRemoteConfig.getString("Admob_Interstitial");
//        Ad_Constant.admob_banner = this.mFirebaseRemoteConfig.getString("Admob_Banner");
//        Log.e("banner",""+Ad_Constant.admob_banner);
//        Ad_Constant.app_ad_open_ads = this.mFirebaseRemoteConfig.getString("Admob_OpenAd");
////        Ad_Constant.showStartScreens = Boolean.valueOf(this.mFirebaseRemoteConfig.getBoolean("is_screen_show"));
//        Ad_Constant.counter = Integer.parseInt(this.mFirebaseRemoteConfig.getString("ins_Counter"));
////        Ad_Constant.app_acc_policy = "https://shreenathinfotech.com/privacy/gb_whats_version_2022.html";




        handler.postDelayed(new Runnable() {
           @Override
           public void run() {
               startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
               finish();
           }
       },3000);

    }
}