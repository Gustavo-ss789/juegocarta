package mx.edu.istpa.tics.juegocartas;

import java.util.List;
import java.util.*;
/*
*Clase principal del juego.
* Ejecuta la partida, mostrando mano con cartas y puntos.
*/

public class Juego {
/*
    * Principal que inicia el juego.
    * Se genera la baraja, que es repartida con las cartas y se calcula los puntos.
    */
    public static void main(String[] args) {
        ServicioJuego servicio = new ServicioJuego();
        List<Carta> baraja = servicio.crearBaraja();
/*
        * primeras 5 cartas 
        */
        List<Carta> manoJugador = baraja.subList(0, 5);

        System.out.println("Tu mano:");
        servicio.mostrarMano(manoJugador);

        int puntos = servicio.calcularPuntos(manoJugador);
        System.out.println("Total de puntos: " + puntos);
    }
}
