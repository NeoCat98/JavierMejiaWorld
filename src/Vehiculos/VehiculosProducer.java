/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Vehiculos.Avion.FactoryAvion;
import Vehiculos.Carro.FactoryCarro;

/**
 *
 * @author javie
 */
public class VehiculosProducer {
    public static AbstractVehiculos getFactory(String type){
        switch(type){
            case "Avion":
                return new FactoryAvion();
            case "Carro":
                return new FactoryCarro();
        }
        return null;
    }
}
