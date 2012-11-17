package com.example.learn1;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.CompoundButton.*;
import android.widget.TextView;
import android.widget.ToggleButton;
 

public class MainActivity extends Activity implements android.view.View.OnClickListener,OnCheckedChangeListener,OnItemSelectedListener {
	
	private Button btt1;
	private Button btt2; 
	private Button btt3;
	private Button btt4;
	private Button btt5;
	private Button btt6;
	private Button btt10;
	private Button btt11;
	private int test=0;
	private int test2=0;
	
	private ToggleButton tgl;
	
	private Spinner sp;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Button btt = (Button)findViewById(R.id.button_cancel);
        setContentView(R.layout.activity_main);
        
        String[] items = {"May Vi Tinh","May Lanh","May Giat","May may","May Gi"};
        		
        btt1 = (Button)findViewById(R.id.btt1);
        btt1.setOnClickListener(this);
        
        btt2 = (Button)findViewById(R.id.btt2);
        btt2.setOnClickListener(this);
        
        btt3 = (Button)findViewById(R.id.btt3);
        btt3.setOnClickListener(this);
        
        btt4 = (Button)findViewById(R.id.btt4);
        btt4.setOnClickListener(this);
        
        btt5 = (Button)findViewById(R.id.openActivity);
        btt5.setOnClickListener(this);
        
        btt6 = (Button)findViewById(R.id.saokhong);
        btt6.setOnClickListener(this);
        
        btt10 = (Button)findViewById(R.id.saoke);
        btt10.setOnClickListener(this);
        
        btt11 = (Button)findViewById(R.id.learnIntent);
        btt11.setOnClickListener(this);
        		
        tgl = (ToggleButton)findViewById(R.id.tgl1);
        tgl.setOnCheckedChangeListener(this);
        
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_gallery_item,items);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.danhsach, android.R.layout.simple_spinner_item);
        
        sp = (Spinner) findViewById(R.id.spinner1);
        sp.setAdapter(adapter);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options1, menu);
        return true;
    }
    
    public void clickEvent(View view){
    	TextView txt = (TextView)findViewById(R.id.from);
    	txt.setHint("f");    	
    }

	@Override
	public void onClick(View view) {
		// TODO Auto-generated method stub
		switch(view.getId()){
		case R.id.btt1 :
			showOneDialog();
			break;
		case R.id.btt2:
			showTwoDialog();
			break;
		case R.id.btt3:
			showListDialog();
			break;
		case R.id.btt4:
			showCheckListCheckBox();
			break;
		case R.id.openActivity:
			Intent intent = new Intent(view.getContext(),Form2.class);
			startActivityForResult(intent, 0);
			break;
		case R.id.saokhong:
			Intent intent1 = new Intent(view.getContext(),Active3Activity.class);
			startActivityForResult(intent1, 0);
			break;
		case R.id.saoke:
			Intent intent3 = new Intent(view.getContext(),LearnUIform.class);
			startActivityForResult(intent3, 0);
			break;
		case R.id.learnIntent:
			Intent intent4 = new Intent(this,Intent1Activity.class);
			startActivity(intent4);
			break;
		}
		
	}

	@Override
	public boolean onOptionsItemSelected(android.view.MenuItem item) {
		return false;
	};

    private void showOneDialog(){
    	AlertDialog.Builder bu = new AlertDialog.Builder(this);
    	bu.setTitle("Toi Khong Hieu");
    	bu.setMessage("Are you sure to close ?");
    	bu.setPositiveButton("OK", new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface arg0, int arg1) {
				// TODO Auto-generated method stub
			}
		});
    	AlertDialog t = bu.create();
    	
    	t.show();
    }
    
    private void showTwoDialog(){
    	AlertDialog.Builder bu2 = new AlertDialog.Builder(this);
    	bu2.setTitle("Cong nghe ");
    	bu2.setMessage("THong Tin");
    	bu2.setNegativeButton("Cancel", new OnClickListener() {		
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
			}
		});
    	
    	bu2.setPositiveButton("OK", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
			}
		});
    	
    	AlertDialog tt = bu2.create();
    	tt.show();
    }
    
    private void showListDialog(){
    	AlertDialog.Builder bu = new AlertDialog.Builder(this);
    	String[] items = {"Red","Green","Pink"};
    	bu.setItems(items, new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
    	
    	bu.setNegativeButton("Cancel", new OnClickListener() {
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
    	
    	bu.setTitle("List");
    	
    	AlertDialog t = bu.create();
    	t.show();
    }
    
    private void showCheckListCheckBox(){
    	AlertDialog.Builder bu = new AlertDialog.Builder(this);
    	String[] listCheck = {"Red","Green","Apple"};
    	bu.setTitle("Thong Tin");
    	bu.setSingleChoiceItems(listCheck, 1, new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
			}
		});
    	
    	AlertDialog t = bu.create();
    	t.show();
    }
    
    public void onClickCheckBox(View view){
    	switch(view.getId()){
    		case R.id.ck1:
    			showdialoginfo();
    			break;
    		case R.id.ck2:
    			break;
    	}
    }
    
    private void showdialoginfo(){
    	AlertDialog.Builder bu = new AlertDialog.Builder(this);
    	bu.setTitle("Hang Trung Quoc");
    	AlertDialog t = bu.create();
    	t.show();
    }

	@Override
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		// TODO Auto-generated method stub
		if (isChecked){ 
			showdialoginfo();
		}
		else{
			showdialoginfo();
		}
	}

	@Override
	public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,
			long arg3) {
		// TODO Auto-generated method stub
		arg0.getItemAtPosition(arg2);
		
	}

	@Override
	public void onNothingSelected(AdapterView<?> arg0) {
		// TODO Auto-generated method stub
		
	}
}
