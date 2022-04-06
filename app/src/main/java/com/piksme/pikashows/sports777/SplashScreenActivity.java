package com.piksme.pikashows.sports777;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.piksme.pikashows.sports777.Ads.Ad_Constant;


public class SplashScreenActivity extends AppCompatActivity {

    FirebaseRemoteConfig mFirebaseRemoteConfig;
    ProgressBar progressBar;

    @Override
    protected void onStart() {
        super.onStart();
        fetchRemoteTitle();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        progressBar = findViewById(R.id.progressbar);

        progressBar.setVisibility(View.VISIBLE);

        Handler handler = new Handler();

        this.mFirebaseRemoteConfig = FirebaseRemoteConfig.getInstance();
        this.mFirebaseRemoteConfig.setConfigSettingsAsync(new FirebaseRemoteConfigSettings.Builder().setMinimumFetchIntervalInSeconds(0).build());
        this.mFirebaseRemoteConfig.setDefaultsAsync((int) R.xml.remote_config_defaults);

        fetchRemoteTitle();

        handler.postDelayed(new Runnable() {
           @Override
           public void run() {
               if (mFirebaseRemoteConfig != null){

               startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
               finish();

//                   progressBar.setVisibility(View.GONE);
               }else {
                   handler.postDelayed(new Runnable() {
                       @Override
                       public void run() {
                           progressBar.setVisibility(View.GONE);
                       }
                   },3000);

               }
           }
       },3000);

    }

    private  void setData(){

        Ad_Constant.flag = mFirebaseRemoteConfig.getBoolean("isActive");
        Ad_Constant.qureka = mFirebaseRemoteConfig.getBoolean("qureka");

        Log.e("qureka",""+mFirebaseRemoteConfig.getBoolean("qureka"));

        Ad_Constant.admob_native = this.mFirebaseRemoteConfig.getString("Admob_native");
        Ad_Constant.admob_interstitial = this.mFirebaseRemoteConfig.getString("Admob_Interstitial");
        Ad_Constant.admob_banner = this.mFirebaseRemoteConfig.getString("Admob_Banner");
        Ad_Constant.app_ad_open_ads = this.mFirebaseRemoteConfig.getString("Admob_OpenAd");
        Ad_Constant.qureka_url=this.mFirebaseRemoteConfig.getString("qureka_url");


        Log.d("qureka",""+mFirebaseRemoteConfig.getBoolean("qureka"));
        Log.d("qureka_url",""+mFirebaseRemoteConfig.getString("qureka_url"));
    }

    private void fetchRemoteTitle() {

        FirebaseRemoteConfig firebaseRemoteConfig = this.mFirebaseRemoteConfig;
        firebaseRemoteConfig.fetchAndActivate().addOnSuccessListener((unusedVoid) -> setData());

    }
}