package wyv.persistencia;

import java.util.List;


public interface IOperacionesBD<T> {

	 String registrar(T a);
	 String actualizar(T a);
	 String eliminar(String id);
	 T buscar(String id);
	 List<T> listar();
         T validar (T entrada);
         int contar();
    
}

