package com.hotrothilaixe;

import java.util.ArrayList;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class QuestionAdapter extends ArrayAdapter<Question> {

	static class ViewHolder4 {
		protected TextView questionNumber;
		protected ImageView image;
		protected TextView question;
		protected RadioGroup radioGroup;
		protected RadioButton ans_A;
		protected RadioButton ans_B;
		protected RadioButton ans_C;
		protected RadioButton ans_D;
	}

	static class ViewHolder3 {
		protected TextView questionNumber;
		protected ImageView image;
		protected TextView question;
		protected RadioGroup radioGroup;
		protected RadioButton ans_A;
		protected RadioButton ans_B;
		protected RadioButton ans_C;
	}

	static class ViewHolder2 {
		protected TextView questionNumber;
		protected ImageView image;
		protected TextView question;
		protected RadioGroup radioGroup;
		protected RadioButton ans_A;
		protected RadioButton ans_B;
	}

	public static ArrayList<Question> list;
	Activity context;

	public QuestionAdapter(Activity context, int resource,
			ArrayList<Question> list) {
		super(context, R.layout.sahinh_question);
		this.context = context;
		this.list = list;
	}

	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Question getItem(int position) {
		return list.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {

		View v = convertView;

		ViewHolder2 viewholder2 = new ViewHolder2();
		ViewHolder3 viewholder3 = new ViewHolder3();
		ViewHolder4 viewholder4 = new ViewHolder4();
		Question item = list.get(position);
		if (v == null) {
			if (getItemViewType(position) == 0) {

				LayoutInflater inflater = context.getLayoutInflater();
				v = inflater.inflate(R.layout.sahinh_question_2, parent, false);
				viewholder2.questionNumber = (TextView) v
						.findViewById(R.id.questionNumber);
				viewholder2.question = (TextView) v.findViewById(R.id.question);
				viewholder2.radioGroup = (RadioGroup) v
						.findViewById(R.id.radio_group_test);
				viewholder2.ans_A = (RadioButton) v.findViewById(R.id.answer_a);
				viewholder2.ans_B = (RadioButton) v.findViewById(R.id.answer_b);
				viewholder2.image = (ImageView) v
						.findViewById(R.id.sahinh_image);
				v.setTag(viewholder2);

				viewholder2.radioGroup
						.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

							@Override
							public void onCheckedChanged(RadioGroup group,
									int checkedId) {
								// TODO Auto-generated method stub
								Integer pos = (Integer) group.getTag();

								switch (checkedId) {
								case R.id.answer_a:
									list.get(pos).current = Question.ANSWER_ONE_SELECTED;
									break;

								case R.id.answer_b:
									list.get(pos).current = Question.ANSWER_TWO_SELECTED;
									break;
								}
							}
						});
				viewholder2.radioGroup.setTag(position);

			}

			if (getItemViewType(position) == 1) {

				LayoutInflater inflater = context.getLayoutInflater();
				v = inflater.inflate(R.layout.sahinh_question_3, parent, false);
				viewholder3.questionNumber = (TextView) v
						.findViewById(R.id.questionNumber);
				viewholder3.question = (TextView) v.findViewById(R.id.question);
				viewholder3.radioGroup = (RadioGroup) v
						.findViewById(R.id.radio_group_test);
				viewholder3.ans_A = (RadioButton) v.findViewById(R.id.answer_a);
				viewholder3.ans_B = (RadioButton) v.findViewById(R.id.answer_b);
				viewholder3.ans_C = (RadioButton) v.findViewById(R.id.answer_c);
				viewholder3.image = (ImageView) v
						.findViewById(R.id.sahinh_image);
				v.setTag(viewholder3);
				viewholder3.radioGroup
						.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

							@Override
							public void onCheckedChanged(RadioGroup group,
									int checkedId) {
								// TODO Auto-generated method stub
								Integer pos = (Integer) group.getTag();

								switch (checkedId) {
								case R.id.answer_a:
									list.get(pos).current = Question.ANSWER_ONE_SELECTED;
									break;

								case R.id.answer_b:
									list.get(pos).current = Question.ANSWER_TWO_SELECTED;
									break;

								case R.id.answer_c:
									list.get(pos).current = Question.ANSWER_THREE_SELECTED;
									break;

								}
							}
						});
				viewholder3.radioGroup.setTag(position);

			}

			if (getItemViewType(position) == 2) {

				LayoutInflater inflater = context.getLayoutInflater();
				v = inflater.inflate(R.layout.sahinh_question, parent, false);
				viewholder4.questionNumber = (TextView) v
						.findViewById(R.id.questionNumber);
				viewholder4.question = (TextView) v.findViewById(R.id.question);
				viewholder4.radioGroup = (RadioGroup) v
						.findViewById(R.id.radio_group_test);
				viewholder4.ans_A = (RadioButton) v.findViewById(R.id.answer_a);
				viewholder4.ans_B = (RadioButton) v.findViewById(R.id.answer_b);
				viewholder4.ans_C = (RadioButton) v.findViewById(R.id.answer_c);
				viewholder4.ans_D = (RadioButton) v.findViewById(R.id.answer_d);
				viewholder4.image = (ImageView) v
						.findViewById(R.id.sahinh_image);
				v.setTag(viewholder4);
				viewholder4.radioGroup
						.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

							@Override
							public void onCheckedChanged(RadioGroup group,
									int checkedId) {
								// TODO Auto-generated method stub
								Integer pos = (Integer) group.getTag();

								switch (checkedId) {
								case R.id.answer_a:
									list.get(pos).current = Question.ANSWER_ONE_SELECTED;
									break;

								case R.id.answer_b:
									list.get(pos).current = Question.ANSWER_TWO_SELECTED;
									break;

								case R.id.answer_c:
									list.get(pos).current = Question.ANSWER_THREE_SELECTED;
									break;

								case R.id.answer_d:
									list.get(pos).current = Question.ANSWER_FOUR_SELECTED;
									break;

								}
							}
						});
				viewholder4.radioGroup.setTag(position);
			}
		} else {
			switch (getItemViewType(position)) {
			case 0:
				viewholder2 = (ViewHolder2) v.getTag();
				break;

			case 1:
				viewholder3 = (ViewHolder3) v.getTag();
				break;

			case 2:
				viewholder4 = (ViewHolder4) v.getTag();
				break;
			}

		}
		switch (getItemViewType(position)) {
		case 0:
			viewholder2.questionNumber.setText("Câu " + (position + 1));
			viewholder2.question.setText(item.getContent());
			viewholder2.ans_A.setText(item.getAns_A());
			viewholder2.ans_B.setText(item.getAns_B());
			viewholder2.radioGroup.setTag(position);
			if (position >= 10) {
				viewholder2.image.setImageResource(item.getImgID());
			}
			if (list.get(position).current == Question.NONE) {
				viewholder2.radioGroup.clearCheck();
			}
			break;

		case 1:
			viewholder3.questionNumber.setText("Câu " + (position + 1));
			viewholder3.question.setText(item.getContent());
			viewholder3.ans_A.setText(item.getAns_A());
			viewholder3.ans_B.setText(item.getAns_B());
			viewholder3.ans_C.setText(item.getAns_C());
			viewholder3.radioGroup.setTag(position);
			if (position >= 10) {
				viewholder3.image.setImageResource(item.getImgID());
			} 
			if (list.get(position).current == Question.NONE) {
				viewholder3.radioGroup.clearCheck();
			}
			break;

		case 2:
			viewholder4.questionNumber.setText("Câu " + (position + 1));
			viewholder4.question.setText(item.getContent());
			viewholder4.ans_A.setText(item.getAns_A());
			viewholder4.ans_B.setText(item.getAns_B());
			viewholder4.ans_C.setText(item.getAns_C());
			viewholder4.ans_D.setText(item.getAns_D());
			viewholder4.radioGroup.setTag(position);
			if (position >= 10) {
				viewholder4.image.setImageResource(item.getImgID());
			} 
			if (list.get(position).current == Question.NONE) {
				viewholder4.radioGroup.clearCheck();
			}
			break;
		}
		return v;
	}

	@Override
	public int getItemViewType(int position) {

		if (list.get(position).getNum_q() == 2)
			return 0;
		if (list.get(position).getNum_q() == 3)
			return 1;
		return 2;
	}

	@Override
	public int getViewTypeCount() {
		return 3;
	}

}