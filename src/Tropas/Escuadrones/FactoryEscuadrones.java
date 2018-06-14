/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tropas.Escuadrones;

import Tropas.AbstractTropas;
import Tropas.Especialistas.Especialistas;

/**
 *
 * @author javie
 */
public class FactoryEscuadrones implements AbstractTropas{

    @Override
    public Escuadrones GetEscuadrones() {
        return new NuevoEscuadron();
    }

    @Override
    public Especialistas GetEspecialistas() {
        return null;
    }
    
}
