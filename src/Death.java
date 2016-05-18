package com.example.deathnote;


import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Death extends Activity {
    
MediaPlayer sound1;

   
     
   

        
protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.fragment_main);
	
	final EditText nameField = (EditText)findViewById(R.id.nameView);
	final TextView nameView = (TextView)findViewById(R.id.textView1);
	Button button1 = (Button)findViewById(R.id.button1);
	
	sound1 = MediaPlayer.create(this,R.raw.kiralaugh);
	sound1.setVolume(1.0f, 1.0f);
	sound1.start();
	
button1.setOnClickListener(new OnClickListener()
		{

        
public void onClick(View v) {
            
if (nameField.getText().toString().contains("Suhas") || nameField.getText().toString().contains("suhas") || nameField.getText().toString().contains("Kira") || nameField.getText().toString().contains("Ryuzaki")) 
{
                nameView.setText("Gods of Death are immortal !!");
            } 
else if (nameField.getText().toString().contains("sukanya") || nameField.getText().toString().contains("Sukanya") || nameField.getText().toString().contains("Misa")) 
{
    nameView.setText("Gods of Death are immortal !!");
            } 

else if (nameField.getText().toString().contains("varshitha") || nameField.getText().toString().contains("Varshitha") || nameField.getText().toString().contains("Varshi") || nameField.getText().toString().contains("Kurisu")) 
{
              nameView.setText(" " + nameField.getText() + " will live full life and will die peacefully while sleeping satisfied with what life has given");
            } 
else if (nameField.getText().toString().contains("Srinija") || nameField.getText().toString().contains("srinija") || nameField.getText().toString().contains("Tension")) {
           
     nameView.setText(" " + nameField.getText() + " will die at 12:00pm on 04/08/2081 by over thinking and sudden arise hyper-tension because of experiencing AlienSpaceShuttle passing over by her head ");
            }
 else {
      nameView.setText(" " + nameField.getText() + " will die at 11:49am on 30-02-2018 by getting hit by a human");
            }
      
  }
		});

   }
}