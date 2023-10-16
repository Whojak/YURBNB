package sv.edu.udb.www.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Timestamp;

@Entity
@Table(name = "alquiler", schema = "airbnb", catalog = "")
public class AlquilerEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_alquiler", nullable = false)
    private int idAlquiler;
    @Basic
    @Column(name = "id_usuario", nullable = false)
    private int idUsuario;
    @Basic
    @Column(name = "id_oferta", nullable = false)
    private int idOferta;
    @Basic
    @Column(name = "estado", nullable = false, length = 30)
    private String estado;
    @Basic
    @Column(name = "fecha_inicio_alquiler", nullable = false)
    private Date fechaInicioAlquiler;
    @Basic
    @Column(name = "fecha_fin_alquiler", nullable = false)
    private Date fechaFinAlquiler;
    @Basic
    @Column(name = "contrato", nullable = true, length = 1000)
    private String contrato;
    @Basic
    @Column(name = "fecha_registro", nullable = false)
    private Timestamp fechaRegistro;

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Date getFechaInicioAlquiler() {
        return fechaInicioAlquiler;
    }

    public void setFechaInicioAlquiler(Date fechaInicioAlquiler) {
        this.fechaInicioAlquiler = fechaInicioAlquiler;
    }

    public Date getFechaFinAlquiler() {
        return fechaFinAlquiler;
    }

    public void setFechaFinAlquiler(Date fechaFinAlquiler) {
        this.fechaFinAlquiler = fechaFinAlquiler;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public Timestamp getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Timestamp fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlquilerEntity that = (AlquilerEntity) o;

        if (idAlquiler != that.idAlquiler) return false;
        if (idUsuario != that.idUsuario) return false;
        if (idOferta != that.idOferta) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (fechaInicioAlquiler != null ? !fechaInicioAlquiler.equals(that.fechaInicioAlquiler) : that.fechaInicioAlquiler != null)
            return false;
        if (fechaFinAlquiler != null ? !fechaFinAlquiler.equals(that.fechaFinAlquiler) : that.fechaFinAlquiler != null)
            return false;
        if (contrato != null ? !contrato.equals(that.contrato) : that.contrato != null) return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(that.fechaRegistro) : that.fechaRegistro != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAlquiler;
        result = 31 * result + idUsuario;
        result = 31 * result + idOferta;
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (fechaInicioAlquiler != null ? fechaInicioAlquiler.hashCode() : 0);
        result = 31 * result + (fechaFinAlquiler != null ? fechaFinAlquiler.hashCode() : 0);
        result = 31 * result + (contrato != null ? contrato.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        return result;
    }
}
