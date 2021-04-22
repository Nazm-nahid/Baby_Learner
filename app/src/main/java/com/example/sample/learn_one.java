package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class learn_one extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learn_one);

        Toolbar toolbar2 = findViewById(R.id.mytoolbar2);
        setSupportActionBar(toolbar2);

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

        final Button b1=(Button) findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _1.start();

            }
        });
        final Button b2=(Button) findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _2.start();

            }
        });
        final Button b3=(Button) findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _3.start();

            }
        });
        final Button b4=(Button) findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _4.start();

            }
        });
        final Button b5=(Button) findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _5.start();

            }
        });
        final Button b6=(Button) findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _6.start();

            }
        });
        final Button b7=(Button) findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _7.start();

            }
        });
        final Button b8=(Button) findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _8.start();

            }
        });
        final Button b9=(Button) findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _9.start();

            }
        });
        final Button b0=(Button) findViewById(R.id.button0);
        b0.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                _0.start();

            }
        });


    }
}
