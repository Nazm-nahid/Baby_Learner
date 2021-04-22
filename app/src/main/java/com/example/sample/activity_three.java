package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class activity_three extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        Toolbar toolbar2 = findViewById(R.id.mytoolbar2);
        setSupportActionBar(toolbar2);

        final MediaPlayer m = MediaPlayer.create(this,R.raw.beep);
        final MediaPlayer _1 = MediaPlayer.create(this,R.raw.one);
        final MediaPlayer _2 = MediaPlayer.create(this,R.raw.two);
        final MediaPlayer _3 = MediaPlayer.create(this,R.raw.three);
        final MediaPlayer _4 = MediaPlayer.create(this,R.raw.four);
        final MediaPlayer _5 = MediaPlayer.create(this,R.raw.five);
        final MediaPlayer _6 = MediaPlayer.create(this,R.raw.six);
        final MediaPlayer _7 = MediaPlayer.create(this,R.raw.seven);
        final MediaPlayer _8 = MediaPlayer.create(this,R.raw.eight);
        final MediaPlayer _9 = MediaPlayer.create(this,R.raw.nine);
        final MediaPlayer _0 = MediaPlayer.create(this,R.raw.zero);


        final Button b1=(Button) findViewById(R.id.buttonid2);

        final double x = (double) Math.random()*10000000;

        final int k = (int) (x%10);

        String s = ""+k ;
        b1.setText(s);

        final MediaPlayer mo = MediaPlayer.create(this,R.raw.etaki);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                mo.start();
                b1.setOnClickListener(new View.OnClickListener()
                {
                    @Override
                    public void onClick(View v)
                    {
                        if(k==1) _1.start();
                        else if(k==2) _2.start();
                        else if(k==3) _3.start();
                        else if(k==4) _4.start();
                        else if(k==5) _5.start();
                        else if(k==6) _6.start();
                        else if(k==7) _7.start();
                        else if(k==8) _8.start();
                        else if(k==9) _9.start();
                        else if(k==0) _0.start();
                        Intent intent=new Intent(getApplicationContext(),activity_two.class);
                        startActivity(intent);
                    }
                });
            }
        },500);





//        TextView mTextview;
//        mTextview = (TextView)findViewById(R.id.secondtext);
//
//        mTextview.setText(getIntent().getStringExtra("secondtext"));
    }
}
