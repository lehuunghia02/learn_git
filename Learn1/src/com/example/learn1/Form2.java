package com.example.learn1;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class Form2 extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_form2, menu);
        return true;
    }
    
    public void showInfo(View view){
    	/*Toast t = new Toast(getApplicationContext());
    	String inform = "Toi la Le Huu Nghia ............";
    	t.setText(inform);
    	t.setDuration(inform.length());
    	t.show();*/
    	switch(view.getId())
    	{
    		case R.id.bttToast:
    			String name = "Toi khong hieu gi het";
    			Toast.makeText(this,name ,name.length()).show();
    			break;
    		case R.id.bttImage:
    			Intent intent = new Intent();
    			intent.setAction(Intent.ACTION_VIEW);
    			intent.setData(android.provider.MediaStore.Images.Media.INTERNAL_CONTENT_URI);
    			startActivity(intent);
    			break;
    		case R.id.bttContact:
    			Intent intent1 =new Intent();
    			intent1.setAction(Intent.ACTION_VIEW);
    			intent1.setData(android.provider.Contacts.People.CONTENT_URI);
    			startActivity(intent1);
    			break;
    		case R.id.bttDial:
    			Intent intent2 = new Intent();
    			intent2.setAction(Intent.ACTION_DIAL);
    			startActivity(intent2);
    			break;
    	}
    }
}
