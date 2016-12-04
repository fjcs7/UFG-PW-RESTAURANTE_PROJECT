package ufg.pw.projeto_restaurante.model;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PrincipalParaTeste {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		NumberFormat formatador = new DecimalFormat("00");
		NumberFormat formatadorAno = new DecimalFormat("0000");
		String horaCompleta = formatador.format(gc.get(Calendar.HOUR_OF_DAY)) +
							  formatador.format(gc.get(Calendar.MINUTE))+
							  formatador.format(gc.get(Calendar.SECOND));

		String dataAtual =   formatador.format(gc.get(Calendar.DATE)) +
							 formatador.format(gc.get(Calendar.MONTH))+
							 formatadorAno.format(gc.get(Calendar.YEAR));

		System.out.println(horaCompleta);
		
		System.out.println(dataAtual);
	}

}
