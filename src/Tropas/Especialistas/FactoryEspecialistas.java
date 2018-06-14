/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tropas.Especialistas;

import Tropas.AbstractTropas;
import Tropas.Escuadrones.Escuadrones;

/**
 *
 * @author javie
 */
public class FactoryEspecialistas implements AbstractTropas {

    @Override
    public Escuadrones GetEscuadrones() {
        return null;
    }

    @Override
    public Especialistas GetEspecialistas() {
        return new NuevoEspecialista();
    }
    
}
