package test;

import java.time.LocalDate;

import negocio.AlquilerABM;
import negocio.PropiedadABM;

public class Test {

	public static void main(String[] args) {
		PropiedadABM p = new PropiedadABM();
		AlquilerABM a = new AlquilerABM();
		
		System.out.println("-- Todas las propiedades:" + p.traerPropiedad());
		
		System.out.println("-- Alquiler con ID: 1 con la info de su propiedad:");
		System.out.println(a.traerAlquiler(1));
		
		System.out.println("-- Todas todas las propiedades del tipo Departamento que tienen ascensor:");
		System.out.println(p.traerPropiedad(true));
		
		System.out.println("-- Precio final del alquiler con ID: 1:");
		System.out.println(a.calcularPrecioFinal(a.traerAlquiler(1)));
		
		System.out.println("-- Precio final de alquileres entre las fechas 2022-03-02 y 2022-03-09:");
		System.out.println(a.calcularPrecioFinal(LocalDate.of(2022, 3, 2), LocalDate.of(2022, 3, 9)));
	}
}
