/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza;

import Raza.Ingeniero.Ingeniero;
import Raza.Mecanico.Mecanico;
import Raza.Militar.Militar;

/**
 *
 * @author javie
 */
public interface AbstractRaza {
    Ingeniero GetIngeniero(String Type);
    Mecanico GetMecanico(String Type);
    Militar GetMilitar(String Type);
}
