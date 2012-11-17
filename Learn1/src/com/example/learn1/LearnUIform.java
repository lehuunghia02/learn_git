package com.example.learn1;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.support.v4.app.NavUtils;

public class LearnUIform extends Activity  {
	
	private RadioButton rd1;
	private RadioButton rd2;
	private RadioButton rd3;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.learnui);
        
        rd1 = (RadioButton)findViewById(R.id.radio1);
        rd2 = (RadioButton)findViewById(R.id.radio2);
        rd3 = (RadioButton)findViewById(R.id.radio3);
        
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.learnui, menu);
        return true;
    }

    public void radioOnClick(View view){
    	
    	switch(view.getId()){
    		case R.id.radio1:
    			showDialog();
    			break;
    	}
    }
    
    private void showDialog(){
    	AlertDialog.Builder bu = new AlertDialog.Builder(this);
    	String[] items={"Con Cho","Con Meo","Con Chuot"};
    	String navigateButton = "Navigation";
    	String positiveButton = "Positive";
    	bu.setTitle(R.string.Message);
    	bu.setSingleChoiceItems(items, 1, new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
    	
    	bu.setNegativeButton(navigateButton, new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
    	
    	bu.setPositiveButton(positiveButton, new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
    	
    	AlertDialog t = bu.create();
    	t.show();
    	
    }
    
}
