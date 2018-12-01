package sample.Modele;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;


public class Modele_Plat {
    private SimpleStringProperty nom_plat;
    private SimpleStringProperty provenance;
    private SimpleIntegerProperty prix;


    public int getPrix() {
        return prix.get();
    }
}
