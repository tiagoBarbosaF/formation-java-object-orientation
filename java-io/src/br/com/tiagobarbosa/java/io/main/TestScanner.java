package br.com.tiagobarbosa.java.io.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("contas.csv"));

        while (scanner.hasNext()) {
            String line = scanner.nextLine();
//            System.out.println(line);

            Scanner lineScanner = new Scanner(line);
            lineScanner.useLocale(Locale.US);
            lineScanner.useDelimiter(",");

            String tipoConta = lineScanner.next();
            int agencia = lineScanner.nextInt();
            int numero = lineScanner.nextInt();
            String titular = lineScanner.next();
            double saldo = lineScanner.nextDouble();
            System.out.printf(new Locale("pt", "BR"),
                    "Titular: %s%nAgência: %04d%nNúmero: %08d%nTitular: %s%nSaldo: " +
                            "%015.2f%n%n", tipoConta, agencia, numero, titular, saldo);

            lineScanner.close();
        }
        scanner.close();
    }
}
