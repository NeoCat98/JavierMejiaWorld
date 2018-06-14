/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio.CreacionDeTropas;

import Edificio.AbstractEdificio;
import Edificio.CreacionDeVehiculos.CreacionDeVehiculos;
import Edificio.EdificioCentral.EdificioCentral;
import Edificio.EdificioDeComida.EdificioDeComida;
import Edificio.EdificioDeMateriales.EdificioDeMateriales;
import Edificio.EdificioDeOro.EdificioDeOro;

/**
 *
 * @author javie
 */
public class FactoryCreacionDeTropas implements AbstractEdificio{

    @Override
    public EdificioCentral GetEdificioCentral() {
        return null;
    }

    @Override
    public CreacionDeTropas GetCreacionDeTropas() {
        return new NuevoEdificioDeTropas();
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
        return null;
    }
    
}
