package Modele;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleStringProperty;

import java.util.LinkedList;

public class Modele_DL {
    private SimpleStringProperty destination;

    private IntegerProperty benefices;
    private Modele_Etudiant ME;
    private LinkedList<Modele_Commande> commandes_contenus = new LinkedList<>();

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
        return benefices.get();
    }

    public IntegerProperty beneficesProperty() {
        return benefices;
    }

    public void setBenefices(int benefices) {
        this.benefices.set(benefices);
    }

    public Modele_Etudiant getME() {
        return ME;
    }

    public void setME(Modele_Etudiant ME) {
        this.ME = ME;
    }
}
