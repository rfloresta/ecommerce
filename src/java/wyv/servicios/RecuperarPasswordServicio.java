package wyv.servicios;

import java.util.List;
import wyv.persistencia.IOperacionesBD;
import wyv.persistencia.RecuperarPassword;
import wyv.persistencia.RecuperarPasswordDao;

public class RecuperarPasswordServicio implements IOperacionesBD<RecuperarPassword> {

    RecuperarPasswordDao recDao;
    RecuperarPassword rec;

    @Override
    public String registrar(RecuperarPassword a) {
        recDao = new RecuperarPasswordDao();
        return recDao.registrar(a);
    }

    @Override
    public String actualizar(RecuperarPassword a) {
        recDao = new RecuperarPasswordDao();
        return recDao.actualizar(a);
    }

    @Override
    public String eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RecuperarPassword buscar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public List<RecuperarPassword> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RecuperarPassword validar(RecuperarPassword entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String comparar(RecuperarPassword entrada) {
        try {
            recDao = new RecuperarPasswordDao();
            rec = recDao.buscar(entrada.getIdUsuario());
            if (rec != null) {
                if (rec.getCodigo().equals(entrada.getCodigo())) {
                    return "ok";
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
        return null;
    }
}
