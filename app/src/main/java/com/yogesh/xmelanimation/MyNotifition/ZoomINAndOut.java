package com.yogesh.xmelanimation.MyNotifition;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.yogesh.xmelanimation.R;

public class ZoomINAndOut extends AppCompatActivity {
    Animation animation;
    TextView text4,tezzt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zoom_i_n_and_out);
        text4 =  findViewById(R.id.textView_zoom);
        tezzt =  findViewById(R.id.textView2);
         animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zooom);
        text4.setAnimation(animation);
        animation.start();


        animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_out);

        tezzt.setAnimation(animation);
        animation.start();
    }
}
