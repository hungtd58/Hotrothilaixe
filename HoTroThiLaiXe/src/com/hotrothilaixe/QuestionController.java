package com.hotrothilaixe;

import java.util.ArrayList;
import java.util.Random;
//import java.util.Random;
import android.content.Context;
import android.database.Cursor;

public class QuestionController extends SQLiteDataController {

	public QuestionController(Context con) {
		super(con);
		// TODO Auto-generated constructor stub
	}

	int Question_id[] = { 0x7F0200DD, 0x7F0200DE, 0x7F0200DF, 0x7F0200E0,
			0x7F0200E1, 0x7F0200E2, 0x7F0200E3, 0x7F0200E4, 0x7F0200E5,
			0x7F0200E6, 0x7F0200E7, 0x7F0200E8, 0x7F0200E9, 0x7F0200EA,
			0x7F0200EB, 0x7F0200EC, 0x7F0200ED, 0x7F0200EE, 0x7F0200EF,
			0x7F0200F0, 0x7F0200F1, 0x7F0200F2, 0x7F0200F3, 0x7F0200F4,
			0x7F0200F5, 0x7F0200F6, 0x7F0200F7, 0x7F0200F8, 0x7F0200F9,
			0x7F0200FA, 0x7F0200FB, 0x7F0200FC, 0x7F0200FD, 0x7F0200FE,
			0x7F0200FF, 0x7F020100, 0x7F020101, 0x7F020102, 0x7F020103,
			0x7F020104, 0x7F020105, 0x7F020106, 0x7F020107, 0x7F020108,
			0x7F020109, 0x7F02010A, 0x7F02010B, 0x7F02010C, 0x7F02010D,
			0x7F02010E };

	private int number_random(int number) {
		Random rd = new Random();
		int numbera = rd.nextInt(number);
		return numbera;
	}

	private int[] create_random(int number) {
		int random[] = new int[10];

		for (int i = 0; i < 10; i++) {

			random[i] = number_random(number);
			for (int j = 0; j < i; j++) {
				if (random[i] == random[j]) {
					i--;
					break;
				}
			}
		}

		return random;
	}

	public ArrayList<Question> getData() {
		ArrayList<Question> data = new ArrayList<Question>();

		try {
			openDataBase();
			Cursor cs1 = database.rawQuery("SELECT * FROM question", null);
			Question q;

			int random[] = create_random(106);
			while (cs1.moveToNext()) {
				for (int i = 0; i < random.length; i++) {
					if (cs1.getInt(0) == random[i]) {
						q = new Question(cs1.getInt(0), cs1.getString(1),
								cs1.getString(2), cs1.getString(3),
								cs1.getString(4), cs1.getString(5),
								cs1.getString(6), cs1.getInt(7), -1);
						data.add(q);
					}
				}
			}
			cs1.close();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			close();
		}

		try {
			openDataBase();
			Cursor cs = database.rawQuery("SELECT * FROM Sa_hinh", null);
			Question q;

			int random[] = create_random(50);
			while (cs.moveToNext()) {
				for (int i = 0; i < random.length; i++) {
					if (cs.getInt(0) == random[i]) {
						q = new Question(cs.getInt(0), cs.getString(1),
								cs.getString(2), cs.getString(3),
								cs.getString(4), cs.getString(5),
								cs.getString(6), cs.getInt(7),
								Question_id[(cs.getInt(0) - 1)]);
						data.add(q);
					}
				}

			}
			cs.close();
		} catch (Exception e) {
			data = null;
		} finally {
			close();
		}

		return data;
	}

}
