package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Programa {

	public static void main(String[] args) throws ParseException {

		// Tipos de formatações
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

		// Maneiras de puxar uma data de agora do pc
		Date x1 = new Date();
		Date x2 = new Date(System.currentTimeMillis());

		// Criando uma data apartir de determinado millisegundos
		// O número de milissegundos desde a meia noite do dia 1 de janeiro de 1970 GMT
		// (UTC), para nós está 3 horas atrasado
		Date x3 = new Date(0L);
		Date x4 = new Date(1000L * 60L * 60l * 5L);

		Date y1 = sdf1.parse("20/07/2021");
		Date y2 = sdf2.parse("20/07/2021 23:01:21");
		Date y3 = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

		System.out.println("--- Datas sem formatação - Horario do Brasil) ---");

		System.out.println("x1: " + x1);
		System.out.println("x2: " + x2);
		System.out.println("x3: " + x3);
		System.out.println("x4: " + x4);
		System.out.println("y1: " + y1);
		System.out.println("y2: " + y2);
		System.out.println("y3: " + y3);

		System.out.println("--- Datas com formatação - Hor�rio Brasil---");

		System.out.println("x1: " + sdf2.format(x1));
		System.out.println("x2: " + sdf2.format(x2));
		System.out.println("x3: " + sdf2.format(x3));
		System.out.println("x4: " + sdf2.format(x4));
		System.out.println("y1: " + sdf2.format(y1));
		System.out.println("y2: " + sdf2.format(y2));
		System.out.println("y3: " + sdf2.format(y3));

		System.out.println("--- Datas com formatação - Hor�rio Greenwich ---");

		System.out.println("x1: " + sdf3.format(x1));
		System.out.println("x2: " + sdf3.format(x2));
		System.out.println("x3: " + sdf3.format(x3));
		System.out.println("x4: " + sdf3.format(x4));
		System.out.println("y1: " + sdf3.format(y1));
		System.out.println("y2: " + sdf3.format(y2));
		System.out.println("y3: " + sdf3.format(y3));

	}
}
