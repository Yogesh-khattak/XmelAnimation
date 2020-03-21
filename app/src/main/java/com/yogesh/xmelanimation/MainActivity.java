
package com.yogesh.xmelanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.transition.Fade;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;

import com.yogesh.xmelanimation.MyNotifition.Blink;
import com.yogesh.xmelanimation.MyNotifition.Bounce;
import com.yogesh.xmelanimation.MyNotifition.Mov;
import com.yogesh.xmelanimation.MyNotifition.SlidDown;
import com.yogesh.xmelanimation.MyNotifition.Togther;
import com.yogesh.xmelanimation.MyNotifition.ZoomINAndOut;

public class MainActivity extends AppCompatActivity {


   Button btn,btn2,btn3,btn4,btn6,btn7,btn8,btn9,btn10,btn11,btn12;
   LinearLayout ly;
  AnimationDrawable animationDrawable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        btn =  findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =  new Intent(MainActivity.this,Fade_iin.class);
                startActivity(i);
            }
        });

        btn2 =  findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 =  new Intent(MainActivity.this,FadeOut.class);
                startActivity(i2);

            }
        });

        btn3 =  findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3 =  new Intent(MainActivity.this, Blink.class);
                startActivity(i3);

            }
        });

        btn4 =  findViewById(R.id.button_zomm);
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4 =  new Intent(MainActivity.this, ZoomINAndOut.class);
                startActivity(i4);

            }
        });


        btn6 =  findViewById(R.id.button_rotate);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6 = new Intent(MainActivity.this, Rota.class);
                startActivity(i6);


            }



        });


        btn7 =  findViewById(R.id.button7);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7 = new Intent(MainActivity.this, Mov.class);
                startActivity(i7);


            }



        });

        btn8 =  findViewById(R.id.button8);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8 = new Intent(MainActivity.this, SlideUp.class);
                startActivity(i8);


            }



        });

        btn9 =  findViewById(R.id.button_down);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i9 = new Intent(MainActivity.this, SlidDown.class);
                startActivity(i9);


            }



        });

        btn10 =  findViewById(R.id.button2_bb);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i10 = new Intent(MainActivity.this, Bounce.class);
                startActivity(i10);


            }



        });

        btn11 =  findViewById(R.id.button11);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i11 = new Intent(MainActivity.this, Seqntial.class);
                startActivity(i11);


            }



        });
        btn12 =  findViewById(R.id.button12);
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i12 = new Intent(MainActivity.this, Togther.class);
                startActivity(i12);
            }



        });

        ly =  findViewById(R.id.ly);
        ly.setBackgroundResource(R.drawable.lyout);
       animationDrawable = (AnimationDrawable) ly.getBackground();
       animationDrawable.setEnterFadeDuration(5);
       animationDrawable.start();

    }
}