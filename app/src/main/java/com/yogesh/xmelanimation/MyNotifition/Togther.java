package com.yogesh.xmelanimation.MyNotifition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.yogesh.xmelanimation.R;

public class Togther extends AppCompatActivity {
    Animation animation;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_togther);
        textView =  findViewById(R.id.textView_togher);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.toghther);
        textView.setAnimation(animation);
        animation.start();
    }
}
