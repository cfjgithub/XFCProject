package com.xfc.fgzs.xfcproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*
* Bundle类是一个key-value对
* 两个activity之间的通讯可以通过bundle类来实现
* */
public class XFCMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xfcmain);
    }
}
