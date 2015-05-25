package com.hotrothilaixe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

	Button btn_study, btn_License, btn_Rule, btn_Giaitri, btn_Help, btn_Place;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		btn_study = (Button) findViewById(R.id.btn_study);
		btn_License = (Button) findViewById(R.id.btn_License);
		btn_Rule = (Button) findViewById(R.id.btn_Rule);
		btn_Giaitri = (Button) findViewById(R.id.btn_Giaitri);
		btn_Help = (Button) findViewById(R.id.btn_Help);
		btn_Place = (Button) findViewById(R.id.btn_Place);
		
		btn_study.setOnClickListener(this);
		btn_License.setOnClickListener(this);
		btn_Rule.setOnClickListener(this);
		btn_Giaitri.setOnClickListener(this);
		btn_Help.setOnClickListener(this);
		btn_Place.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn_study:
			startStudy();
			break;
		case R.id.btn_Giaitri:
			startGiaitri();
			break;
		case R.id.btn_License:
			startLicense();
			break;
		case R.id.btn_Rule:
			startRule();
			break;
		case R.id.btn_Help:
			startHelp();
			break;
		case R.id.btn_Place:
			Intent place = new Intent(MainActivity.this, TestPlace.class);
			startActivity(place);
			break;
		}
	}

	private void startHelp() {
		Intent help = new Intent(MainActivity.this, Contact.class);
		startActivity(help);
	}
	private void startRule() {
		Intent rule = new Intent(MainActivity.this, TrafficSigns.class);
		startActivity(rule);
	}

	private void startLicense() {
		Intent license = new Intent(MainActivity.this, Rule.class);
		startActivity(license);
	}

	private void startGiaitri() {
		Intent giaitri = new Intent(MainActivity.this, Entertainment.class);
		startActivity(giaitri);
	}

	private void startStudy() {
		Intent stduy = new Intent(MainActivity.this, QuestionTest.class);
		startActivity(stduy);
	}
}