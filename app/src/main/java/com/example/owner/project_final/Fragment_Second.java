package com.example.owner.project_final;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Fragment_Second extends Fragment
        implements OnMapReadyCallback {

    public Fragment_Second(){

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        RelativeLayout layout=(RelativeLayout)inflater.inflate(R.layout.fragment_second, container, false);

//        FragmentManager fragmentManager=getFragmentManager();
//        SupportMapFragment mapFragment=(SupportMapFragment)fragmentManager.findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);

//        FragmentManager fragmentManager = getFragmentManager();
//        MapFragment mapFragment = (MapFragment) fragmentManager.findFragmentById(R.id.map);
//        mapFragment.getMapAsync(this);

        return layout;
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
