package edu.iastate.angrysimon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;



public class Simon_Main_Screen extends Activity{
	 
	private String Game_Mode="Classic";
	//private CustomGestureListener Gesture_Main_Screen = new CustomGestureListener();
	
	 @Override
	protected void onCreate(Bundle savedInstanceState) {
	        
	 super.onCreate(savedInstanceState);
	        
     setContentView(R.layout.activity_main_screen);
	// super.setGestureDetector(new GestureDetector(this.getApplicationContext(), this));
	// super.setLeftRight(ScoreBoardActivity.class, SimonActivity.class);   
	       
	final Intent GotoGame_Intent = new Intent(this, SimonActivity.class);
	        
	 //       Gesture_Main_Screen.setLeftRight(Simon_Settings_Screen.class, ScoreBoardActivity.class);
	        
	        // 3 buttons 
	        Button Classic_Button = (Button) findViewById(R.id.button_Classic_Simon);
	        Button Angry_Button = (Button) findViewById(R.id.button_Angry_Simon);
	        Button Rage_Button = (Button) findViewById(R.id.button_Rage_Simon);
	        
	        Classic_Button.setOnClickListener(new View.OnClickListener() {
	   		
	   	    @Override
			public void onClick(View v) {
	   	     //Intent GotoGame_Intent = new Intent(this, SimonActivity.class);
	   	    	Game_Mode="Classic";
	   	    	GotoGame_Intent.putExtra("Game_Mode",Game_Mode);
	   	    	startActivity(GotoGame_Intent);
	   	    } 
	   	    
	   		});
	    	   
	       
         	 
	   	Angry_Button.setOnClickListener(new View.OnClickListener() {
	   		
	   	    @Override
			public void onClick(View v) {
	   	    	//Mode =  Angry;
	   	    	Game_Mode="Angry";
	   	    	GotoGame_Intent.putExtra("Game_Mode",Game_Mode);
	   	    	startActivity(GotoGame_Intent);
	   	    }
	   	    
	   		});
	    	   
	       

	   Rage_Button.setOnClickListener(new View.OnClickListener() {
		
	    @Override
		public void onClick(View v) {
	    	Game_Mode="Rage";
	    	GotoGame_Intent.putExtra("Game_Mode",Game_Mode);
	    	startActivity(GotoGame_Intent);
	    	
	    	
	    }
	    
		});
	   
   
	        	
	 }
	 	
	 
	  @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		    // Inflate the menu items for use in the action bar
		    MenuInflater inflater = getMenuInflater();
		    inflater.inflate(R.menu.simon_main_screen_menu, menu);
		    return true;
		}
	 	
	  @Override
	  public boolean onOptionsItemSelected(MenuItem item) {
	      // Handle presses on the action bar items
	      switch (item.getItemId()) {
	          case R.id.action_settings:
	              // intent add open new activity
	        	  Intent Settings_Intent = new Intent(this,Simon_Settings_Screen.class);
	        	  startActivity(Settings_Intent);
	        	  return true;
	          case R.id.score_board:
	              // intent add open new activity
	        	  Intent ScoreBoard_Intent = new Intent(this,ScoreBoardActivity.class);
	        	  startActivity(ScoreBoard_Intent);
	        	  return true;
	          default:
	              return super.onOptionsItemSelected(item);
	      }
	  }





	

	 
}
