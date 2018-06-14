/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tropas;

import Tropas.Escuadrones.FactoryEscuadrones;
import Tropas.Especialistas.FactoryEspecialistas;

/**
 *
 * @author javie
 */
public class TropasProducer {
    public static AbstractTropas getFactory(String Type){
        switch(Type){
            case "Escuadrones":
                return new FactoryEscuadrones();
            case "Especialista":
                return new FactoryEspecialistas();
        }
        return null;
    }
}
