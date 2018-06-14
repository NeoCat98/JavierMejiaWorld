/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio.CreacionDeVehiculos;

/**
 *
 * @author javie
 */
public class NuevoEdificioDeVehiculos implements CreacionDeVehiculos{
    int vida = 350, Vehiculos = 3,Tiempo = 10, costo = 200;
    
    @Override
    public void Elegir() {
        System.out.println("Se ha creado el edificio de vehiculos con exito.");
        System.out.println("Cantidad de vida actual: " + vida);
        System.out.println("Cantidad de vehiculos que puede tener: " + Vehiculos);
        System.out.println("Tiempo que tarda en crearse: "+ Tiempo);
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getTiempoEnConstruir() {
        return Tiempo;
    }

    @Override
    public int Especialidad() {
        return Vehiculos;
    }

    @Override
    public int getCosto() {
        return costo;
    }
}
