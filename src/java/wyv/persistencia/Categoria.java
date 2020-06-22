/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Data
 */
@Entity
@Table(name = "categoria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categoria.findAll", query = "SELECT c FROM Categoria c")
    , @NamedQuery(name = "Categoria.findByIdCategoria", query = "SELECT c FROM Categoria c WHERE c.idCategoria = :idCategoria")
    , @NamedQuery(name = "Categoria.findByNombre", query = "SELECT c FROM Categoria c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Categoria.findByCategoriaSuperior", query = "SELECT c FROM Categoria c WHERE c.categoriaSuperior = :categoriaSuperior")})
public class Categoria implements Serializable {

    @OneToMany(mappedBy = "idCategoria")
    private List<Producto> productoList;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idCategoria")
    private Integer idCategoria;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "categoriaSuperior")
    private Integer categoriaSuperior;
<<<<<<< HEAD
=======
    @OneToMany(mappedBy = "idCategoria")
    private List<Producto> productoList;
>>>>>>> 97edac29254a5880c5c2e5d3c6e7960383a0a617

    public Categoria() {
    }

    public Categoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public Integer getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCategoriaSuperior() {
        return categoriaSuperior;
<<<<<<< HEAD
=======
    }

    public void setCategoriaSuperior(Integer categoriaSuperior) {
        this.categoriaSuperior = categoriaSuperior;
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
>>>>>>> 97edac29254a5880c5c2e5d3c6e7960383a0a617
    }

    public void setCategoriaSuperior(Integer categoriaSuperior) {
        this.categoriaSuperior = categoriaSuperior;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCategoria != null ? idCategoria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categoria)) {
            return false;
        }
        Categoria other = (Categoria) object;
        if ((this.idCategoria == null && other.idCategoria != null) || (this.idCategoria != null && !this.idCategoria.equals(other.idCategoria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wyv.persistencia.Categoria[ idCategoria=" + idCategoria + " ]";
<<<<<<< HEAD
    }

    @XmlTransient
    public List<Producto> getProductoList() {
        return productoList;
    }

    public void setProductoList(List<Producto> productoList) {
        this.productoList = productoList;
=======
>>>>>>> 97edac29254a5880c5c2e5d3c6e7960383a0a617
    }
    
}
