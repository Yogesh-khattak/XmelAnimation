package com.yogesh.xmelanimation.MyNotifition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.yogesh.xmelanimation.R;

public class Blink extends AppCompatActivity {
    Button btn_b;
    TextView text;
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blink);

        text = findViewById(R.id.txt3);
        btn_b =  findViewById(R.id.btn_blink);
        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bblink);
        text.setAnimation(animation);
        btn_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              animation.start();
            }
        });

    }
}
