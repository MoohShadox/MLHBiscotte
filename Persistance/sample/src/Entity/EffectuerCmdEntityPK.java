package Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class EffectuerCmdEntityPK implements Serializable {
    private String matricule;
    private String numcmd;

    @Column(name = "MATRICULE")
    @Id
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    @Column(name = "NUMCMD")
    @Id
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
        EffectuerCmdEntityPK that = (EffectuerCmdEntityPK) o;
        return Objects.equals(matricule, that.matricule) &&
                Objects.equals(numcmd, that.numcmd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(matricule, numcmd);
    }
}
