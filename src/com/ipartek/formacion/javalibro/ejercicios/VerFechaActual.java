package com.ipartek.formacion.javalibro.ejercicios;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * 
 * Mostar la fecha actual del sistema
 * 
 * @author Administrador
 *
 */
public class VerFechaActual {

	public static void main(String[] args) {

		String[] meses = { "ENERO", "FEBERERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO", "AGOSTO", "SEPTIEMBRE",
				"OCUTBRE", "NOVIEMBRE", "DICIEMBRE" };

		String[] diasSemana = { "DOMINGO", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO" };

		Date date = new Date();
		GregorianCalendar gc = new GregorianCalendar();
		gc.setTime(date);

		int anyo = gc.get(Calendar.YEAR);
		int mes = gc.get(Calendar.MONTH);
		int dia = gc.get(Calendar.DAY_OF_MONTH);
		int diaSemana = gc.get(Calendar.DAY_OF_WEEK) - 1;
		System.out.println(diasSemana[diaSemana] + " " + dia + " DE " + meses[mes] + " DEL " + anyo);

	}

}
