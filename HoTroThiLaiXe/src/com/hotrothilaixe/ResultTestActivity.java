package com.hotrothilaixe;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.GridView;

public class ResultTestActivity extends Activity {

	GridView gridData;
	ResultAdapter adapter;
	Button btnFinsh;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_result_test);
		btnFinsh = (Button) findViewById(R.id.btnFinsh);
		
		ArrayList<String> rs = getIntent().getStringArrayListExtra("result");
		
		gridData = (GridView) findViewById(R.id.gridData);
		adapter = new ResultAdapter(rs, this);
		gridData.setAdapter(adapter);
		adapter.notifyDataSetChanged();
		
		btnFinsh.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				onBackPressed();
				onBackPressed();
			}
		});
	}
}
