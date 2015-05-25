package com.hotrothilaixe;

import com.google.android.gms.maps.*;
import com.google.android.gms.maps.model.*;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

public class TestPlace extends Activity implements OnMapReadyCallback {

	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_test_place);

		MapFragment mapFragment = ((MapFragment) getFragmentManager()
				.findFragmentById(R.id.map));
		mapFragment.getMapAsync(this);
	}

	@Override
	public void onMapReady(GoogleMap map) {
		LatLng diemthiso1 = new LatLng(20.998590, 105.819877);
		LatLng diemthiso2 = new LatLng(21.001349, 105.795298);
		map.setMyLocationEnabled(true);
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(diemthiso1, 13));
		map.moveCamera(CameraUpdateFactory.newLatLngZoom(diemthiso2, 13));
		map.addMarker(new MarkerOptions().title("Địa điểm thi số 1")
				.snippet("101 Tô Vĩnh Diện").position(diemthiso1));
		map.addMarker(new MarkerOptions().title("Địa điểm thi số 2")
				.snippet("243 Khuất Duy Tiến, ĐH Phòng Cháy Chữa Cháy")
				.position(diemthiso2));
	}
}