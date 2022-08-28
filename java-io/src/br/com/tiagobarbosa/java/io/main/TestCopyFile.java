package br.com.tiagobarbosa.java.io.main;

import java.io.*;

public class TestCopyFile {
    public static void main(String[] args) throws IOException {
//        InputStream fileInputStream = new FileInputStream("lorem.txt");
        InputStream fileInputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        OutputStream fileOutputStream = new FileOutputStream("testWrite.txt");
//        OutputStream fileOutputStream = System.out;
        Writer outputStream = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStream);

        String line = bufferedReader.readLine();
        while (line != null && !line.isEmpty()) {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            line = bufferedReader.readLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}