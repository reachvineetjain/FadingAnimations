package com.nehvin.fadinganimations;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView mTom = null;
    private ImageView mJerry = null;
    private int mDuration;

    public void fadeTom(View view)
    {
        mJerry.setAlpha(0f);
        mJerry.setVisibility(View.VISIBLE);
        mJerry.animate().alpha(1f).setDuration(2000).setListener(null);
        mTom.animate().alpha(0f).setDuration(2000).setListener(new AnimatorListenerAdapter() {

            @Override
            public void onAnimationEnd(Animator animation) {
                mTom.setVisibility(View.INVISIBLE);
            }
        });
//        mTom.animate().alpha(0f).setDuration(2000);
//        mJerry.animate().alpha(1f).setDuration(2000);

    }

    public void fadeJerry(View view)
    {
        mTom.setAlpha(0f);
        mTom.setVisibility(View.VISIBLE);
        mTom.animate().alpha(1f).setDuration(2000).setListener(null);
        mJerry.animate().alpha(0f).setDuration(2000).setListener(new AnimatorListenerAdapter() {

            @Override
            public void onAnimationEnd(Animator animation) {
                mJerry.setVisibility(View.INVISIBLE);
            }
        });

//        mJerry.animate().alpha(0f).setDuration(2000);
//        mTom.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTom = (ImageView) findViewById(R.id.tom);
        mJerry = (ImageView) findViewById(R.id.jerry);
//        mJerry.setVisibility(View.INVISIBLE);
//        mDuration = getResources().getInteger(android.R.integer.config_longAnimTime);
//        Log.i("Info", "duration is : "+mDuration);
    }
}
