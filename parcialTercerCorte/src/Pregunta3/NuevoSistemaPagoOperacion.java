package Pregunta3;

public class NuevoSistemaPagoOperacion {
    public void crearSesion(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("Creando la sesión para: " + nuevoSistemaPago.getNombre());
    }

    public void validarCorreo(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("Validando el correo: " + nuevoSistemaPago.getCorreo());
    }

    public void validarAutorizacion() {
        System.out.println("Validando autorización");
    }

    public void realizarPago(NuevoSistemaPago nuevoSistemaPago) {
        System.out.println("Realizando el pago");
    }
}
