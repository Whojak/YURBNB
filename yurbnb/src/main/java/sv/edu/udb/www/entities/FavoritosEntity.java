package sv.edu.udb.www.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "favoritos", schema = "airbnb", catalog = "")
public class FavoritosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_favorito", nullable = false)
    private int idFavorito;
    @Basic
    @Column(name = "id_oferta", nullable = false)
    private int idOferta;

    public int getIdFavorito() {
        return idFavorito;
    }

    public void setIdFavorito(int idFavorito) {
        this.idFavorito = idFavorito;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FavoritosEntity that = (FavoritosEntity) o;

        if (idFavorito != that.idFavorito) return false;
        if (idOferta != that.idOferta) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idFavorito;
        result = 31 * result + idOferta;
        return result;
    }
}
