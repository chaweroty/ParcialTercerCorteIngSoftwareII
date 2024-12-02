package Pregunta3;
public class Main {
    public static void main(String[] args) {
        SistemaPagoOperacion sistemaOperacion = new SistemaPagoOperacion("Usuario1", "sebs@autonoma.com");
        SistemaPago adaptador = new SistemaPagoAdapter(sistemaOperacion);

        System.out.println("Usando el adaptador para el sistema existente:");
        adaptador.iniciarSesion();
        adaptador.validarDatos();
        adaptador.realizarPago();

        NuevoSistemaPago nuevoSistemaPago = new NuevoSistemaPago("Usuario2", "12345", "sebs2@example.com");
        NuevoSistemaPagoOperacion operacion = new NuevoSistemaPagoOperacion();

        System.out.println("Usando el nuevo sistema de pago:");
        operacion.crearSesion(nuevoSistemaPago);
        operacion.validarCorreo(nuevoSistemaPago);
        operacion.validarAutorizacion();
        operacion.realizarPago(nuevoSistemaPago);
    }
}
