package Entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "EFFECTUER_CMD", schema = "ADMIN", catalog = "")
@IdClass(EffectuerCmdEntityPK.class)
public class EffectuerCmdEntity {
    private String matricule;
    private String pos;
    private String numcmd;

    @Id
    @Column(name = "MATRICULE")
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Basic
    @Column(name = "POS")
    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    @Id
    @Column(name = "NUMCMD")
    public String getNumcmd() {
        return numcmd;
    }

    public void setNumcmd(String numcmd) {
        this.numcmd = numcmd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EffectuerCmdEntity that = (EffectuerCmdEntity) o;
        return Objects.equals(matricule, that.matricule) &&
                Objects.equals(pos, that.pos) &&
                Objects.equals(numcmd, that.numcmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, pos, numcmd);
    }
}
