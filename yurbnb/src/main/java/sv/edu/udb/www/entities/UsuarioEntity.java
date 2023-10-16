package sv.edu.udb.www.entities;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Collection;

@Entity
@Table(name = "usuario", schema = "airbnb", catalog = "")
public class UsuarioEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_usuario", nullable = false)
    private int idUsuario;
    @Basic
    @Column(name = "id_tipo", nullable = false)
    private int idTipo;
    @Basic
    @Column(name = "nombre", nullable = false, length = 30)
    private String nombre;
    @Basic
    @Column(name = "apellido", nullable = false, length = 30)
    private String apellido;
    @Basic
    @Column(name = "token", nullable = false, length = 30)
    private String token;
    @Basic
    @Column(name = "telefono", nullable = false, length = 10)
    private String telefono;
    @Basic
    @Column(name = "correo", nullable = false, length = 50)
    private String correo;
    @Basic
    @Column(name = "contrasena", nullable = false, length = 30)
    private String contrasena;
    @Basic
    @Column(name = "dui", nullable = false, length = 10)
    private String dui;
    @Basic
    @Column(name = "estado", nullable = false, length = 30)
    private String estado;
    @Basic
    @Column(name = "fecha_registro", nullable = false)
    private Timestamp fechaRegistro;
    @OneToMany(mappedBy = "usuarioByIdUsuario")
    private Collection<AlquilerEntity> alquilersByIdUsuario;
    @OneToMany(mappedBy = "usuarioByIdUsuario")
    private Collection<OfertaEntity> ofertasByIdUsuario;
    @ManyToOne
    @JoinColumn(name = "id_tipo", referencedColumnName = "id_tipo", nullable = false)
    private TipousuarioEntity tipousuarioByIdTipo;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdTipo() {
        return idTipo;
    }

    public void setIdTipo(int idTipo) {
        this.idTipo = idTipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
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

        UsuarioEntity that = (UsuarioEntity) o;

        if (idUsuario != that.idUsuario) return false;
        if (idTipo != that.idTipo) return false;
        if (nombre != null ? !nombre.equals(that.nombre) : that.nombre != null) return false;
        if (apellido != null ? !apellido.equals(that.apellido) : that.apellido != null) return false;
        if (token != null ? !token.equals(that.token) : that.token != null) return false;
        if (telefono != null ? !telefono.equals(that.telefono) : that.telefono != null) return false;
        if (correo != null ? !correo.equals(that.correo) : that.correo != null) return false;
        if (contrasena != null ? !contrasena.equals(that.contrasena) : that.contrasena != null) return false;
        if (dui != null ? !dui.equals(that.dui) : that.dui != null) return false;
        if (estado != null ? !estado.equals(that.estado) : that.estado != null) return false;
        if (fechaRegistro != null ? !fechaRegistro.equals(that.fechaRegistro) : that.fechaRegistro != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUsuario;
        result = 31 * result + idTipo;
        result = 31 * result + (nombre != null ? nombre.hashCode() : 0);
        result = 31 * result + (apellido != null ? apellido.hashCode() : 0);
        result = 31 * result + (token != null ? token.hashCode() : 0);
        result = 31 * result + (telefono != null ? telefono.hashCode() : 0);
        result = 31 * result + (correo != null ? correo.hashCode() : 0);
        result = 31 * result + (contrasena != null ? contrasena.hashCode() : 0);
        result = 31 * result + (dui != null ? dui.hashCode() : 0);
        result = 31 * result + (estado != null ? estado.hashCode() : 0);
        result = 31 * result + (fechaRegistro != null ? fechaRegistro.hashCode() : 0);
        return result;
    }

    public Collection<AlquilerEntity> getAlquilersByIdUsuario() {
        return alquilersByIdUsuario;
    }

    public void setAlquilersByIdUsuario(Collection<AlquilerEntity> alquilersByIdUsuario) {
        this.alquilersByIdUsuario = alquilersByIdUsuario;
    }

    public Collection<OfertaEntity> getOfertasByIdUsuario() {
        return ofertasByIdUsuario;
    }

    public void setOfertasByIdUsuario(Collection<OfertaEntity> ofertasByIdUsuario) {
        this.ofertasByIdUsuario = ofertasByIdUsuario;
    }

    public TipousuarioEntity getTipousuarioByIdTipo() {
        return tipousuarioByIdTipo;
    }

    public void setTipousuarioByIdTipo(TipousuarioEntity tipousuarioByIdTipo) {
        this.tipousuarioByIdTipo = tipousuarioByIdTipo;
    }
}
