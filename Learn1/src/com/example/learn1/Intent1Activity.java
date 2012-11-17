package com.example.learn1;

import java.net.URI;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.support.v4.app.NavUtils;

public class Intent1Activity extends Activity {
	

	int requestCode;
	int restultRequestCode = 1;
	Button btt1;
	
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
				
		Log.d("activity","" + resultCode);
		
		if (resultCode == 1){
			String chuoiwa = "Ban da chon cai gi";
			Toast.makeText(this, chuoiwa, chuoiwa.length()).show();
		}
		else
		{
			String saoky = "sao ky vay ta";
			Toast.makeText(this, saoky, Toast.LENGTH_LONG).show();
		}
		
		if (requestCode == restultRequestCode){
			if (resultCode == RESULT_OK){
				
				startActivity(new Intent(Intent.ACTION_VIEW));
			}
		}
	}

	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent1);
        Intent intent1 = new Intent(this,Intent2Activity.class);
        startActivityForResult(intent1, restultRequestCode);
        
        btt1 = (Button)findViewById(R.id.bttcheckintent);
		btt1.setOnClickListener(new Button.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intentInfo = new Intent(Intent.ACTION_VIEW,Uri.parse("content://contacts"));
				startActivityForResult(intentInfo, restultRequestCode);
			}
		});
		
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.intent1, menu);
        return true;
    }
    
}
