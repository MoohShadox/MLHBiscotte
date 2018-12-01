package Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class PlatsCmdEntityPK implements Serializable {
    private String numcommande;
    private String numplat;

    @Column(name = "NUMCOMMANDE")
    @Id
    public String getNumcommande() {
        return numcommande;
    }

    public void setNumcommande(String numcommande) {
        this.numcommande = numcommande;
    }

    @Column(name = "NUMPLAT")
    @Id
    public String getNumplat() {
        return numplat;
    }

    public void setNumplat(String numplat) {
        this.numplat = numplat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlatsCmdEntityPK that = (PlatsCmdEntityPK) o;
        return Objects.equals(numcommande, that.numcommande) &&
                Objects.equals(numplat, that.numplat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numcommande, numplat);
    }
}
