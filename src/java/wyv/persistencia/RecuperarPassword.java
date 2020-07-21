/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Romario
 */
@Entity
@Table(name = "recuperar_password")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RecuperarPassword.findAll", query = "SELECT r FROM RecuperarPassword r")
    , @NamedQuery(name = "RecuperarPassword.findByIdUsuario", query = "SELECT r FROM RecuperarPassword r WHERE r.idUsuario = :idUsuario")
    , @NamedQuery(name = "RecuperarPassword.findByCodigo", query = "SELECT r FROM RecuperarPassword r WHERE r.codigo = :codigo")})
public class RecuperarPassword implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "idUsuario")
    private String idUsuario;
    @Basic(optional = false)
    @Column(name = "codigo")
    private String codigo;

    public RecuperarPassword() {
    }

    public RecuperarPassword(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public RecuperarPassword(String idUsuario, String codigo) {
        this.idUsuario = idUsuario;
        this.codigo = codigo;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RecuperarPassword)) {
            return false;
        }
        RecuperarPassword other = (RecuperarPassword) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wyv.persistencia.RecuperarPassword[ idUsuario=" + idUsuario + " ]";
    }
    
}
