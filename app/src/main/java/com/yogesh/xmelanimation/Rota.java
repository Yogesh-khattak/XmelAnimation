package com.yogesh.xmelanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class Rota extends AppCompatActivity {
    Animation animation;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rota);
        textView =  findViewById(R.id.textView_6);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
        textView.setAnimation(animation);
        animation.start();
    }
}
