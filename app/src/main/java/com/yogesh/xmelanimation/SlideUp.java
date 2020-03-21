package com.yogesh.xmelanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SlideUp extends AppCompatActivity {
    Animation anim;
    TextView text_sup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide_up);


            text_sup =  findViewById(R.id.text_slide_up);
        anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide_up);
        text_sup.setAnimation(anim);
        anim.start();


    }
}
