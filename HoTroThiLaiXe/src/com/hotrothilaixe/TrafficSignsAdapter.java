package com.hotrothilaixe;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class TrafficSignsAdapter extends BaseAdapter {

	private ArrayList<Sign> s;
	Context context;
	LayoutInflater infla;
	private int bienbao[];

	public TrafficSignsAdapter(ArrayList<Sign> s, Context context) {
		super();
		this.setS(s);
		this.context = context;
		infla = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	public TrafficSignsAdapter(ArrayList<Sign> s, Context context, int[] bienbao) {
		super();
		this.setS(s);
		this.context = context;
		this.bienbao = bienbao;
		infla = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return s.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return s.get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	ImageView sign;
	TextView info;

	@Override
	public View getView(int pos, View v, ViewGroup parent) {
		// TODO Auto-generated method stub
		if (v == null) {
			v = infla.inflate(R.layout.sign_item, null);
		}

		sign = (ImageView) v.findViewById(R.id.sign);
		info = (TextView) v.findViewById(R.id.info);

		sign.setImageResource(bienbao[pos]);
		info.setText(s.get(pos).getDescription());
		return v;
	}

	public ArrayList<Sign> getS() {
		return s;
	}

	public void setS(ArrayList<Sign> s) {
		this.s = s;
	}

}
