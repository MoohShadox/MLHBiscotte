package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "DEMANDELIVRAISON", schema = "ADMIN", catalog = "")
public class DemandelivraisonEntity {
    private String numdemande;
    private String destinationfinal;

    @Id
    @Column(name = "NUMDEMANDE")
    public String getNumdemande() {
        return numdemande;
    }

    public void setNumdemande(String numdemande) {
        this.numdemande = numdemande;
    }

    @Basic
    @Column(name = "DESTINATIONFINAL")
    public String getDestinationfinal() {
        return destinationfinal;
    }

    public void setDestinationfinal(String destinationfinal) {
        this.destinationfinal = destinationfinal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DemandelivraisonEntity that = (DemandelivraisonEntity) o;
        return Objects.equals(numdemande, that.numdemande) &&
                Objects.equals(destinationfinal, that.destinationfinal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numdemande, destinationfinal);
    }
}
