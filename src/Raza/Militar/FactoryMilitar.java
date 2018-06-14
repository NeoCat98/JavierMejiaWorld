/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza.Militar;

import Raza.Ingeniero.Ingeniero;
import Raza.Mecanico.Mecanico;
import Raza.AbstractRaza;

/**
 *
 * @author javie
 */
public class FactoryMilitar implements AbstractRaza {

    @Override
    public Ingeniero GetIngeniero(String Type) {
        return null;
    }

    @Override
    public Mecanico GetMecanico(String Type) {
        return null;
    }

    @Override
    public Militar GetMilitar(String Type) {
        return new EspecialidadMilitar();
    }
    
}
