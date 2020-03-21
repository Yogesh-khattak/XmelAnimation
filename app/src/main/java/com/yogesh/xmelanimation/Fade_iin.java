package com.yogesh.xmelanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class Fade_iin extends AppCompatActivity {
    Animation animation;
    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade_iin);
        txt = findViewById(R.id.textView_fade );
        btn = findViewById(R.id.button_fade);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
        txt.setAnimation(animation);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.start();
            }
        });
    }

}
