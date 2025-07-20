package mx.edu.istpa.tics.juegocartas;

import java.util.List;
import java.util.*;

public class Juego {

    public static void main(String[] args) {
        ServicioJuego servicio = new ServicioJuego();
        List<Carta> baraja = servicio.crearBaraja();

        List<Carta> manoJugador = baraja.subList(0, 5);

        System.out.println("Tu mano:");
        servicio.mostrarMano(manoJugador);

        int puntos = servicio.calcularPuntos(manoJugador);
        System.out.println("Total de puntos: " + puntos);
    }
}
