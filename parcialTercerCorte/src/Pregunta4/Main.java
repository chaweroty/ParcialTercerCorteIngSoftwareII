package Pregunta4;

public class Main {
    public static void main(String[] args) {
        Configuracion config = Configuracion.getInstancia();

        System.out.println("URL: " + config.getUrl());
        System.out.println("Usuario: " + config.getUsuario());
        System.out.println("Password: " + config.getPassword());

        config.setUrl("http://softwareII.com");
        config.setUsuario("nuevoUsuario");
        config.setPassword("nuevaPassword");

        System.out.println("Configuración actualizada:");
        System.out.println("URL: " + config.getUrl());
        System.out.println("Usuario: " + config.getUsuario());
        System.out.println("Password: " + config.getPassword());
    }
}