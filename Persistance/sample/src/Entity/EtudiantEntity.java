package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ETUDIANT", schema = "ADMIN", catalog = "")
public class EtudiantEntity {
    private String matricule;
    private String nom;
    private String prenom;
    private String motdepasse;

    @Override
    public String toString() {
        return nom + prenom;
    }

    @Id
    @Column(name = "MATRICULE")
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Basic
    @Column(name = "NOM")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "PRENOM")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "MOTDEPASSE")
    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtudiantEntity that = (EtudiantEntity) o;
        return Objects.equals(matricule, that.matricule) &&
                Objects.equals(nom, that.nom) &&
                Objects.equals(prenom, that.prenom) &&
                Objects.equals(motdepasse, that.motdepasse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, nom, prenom, motdepasse);
    }
}
