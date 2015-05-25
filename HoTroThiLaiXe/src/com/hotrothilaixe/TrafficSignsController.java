package com.hotrothilaixe;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;

public class TrafficSignsController extends SQLiteDataController{
	public TrafficSignsController(Context con) {
		super(con);
		// TODO Auto-generated constructor stub
	}

	public ArrayList<Sign> getData(String str) {
		ArrayList<Sign> data = new ArrayList<Sign>();

		try {
			openDataBase();
			Sign t;
			Cursor cs = database.rawQuery(str,
					null);
			// cs.moveToFirst();
			while (cs.moveToNext()) {
				t = new Sign(cs.getInt(0), cs.getString(1));
				data.add(t);
			}
			cs.close();
		} catch (Exception e) {
			// TODO: handle exception
			data = null;
		} finally {
			close();
		}

		return data;
	}
}
