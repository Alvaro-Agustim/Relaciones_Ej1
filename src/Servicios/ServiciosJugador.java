/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
    • disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
    mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
    revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
    devuelve true, sino false.
 */
package Servicios;

import Entidades.Jugador;
import Entidades.Revolver;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class ServiciosJugador {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Jugador crearJugador() {
        Jugador j1 = new Jugador();
        System.out.println("Ingrese el nombre del jugador");
        j1.setNombre(leer.next());
        return j1;
    }

    public Boolean disparo(Revolver r) {
        ServiciosRevolver rs = new ServiciosRevolver();
        Boolean mojado = rs.mojar(r);
        rs.siguienteChorro(r);
        return mojado;
    }
}
