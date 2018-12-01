package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "SATISFAIRE_ENS_CMD", schema = "ADMIN", catalog = "")
@IdClass(SatisfaireEnsCmdEntityPK.class)
public class SatisfaireEnsCmdEntity {
    private String numcommande;
    private String matricule;
    private String statut;

    @Id
    @Column(name = "NUMCOMMANDE")
    public String getNumcommande() {
        return numcommande;
    }

    public void setNumcommande(String numcommande) {
        this.numcommande = numcommande;
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
    @Column(name = "STATUT")
    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SatisfaireEnsCmdEntity that = (SatisfaireEnsCmdEntity) o;
        return Objects.equals(numcommande, that.numcommande) &&
                Objects.equals(matricule, that.matricule) &&
                Objects.equals(statut, that.statut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numcommande, matricule, statut);
    }
}
