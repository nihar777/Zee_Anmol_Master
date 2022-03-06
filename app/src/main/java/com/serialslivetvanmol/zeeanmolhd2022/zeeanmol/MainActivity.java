package com.serialslivetvanmol.zeeanmolhd2022.zeeanmol;

import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.browser.customtabs.CustomTabsIntent;

import com.google.android.ads.mediationtestsuite.MediationTestSuite;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.serialslivetvanmol.zeeanmolhd2022.zeeanmol.Ads.Ad_Constant;
import com.serialslivetvanmol.zeeanmolhd2022.zeeanmol.Ads.AdmobAdsTemplete;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public Dialog dialog;
    /* access modifiers changed from: private */
    public Dialog dialog1;
    private LinearLayout btn_start;
    private LinearLayout btn_share;
    private LinearLayout btn_rate;
    private LinearLayout btn_privacy;
//
//FirebaseDatabase database =FirebaseDatabase.getInstance();
//DatabaseReference reference=database.getReference().child("AdsId");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AdmobAdsTemplete.interstitialAds(MainActivity.this, null);


//        MediationTestSuite.launch(MainActivity.this);


        this.btn_start = (LinearLayout) findViewById(R.id.btn_start);
        this.btn_share = (LinearLayout) findViewById(R.id.btn_share);
        this.btn_rate = (LinearLayout) findViewById(R.id.btn_rate);
        this.btn_privacy = (LinearLayout) findViewById(R.id.btn_privacy);
//        Button button = (Button) findViewById(R.id.btn_start);
//        Button share = (Button) findViewById(R.id.btn_share);
//        Button rate = (Button) findViewById(R.id.btn_rate);
//        Button privacy = (Button) findViewById(R.id.btn_privacy);
        btn_start.setOnClickListener(this);

        btn_privacy.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onClick(View v) {

                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
                CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
                builder.setToolbarColor(getColor(R.color.purple_200)).setShowTitle(true);
                CustomTabsIntent build = builder.build();
                build.intent.setPackage("com.android.chrome");
                build.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                build.launchUrl(getApplicationContext(), Uri.parse("https://tuhinsapps77.blogspot.com/2022/02/privacy-policy-built-zee-anmol-tv.html"));



//              reference.push();
/*
              reference.addValueEventListener(new ValueEventListener() {
                  @Override
                  public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                      for (DataSnapshot dataSnapshot1 : dataSnapshot.getChildren()){
                          Log.d("Firebase data==>", String.valueOf(dataSnapshot1));

                      }
                  }

                  @Override
                  public void onCancelled(@NonNull DatabaseError databaseError) {

                  }
              });
*/

            }
        });

        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
                try {
                    Intent shareIntent = new Intent(Intent.ACTION_SEND);
                    shareIntent.setType("text/plain");
                    shareIntent.putExtra(Intent.EXTRA_SUBJECT, "My application name");
                    String shareMessage = "https://play.google.com/store/apps/details?id=" + getPackageName();
                    shareIntent.putExtra(Intent.EXTRA_TEXT, shareMessage);
                    startActivity(Intent.createChooser(shareIntent, "choose one"));
                } catch (Exception e) {
                    //e.toString();
                }
            }
        });

        btn_rate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse("market://details?id=" + getPackageName()));
                startActivity(i);
            }
        });

        exitdialog();
        thankdialog();


    }


    @SuppressLint("ResourceType")
    public void exitdialog() {
        Dialog dialog2 = new Dialog(this);
        this.dialog = dialog2;
        dialog2.setContentView(R.layout.axieguide_exit_dialog);
        this.dialog.getWindow().setBackgroundDrawableResource(17170445);
//        AxieGuide_NativeUtil.Mopub_NativAds(this, (FrameLayout) this.dialog.findViewById(R.id.fl_adplaceholder));
        ((TextView) this.dialog.findViewById(R.id.tv_no)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.dialog.dismiss();
            }
        });
        ((TextView) this.dialog.findViewById(R.id.tv_yesh)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.dialog.dismiss();
                MainActivity.this.dialog1.show();
            }
        });
        ((TextView) this.dialog.findViewById(R.id.tv_rate)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.dialog.dismiss();
                try {
                    MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + MainActivity.this.getPackageName())));
                } catch (ActivityNotFoundException unused) {
                    MainActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://play.google.com/store/apps/details?id=" + MainActivity.this.getPackageName())));
                }
            }
        });
    }


    @SuppressLint("ResourceType")
    public void thankdialog() {
        Dialog dialog2 = new Dialog(this);
        this.dialog1 = dialog2;
        dialog2.setContentView(R.layout.axieguide_thankyou_dialog);
        this.dialog1.getWindow().setBackgroundDrawableResource(17170445);
//        AxieGuide_NativeUtil.Mopub_NativAds(this, (FrameLayout) this.dialog1.findViewById(R.id.fl_adplaceholder));
        ((TextView) this.dialog1.findViewById(R.id.tv_yesh)).setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                MainActivity.this.dialog1.dismiss();
                MainActivity.this.finishAffinity();
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(intent);
        AdmobAdsTemplete.interstitialAds(MainActivity.this, intent);

    }


    @SuppressLint("ResourceType")
    public void qureka(View view) {
        view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.parseColor(getString(R.color.colorPrimary))).setShowTitle(true);
        CustomTabsIntent build = builder.build();
        build.intent.setPackage("com.android.chrome");
        build.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        build.launchUrl(getApplicationContext(), Uri.parse(Ad_Constant.qureka_url));

    }

    @SuppressLint("ResourceType")
    public void mgl(View view) {


        view.startAnimation(AnimationUtils.loadAnimation(getApplicationContext(), R.anim.button_push));
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.parseColor(getString(R.color.colorPrimary))).setShowTitle(true);
        CustomTabsIntent build = builder.build();
        build.intent.setPackage("com.android.chrome");
        build.intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        build.launchUrl(getApplicationContext(), Uri.parse(Ad_Constant.qureka_url));
    }
}