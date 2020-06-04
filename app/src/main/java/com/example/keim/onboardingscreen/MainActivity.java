package com.example.keim.onboardingscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation smalltobig, bg_anim,btn_anim;
    ImageView imageView;
    TextView tv1,tv2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        smalltobig= AnimationUtils.loadAnimation(this,R.anim.smalltobig);
        bg_anim=AnimationUtils.loadAnimation(this,R.anim.bg_anim);
        btn_anim=AnimationUtils.loadAnimation(this,R.anim.btn_anim);


        imageView=findViewById(R.id.jouney_img);
        tv1=findViewById(R.id.Journey);
        tv2=findViewById(R.id.subhead_journey);
        btn=findViewById(R.id.btn1);


        imageView.startAnimation(smalltobig);
        tv1.startAnimation(bg_anim);
        tv2.startAnimation(bg_anim);
        btn.startAnimation(btn_anim);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a =new Intent(MainActivity.this,DuaActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
    }
}
