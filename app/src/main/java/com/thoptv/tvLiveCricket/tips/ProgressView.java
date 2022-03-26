package com.thoptv.tvLiveCricket.tips;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;


public class ProgressView extends Dialog {
    private int loader_color;

    public ProgressView(Context context, int i) {
        super(context);
        this.loader_color = i;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.zee_anmo_load);
        setCancelable(false);
    }
}
