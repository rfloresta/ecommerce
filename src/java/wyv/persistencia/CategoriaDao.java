package wyv.persistencia;

import java.util.List;

public class CategoriaDao implements IOperacionesBD<Categoria>{

    CategoriaJpa  cateJpa=new CategoriaJpa();
    Categoria categoria;
    
    @Override
    public String registrar(Categoria a) {
        try {
           
            cateJpa.create(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String actualizar(Categoria a) {
        try {
            cateJpa.edit(a);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public String eliminar(String id) {
        int idcat= Integer.parseInt(id);
         try {
            cateJpa.destroy(idcat);
            return "ok";
        } catch (Exception e) {
            e.getMessage();
            return "error";
        }
    }

    @Override
    public Categoria buscar(String id) {
        int idcat= Integer.parseInt(id);
         try {
            return cateJpa.findCategoria(idcat);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public List<Categoria> listar() {
       try {
            return cateJpa.findCategoriaEntities();
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    @Override
    public Categoria ingresar(Categoria entrada) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public List<Categoria> listarCategoria() {
       try {
            return cateJpa.listarCategoria();
        } catch (Exception e) {
            e.getMessage();
            return null;
}
    }
     
      public List<Categoria> listarsubCategoria(int id) {
       try {
            return cateJpa.listarsubCategoria(id);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }
}
