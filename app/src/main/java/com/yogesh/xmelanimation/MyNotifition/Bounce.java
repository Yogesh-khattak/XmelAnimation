package com.yogesh.xmelanimation.MyNotifition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.yogesh.xmelanimation.R;

public class Bounce extends AppCompatActivity {
    Animation animation;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bounce);
        textView  = findViewById(R.id.textView_bounce);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bounce);
        textView.setAnimation(animation);
        animation.start();
    }
}
