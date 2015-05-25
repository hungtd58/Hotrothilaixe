package com.hotrothilaixe;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

@SuppressWarnings("deprecation")
public class TrafficSigns extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_signs);

		TabHost tabhost = getTabHost();

		TabSpec dangerous = tabhost.newTabSpec("Dangerous");
		dangerous.setIndicator("Biển Nguy Hiểm");
		Intent dangerousIntent = new Intent(this, TrafficSignsDangerous.class);
		dangerous.setContent(dangerousIntent);

		TabSpec ban = tabhost.newTabSpec("Ban");
		ban.setIndicator("Biển Báo Cấm");
		Intent banIntent = new Intent(this, TrafficSignsBan.class);
		ban.setContent(banIntent);

		TabSpec instruction = tabhost.newTabSpec("Instruction");
		instruction.setIndicator("Biển Báo Chỉ dẫn");
		Intent instructionIntent = new Intent(this,
				TrafficSignsInstructions.class);
		instruction.setContent(instructionIntent);

		TabSpec command = tabhost.newTabSpec("Command");
		command.setIndicator("Biển Hiệu Lệnh");
		Intent commandIntent = new Intent(this, TrafficSignsCommand.class);
		command.setContent(commandIntent);

		tabhost.addTab(dangerous);
		tabhost.addTab(ban);
		tabhost.addTab(instruction);
		tabhost.addTab(command);

	}

}
