/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos.Avion;

import Vehiculos.AbstractVehiculos;
import Vehiculos.Carro.Carro;

/**
 *
 * @author javie
 */
public class FactoryAvion implements AbstractVehiculos{

    @Override
    public Avion GetAvion(String Accion) {
        return new NuevoAvion();
    }

    @Override
    public Carro GetCarro(String Accion) {
        return null;
    }
    
}
