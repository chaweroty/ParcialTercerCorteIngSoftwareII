package Pregunta2;

public class Main {
    public static void main(String[] args) {
        Hamburguesa hamburguesa = new HamburguesaBuilder()
                .setTipoTomate("Tomate Cherry")
                .setTipoCarne("Carne de Res")
                .setTipoQueso("Queso mozarella")
                .setTipoPan("Pan de miga")
                .build();

        System.out.println("Hamburguesa creada con:");
        System.out.println("Tomate: " + hamburguesa.getTipoTomate());
        System.out.println("Carne: " + hamburguesa.getTipoCarne());
        System.out.println("Queso: " + hamburguesa.getTipoQueso());
        System.out.println("Pan: " + hamburguesa.getTipoPan());
    }
}