package Exercicio_Data;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Data_Atual_Nascimento {

	public static void main(String[] args) {
		
		DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		LocalDateTime dataNascimento = LocalDateTime.of(1988, Month.APRIL, 16, 22, 12, 34);
		LocalDateTime dataHoje = LocalDateTime.now();
		
		Duration segundosNascimento = Duration.between(dataNascimento, dataHoje);
		Period diasDeVida = Period.between(dataNascimento.toLocalDate(), dataHoje.toLocalDate());
		
		
		System.out.printf("O dia de hoje é: %s \n", dataHoje.format(formatarData));
		System.out.printf("Seu nascimento é: %s \n", dataNascimento.format(formatarData));
		System.out.printf("O ano do nascimento é bissexto: %b \n" , dataNascimento.toLocalDate().isLeapYear());
		System.out.println("Se passaram " + segundosNascimento.getSeconds() + " segundos, desde o seu nascimento.");
		System.out.println("Se passaram " + (diasDeVida.getYears()*365) + " dias, desde o seu nascimento.");
		System.out.println("Dias fora da barriga " + ChronoUnit.DAYS.between(dataNascimento, dataHoje));
		

	}

}
