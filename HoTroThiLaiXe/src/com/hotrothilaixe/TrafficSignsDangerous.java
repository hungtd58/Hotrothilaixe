package com.hotrothilaixe;

import java.io.IOException;
import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class TrafficSignsDangerous extends Activity {

	ListView lv;
	TrafficSignsAdapter adapter;

	private int[] bien_bao_nguy_hiem = { 0x7F020051, 0x7F020052, 0x7F020053,
			0x7F020054, 0x7F020055, 0x7F020056, 0x7F020057, 0x7F020058,
			0x7F020059, 0x7F02005A, 0x7F02005B, 0x7F02005C, 0x7F02005D,
			0x7F02005E, 0x7F02005F, 0x7F020060, 0x7F020061, 0x7F020062,
			0x7F020063, 0x7F020064, 0x7F020065, 0x7F020066, 0x7F020067,
			0x7F020068, 0x7F020069, 0x7F02006A, 0x7F02006B, 0x7F02006C,
			0x7F02006D, 0x7F02006E, 0x7F02006F, 0x7F020070, 0x7F020071,
			0x7F020072, 0x7F020073, 0x7F020074, 0x7F020075, 0x7F020076,
			0x7F020077, 0x7F020078, 0x7F020079, 0x7F02007A, 0x7F02007B,
			0x7F02007C, 0x7F02007D, 0x7F02007E, 0x7F02007F, 0x7F020080,
			0x7F020081, 0x7F020082, 0x7F020083, 0x7F020084, 0x7F020085,
			0x7F020086, 0x7F020087, 0x7F020088, 0x7F020089, 0x7F02008A,
			0x7F02008B, 0x7F02008C, };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_sign_dangerous);
		createDatabase();

		lv = (ListView) findViewById(R.id.list_signs);
		adapter = new TrafficSignsAdapter(create_List_Sign(), this,
				bien_bao_nguy_hiem);
		lv.setAdapter(adapter);
		adapter.notifyDataSetChanged();
	}

	private ArrayList<Sign> create_List_Sign() {
		TrafficSignsController controller = new TrafficSignsController(
				this);
		return controller.getData("Select * from Bien_bao_nguy_hiem");
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
