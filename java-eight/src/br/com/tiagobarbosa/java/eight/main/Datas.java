package br.com.tiagobarbosa.java.eight.main;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate birthdate = LocalDate.of(2025, Month.APRIL, 4);
        System.out.println(birthdate.getYear() - hoje.getYear());

        System.out.println(Period.between(hoje, birthdate));
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatBirthdate = birthdate.format(dateTimeFormatter);
        System.out.println(formatBirthdate);
        System.out.println();

        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        String format = agora.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(format);
    }
}
