/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio.EdificioDeOro;

import Edificio.AbstractEdificio;
import Edificio.CreacionDeTropas.CreacionDeTropas;
import Edificio.CreacionDeVehiculos.CreacionDeVehiculos;
import Edificio.EdificioCentral.EdificioCentral;
import Edificio.EdificioDeComida.EdificioDeComida;
import Edificio.EdificioDeMateriales.EdificioDeMateriales;

/**
 *
 * @author javie
 */
public class FactoryEdificioDeOro implements AbstractEdificio{

    @Override
    public EdificioCentral GetEdificioCentral() {
        return null;
    }

    @Override
    public CreacionDeTropas GetCreacionDeTropas() {
        return null;
    }

    @Override
    public CreacionDeVehiculos GetCreacionDeVehiculos() {
        return null;
    }

    @Override
    public EdificioDeComida GetEdificioDeComida() {
        return null;
    }

    @Override
    public EdificioDeMateriales GetEdificioDeMateriales() {
        return null;
    }

    @Override
    public EdificioDeOro GetEdificioDeOro() {
        return new NuevoEdificioDeOro();
    }
    
}
