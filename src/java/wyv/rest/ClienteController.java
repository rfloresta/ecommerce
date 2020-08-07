package wyv.rest;

import com.opensymphony.xwork2.ModelDriven;
import org.apache.struts2.rest.HttpHeaders;
import wyv.persistencia.ClienteDao;
import org.apache.struts2.rest.DefaultHttpHeaders;

public class ClienteController  implements ModelDriven<Object> {

    private String id;
    private Object model;
    private final  ClienteDao clieDao = new ClienteDao();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public HttpHeaders index() {
		model = clieDao.listar();
		return new DefaultHttpHeaders("index").disableCaching();
	}
    public HttpHeaders show() {
        model = clieDao.buscar(id);
        return new DefaultHttpHeaders("show");
    }

    @Override
    public Object getModel() {
        return model;    
    }

}
