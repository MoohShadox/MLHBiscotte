package sample.Modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.LinkedList;

public class Modele_DL {
    private SimpleStringProperty destination;
    private SimpleBooleanProperty selected;
    private Modele_Etudiant ME;
    private LinkedList<Modele_Commande> commandes_contenus = new LinkedList<>();

    public Modele_DL(String destination,Modele_Etudiant ME){
        this.destination = new SimpleStringProperty(destination);
        this.ME = ME;
    }

    public void add_commande(Modele_Commande MC){
        commandes_contenus.add(MC);
    }

    public boolean isSelected() {
        return selected.get();
    }

    public SimpleBooleanProperty selectedProperty() {
        return selected;
    }

    public LinkedList<Modele_Commande> getCommandes_contenus() {
        return commandes_contenus;
    }

    public String getDestination() {
        return destination.get();
    }

    public SimpleStringProperty destinationProperty() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination.set(destination);
    }

    public int getBenefices() {
        int i=0;
        for (Modele_Commande MC:commandes_contenus)
        {
            i += MC.getPrixTotal();
        }
        return i;
    }

    public IntegerProperty beneficesProperty() {
        return new SimpleIntegerProperty(getBenefices());
    }


    public Modele_Etudiant getME() {
        return ME;
    }

    public void setME(Modele_Etudiant ME) {
        this.ME = ME;
    }
}
