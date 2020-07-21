package wyv.persistencia;

import java.util.List;

public class RecuperarPasswordDao implements IOperacionesBD<RecuperarPassword> {

    RecuperarPasswordJpa recJpa = new RecuperarPasswordJpa();

    @Override
    public String registrar(RecuperarPassword a) {
        try {
            recJpa.create(a);
            return "ok";
        } catch (Exception e) {
            return "error";
        }
    }

    @Override
    public String actualizar(RecuperarPassword a) {
        try {
            recJpa.edit(a);
            return "ok";
        } catch (Exception e) {
            return "error";
        }
    }

    @Override
    public String eliminar(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RecuperarPassword buscar(String id) {
            return recJpa.findRecuperarPassword(id);
    }

    @Override
    public List<RecuperarPassword> listar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RecuperarPassword validar(RecuperarPassword entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
