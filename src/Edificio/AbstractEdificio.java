/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio;

import Edificio.CreacionDeTropas.CreacionDeTropas;
import Edificio.CreacionDeVehiculos.CreacionDeVehiculos;
import Edificio.EdificioCentral.EdificioCentral;
import Edificio.EdificioDeComida.EdificioDeComida;
import Edificio.EdificioDeMateriales.EdificioDeMateriales;
import Edificio.EdificioDeOro.EdificioDeOro;

/**
 *
 * @author javie
 */
public interface AbstractEdificio {
    EdificioCentral GetEdificioCentral();
    CreacionDeTropas GetCreacionDeTropas();
    CreacionDeVehiculos GetCreacionDeVehiculos();
    EdificioDeComida GetEdificioDeComida();
    EdificioDeMateriales GetEdificioDeMateriales();
    EdificioDeOro GetEdificioDeOro();
}
