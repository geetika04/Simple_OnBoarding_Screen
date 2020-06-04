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

public class DuaActivity extends AppCompatActivity {
    Animation smalltobig,bg_anim,btn_anim;
    ImageView img2;
    TextView tv3,tv4;
    Button btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);
        smalltobig= AnimationUtils.loadAnimation(this,R.anim.smalltobig);
        bg_anim=AnimationUtils.loadAnimation(this,R.anim.bg_anim);
        btn_anim=AnimationUtils.loadAnimation(this,R.anim.btn_anim);


        img2=findViewById(R.id.planning_img);
        tv3=findViewById(R.id.planning);
        tv4=findViewById(R.id.subhead_planning);
        btn2=findViewById(R.id.btn2);


        img2.startAnimation(smalltobig);
        tv3.startAnimation(bg_anim);
        tv4.startAnimation(bg_anim);
        btn2.startAnimation(btn_anim);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(DuaActivity.this, thrioActivity.class);
                a.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
                startActivity(a);
            }
        });
    }
}
