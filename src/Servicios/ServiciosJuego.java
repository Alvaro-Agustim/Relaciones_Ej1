/*
llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los
jugadores y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego,
sino se moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se
tiene que mojar. Al final del juego, se debe mostrar que jugador se mojó.
Pensar la lógica necesaria para realizar esto, usando los atributos de la clase Juego.
 */
package Servicios;


import Entidades.Juego;
import Entidades.Jugador;
import Entidades.Revolver;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class ServiciosJuego {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Juego altaRuleta(ArrayList<Jugador> jugadores, Revolver r) {
        Juego ruleta = new Juego();
        ruleta.setJugadores(jugadores);
        ruleta.setRevolver(r);
        return ruleta;
    }

    public void ronda(Juego j) {        
        ServiciosJugador sj = new ServiciosJugador();
        List<Jugador> jugadores = j.getJugadores();
        Revolver r = j.getRevolver();
        Boolean stop = false;
        while(!stop){
            for (Jugador jugador : jugadores) {
                System.out.println("Turno del jugador "+jugador.getId());
                if(sj.disparo(r)){
                    jugador.setMojado(true);
                    System.out.println("El jugador "+jugador+" perdio");
                    stop = true;
                    break;                    
                }
            }
        }
    }

    public void iniciarJuego() {
        ServiciosJugador sj = new ServiciosJugador();
        ArrayList<Jugador> jugadores = new ArrayList();
        ServiciosRevolver rs = new ServiciosRevolver();
        Revolver r1 = rs.llenarRevolver();
        System.out.println("Ingrese la cantidad de jugadores");
        int cantidadJugadores = leer.nextInt();
        for (int i = 0; i < cantidadJugadores; i++) {
            Jugador j = sj.crearJugador();
            j.setId(i + 1);
            jugadores.add(j);
        }       
        Juego ruleta = altaRuleta(jugadores, r1);
        ronda(ruleta);
    }
}
