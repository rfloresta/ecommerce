/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author bdeg_
 */
@Embeddable
public class DetallePedidoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idProducto")
    private int idProducto;
    @Basic(optional = false)
    @Column(name = "idPedido")
    private int idPedido;

    public DetallePedidoPK() {
    }

    public DetallePedidoPK(int idProducto, int idPedido) {
        this.idProducto = idProducto;
        this.idPedido = idPedido;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idProducto;
        hash += (int) idPedido;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePedidoPK)) {
            return false;
        }
        DetallePedidoPK other = (DetallePedidoPK) object;
        if (this.idProducto != other.idProducto) {
            return false;
        }
        if (this.idPedido != other.idPedido) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wyv.persistencia.DetallePedidoPK[ idProducto=" + idProducto + ", idPedido=" + idPedido + " ]";
    }
    
}