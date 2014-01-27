package com.example.recorder;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;


public class Principal extends Activity {
	
	public final static String EXTRA_MESSAGE = "com.example.recorder.MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        
      
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
    	
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }
    
    
    public void cargarActivitySegunda(View view){
		
		
		Intent intent = new Intent(this, SegundaActivity.class);
		EditText editText = (EditText)findViewById(R.id.textoEntrada);
		String string = editText.getText().toString();
		intent.putExtra(EXTRA_MESSAGE, string);
		startActivity(intent);
	}
    
}
