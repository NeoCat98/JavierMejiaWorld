/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio;

import Edificio.CreacionDeTropas.FactoryCreacionDeTropas;
import Edificio.CreacionDeVehiculos.FactoryCreacionDeVehiculos;
import Edificio.EdificioCentral.FactoryEdificioCentral;
import Edificio.EdificioDeComida.FactoryEdificioDeComida;
import Edificio.EdificioDeMateriales.FactoryEdificioDeMateriales;
import Edificio.EdificioDeOro.FactoryEdificioDeOro;

/**
 *
 * @author javie
 */
public class EdificioProducer {
    public static AbstractEdificio getFactory(String Type){
        
        switch(Type){
            case "Edificio central":
                return new FactoryEdificioCentral();
            case "Creacion de tropas":
                return new FactoryCreacionDeTropas();
            case "Creacion de vehiculos":
                return new FactoryCreacionDeVehiculos();
            case "Edificio de Oro":
                return new FactoryEdificioDeOro();
            case "Edificio de Comida":
                return new FactoryEdificioDeComida();
            case "Edificio de Materiales":
                return new FactoryEdificioDeMateriales();
        }
        return null;
    }
}
