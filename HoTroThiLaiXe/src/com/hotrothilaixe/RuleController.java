package com.hotrothilaixe;

import android.content.Context;
import android.database.Cursor;

public class RuleController extends SQLiteDataController {

	public RuleController(Context con) {
		super(con);
		// TODO Auto-generated constructor stub
	}

	public String getData(int page) {
		String content;

		try {
			openDataBase();
			Cursor cs = database.rawQuery(
					"SELECT * FROM Luat_Giao_Thong where id = " + page, null);
			cs.moveToNext();
			content = cs.getString(1);
			cs.close();
		} catch (Exception e) {
			return null;
		} finally {
			close();
		}

		return content;
	}
}
