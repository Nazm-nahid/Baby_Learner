package com.example.sample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.mytoolbar);
        setSupportActionBar(toolbar);

        final MediaPlayer m = MediaPlayer.create(this,R.raw.choloshikhi);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                m.start();
            }
        },1000);


        Button b1=(Button) findViewById(R.id.buttonid);
//        final EditText t=(EditText) findViewById(R.id.textid);
        b1.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                String text = "Hey  !! Welcome to Second Activity ";
                Intent intent=new Intent(getApplicationContext(),activity_two.class);
                intent.putExtra("secondtext",text);
                startActivity(intent);
            }
        });

        Button b2=(Button) findViewById(R.id.buttonid1);

        b2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent=new Intent(getApplicationContext(),game_one.class);
                startActivity(intent);
            }
        });

        Button b3=(Button) findViewById(R.id.buttonid2);

        b3.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent=new Intent(getApplicationContext(),learn_one.class);
                startActivity(intent);
            }
        });

//        Button b2=(Button) findViewById(R.id.buttonid2);
//        final EditText tt=(EditText) findViewById(R.id.textid);
//        b2.setOnClickListener(new View.OnClickListener()
//        {
//            @Override
//            public void onClick(View v)
//            {
//                String text = "Welcome "+tt.getText().toString()+ " !! It's Third Activity ";
//                Intent intent=new Intent(getApplicationContext(),activity_three.class);
//                intent.putExtra("thirdtext",text);
//                startActivity(intent);
//            }
//        });
    }


}
