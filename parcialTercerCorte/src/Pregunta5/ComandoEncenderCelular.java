package Pregunta5;

public class ComandoEncenderCelular implements Comando {
    private Celular celular;

    public ComandoEncenderCelular(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void ejecutar() {
        celular.encender();
    }
}