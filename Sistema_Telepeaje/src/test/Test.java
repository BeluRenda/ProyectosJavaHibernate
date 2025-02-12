package test;

import java.time.LocalDate;

import negocio.AbonadoABM;
import negocio.PeajeABM;
import negocio.RodadoABM;

public class Test {

	public static void main(String[] args) {
		AbonadoABM a = new AbonadoABM();
		RodadoABM r = new RodadoABM();
		PeajeABM p = new PeajeABM();
		
		System.out.println("-- Traigo todos los peajes Manuales: " + p.traerManual());
		
		System.out.println("-- Traigo todos los Telepeajes: ");
		System.out.println(p.traerTelepeaje());
		
		System.out.println("-- Traigo los peajes Manuales de 2020-11-01: ");
		System.out.println(p.traerManual(LocalDate.of(2020, 11, 02)));
		
		System.out.println("-- Calculo el total de caja de los peajes Manuales de 2020-11-01: ");
		System.out.println(p.cerrarCaja(LocalDate.of(2020, 11, 02)));
		
		System.out.println("-- Traigo rodado con dominio AAA111: ");
		System.out.println(r.traerRodado("AAA111"));
		
		//System.out.println("-- Traigo Telepeajes de rodado con dominio AAA111: ");
		//System.out.println(p.traerTelepeaje(r.traerRodado("AAA111")));
		
		System.out.println("-- Traigo abonado con DNI 11111111: ");
		System.out.println(a.traerAbonado(11111111));
		
		System.out.println("-- Traigo Telepeajes de abonado con dni 11111111 y calculo descuento de cada Telepeaje: ");
		System.out.println(p.traerTelepeaje(a.traerAbonado(11111111)));
		
//FALTA: 
//traerTelepeaje por Rodado
//calcularDescuento PORQUE NO DICE DE CUÁNTO ES	
	}
}
