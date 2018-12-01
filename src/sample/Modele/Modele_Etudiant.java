package sample.Modele;

import javafx.beans.property.SimpleStringProperty;

public class Modele_Etudiant {
    private SimpleStringProperty nom;
    private SimpleStringProperty prenom;
    private SimpleStringProperty matricule;
    private SimpleStringProperty mdp;

    public Modele_Etudiant(String nom,String prenom,String matricule,String mdp){
        this.nom = new SimpleStringProperty(nom);
        this.prenom = new SimpleStringProperty(prenom);
        this.matricule = new SimpleStringProperty(matricule);
        this.mdp = new SimpleStringProperty(mdp);
    }

    public String getNom() {
        return nom.get();
    }

    public SimpleStringProperty nomProperty() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom.set(nom);
    }

    public String getPrenom() {
        return prenom.get();
    }

    public SimpleStringProperty prenomProperty() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom.set(prenom);
    }

    public String getMatricule() {
        return matricule.get();
    }

    public SimpleStringProperty matriculeProperty() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule.set(matricule);
    }

    public String getMdp() {
        return mdp.get();
    }

    public SimpleStringProperty mdpProperty() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp.set(mdp);
    }
}
