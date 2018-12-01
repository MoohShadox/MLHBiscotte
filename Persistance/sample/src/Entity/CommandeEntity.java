package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "COMMANDE", schema = "ADMIN", catalog = "")
public class CommandeEntity {
    private String numcommande;
    private String position;

    @Id
    @Column(name = "NUMCOMMANDE")
    public String getNumcommande() {
        return numcommande;
    }

    public void setNumcommande(String numcommande) {
        this.numcommande = numcommande;
    }

    @Basic
    @Column(name = "POSITION")
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CommandeEntity that = (CommandeEntity) o;
        return Objects.equals(numcommande, that.numcommande) &&
                Objects.equals(position, that.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numcommande, position);
    }
}
