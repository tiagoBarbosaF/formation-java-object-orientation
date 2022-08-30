package br.com.tiagobarbosa.java.io.main;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class TestCharset {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String string = "ç";
        System.out.println(string.codePointAt(0));

        Charset charset = Charset.defaultCharset();
        System.out.println(charset.displayName());

        byte[] bytes = string.getBytes(charset.displayName());
        System.out.println(bytes.length + ", " + charset.displayName());
        String newString = new String(bytes, charset.displayName());
        System.out.println(newString);

        byte[] bytes2 = string.getBytes(StandardCharsets.UTF_16);
        System.out.println(bytes2.length + ", " + StandardCharsets.UTF_16);
        newString = new String(bytes2, StandardCharsets.UTF_16);
        System.out.println(newString);

        bytes2 = string.getBytes(StandardCharsets.US_ASCII);
        System.out.println(bytes2.length + ", " + StandardCharsets.US_ASCII);
        newString = new String(bytes2, StandardCharsets.US_ASCII);
        System.out.println(newString);
    }
}
