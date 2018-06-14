/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza;

import Raza.Ingeniero.FactoryIngeniero;
import Raza.Mecanico.FactoryMecanico;
import Raza.Militar.FactoryMilitar;

/**
 *
 * @author javie
 */
public class RazaProducer {
    public static AbstractRaza getFactory(String Type){
        switch(Type){
            case "Militar":
                return new FactoryMilitar();
            case "Mecanico":
                return new FactoryMecanico();
            case "Ingeniero":
                return new FactoryIngeniero();
        }
        return null;
    }
}
