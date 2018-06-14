/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos.Avion;

/**
 *
 * @author javie
 */
public class NuevoAvion implements Avion{
    int Velocidad = 2, cantidadT = 10,tiempo = 8, costo = 1100;
    
    @Override
    public void Elegir() {

        System.out.println("La velocidad del avion: " + Velocidad);
        System.out.println("Cantidad de tropas que caben: " + cantidadT);
        System.out.println("Costo: " + costo);
    }
    @Override
    public int getVelocidad() {
        return Velocidad;
    }

    @Override
    public int getTiempo() {
        return tiempo;
    }

    @Override
    public int getCosto() {
        return costo;
    }

    @Override
    public int getCantidadT() {
        return cantidadT;
    }
    
}
