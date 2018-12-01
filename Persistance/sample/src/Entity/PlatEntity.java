package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PLAT", schema = "ADMIN", catalog = "")
public class PlatEntity {
    private String numplat;
    private String nomplat;
    private String prix;
    private String fastfood;

    @Id
    @Column(name = "NUMPLAT")
    public String getNumplat() {
        return numplat;
    }

    public void setNumplat(String numplat) {
        this.numplat = numplat;
    }

    @Basic
    @Column(name = "NOMPLAT")
    public String getNomplat() {
        return nomplat;
    }

    public void setNomplat(String nomplat) {
        this.nomplat = nomplat;
    }

    @Basic
    @Column(name = "PRIX")
    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    @Basic
    @Column(name = "FASTFOOD")
    public String getFastfood() {
        return fastfood;
    }

    public void setFastfood(String fastfood) {
        this.fastfood = fastfood;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlatEntity that = (PlatEntity) o;
        return Objects.equals(numplat, that.numplat) &&
                Objects.equals(nomplat, that.nomplat) &&
                Objects.equals(prix, that.prix) &&
                Objects.equals(fastfood, that.fastfood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numplat, nomplat, prix, fastfood);
    }
}
