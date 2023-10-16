package sv.edu.udb.www.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "img", schema = "airbnb", catalog = "")
public class ImgEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id_img", nullable = false)
    private int idImg;
    @Basic
    @Column(name = "id_oferta", nullable = false)
    private int idOferta;
    @Basic
    @Column(name = "img1", nullable = true, length = 1000)
    private String img1;
    @Basic
    @Column(name = "img2", nullable = true, length = 1000)
    private String img2;

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public int getIdOferta() {
        return idOferta;
    }

    public void setIdOferta(int idOferta) {
        this.idOferta = idOferta;
    }

    public String getImg1() {
        return img1;
    }

    public void setImg1(String img1) {
        this.img1 = img1;
    }

    public String getImg2() {
        return img2;
    }

    public void setImg2(String img2) {
        this.img2 = img2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ImgEntity imgEntity = (ImgEntity) o;

        if (idImg != imgEntity.idImg) return false;
        if (idOferta != imgEntity.idOferta) return false;
        if (img1 != null ? !img1.equals(imgEntity.img1) : imgEntity.img1 != null) return false;
        if (img2 != null ? !img2.equals(imgEntity.img2) : imgEntity.img2 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idImg;
        result = 31 * result + idOferta;
        result = 31 * result + (img1 != null ? img1.hashCode() : 0);
        result = 31 * result + (img2 != null ? img2.hashCode() : 0);
        return result;
    }
}
