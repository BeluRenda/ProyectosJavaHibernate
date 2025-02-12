package negocio;

import dao.AbonadoDao;
import datos.Abonado;

public class AbonadoABM {
	AbonadoDao dao = new AbonadoDao();
	
//Casos de Uso:
	
	public Abonado traerAbonado(long dni) {
		return dao.traerAbonado(dni);
	}
}