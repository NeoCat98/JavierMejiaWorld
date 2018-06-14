/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tropas;

import Tropas.Escuadrones.Escuadrones;
import Tropas.Especialistas.Especialistas;

/**
 *
 * @author javie
 */
public interface AbstractTropas {
    Escuadrones GetEscuadrones();
    Especialistas GetEspecialistas();
}
