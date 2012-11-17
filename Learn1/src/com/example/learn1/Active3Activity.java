package com.example.learn1;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;
import android.support.v4.app.NavUtils;

public class Active3Activity extends Activity implements android.view.View.OnClickListener  {
	
	private Button btt1; 
	private GridView gv1;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active3);
        btt1 =(Button)findViewById(R.id.showinfo);
        btt1.setOnClickListener(this);
        
        gv1 = (GridView)findViewById(R.id.gridView1);
        showGrid();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.active3, menu);
        return true;
    }

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId())
		{
			case R.id.showinfo:
				showAlertdialog();
				break;
		}
	}

    private void showAlertdialog(){
    	AlertDialog.Builder bu = new AlertDialog.Builder(this);
    	bu.setTitle("Sao ky vay ta chuoi thiet");
    	String[] items={"tro choi","khong hieu","chui thiet"};
    	bu.setItems(items,new OnClickListener() {
			
    		@Override
			public void onClick(DialogInterface dialog, int which) {
				// TODO Auto-generated method stub
				
			}
		});
    	
    	bu.create();
    	bu.show();
    }
    
    private void showGrid(){
    	String[] listContent= {"Thang Mot","Thang 2","Thang 3","Thang 4","Thang 5","Thang 6","Thang 7","Thang 8","Thang 9","Thang 10"};
    	
    	ArrayAdapter<String> a = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listContent);
    	gv1.setAdapter(a);
    }
}
