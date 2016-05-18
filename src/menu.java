package com.example.deathnote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;



public class menu extends Activity {
	
	Button b1,b2;
	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu_main);
		
		b1 = (Button)findViewById(R.id.b1);
		b2 = (Button)findViewById(R.id.b2);
		
		//b1.setOnClickListener(this);
		//b2.setOnClickListener(this);
	
   
    b1.setOnClickListener(new OnClickListener()
    {	
	public void onClick(View v) {
    		
    		//if(v.getId()==R.id.b1)
    		//{
    			Intent intent = new Intent(getBaseContext(),Death.class);
    		    startActivity(intent);
    	   //}
    		/* else if(v.getId()==R.id.b2)
    		{
    		 Intent intent1 = new Intent(getBaseContext(),Death.class);
	        startActivity(intent1);
             } */
	
      }
    });
	}
}
