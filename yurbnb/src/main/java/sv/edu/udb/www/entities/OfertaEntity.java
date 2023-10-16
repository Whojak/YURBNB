package sv.edu.udb.www.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "oferta", schema = "airbnb", catalog = "")
public class OfertaEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_oferta", nullable = false)
    private int idOferta;
    @Basic
    @Column(name = "id_usuario", nullable = false)
    private int idUsuario;
    @Basic
    @Column(name = "costo", nullable = false, precision = 0)
    private double costo;
    @Basic
    @Column(name = "costo_comision", nullable = false, precision = 0)
    private double costoComision;
    @Basic
    @Column(name = "titulo", nullable = false, length = 50)
    private String titulo;
    @Basic
    @Column(name = "descripcion", nullable = false, length = 300)
    private String descripcion;
    @Basic
    @Column(name = "observaciones", nullable = true, length = 500)
    private String observaciones;
    @Basic
    @Column(name = "direccion", nullable = false, length = 150)
    private String direccion;
    @Basic
    @Column(name = "deparamento", nullable = false, length = 30)
    private String deparamento;
    @Basic
    @Column(name = "contrato", nullable = true, length = 1000)
    private String contrato;
    @Basic
    @Column(name = "estado", nullable = false, length = 30)
    private String estado;
    @Basic
    @Column(name = "fecha_registro", nullable = false)
    private Timestamp fechaRegistro;
    @OneToMany(mappedBy = "ofertaByIdOferta")
    private Collection<AlquilerEntity> alquilersByIdOferta;
    @OneToMany(mappedBy = "ofertaByIdOferta")
    private Collection<FavoritosEntity> favoritosByIdOferta;
    @OneToMany(mappedBy = "ofertaByIdOferta")
    private Collection<ImgEntity> imgsByIdOferta;

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getCostoComision() {
        return costoComision;
    }

    public void setCostoComision(double costoComision) {
        this.costoComision = costoComision;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDeparamento() {
        return deparamento;
    }

    public void setDeparamento(String deparamento) {
        this.deparamento = deparamento;
    }

    public String getContrato() {
        return contrato;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
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

        OfertaEntity that = (OfertaEntity) o;

        if (idOferta != that.idOferta) return false;
        if (idUsuario != that.idUsuario) return false;
        if (Double.compare(that.costo, costo) != 0) return false;
        if (Double.compare(that.costoComision, costoComision) != 0) return false;
        if (titulo != null ? !titulo.equals(that.titulo) : that.titulo != null) return false;
        if (descripcion != null ? !descripcion.equals(that.descripcion) : that.descripcion != null) return false;
        if (observaciones != null ? !observaciones.equals(that.observaciones) : that.observaciones != null)
            return false;
        if (direccion != null ? !direccion.equals(that.direccion) : that.direccion != null) return false;
        if (deparamento != null ? !deparamento.equals(that.deparamento) : that.deparamento != null) return false;
        if (contrato != null ? !contrato.equals(that.contrato) : that.contrato != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(that.fechaRegistro) : that.fechaRegistro != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = idOferta;
        result = 31 * result + idUsuario;
        temp = Double.doubleToLongBits(costo);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(costoComision);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (titulo != null ? titulo.hashCode() : 0);
        result = 31 * result + (descripcion != null ? descripcion.hashCode() : 0);
        result = 31 * result + (observaciones != null ? observaciones.hashCode() : 0);
        result = 31 * result + (direccion != null ? direccion.hashCode() : 0);
        result = 31 * result + (deparamento != null ? deparamento.hashCode() : 0);
        result = 31 * result + (contrato != null ? contrato.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        return result;
    }

    public Collection<AlquilerEntity> getAlquilersByIdOferta() {
        return alquilersByIdOferta;
    }

    public void setAlquilersByIdOferta(Collection<AlquilerEntity> alquilersByIdOferta) {
        this.alquilersByIdOferta = alquilersByIdOferta;
    }

    public Collection<FavoritosEntity> getFavoritosByIdOferta() {
        return favoritosByIdOferta;
    }

    public void setFavoritosByIdOferta(Collection<FavoritosEntity> favoritosByIdOferta) {
        this.favoritosByIdOferta = favoritosByIdOferta;
    }

    public Collection<ImgEntity> getImgsByIdOferta() {
        return imgsByIdOferta;
    }

    public void setImgsByIdOferta(Collection<ImgEntity> imgsByIdOferta) {
        this.imgsByIdOferta = imgsByIdOferta;
    }
}
