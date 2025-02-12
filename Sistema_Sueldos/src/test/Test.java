package test;

import java.time.LocalDate;

import negocio.EmpleadoABM;
import negocio.FichadaABM;

public class Test {

	public static void main(String[] args) {
		EmpleadoABM empleado = new EmpleadoABM();
		FichadaABM fichada = new FichadaABM();
		
		System.out.println("-- Empleado con ID 2:  " + empleado.traerEmpleado(2));
		
		System.out.println("-- Fichadas del empleado con ID 1: ");
		System.out.println(fichada.traerFichadas(empleado.traerEmpleado(1), LocalDate.of(2023, 9, 04), LocalDate.of(2023, 9, 05), true));
		
		System.out.println("-- Cantidad de horas extras del empleado con ID 1: ");
		System.out.println(fichada.cantidadHorasExtras(empleado.traerEmpleado(1), LocalDate.of(2023, 9, 04), LocalDate.of(2023, 9, 05)));
		
		System.out.println("-- Boolean si tiene presentismo empleado con ID 3: ");
		System.out.println(fichada.tienePresentismo(empleado.traerEmpleado(3), LocalDate.of(2023, 9, 04), LocalDate.of(2023, 9, 05)));
		
		System.out.println("-- Valor del sueldo final del empleado con ID 1: ");
		System.out.println(fichada.calcularSueldoFinal(empleado.traerEmpleado(1), LocalDate.of(2023, 9, 04), LocalDate.of(2023, 9, 05)));
		
		
		
		
	}
}