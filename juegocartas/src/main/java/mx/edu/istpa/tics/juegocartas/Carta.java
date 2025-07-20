package mx.edu.istpa.tics.juegocartas;
/*
* Representa una carta de la baraja palo, valor y puntos.
*/
public class Carta {
    private String palo;
    private String valor;
    private int puntos;
/*
    * Crear una carta
    * El palo de la carta como corazones, treboles.
    * Puntos que vale cada carta.
    
    */
    
    public Carta(String palo, String valor, int puntos) {
        this.palo = palo;
        this.valor = valor;
        this.puntos = puntos;
    }
/*
    * Devuelve los puntos de las cartas.
    * @return de los que esten asociados a la carta.
    */
    public int getPuntos() {
        return puntos;
    }
/*
    * Devuelv+e el texto de la carta.
    * @return  una cadena con valor, palo y los puntos de carta.
    */
    public String toString() {
        return valor + " de " + palo + " ( " + puntos + " puntos )";
    }
}