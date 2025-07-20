
package mx.edu.istpa.tics.juegocartas;
import java.util.*;

public class ServicioJuego {

    public List<Carta> crearBaraja() {
        String[] palos = {"Corazones", "Diamantes", "Treboles", "Picas"};
        String[] valores = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        List<Carta> baraja = new ArrayList<>();

        for (String palo : palos) {
            for (String valor : valores) {
                int puntos = calcularValor(valor);
                baraja.add(new Carta(palo, valor, puntos));
            }
        }
        Collections.shuffle(baraja);
        return baraja;
    }

    private int calcularValor(String valor) {
        switch (valor) {
            case "A": return 11;
            case "J": case "Q": case "K": return 10;
            default: return Integer.parseInt(valor);
        }
    }

    public int calcularPuntos(List<Carta> mano) {
        int total = 0;
        for (Carta carta : mano) {
            total += carta.getPuntos();
        }
        return total;
    }

    public void mostrarMano(List<Carta> mano) {
        for (Carta carta : mano) {
            System.out.println(carta);
        }
    }


}