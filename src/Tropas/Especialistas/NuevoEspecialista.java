/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tropas.Especialistas;

/**
 *
 * @author javie
 */
public class NuevoEspecialista implements Especialistas{
    
    int vida = 300 , ataqueE=60 , ataque = 120, velocidad = 7 , tiempo = 10;
    
    @Override
    public void Elegir() {
        System.out.println("Cantidad de vida: " + vida);
        System.out.println("Cantidad de ataque por turno a edificios: " + ataqueE);
        System.out.println("Cantidad de ataque por turno a unidades: " + ataque);
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
