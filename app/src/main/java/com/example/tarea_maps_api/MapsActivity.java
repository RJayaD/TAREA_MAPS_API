package com.example.tarea_maps_api;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.Polyline;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);

        mapFragment.getMapAsync(this);
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

        // Add a marker in Sydney and move the camera
        Market(googleMap);
        Polyg(googleMap);
    }

    public void Market(GoogleMap googleMap)
    {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        final LatLng puntoFCI = new LatLng(-1.0126056,-79.4706553);
        final LatLng puntoUTEQ = new LatLng(-1.0124661,-79.4706339);
        final LatLng puntoFCA = new LatLng(-1.0130113,-79.4689984);
        final LatLng puntoRect = new LatLng(-1.012914,-79.4693276);
        final LatLng puntoAdit = new LatLng(-1.012986, -79.467702);
        final LatLng puntoPark = new LatLng(-1.012417, -79.467697);
        final LatLng puntoBibl = new LatLng(-1.012379, -79.468452);
        final LatLng puntoInsti = new LatLng(-1.012222, -79.469695);
        final LatLng puntoFCE = new LatLng(-1.012143, -79.470147);
        final LatLng puntoComed = new LatLng(-1.012918, -79.469982);
        final LatLng puntoFCAmb = new LatLng(-1.012679, -79.471108);

        mMap.addMarker(new MarkerOptions().position(puntoFCI).title("FCI"));
        mMap.addMarker(new MarkerOptions().position(puntoFCA).title("U.PostGrado"));
        mMap.addMarker(new MarkerOptions().position(puntoRect).title("FC. AgrariasRectorado"));
        mMap.addMarker(new MarkerOptions().position(puntoAdit).title("Aditurium"));
        mMap.addMarker(new MarkerOptions().position(puntoPark).title("Parqueadero"));
        mMap.addMarker(new MarkerOptions().position(puntoBibl).title("Biblioteca"));
        mMap.addMarker(new MarkerOptions().position(puntoInsti).title("Instituto de Inform."));
        mMap.addMarker(new MarkerOptions().position(puntoFCE).title("FCE"));
        mMap.addMarker(new MarkerOptions().position(puntoComed).title("Comedor D'Scarlet"));
        mMap.addMarker(new MarkerOptions().position(puntoFCAmb).title("FC. Ambientales"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(puntoUTEQ));
        mMap.getUiSettings().setZoomControlsEnabled(true);

    }

    public void Polyg(GoogleMap googleMap)
    {
        Polyline polyline1 = googleMap.addPolyline(new PolylineOptions()
                .clickable(true)
                .add(
                        new LatLng(-1.012290, -79.467211),
                        new LatLng(-1.013216, -79.467286),
                        new LatLng(-1.012969, -79.471844),
                        new LatLng(-1.0118206,-79.4718925),
                        new LatLng(-1.012290, -79.467211)
                ));
    }
}