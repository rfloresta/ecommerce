
package wyv.negocio;


public class Linea {
    private ProductoObj proObj;
    private int can;

    public Linea(ProductoObj proObj, int can) {
        this.proObj = proObj;
        this.can = can;
    }

    public Linea() {
    }
    
    public ProductoObj getProObj() {
        return proObj;
    }

    public void setProObj(ProductoObj proObj) {
        this.proObj = proObj;
    }

    public int getCan() {
        return can;
    }

    public void setCan(int can) {
        this.can = can;
    }
    
    public double getImporte()
    {
        return proObj.getPrecioVenta()*can;
    }
    
    
}
