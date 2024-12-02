package Pregunta2;

public class Hamburguesa {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;
    public Hamburguesa(HamburguesaBuilder builder) {
        this.tipoTomate = builder.tipoTomate;
        this.tipoCarne = builder.tipoCarne;
        this.tipoQueso = builder.tipoQueso;
        this.tipoPan = builder.tipoPan;
    }

    public String getTipoTomate() {
        return tipoTomate;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public String getTipoQueso() {
        return tipoQueso;
    }

    public String getTipoPan() {
        return tipoPan;
    }
}