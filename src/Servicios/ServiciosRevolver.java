/*
 Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los
valores deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)
 */
package Servicios;

import java.util.concurrent.ThreadLocalRandom;
import Entidades.Revolver;

/**
 *
 * @author alvaro
 */
public class ServiciosRevolver {

    public Revolver llenarRevolver() {
        Revolver r1 = new Revolver();
        r1.setPosicionActual(ThreadLocalRandom.current().nextInt(1, 6 + 1));
        r1.setPosicionAgua(ThreadLocalRandom.current().nextInt(1, 6 + 1));
        System.out.println(r1);
        return r1;
    }

    public Boolean mojar(Revolver r1) {
        int actual = r1.getPosicionActual();
        int agua = r1.getPosicionAgua();
        return (actual == agua);
    }

    public void siguienteChorro(Revolver r1) {
        int actual = r1.getPosicionActual();
        if (actual < 6) {
            r1.setPosicionActual(actual+1);
        } else {
            r1.setPosicionActual(0);
        }
    }

}
