/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wyv.persistencia;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Data
 */
@Entity
@Table(name = "detalle_pedido")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetallePedido.findAll", query = "SELECT d FROM DetallePedido d")
    , @NamedQuery(name = "DetallePedido.findByCantidad", query = "SELECT d FROM DetallePedido d WHERE d.cantidad = :cantidad")
    , @NamedQuery(name = "DetallePedido.findByPrecio", query = "SELECT d FROM DetallePedido d WHERE d.precio = :precio")
    , @NamedQuery(name = "DetallePedido.findByDescuento", query = "SELECT d FROM DetallePedido d WHERE d.descuento = :descuento")
    , @NamedQuery(name = "DetallePedido.findByIdProducto", query = "SELECT d FROM DetallePedido d WHERE d.detallePedidoPK.idProducto = :idProducto")
    , @NamedQuery(name = "DetallePedido.findByIdPedido", query = "SELECT d FROM DetallePedido d WHERE d.detallePedidoPK.idPedido = :idPedido")})
public class DetallePedido implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DetallePedidoPK detallePedidoPK;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "precio")
    private Double precio;
    @Basic(optional = false)
    @Column(name = "descuento")
    private double descuento;
    @JoinColumn(name = "idProducto", referencedColumnName = "idProducto", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Producto producto;
    @JoinColumn(name = "idPedido", referencedColumnName = "idPedido", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Pedido pedido;

    public DetallePedido() {
    }

    public DetallePedido(DetallePedidoPK detallePedidoPK) {
        this.detallePedidoPK = detallePedidoPK;
    }

    public DetallePedido(DetallePedidoPK detallePedidoPK, double descuento) {
        this.detallePedidoPK = detallePedidoPK;
        this.descuento = descuento;
    }

    public DetallePedido(int idProducto, int idPedido) {
        this.detallePedidoPK = new DetallePedidoPK(idProducto, idPedido);
    }

    public DetallePedidoPK getDetallePedidoPK() {
        return detallePedidoPK;
    }

    public void setDetallePedidoPK(DetallePedidoPK detallePedidoPK) {
        this.detallePedidoPK = detallePedidoPK;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (detallePedidoPK != null ? detallePedidoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetallePedido)) {
            return false;
        }
        DetallePedido other = (DetallePedido) object;
        if ((this.detallePedidoPK == null && other.detallePedidoPK != null) || (this.detallePedidoPK != null && !this.detallePedidoPK.equals(other.detallePedidoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "wyv.persistencia.DetallePedido[ detallePedidoPK=" + detallePedidoPK + " ]";
    }
    
}
