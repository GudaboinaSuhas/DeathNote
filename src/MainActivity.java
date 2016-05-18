package com.example.deathnote;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity {
    
MediaPlayer sound;

protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.activity_main);
	
	 sound = MediaPlayer.create(this,R.raw.low);
     sound.setVolume(0.2f, 0.2f);
	 sound.start();
	 
	 Button btnJustice = (Button)findViewById(R.id.btnJustice);
	        
	 btnJustice.setOnClickListener(new OnClickListener()
			 {
		 public void onClick(View v) {
			 
			 Intent intent2 = new Intent(MainActivity.this,menu.class);
	    		startActivity(intent2);
			 
		 }
		 
			 
			 });
   

       }
}