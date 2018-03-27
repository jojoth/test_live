package com.example.sukationg.test_live;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import  android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.net.Uri;
import android.util.Log;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    VideoView vdoview;
    MediaController mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        vdoview= (VideoView)findViewById(R.id.videoView);
        if(mc== null){
            mc = new MediaController(MainActivity.this);
            mc.setAnchorView(vdoview);
        }
        vdoview.setMediaController(mc);
        Uri uri= Uri.parse("http://abhiandroid-8fb4.kxcdn.com/ui/wp-content/uploads/2016/04/videoviewtestingvideo.mp4");

        vdoview.setVideoURI(uri);
        vdoview.start();





    }
}
