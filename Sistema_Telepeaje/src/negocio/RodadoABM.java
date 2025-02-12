package negocio;

import dao.RodadoDao;
import datos.Rodado;

public class RodadoABM {
	RodadoDao dao = new RodadoDao();
	
//Casos de Uso:
	
	public Rodado traerRodado(String dominio) {
		// Valido que el dominio no sea nulo o vacio.
		if (dominio == null || dominio.isEmpty()) {
	            throw new IllegalArgumentException("El dominio no puede ser nulo o vacío.");
	    }
		return dao.traerRodado(dominio);
	}
}