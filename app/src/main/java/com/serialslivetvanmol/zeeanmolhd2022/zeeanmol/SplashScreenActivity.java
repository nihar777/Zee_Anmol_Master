package com.serialslivetvanmol.zeeanmolhd2022.zeeanmol;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigSettings;
import com.serialslivetvanmol.zeeanmolhd2022.zeeanmol.Ads.Ad_Constant;


public class SplashScreenActivity extends AppCompatActivity {

    FirebaseRemoteConfig mFirebaseRemoteConfig;
    ProgressBar progressBar;

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

    private void fetchRemoteTitle() {
        FirebaseRemoteConfig firebaseRemoteConfig = this.mFirebaseRemoteConfig;
        Ad_Constant.flag = firebaseRemoteConfig.getBoolean("isActive");
        Ad_Constant.qureka = firebaseRemoteConfig.getBoolean("qureka");

        Log.e("qureka",""+firebaseRemoteConfig.getBoolean("qureka"));

        Ad_Constant.admob_native = this.mFirebaseRemoteConfig.getString("Admob_native");
        Ad_Constant.admob_interstitial = this.mFirebaseRemoteConfig.getString("Admob_Interstitial");
        Ad_Constant.admob_banner = this.mFirebaseRemoteConfig.getString("Admob_Banner");
        Ad_Constant.app_ad_open_ads = this.mFirebaseRemoteConfig.getString("Admob_OpenAd");


        firebaseRemoteConfig.fetchAndActivate()
                .addOnCompleteListener(this, new OnCompleteListener<Boolean>() {
                    @Override
                    public void onComplete(@NonNull Task<Boolean> task) {
                        if (task.isSuccessful()) {
                            boolean updated = task.getResult();

                        } else {

                        }
                    }
                });

    }
}