package negocio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import dao.PeajeDao;
import datos.Abonado;
import datos.Manual;
//import datos.Peaje;
import datos.Rodado;
import datos.Telepeaje;

public class PeajeABM {
	PeajeDao dao = new PeajeDao();
	
//Casos de Uso:
	
	public List<Manual> traerManual() {
		return dao.traerManual();
	}
	

	public List<Telepeaje> traerTelepeaje() {
		return dao.traerTelepeaje();
	}
	

	public List<Manual> traerManual(LocalDate fecha) {
		List<Manual> aux = new ArrayList<Manual>();
		
		for(Manual m : traerManual()) {
			if(m.getFecha().isEqual(fecha)) {
				aux.add(m);
			}
		}
		return aux;
	}
	

	public double cerrarCaja(LocalDate fecha) {
		double total = 0;
		
		for(Manual m : traerManual(fecha)) {
			total += m.getPrecio();
		}
		return total;
	}
	
	
	public List<Telepeaje> traerTelepeaje(Rodado rodado) {
		return dao.traerTelepeaje(rodado);
	}
	

	public List<Telepeaje> traerTelepeaje(Abonado abonado) {
		return dao.traerTelepeaje(abonado);
	}
}