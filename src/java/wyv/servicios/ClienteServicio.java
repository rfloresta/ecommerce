package wyv.servicios;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wyv.persistencia.Cliente;
import wyv.persistencia.ClienteDao;
import wyv.persistencia.IOperacionesBD;

@Service
public class ClienteServicio implements IOperacionesBD<Cliente> {

    @Autowired
    ClienteDao clieDao/*=new ClienteDao()*/;
    Cliente cliente;

    @Override
    public String registrar(Cliente a) {
        return clieDao.registrar(a);
    }

    @Override
    public String actualizar(Cliente a) {
        return clieDao.actualizar(a);
    }

    @Override
    public String eliminar(String id) {
        return clieDao.eliminar(id);
    }

    @Override
    public Cliente buscar(String id) {
        return clieDao.buscar(id);
    }

    @Override
    public List<Cliente> listar() {
        return clieDao.listar();
    }

    @Override
    public Cliente validar(Cliente entrada) {
        cliente = clieDao.validar(entrada);
        try {
            if (cliente != null) {
                if (cliente.getEmail().equals(entrada.getEmail())) {
                    return cliente;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public Cliente validarEmail(String email) {
        List<Cliente> lstClie = listar();
        for (Cliente c : lstClie) {
            if (c.getEmail().equals(email)) {
                return c;
            }
        }
        return null;
    }

    public String comparar(Cliente entrada) {
        String estado = "incorrecto";
        try {
            cliente = clieDao.buscar(entrada.getIdCliente().toString());
            if (cliente.getCodigoGenerado().equals(entrada.getCodigoGenerado())) {
                estado = "ok";
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return estado;
    }

    @Override
    public int contar() {
        return clieDao.contar();
    }

}
