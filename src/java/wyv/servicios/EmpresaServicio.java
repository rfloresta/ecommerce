package wyv.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wyv.persistencia.Empresa;
import wyv.persistencia.EmpresaDao;
import wyv.persistencia.IOperacionesBD;

@Service
public class EmpresaServicio implements IOperacionesBD<Empresa> {

    @Autowired
    EmpresaDao empDao;

    @Override
    public String registrar(Empresa a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String actualizar(Empresa a) {
        return empDao.actualizar(a);
    }

    @Override
    public String eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Empresa buscar(String id) {
        return empDao.buscar(id);
    }

    @Override
    public List<Empresa> listar() {
        return empDao.listar();
    }

    @Override
    public Empresa validar(Empresa entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
