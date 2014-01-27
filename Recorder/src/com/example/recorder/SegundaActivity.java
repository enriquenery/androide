package com.example.recorder;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SegundaActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_segunda);
		Intent intent = getIntent();
		String textoDeMuestra = intent.getStringExtra(Principal.EXTRA_MESSAGE);
		TextView textView = new TextView(this);
		textView.setTextSize(50);
		textView.setText(textoDeMuestra);

	
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.segunda, menu);
		return true;
	}

}
