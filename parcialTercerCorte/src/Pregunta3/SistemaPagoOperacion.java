package Pregunta3;

public class SistemaPagoOperacion {
    private String nombreUsuario;
    private String correo;

    public SistemaPagoOperacion(String nombreUsuario, String correo) {
        this.nombreUsuario = nombreUsuario;
        this.correo = correo;
    }

    public void iniciarSesionExistente() {
        System.out.println("Iniciando sesión para el usuario: " + nombreUsuario);
    }

    public void validarCorreoExistente() {
        System.out.println("Validando el correo: " + correo);
    }

    public void procesarPagoExistente() {
        System.out.println("Realizando el pago en el sistema existente");
    }
}
