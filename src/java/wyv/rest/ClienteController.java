package wyv.rest;

import com.google.gson.Gson;
import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.rest.HttpHeaders;
import wyv.persistencia.ClienteDao;
import org.apache.struts2.rest.DefaultHttpHeaders;
import org.json.simple.parser.ParseException;
import wyv.persistencia.Cliente;

public class ClienteController implements ModelDriven<Object> {

    public Cliente cliente = new Cliente();
    private String id;
    private Object clientes;
    private String estado="error";
    private String json;
    
    private ClienteDao clieDao;

    public HttpHeaders index() {
        clieDao = new ClienteDao();
        clientes = clieDao.listar();
        return new DefaultHttpHeaders("index").disableCaching();
    }

    public HttpHeaders show() {
        clieDao = new ClienteDao();
        clientes = clieDao.buscar(id);
        if(clientes==null){
            return new DefaultHttpHeaders("show").withStatus(404);
        }
        return new DefaultHttpHeaders("show").withETag(clientes);
    }
    
    public HttpHeaders edit() throws ParseException {
        clieDao = new ClienteDao();
        cliente = clieDao.buscar(id);
        if(cliente==null){
            return new DefaultHttpHeaders("show").withStatus(404);
        }
        if(json.equals("")){
            return new DefaultHttpHeaders("show").withStatus(400);
        }
        clieDao = new ClienteDao();
        Gson g = new Gson();
        cliente = g.fromJson(json, Cliente.class);
        cliente.setIdCliente(Integer.parseInt(getId()));
        estado=clieDao.actualizar(cliente);
        return new DefaultHttpHeaders("edit").withETag(cliente);
    }

    @Override
    public Object getModel() {
        if (clientes == null) {
            return estado;
        } 
        return clientes;
    }

    
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }
}
