package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ETUDIANT_LIVRAISON", schema = "ADMIN", catalog = "")
@IdClass(EtudiantLivraisonEntityPK.class)
public class EtudiantLivraisonEntity {
    private String matricule;
    private String numdemande;

    @Id
    @Column(name = "MATRICULE")
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Id
    @Column(name = "NUMDEMANDE")
    public String getNumdemande() {
        return numdemande;
    }

    public void setNumdemande(String numdemande) {
        this.numdemande = numdemande;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EtudiantLivraisonEntity that = (EtudiantLivraisonEntity) o;
        return Objects.equals(matricule, that.matricule) &&
                Objects.equals(numdemande, that.numdemande);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, numdemande);
    }
}
