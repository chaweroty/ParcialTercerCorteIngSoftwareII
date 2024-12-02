package Pregunta2;

public class HamburguesaBuilder {
    protected String tipoTomate;
    protected String tipoCarne;
    protected String tipoQueso;
    protected String tipoPan;

    public HamburguesaBuilder setTipoTomate(String tipoTomate) {
        this.tipoTomate = tipoTomate;
        return this;
    }

    public HamburguesaBuilder setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }

    public HamburguesaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    public HamburguesaBuilder setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
        return this;
    }

    public Hamburguesa build() {
        return new Hamburguesa(this);
    }
}