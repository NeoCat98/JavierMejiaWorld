/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos.Carro;

import Vehiculos.AbstractVehiculos;
import Vehiculos.Avion.Avion;

/**
 *
 * @author javie
 */
public class FactoryCarro implements AbstractVehiculos{

    @Override
    public Avion GetAvion(String Accion) {
        return null;
    }

    @Override
    public Carro GetCarro(String Accion) {
        return new NuevoCarro();
    }
    
}
