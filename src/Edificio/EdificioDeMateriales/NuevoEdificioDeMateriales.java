/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio.EdificioDeMateriales;

/**
 *
 * @author javie
 */
public class NuevoEdificioDeMateriales implements EdificioDeMateriales{
    int vida = 250,recursoMaterial = 50,Tiempo = 10, costo = 100;
    
    @Override
    public void Elegir() {
        System.out.println("Se ha creado el recolector de materia prima con exito.");
        System.out.println("Cantidad de vida: " + vida);
        System.out.println("Cantidad de recurso material generado por turno: " + recursoMaterial);
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getTiempoEnConstruir() {
        return Tiempo;
    }

    @Override
    public int getEspecialidad() {
        return recursoMaterial;
    }

    @Override
    public int getCosto() {
        return costo;
    }
}
