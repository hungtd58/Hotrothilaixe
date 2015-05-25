package com.hotrothilaixe;

import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ListView;

public class TrafficSignsCommand extends Activity {

	private int bien_bao_hieu_lenh[] = { 0x7F02008D, 0x7F02008E, 0x7F02008F,
			0x7F020090, 0x7F020091, 0x7F020092, 0x7F020093, 0x7F020094,
			0x7F020095, 0x7F020096, 0x7F020097, 0x7F020098, 0x7F020099,
			0x7F02009A, 0x7F02009B, 0x7F02009C, 0x7F02009D, 0x7F02009E };

	private ListView lv;
	private TrafficSignsAdapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_traffic_signs_command);
		createDatabase();
		
		lv = (ListView) findViewById(R.id.list_signs);
		adapter = new TrafficSignsAdapter(create_List_Sign(), this,
				bien_bao_hieu_lenh);
		lv.setAdapter(adapter);
		adapter.notifyDataSetChanged();
	}

	private ArrayList<Sign> create_List_Sign() {
		TrafficSignsController controller = new TrafficSignsController(this);
		return controller.getData("Select * from Bien_hieu_lenh");
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
