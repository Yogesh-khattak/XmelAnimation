package com.yogesh.xmelanimation.MyNotifition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.yogesh.xmelanimation.R;

public class SlidDown extends AppCompatActivity {
    Animation animation;
    TextView textout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_out);

       textout =  findViewById(R.id.textView_slide_out);
       animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_down);
       textout.setAnimation(animation);
       animation.start();

    }
}
