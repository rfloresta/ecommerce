package wyv.negocio;

public class ProductoObj {
    public String codPro,nombre,descripcion,proveedor;
    public double preciocom,precioven;
    public int stock;
    public double descuento;

    public String getCodPro() {
        return codPro;
    }

    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getPreciocom() {
        return preciocom;
    }

    public void setPreciocom(double preciocom) {
        this.preciocom = preciocom;
    }

    public double getPrecioven() {
        return precioven;
    }

    public void setPrecioven(double precioven) {
        this.precioven = precioven;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

 
}
