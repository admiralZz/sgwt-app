package com.example.sgwt.runner;


import org.apache.catalina.startup.Tomcat;

public class Main {
    public static void main(String[] args) {
        // Указываем порт
        int port = 8080;

        // Создаём Tomcat
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(port);
        tomcat.getConnector();

        // Указываем путь к веб-приложению (web.xml, WEB-INF/classes, т.д.)
        String webappDirLocation = specify_your_exploded_war;

        // Регистрируем веб-приложение
        tomcat.addWebapp("/app", webappDirLocation);

        System.out.println("✅ Starting Tomcat on http://localhost:" + port);
        System.out.println("→ Using webapp dir: " + webappDirLocation);

        try {
            tomcat.start();
            tomcat.getServer().await();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
