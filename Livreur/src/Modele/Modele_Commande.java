package Modele;

import javafx.beans.property.SimpleStringProperty;

import java.util.LinkedList;

public class Modele_Commande {
    private SimpleStringProperty numero_commande;
    private SimpleStringProperty position;
    private Modele_Etudiant emetteur;
    private LinkedList<Modele_Plat> plats_demandes;

    public int getNbPlats(){
        return plats_demandes.size();
    }

    public int getPrixTotal(){
        int i = 0;
        for (Modele_Plat MP:plats_demandes){
            i+= MP.getPrix();
        }
        return i;
    }

}
