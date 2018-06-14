/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio.EdificioDeComida;

/**
 *
 * @author javie
 */
public class NuevoEdificioDeComida implements EdificioDeComida{
    int vida = 150, recursoComida = 20,Tiempo = 8, costo = 75;
    
    @Override
    public void Elegir() {
        System.out.println("Se ha creado el recolector de comida con exito");
        System.out.println("Cantidad de vida:" + vida);
        System.out.println("Cantidad de recurso comida generado por turno: " + recursoComida );
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getTiempoEnCronstruir() {
        return Tiempo;
    }

    @Override
    public int getEspecialidad() {
        return recursoComida;
    }

    @Override
    public int getCosto() {
        return costo;
    }
    
}
