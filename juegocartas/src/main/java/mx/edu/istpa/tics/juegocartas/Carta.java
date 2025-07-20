package mx.edu.istpa.tics.juegocartas;

public class Carta {
    private String palo;
    private String valor;
    private int puntos;

    public Carta(String palo, String valor, int puntos) {
        this.palo = palo;
        this.valor = valor;
        this.puntos = puntos;
    }

    public int getPuntos() {
        return puntos;
    }

    public String toString() {
        return valor + " de " + palo + " (" + puntos + " puntos)";
    }
}