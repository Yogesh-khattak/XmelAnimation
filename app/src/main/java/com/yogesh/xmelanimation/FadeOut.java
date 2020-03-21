package com.yogesh.xmelanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class FadeOut extends AppCompatActivity {
    TextView txt;
    Button btn;
   Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fade_out);
        txt =  findViewById(R.id.textView_fade_out);
        btn =  findViewById(R.id.button_fade_out);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_out);
        txt.setAnimation(animation);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animation.start();

            }
        });
    }
}
