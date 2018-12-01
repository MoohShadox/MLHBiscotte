package sample.Modele;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Modele_Plat {
    private SimpleStringProperty nom_plat;
    private SimpleStringProperty provenance;
    private SimpleIntegerProperty prix;

    public Modele_Plat(String nom_plat, String provenance, int prix) {
        this.nom_plat = new SimpleStringProperty(nom_plat);
        this.provenance = new SimpleStringProperty(provenance);
        this.prix = new SimpleIntegerProperty(prix);
    }


    public int getPrix() {
        return prix.get();
    }
}
