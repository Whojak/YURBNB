package sv.edu.udb.www.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tipousuario", schema = "airbnb", catalog = "")
public class TipousuarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_tipo", nullable = false)
    private int idTipo;
    @Basic
    @Column(name = "tipo", nullable = false, length = 20)
    private String tipo;

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TipousuarioEntity that = (TipousuarioEntity) o;

        if (idTipo != that.idTipo) return false;
        if (tipo != null ? !tipo.equals(that.tipo) : that.tipo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idTipo;
        result = 31 * result + (tipo != null ? tipo.hashCode() : 0);
        return result;
    }
}
