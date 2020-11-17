package com.marcelolissa.myapplication;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private int caso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        Bundle mapa = getIntent().getExtras();
        caso =  mapa.getInt("lugar");

    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        switch (caso){
            case 1:
                // Add a marker in Sydney and move the camera
                LatLng chajari = new LatLng(-30.754670789883033, -57.98455238342286);
                mMap.addMarker(new MarkerOptions().position(chajari).title("Marker in Sydney"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(chajari));
                break;
            case 2:
                // Add a marker in Sydney and move the camera
                LatLng parana = new LatLng(-31.742547723791088, -60.517973899841316);
                mMap.addMarker(new MarkerOptions().position(parana).title("Marker in Sydney"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(parana));
                break;
            case 3:
                // Add a marker in Sydney and move the camera
                LatLng concordia = new LatLng(-31.373718178573988, -58.02098751068115);
                mMap.addMarker(new MarkerOptions().position(concordia).title("Marker in Sydney"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(concordia));
                break;
            case 4:
                // Add a marker in Sydney and move the camera
                LatLng federacion = new LatLng(-30.985997816992928, -57.92005062103272);
                mMap.addMarker(new MarkerOptions().position(federacion).title("Marker in Sydney"));
                mMap.moveCamera(CameraUpdateFactory.newLatLng(federacion));
                break;
            default:
                break;

        }

    }
}