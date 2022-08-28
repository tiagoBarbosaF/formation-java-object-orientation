package br.com.tiagobarbosa.java.io.main;

import java.io.*;

public class TestWriterPrintWriter {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fileOutputStream = new FileOutputStream("testWrite.txt");
//        Writer outputStream = new OutputStreamWriter(fileOutputStream);
//        BufferedWriter bufferedWriter = new BufferedWriter(outputStream);

//        PrintStream printStream = new PrintStream("testWrite.txt");
        PrintWriter printWriter = new PrintWriter("testWrite.txt");
        printWriter.println("Testing write a new file using PrintWriter.");
        printWriter.println();
        printWriter.println();
        printWriter.println("Other line for testing...");
        printWriter.close();
    }
}