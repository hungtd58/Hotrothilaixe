package com.hotrothilaixe;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class RuleInfomation extends Activity {

	TextView content;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_rule_infomation);

		int selected = getIntent().getExtras().getInt("Code");

		RuleController r = new RuleController(this);
		String s = r.getData(selected);

		content = (TextView) findViewById(R.id.content);
		content.setText(s);
	}

}
