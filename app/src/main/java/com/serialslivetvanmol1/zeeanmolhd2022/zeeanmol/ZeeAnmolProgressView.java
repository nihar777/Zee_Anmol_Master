package com.serialslivetvanmol1.zeeanmolhd2022.zeeanmol;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.serialslivetvanmol1.zeeanmolhd2022.zeeanmol.R;


public class ZeeAnmolProgressView extends Dialog {
    private int loader_color;

    public ZeeAnmolProgressView(Context context, int i) {
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
