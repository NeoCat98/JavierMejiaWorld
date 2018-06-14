/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza.Mecanico;

import Raza.Ingeniero.Ingeniero;
import Raza.Militar.Militar;
import Raza.AbstractRaza;

/**
 *
 * @author javie
 */
public class FactoryMecanico implements AbstractRaza{

    @Override
    public Ingeniero GetIngeniero(String Type) {
        return null;
    }

    @Override
    public Mecanico GetMecanico(String Type) {
        return new EspecialidadMecanico();
    }

    @Override
    public Militar GetMilitar(String Type) {
        return null;
    }
    
}
