package Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class SatisfaireEnsCmdEntityPK implements Serializable {
    private String numcommande;
    private String matricule;

    @Column(name = "NUMCOMMANDE")
    @Id
    public String getNumcommande() {
        return numcommande;
    }

    public void setNumcommande(String numcommande) {
        this.numcommande = numcommande;
    }

    @Column(name = "MATRICULE")
    @Id
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SatisfaireEnsCmdEntityPK that = (SatisfaireEnsCmdEntityPK) o;
        return Objects.equals(numcommande, that.numcommande) &&
                Objects.equals(matricule, that.matricule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numcommande, matricule);
    }
}
