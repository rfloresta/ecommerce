package wyv.servicios;

import java.util.List;
import wyv.persistencia.Empresa;
import wyv.persistencia.EmpresaDao;
import wyv.persistencia.IOperacionesBD;

public class EmpresaServicio implements IOperacionesBD<Empresa> {

    EmpresaDao empDao;

    @Override
    public String registrar(Empresa a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizar(Empresa a) {
        empDao = new EmpresaDao();
        return empDao.actualizar(a);
    }

    @Override
    public String eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empresa buscar(String id) {
        empDao = new EmpresaDao();
        return empDao.buscar(id);
    }

    @Override
    public List<Empresa> listar() {
        empDao = new EmpresaDao();
        return empDao.listar();
    }

    @Override
    public Empresa validar(Empresa entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
