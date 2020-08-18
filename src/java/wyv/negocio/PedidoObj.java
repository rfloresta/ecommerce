package wyv.negocio;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import wyv.persistencia.PedidoDao;

public class PedidoObj {

    private static List<Linea> cesta = new ArrayList();
    private String num;
    private String fec;
    private ClienteObj cli;
    private String pago;

    public void agregar(ProductoObj pro, int can) {
        Linea lin = new Linea();
        lin.setProObj(pro);
        lin.setCan(can);
        cesta.add(lin);
    }

    public void quitar(String cod) {
        for (int i = 0; i < cesta.size(); i++) {
            Linea lin = (Linea) cesta.get(i);
            if (lin.getProObj().getIdProducto().equals(cod)) {
                cesta.remove(i);
            }
        }
    }

    public List getCesta() {
        return cesta;
    }

    public double getSubTot() {
        double tot = 0.0;
        for (int i = 0; i < cesta.size(); i++) {
            Linea lin = (Linea) cesta.get(i);
            tot += lin.getImporte();
        }

        return tot;
    }

    public double getValorIgv() {
        double tot = 0.0;
        for (int i = 0; i < cesta.size(); i++) {
            Linea lin = (Linea) cesta.get(i);
            tot += lin.getImporte();
        }
        double igv = 0.0;
        return igv = tot * 0.18;
    }

    public double getDescTotales() {
        double totDescuento = 0.0;
        double importe = 0;
        double descuento = 0;
        for (int i = 0; i < cesta.size(); i++) {
            Linea lin = (Linea) cesta.get(i);

            descuento += lin.getCan() * (lin.getProObj().getDescuento() / 100);
            importe += lin.getImporte();

            totDescuento = importe * descuento;

        }
        return totDescuento;
    }

    public double getTot() {
        double tot = 0.0;
        for (int i = 0; i < cesta.size(); i++) {
            Linea lin = (Linea) cesta.get(i);
            tot += lin.getImporte();
        }
        double total = tot - getDescTotales();
        return total;
    }

    public int existeProducto(String webid, List<Linea> cart) {
        for (int i = 0; i < cart.size(); i++) {
            if (cart.get(i).getProObj().getIdProducto().equals(webid)) {
                System.out.println("El producto existe");
                return i;
            }
        }
        return -1;
    }

    public String getNum() {
        PedidoDao daoPedi = new PedidoDao();
        return daoPedi.generaNumero();
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFec() {

        Date h = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(h);
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public ClienteObj getCli() {
        return cli;
    }

    public void setCli(ClienteObj cli) {
        this.cli = cli;
    }

    public String getPago() {
        return pago;
    }

    public void setPago(String pago) {
        this.pago = pago;
    }

}
