package Pregunta5;

public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();

        Comando comandoEncenderComputador = new ComandoEncenderComputador(computador);
        Comando comandoReiniciarComputador = new ComandoReiniciarComputador(computador);
        Comando comandoSuspenderComputador = new ComandoSuspenderComputador(computador);
        Comando comandoApagarComputador = new ComandoApagarComputador(computador);

        Comando comandoEncenderCelular = new ComandoEncenderCelular(celular);
        Comando comandoReiniciarCelular = new ComandoReiniciarCelular(celular);
        Comando comandoSuspenderCelular = new ComandoSuspenderCelular(celular);
        Comando comandoApagarCelular = new ComandoApagarCelular(celular);

        ControlRemoto controlRemoto = new ControlRemoto();

        controlRemoto.asignarComando("encenderComputador", comandoEncenderComputador);
        controlRemoto.asignarComando("reiniciarComputador", comandoReiniciarComputador);
        controlRemoto.asignarComando("suspenderComputador", comandoSuspenderComputador);
        controlRemoto.asignarComando("apagarComputador", comandoApagarComputador);

        controlRemoto.asignarComando("encenderCelular", comandoEncenderCelular);
        controlRemoto.asignarComando("reiniciarCelular", comandoReiniciarCelular);
        controlRemoto.asignarComando("suspenderCelular", comandoSuspenderCelular);
        controlRemoto.asignarComando("apagarCelular", comandoApagarCelular);

        controlRemoto.ejecutarComando("encenderComputador");
        controlRemoto.ejecutarComando("reiniciarComputador");
        controlRemoto.ejecutarComando("suspenderComputador");
        controlRemoto.ejecutarComando("apagarComputador");

        controlRemoto.ejecutarComando("encenderCelular");
        controlRemoto.ejecutarComando("reiniciarCelular");
        controlRemoto.ejecutarComando("suspenderCelular");
        controlRemoto.ejecutarComando("apagarCelular");
    }
}