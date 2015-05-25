package com.hotrothilaixe;

import java.io.IOException;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class QuestionTest extends Activity implements OnClickListener {

	int numberQuestion;
	ListView lvData, lvSahinh;
	QuestionAdapter adapter;

	Button done;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_question_test);
		numberQuestion = getData().size();
		done = (Button) findViewById(R.id.done);
		done.setOnClickListener(this);

		createDatabase();

		lvData = (ListView) findViewById(R.id.list_sahinh);
		lvSahinh = (ListView) findViewById(R.id.list_sahinh);

		adapter = new QuestionAdapter(QuestionTest.this,
				R.layout.sahinh_question, getData());

		lvData.setAdapter(adapter);

		adapter.notifyDataSetChanged();
	}

	private void createDatabase() {
		SQLiteDataController controller = new SQLiteDataController(this);
		try {
			controller.isCreatedDatabase();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private ArrayList<Question> getData() {
		QuestionController controller = new QuestionController(this);
		return controller.getData();
	}

	@Override
	public void onClick(View v) {
		switch (v.getId()) {
		// case R.id.back:
		// onBackPressed();
		// break;

		case R.id.done:
			done();
			break;
		}
	}

	private ArrayList<String> getMark() {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < numberQuestion; i++) {
			if (!(QuestionAdapter.list.get(i).current).equals(Question.NONE)
					&& (QuestionAdapter.list.get(i).current)
							.equals(QuestionAdapter.list.get(i).getResult())){
				String t = "T";
				result.add(t);
			} else {
				String f = "F";
				result.add(f);
			}
				
		}
		return result;
	}

	private void done() {
		Intent intent = new Intent(this, ResultTestActivity.class);
		intent.putStringArrayListExtra("result", getMark());
		startActivity(intent);
	}
}
