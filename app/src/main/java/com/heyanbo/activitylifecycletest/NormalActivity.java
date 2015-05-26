package com.heyanbo.activitylifecycletest;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

/**
 * Created by kaite on 2015/5/26.
 */
public class NormalActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);


    }
}
