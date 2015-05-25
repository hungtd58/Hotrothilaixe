package com.hotrothilaixe;

import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class TrafficSignsInstructions extends Activity {

	private int bien_bao_chi_dan[] = { 0x7F02009F, 0x7F0200A0, 0x7F0200A1,
			0x7F0200A2, 0x7F0200A3, 0x7F0200A4, 0x7F0200A5, 0x7F0200A6,
			0x7F0200A7, 0x7F0200A8, 0x7F0200A9, 0x7F0200AA, 0x7F0200AB,
			0x7F0200AC, 0x7F0200AD, 0x7F0200AE, 0x7F0200AF, 0x7F0200B0,
			0x7F0200B1, 0x7F0200B2, 0x7F0200B3, 0x7F0200B4, 0x7F0200B5,
			0x7F0200B6, 0x7F0200B7, 0x7F0200B8, 0x7F0200B9, 0x7F0200BA,
			0x7F0200BB, 0x7F0200BC, 0x7F0200BD, 0x7F0200BE, 0x7F0200BF,
			0x7F0200C0, 0x7F0200C1, 0x7F0200C2, 0x7F0200C3, 0x7F0200C4,
			0x7F0200C5, 0x7F0200C6, 0x7F0200C7, 0x7F0200C8, 0x7F0200C9,
			0x7F0200CA, 0x7F0200CB, 0x7F0200CC, 0x7F0200CD, 0x7F0200CE,
			0x7F0200CF, 0x7F0200D0, 0x7F0200D1, 0x7F0200D2, 0x7F0200D3,
			0x7F0200D4, 0x7F0200D5, 0x7F0200D6, 0x7F0200D7, 0x7F0200D8,
			0x7F0200D9, 0x7F0200DA };

	private ListView lv;
	private TrafficSignsAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_signs_instructions);
		createDatabase();

		lv = (ListView) findViewById(R.id.list_signs);
		adapter = new TrafficSignsAdapter(create_List_Sign(), this,
				bien_bao_chi_dan);
		lv.setAdapter(adapter);
		adapter.notifyDataSetChanged();
	}

	private ArrayList<Sign> create_List_Sign() {
		TrafficSignsController controller = new TrafficSignsController(this);
		return controller.getData("Select * from Bien_chi_dan");
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
