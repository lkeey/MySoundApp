package com.example.mysoundapp;

import android.content.Context;
import android.media.MediaPlayer;

public class AudioPlayer {
    private MediaPlayer mPlayer;

    public void play(Context context) {
        stop();
        mPlayer = MediaPlayer.create(
                context, R.raw.music
        );

        mPlayer.setOnCompletionListener(mediaPlayer -> stop());

        mPlayer.start();
    }

    public void stop() {
        if(mPlayer != null) {
            mPlayer.release();
            mPlayer = null;
        }
    }
}
