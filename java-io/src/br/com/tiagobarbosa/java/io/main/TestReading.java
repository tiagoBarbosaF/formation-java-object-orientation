package br.com.tiagobarbosa.java.io.main;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestReading {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
    }
}