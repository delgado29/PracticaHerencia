public class Provincia extends Zona{
    private String idioma;
    protected String moneda;
    private String preidente;

    public Provincia ( String idioma, String moneda, String preidente, String name, double surface){
        super(name, surface);
        this.idioma=idioma;
        this.moneda=moneda;
        this.preidente=preidente;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setPreidente(String preidente) {
        this.preidente = preidente;
    }

    public String getPreidente() {
        return preidente;
    }
}
