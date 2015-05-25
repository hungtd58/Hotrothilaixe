package com.hotrothilaixe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;

public class Rule extends Activity implements OnClickListener {

	Button chuong_1, chuong_2, chuong_3, chuong_4, chuong_5, chuong_6,
			chuong_7, chuong_8;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_rule);
		chuong_1 = (Button) findViewById(R.id.chuong_1);
		chuong_2 = (Button) findViewById(R.id.chuong_2);
		chuong_3 = (Button) findViewById(R.id.chuong_3);
		chuong_4 = (Button) findViewById(R.id.chuong_4);
		chuong_5 = (Button) findViewById(R.id.chuong_5);
		chuong_6 = (Button) findViewById(R.id.chuong_6);
		chuong_7 = (Button) findViewById(R.id.chuong_7);
		chuong_8 = (Button) findViewById(R.id.chuong_8);

		chuong_1.setOnClickListener(this);
		chuong_2.setOnClickListener(this);
		chuong_3.setOnClickListener(this);
		chuong_4.setOnClickListener(this);
		chuong_5.setOnClickListener(this);
		chuong_6.setOnClickListener(this);
		chuong_7.setOnClickListener(this);
		chuong_8.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {

		switch (v.getId()) {
		case R.id.chuong_1:
			Intent detail1 = new Intent(this, RuleInfomation.class);
			detail1.putExtra("Code", 1);
			startActivity(detail1);
			break;

		case R.id.chuong_2:
			Intent detail2 = new Intent(this, RuleInfomation.class);
			detail2.putExtra("Code", 2);
			startActivity(detail2);
			break;
		case R.id.chuong_3:
			Intent detail3 = new Intent(this, RuleInfomation.class);
			detail3.putExtra("Code", 3);
			startActivity(detail3);
			break;
		case R.id.chuong_4:
			Intent detail4 = new Intent(this, RuleInfomation.class);
			detail4.putExtra("Code", 4);
			startActivity(detail4);
			break;
		case R.id.chuong_5:
			Intent detail5 = new Intent(this, RuleInfomation.class);
			detail5.putExtra("Code", 5);
			startActivity(detail5);
			break;
		case R.id.chuong_6:
			Intent detail6 = new Intent(this, RuleInfomation.class);
			detail6.putExtra("Code", 6);
			startActivity(detail6);
			break;
		case R.id.chuong_7:
			Intent detail7 = new Intent(this, RuleInfomation.class);
			detail7.putExtra("Code", 7);
			startActivity(detail7);
			break;
		case R.id.chuong_8:
			Intent detail8 = new Intent(this, RuleInfomation.class);
			detail8.putExtra("Code", 8);
			startActivity(detail8);
			break;
		}
	}
}
