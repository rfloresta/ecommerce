package wyv.persistencia;

import java.util.List;

public interface IOperacionesBD<T> {

	 int registrar(T a);
	 int actualizar(T a);
	 int eliminar(int id);
	 T buscar(int id);
	 List<T> listar();
         T ingresar(T entrada);
    
}
