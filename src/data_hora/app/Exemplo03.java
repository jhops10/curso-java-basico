package data_hora.app;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Exemplo03 {

	public static void main(String[] args) {
		
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		LocalDate r1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		
		System.out.println("r1 = " + r1);
		
		System.out.println("d04 Dia do mês = " + d04.getDayOfMonth());
		System.out.println("d04 Mês = " + d04.getMonthValue()); //Mês em número
		System.out.println("d04 Mês = " + d04.getMonth()); //Mês escrito
		System.out.println("d04 Ano = " + d04.getYear()); //Ano em número
		System.out.println("d04 Ano = " + d04.getDayOfYear()); //Dia do ano
		
		System.out.println("d05 Hora = " + d05.getHour()); //Hora
		System.out.println("d05 Minutos = " + d05.getMinute()); //Minutos
		System.out.println("d05 Segundos = " + d05.getSecond()); //Segundos
		
		
	}

}
