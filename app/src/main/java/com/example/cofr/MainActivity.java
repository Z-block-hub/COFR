package com.example.cofr;

import androidx.appcompat.app.AppCompatActivity;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    MediaPlayer player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // The following removes the Title Bar
        //Must be implemented before setContentView()
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();


        setContentView(R.layout.activity_main);
    }

    public void toggle(View v) {
        v.setEnabled(false);
    }


    /**
     * Assigns a res/raw resource sound to the current instance of MediaPlayer
     *
     * @param button a Button object with a text value referencing a sound in the raw library.
     */
    public void setPlayer(Button button){
        if(button.getText().equals("wow")){
            player = MediaPlayer.create(this, R.raw.wow);
        }
        if(button.getText().equals("bruh")){
            player = MediaPlayer.create(this, R.raw.bruh);
        }
        if(button.getText().equals("hub")){
            player = MediaPlayer.create(this, R.raw.hub);
        }
        if(button.getText().equals("shit")){
            player = MediaPlayer.create(this, R.raw.shit);
        }
        if(button.getText().equals("milk")){
            player = MediaPlayer.create(this, R.raw.milk);
        }
        if(button.getText().equals("hzuh")){
            player = MediaPlayer.create(this, R.raw.hzuh);
        }
    }

    /**
     * Plays a sound
     * @param v The button clicked.
     */
    public void playSound(View v){
        Button button = (Button) v;
        stopPlaying();
        setPlayer(button);
        player.start();
    }


    /**
     * Stops and releases the player.
     */
    public void stopPlaying() {
        if (player != null) {
            player.stop();
            player.release();
            player = null;
        }
    }
}