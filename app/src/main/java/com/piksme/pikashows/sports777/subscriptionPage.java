package com.piksme.pikashows.sports777;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.piksme.pikashows.sports777.Ads.AdmobAdsTemplete;


public class subscriptionPage extends AppCompatActivity {
    public static ZeeAnmolProgressView dialogView;
    private static int loader_color = Color.parseColor("#D81B60");
    private ImageView imgBack;
    public TextView textdicrip;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subscription_page);


        LinearLayout linearLayout = findViewById(R.id.banner_ad);
        AdmobAdsTemplete.loadBanner(this, linearLayout);

        FrameLayout frameLayout = findViewById(R.id.native_add);
        AdmobAdsTemplete.loadNativeAds(this, frameLayout);

//        AxieGuide_NativeUtil.Mopub_NativAds(this, (FrameLayout) findViewById(R.id.fl_adplaceholder));
//        AxieGuide_BannerUtil.MopubloadBanner(this, (FrameLayout) findViewById(R.id.banner_adview), (MoPubView) findViewById(R.id.mopubAdview));
        dialogView = new ZeeAnmolProgressView(this, loader_color);
        ImageView imageView = (ImageView) findViewById(R.id.imgBack);
        this.imgBack = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                subscriptionPage.this.onBackPressed();
            }
        });
        TextView textView = (TextView) findViewById(R.id.textdicrip);
        this.textdicrip = textView;
        int i = ZeeAnmolConstant.position;
        if (i == 1) {
            textView.setText(getResources().getString(R.string.discrip1));
        } else if (i == 2) {
            textView.setText(getResources().getString(R.string.discrip2));
        } else if (i == 3) {
            textView.setText(getResources().getString(R.string.discrip3));
        } else if (i == 4) {
            textView.setText(getResources().getString(R.string.discrip4));
        } else if (i == 5) {
            textView.setText(getResources().getString(R.string.discrip5));
        } else if (i == 6) {
            textView.setText(getResources().getString(R.string.discrip6));
        } else if (i == 7) {
            textView.setText(getResources().getString(R.string.discrip7));
        } else if (i == 8) {
            textView.setText(getResources().getString(R.string.discrip8));
        } else if (i == 9) {
            textView.setText(getResources().getString(R.string.discrip9));
        }
    }

    public void onBackPressed() {
        dialogView.show();
        subscriptionPage.this.finish();    }
}