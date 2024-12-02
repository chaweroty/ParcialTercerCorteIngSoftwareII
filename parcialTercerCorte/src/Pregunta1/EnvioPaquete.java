package Pregunta1;

public class EnvioPaquete implements EnvioFactory{
        @Override
        public void enviarFormaExpress(String paquete) {
            System.out.println("Enviando paquete de forma express: " + paquete);
        }

        @Override
        public void enviarFormaRegular(String paquete) {
            System.out.println("Enviando paquete de forma regular: " + paquete);
        }

}
