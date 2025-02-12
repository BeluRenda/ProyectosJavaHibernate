package negocio;

import dao.EmpleadoDao;
import datos.Empleado;

public class EmpleadoABM {
	EmpleadoDao dao = new EmpleadoDao();
	
//Casos de Uso:
	
	public Empleado traerEmpleado(int idEmpleado) {
		return dao.traerEmpleado(idEmpleado);
	}
}
