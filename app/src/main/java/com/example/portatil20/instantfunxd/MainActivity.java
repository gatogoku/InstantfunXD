package com.example.portatil20.instantfunxd;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void b1(View view){ MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.combo_breaker);mp.start();}
    public void b2(View view){ MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.darth_vader);mp.start();}
    public void b3(View view){ MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.doh);mp.start();}
    public void b4(View view){ MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.fatality);mp.start();}
    public void b5(View view){ MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.gaaaay);mp.start();}
    public void b6(View view){ MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.hadouken);mp.start();}
    public void b7(View view){ MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.homer_bocadillo);mp.start();}
    public void b8(View view){ MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.im_batman);mp.start();}
    public void b9(View view){ MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.its_a_trap);mp.start();}
    public void b10(View view){ MediaPlayer mp = MediaPlayer.create(MainActivity.this, R.raw.kamehameha);mp.start();}






}