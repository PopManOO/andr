package com.mycompany.myapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formation_442);	
		Button g = (Button) findViewById(R.id.btnGDB);
			
		g.setOnClickListener(new View.OnClickListener(){		
				public void onClick(View p1){
					Intent i = new Intent(MainActivity.this, action.class);
					startActivity(i);
				}
		});
    }
}
