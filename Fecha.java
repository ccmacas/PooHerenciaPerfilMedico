package registromedico;

public class Fecha {

    // atributos
    private int dia;
    private int mes;
    private int anio;

    // constructor 
    
    public Fecha(String fecha){
        String []valores = fecha.split("/");
        this.dia = Integer.parseInt(valores[0]);
        this.mes = Integer.parseInt(valores[1]);
        this.anio = Integer.parseInt(valores[2]);
    }
    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    // metodos get y set 
    public int getdia() {
        return dia;
    }

    public int getmes() {
        return mes;
    }

    public int getanio() {
        return anio;
    }

    public void setdia(int dia) {
        this.dia = dia;
    }

    public void setmes(int mes) {
        this.mes = mes;
    }

    public void setanio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return String.format("%2d/%2d/%4d", this.dia, this.mes, this.anio);
    }

}
