package com.example.owner.project_final;

import android.app.FragmentManager;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Tab2Activity extends MainActivity
        implements OnMapReadyCallback {
// Error occur
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab2);

        FragmentManager fragmentManager = getFragmentManager();
        MapFragment mapFragment = (MapFragment)fragmentManager
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        LatLng GACHON = new LatLng(37.4523915, 127.1307015);

        MarkerOptions markerOptions = new MarkerOptions();
        markerOptions.position(GACHON);
        markerOptions.title("가천대학교");
        markerOptions.snippet("가천대학교 글로벌캠퍼스");
        googleMap.addMarker(markerOptions);

        googleMap.moveCamera(CameraUpdateFactory.newLatLng(GACHON));
        googleMap.animateCamera(CameraUpdateFactory.zoomTo(10));
    }
}
