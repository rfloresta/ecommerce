package wyv.rest;

import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.rest.HttpHeaders;
import org.apache.struts2.rest.DefaultHttpHeaders;
import wyv.persistencia.PedidoDao;

public class PedidoController  implements ModelDriven<Object> {

    private String id;
    private Object model;
    private final  PedidoDao pedDao = new PedidoDao();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HttpHeaders show() {
        model = pedDao.listarDPedidoPorCliente(Integer.parseInt(id));
        return new DefaultHttpHeaders("show");
    }

    @Override
    public Object getModel() {
        return model;    
    }

}
