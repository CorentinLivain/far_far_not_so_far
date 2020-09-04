package com.example.lejeu;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class Balise {

    MapsActivity context;
    LatLng coordonnees;
    String titre;
    boolean valide;
    Marker marqueur;
    int numero;

    public Balise(MapsActivity context, LatLng coordonnees, String titre, int numero) {
        this.context = context;
        this.coordonnees = coordonnees;
        this.titre = titre;
        this.valide = false;
        this.marqueur = null;
        this.numero = numero;
    }

    public void creerMarqueur(GoogleMap pMap) {
        marqueur = pMap.addMarker(new MarkerOptions()
                .position(coordonnees)
                .title(titre));
    }

    /*public void validerBalise() {
        valide = true;
        marqueur.setIcon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_GREEN));
    }*/
}