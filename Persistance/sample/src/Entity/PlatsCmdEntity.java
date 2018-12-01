package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PLATS_CMD", schema = "ADMIN", catalog = "")
@IdClass(PlatsCmdEntityPK.class)
public class PlatsCmdEntity {
    private String numcommande;
    private String numplat;

    @Id
    @Column(name = "NUMCOMMANDE")
    public String getNumcommande() {
        return numcommande;
    }

    public void setNumcommande(String numcommande) {
        this.numcommande = numcommande;
    }

    @Id
    @Column(name = "NUMPLAT")
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
        PlatsCmdEntity that = (PlatsCmdEntity) o;
        return Objects.equals(numcommande, that.numcommande) &&
                Objects.equals(numplat, that.numplat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numcommande, numplat);
    }
}
