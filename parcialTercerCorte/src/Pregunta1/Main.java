package Pregunta1;

public class Main {
    public static void main(String[] args) {

        EnvioFactory envioFactory = new EnvioPaquete();

        String paqueteExpress = "Paquete 1";
        envioFactory.enviarFormaExpress(paqueteExpress);

        String paqueteRegular = "Paquete 2";
        envioFactory.enviarFormaRegular(paqueteRegular);
    }
}