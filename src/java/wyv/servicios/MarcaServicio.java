package wyv.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wyv.persistencia.Marca;
import wyv.persistencia.IOperacionesBD;
import wyv.persistencia.MarcaDao;

@Service
public class MarcaServicio implements IOperacionesBD<Marca> {

    @Autowired
    MarcaDao marDao;
    Marca marca;

    @Override
    public String registrar(Marca a) {
        return marDao.registrar(a);
    }

    @Override
    public String actualizar(Marca a) {
            return marDao.actualizar(a);   

    }

    @Override
    public String eliminar(String id) {
        return marDao.eliminar(id);
    }

    @Override
    public Marca buscar(String id) {
        return (Marca) marDao.buscar(id);
    }

    @Override
    public List<Marca> listar() {
        return marDao.listar();
    }

    @Override
    public Marca validar(Marca entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int contar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
