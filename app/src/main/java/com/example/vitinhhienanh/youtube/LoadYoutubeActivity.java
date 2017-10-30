package com.example.vitinhhienanh.youtube;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;


/**
 * Created by vitinhHienAnh on 29-10-17.
 */

public class LoadYoutubeActivity extends YouTubeBaseActivity {
    Button btnPlay;
//    private YouTubePlayerView youtubePlayerView;
//    private YouTubePlayer.OnInitializedListener onInitializedListener;
        private YouTubePlayerView youtubePlayerView;
    private  YouTubePlayer.OnInitializedListener onInitializedListener;
    @Override
    protected void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.layut_load_clip);
        youtubePlayerView =  findViewById(R.id.YoutubePlayerViewLoadClip);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("9ZaEPeaucIU");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        btnPlay = (Button) findViewById(R.id.btnPlay);
        btnPlay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youtubePlayerView.initialize("AIzaSyDLz7Jn6bsahhBcenywKGopqjRRjJ4cIPU", onInitializedListener);

            }
        });
    }
}
