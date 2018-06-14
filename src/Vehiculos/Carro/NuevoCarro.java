/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos.Carro;

/**
 *
 * @author javie
 */
public class NuevoCarro implements Carro{
    int velocidad = 3, cantidadT = 4,tiempo = 5,costo = 600;
    @Override
    public void Elegir() {
        System.out.println("Velocidad del carro: " + velocidad);
        System.out.println("Cantidad de tropas que caben: " + cantidadT);
        System.out.println("Costo" + costo);
        
    }

    @Override
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public int getCantidadT() {
        return cantidadT;
    }

    @Override
    public int getTiempo() {
        return tiempo;
    }

    @Override
    public int getCosto() {
        return costo;
    }
    
}
