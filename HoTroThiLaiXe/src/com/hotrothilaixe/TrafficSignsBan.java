package com.hotrothilaixe;

import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class TrafficSignsBan extends Activity {

	private int bien_bao_cam[] = { 0x7F020022, 0x7F020023, 0x7F020024,
			0x7F020025, 0x7F020026, 0x7F020027, 0x7F020028, 0x7F020029,
			0x7F02002A, 0x7F02002B, 0x7F02002C, 0x7F02002D, 0x7F02002E,
			0x7F02002F, 0x7F020030, 0x7F020031, 0x7F020032, 0x7F020033,
			0x7F020034, 0x7F020035, 0x7F020036, 0x7F020037, 0x7F020038,
			0x7F020039, 0x7F02003A, 0x7F02003B, 0x7F02003C, 0x7F02003D,
			0x7F02003E, 0x7F02003F, 0x7F020040, 0x7F020041, 0x7F020042,
			0x7F020043, 0x7F020044, 0x7F020045, 0x7F020046, 0x7F020047,
			0x7F020048, 0x7F020049, 0x7F02004A, 0x7F02004B, 0x7F02004C,
			0x7F02004D, 0x7F02004E, 0x7F02004F, 0x7F020050 };

	private ListView lv;
	private TrafficSignsAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_sign_ban);
		createDatabase();

		lv = (ListView) findViewById(R.id.list_signs);
		adapter = new TrafficSignsAdapter(create_List_Sign(), this,
				bien_bao_cam);
		lv.setAdapter(adapter);
		adapter.notifyDataSetChanged();
	}

	private ArrayList<Sign> create_List_Sign() {
		TrafficSignsController controller = new TrafficSignsController(
				this);
		return controller.getData("Select * from Bien_Cam");
	}

	private void createDatabase() {
		SQLiteDataController controller = new SQLiteDataController(this);
		try {
			controller.isCreatedDatabase();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
