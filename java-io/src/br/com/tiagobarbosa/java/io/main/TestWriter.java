package br.com.tiagobarbosa.java.io.main;

import java.io.*;

public class TestWriter {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("testWrite.txt");
        Writer outputStream = new OutputStreamWriter(fileOutputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStream);

        bufferedWriter.write("Testing write a new file using BufferedWriter.");
        bufferedWriter.newLine();
        bufferedWriter.newLine();
        bufferedWriter.write("Other line for testing...");
        bufferedWriter.close();
    }
}