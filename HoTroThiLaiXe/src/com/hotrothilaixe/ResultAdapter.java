package com.hotrothilaixe;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultAdapter extends BaseAdapter {

	private ArrayList<String> list;
	LayoutInflater inflater;
	Context con;

	public ResultAdapter(ArrayList<String> list, Context con) {
		super();
		this.list = list;
		this.con = con;
		inflater = (LayoutInflater) con
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	@Override
	public Object getItem(int pos) {
		// TODO Auto-generated method stub
		return list.get(pos);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	TextView numQ;
	ImageView result;
	@Override
	public View getView(int pos, View v, ViewGroup arg2) {
		// TODO Auto-generated method stub
		if (v == null) {
			v = inflater.inflate(R.layout.grid_item, null);
		}
		
		numQ = (TextView) v.findViewById(R.id.numQ);
		result = (ImageView) v.findViewById(R.id.result);

		numQ.setText("Câu " + (pos+1)  );
		if(list.get(pos).equals("T")){
			result.setImageResource(R.drawable.xtrue);
		}
		else result.setImageResource(R.drawable.xfalse);
		return v;
	}

	public ArrayList<String> getResult() {
		return list;
	}

	public void setResult(ArrayList<String> list) {
		this.list = list;
	}

}
