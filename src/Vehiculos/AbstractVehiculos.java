/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vehiculos;

import Vehiculos.Avion.Avion;
import Vehiculos.Carro.Carro;

/**
 *
 * @author javie
 */
public interface AbstractVehiculos {
    Avion GetAvion(String Type);
    Carro GetCarro(String Type);
}
