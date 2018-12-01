package Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class EtudiantLivraisonEntityPK implements Serializable {
    private String matricule;
    private String numdemande;

    @Column(name = "MATRICULE")
    @Id
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Column(name = "NUMDEMANDE")
    @Id
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
        EtudiantLivraisonEntityPK that = (EtudiantLivraisonEntityPK) o;
        return Objects.equals(matricule, that.matricule) &&
                Objects.equals(numdemande, that.numdemande);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, numdemande);
    }
}
