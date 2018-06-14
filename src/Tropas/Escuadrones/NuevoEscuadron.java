/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tropas.Escuadrones;

/**
 *
 * @author javie
 */
public class NuevoEscuadron implements Escuadrones{
    
    int vida = 50 , ataque = 35 , ataqueE= 20 , velocidad = 7 , tiempo = 5;
    
    @Override
    public void Elegir() {

        System.out.println("Cantidad de vida: " + vida);
        System.out.println("Cantida de ataque por turno a edificios: " + ataqueE);
        System.out.println("Cantidad de ataque por turno a otras unidades: " + ataque);
    }

    @Override
    public int getAtaque() {
        return ataque;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public int getAtaqueEdificio() {
        return ataqueE;
    }

    @Override
    public int getTiempo() {
        return tiempo;
    }
    
}
