package test;

import java.time.LocalTime;

import negocio.DosisABM;
import negocio.PersonaABM;
import negocio.VacunaABM;

public class Test {

	public static void main(String[] args) {
		// public Vacuna traerVacuna(long codigo)  - ESTA HECHO EN negocio.VacunaABM
		// public int calcularEdad(LocalDate hoy)  - ESTA HECHO EN datos.Persona
		// public List<Persona> traerPersona(int edadDesde, int edadHasta)
		// public List<Dosis> traerDosis(Vacuna vacuna)
		// public List<Dosis> traerDosis(LocalTime horaDesde, LocalTime horaHasta)
		// public List<Dosis> traerDosis(LocalTime horaDesde, LocalTime horaHasta, boolean tieneComorbilidades)

		PersonaABM persona = new PersonaABM();
		VacunaABM vacuna = new VacunaABM();
		DosisABM dosis = new DosisABM();
		
		System.out.println("-- Traigo vacuna por codigo 800011: /n" + vacuna.traerVacuna(800011));
		
		System.out.println("-- Personas entre 30 y 40 años: ");
		System.out.println(persona.traerPersona(30, 40));
		
		System.out.println("-- Dosis aplicadas de la vacuna con codigo 800011: ");
		System.out.println(dosis.traerDosis(vacuna.traerVacuna(800011)));
		
		System.out.println("-- Dosis aplicadas entre las 11:15 y 11:45: ");
		System.out.println(dosis.traerDosis(LocalTime.of(11, 15), LocalTime.of(11, 45)));
		
		System.out.println("-- Dosis aplicadas entre las 11:15 y 11:45 a personas sin comorbilidades: ");
		System.out.println(dosis.traerDosis(LocalTime.of(11, 15), LocalTime.of(11, 45), false));
	}
}