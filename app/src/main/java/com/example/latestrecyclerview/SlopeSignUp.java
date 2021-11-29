package com.example.latestrecyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

public class SlopeSignUp extends AppCompatActivity implements View.OnClickListener {

    ImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_slope_sign_up);

        mImageView=(ImageView) findViewById(R.id.signup_img_back);
        mImageView.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v == mImageView)
            finish();
    }
}