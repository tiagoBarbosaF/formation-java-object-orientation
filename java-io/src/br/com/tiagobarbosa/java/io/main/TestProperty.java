package br.com.tiagobarbosa.java.io.main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperty {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("login", "admin");
        properties.setProperty("senha", "adminSenha");
        properties.setProperty("url", "www.tiagobarbosa.com");

        properties.store(new FileWriter("conf.properties"), "properties login");

        Properties reading = new Properties();
        reading.load(new FileReader("conf.properties"));

        String login = reading.getProperty("login");
        String senha = reading.getProperty("senha");
        String url = reading.getProperty("url");

        System.out.printf("Login: %s%nSenha: %s%nURL: %s%n", login, senha, url);
    }
}
