package Pregunta3;

public class SistemaPagoAdapter implements SistemaPago {
    private SistemaPagoOperacion sistemaPagoOperacion;

    // Constructor para inicializar sistemaPagoOperacion
    public SistemaPagoAdapter(SistemaPagoOperacion sistemaPagoOperacion) {
        this.sistemaPagoOperacion = sistemaPagoOperacion;
    }

    @Override
    public void iniciarSesion() {
        sistemaPagoOperacion.iniciarSesionExistente();
    }

    @Override
    public void validarDatos() {
        sistemaPagoOperacion.validarCorreoExistente();
    }

    @Override
    public void realizarPago() {
        sistemaPagoOperacion.procesarPagoExistente();
    }
}
