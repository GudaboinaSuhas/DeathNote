package com.example.deathnote;

import android.app.Activity;
import android.os.Bundle;
import android.widget.VideoView;

public class Video1 extends Activity{
	
	protected void onCreate(Bundle savedInstanceState) {
        
		super.onCreate(savedInstanceState);
		setContentView(R.layout.video_main);
		VideoView video = (VideoView) findViewById(R.id.video);
	    video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.kira3);
	    video.start();
		 
	           }
		}




