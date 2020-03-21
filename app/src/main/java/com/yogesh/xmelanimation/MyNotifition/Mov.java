package com.yogesh.xmelanimation.MyNotifition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.yogesh.xmelanimation.R;

public class Mov extends AppCompatActivity {
    Animation animation;
    TextView  textView7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mov);
       textView7=  findViewById(R.id.textView_mov);
       animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.moveee);
       textView7.setAnimation(animation);
       animation.start();
    }
}
