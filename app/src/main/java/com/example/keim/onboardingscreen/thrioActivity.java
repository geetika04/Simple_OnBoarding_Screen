package com.example.keim.onboardingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class thrioActivity extends AppCompatActivity {

    Animation smalltobig,bg_anim,btn_anim;
    ImageView ing3;
    TextView tv5,tv6;
    Button btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thrio);
        smalltobig= AnimationUtils.loadAnimation(this,R.anim.smalltobig);
        bg_anim=AnimationUtils.loadAnimation(this,R.anim.bg_anim);
        btn_anim=AnimationUtils.loadAnimation(this,R.anim.btn_anim);


        ing3=findViewById(R.id.destination_img);
        tv5=findViewById(R.id.destination);
        tv6=findViewById(R.id.subhead_destination);
        btn3=findViewById(R.id.btn3);


        ing3.startAnimation(smalltobig);
        tv5.startAnimation(bg_anim);
        tv6.startAnimation(bg_anim);
        btn3.startAnimation(btn_anim);
    }
}
