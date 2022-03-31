/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author alvaro esta clase posee los siguientes atributos: posición
 * actual(posición del tambor que se dispara, puede que esté el agua o no) y
 * posición agua (laposición del tambor donde se encuentra el agua). Estas dos
 * posiciones, se generarán aleatoriamente.
 *
 */
public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
    }

    public int getPosicionActual() {
        return posicionActual;
    }

    public void setPosicionActual(int posicionActual) {
        this.posicionActual = posicionActual;
    }

    public int getPosicionAgua() {
        return posicionAgua;
    }

    public void setPosicionAgua(int posicionAgua) {
        this.posicionAgua = posicionAgua;
    }

    @Override
    public String toString() {
        return "posicionActual: " + posicionActual
                + "\nposicionAgua: " + posicionAgua;
    }

}
