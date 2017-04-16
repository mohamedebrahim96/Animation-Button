package com.example.home.animatedfloatactionbutton;

import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView button;
    static boolean x = false;
    // the link of the tutorial http://myhexaville.com/2017/04/14/android-vector-path-animations-easy/
    //           https://materialdesignicons.com/
    //               https://shapeshifter.design/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (ImageView)findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Drawable d = button.getDrawable();
                if(x == false)
                {
                    ((AnimatedVectorDrawable)d ).start();
                    x = true;
                }else {
                    ((AnimatedVectorDrawable)d ).reset();
                    x = false;
                }


            }
        });
    }
}
