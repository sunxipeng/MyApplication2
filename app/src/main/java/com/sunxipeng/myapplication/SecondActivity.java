package com.sunxipeng.myapplication;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Administrator on 2016/9/6.
 */
public class SecondActivity extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);
    }

   /* @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
        overridePendingTransition(R.animator.push_left_in, R.animator.push_left_out);
    }*/
}
