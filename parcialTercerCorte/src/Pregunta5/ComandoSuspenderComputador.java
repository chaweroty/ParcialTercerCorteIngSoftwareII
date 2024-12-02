package Pregunta5;

public class ComandoSuspenderComputador implements Comando {
    private Computador computador;

    public ComandoSuspenderComputador(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void ejecutar() {
        computador.suspender();
    }
}