package sample.Modele;

import javafx.beans.property.SimpleStringProperty;

import java.util.LinkedList;

public class Modele_Commande {
    private SimpleStringProperty numero_commande;
    private SimpleStringProperty position;
    private Modele_Etudiant emetteur;
    private LinkedList<Modele_Plat> plats_demandes = new LinkedList<>();

    public Modele_Commande(String numero_commande, String position, Modele_Etudiant emetteur) {
        this.numero_commande = new SimpleStringProperty(numero_commande);
        this.position = new SimpleStringProperty(position);
        this.emetteur = emetteur;
    }
    public void add_plat(Modele_Plat MP){
        plats_demandes.add(MP);
    }

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
