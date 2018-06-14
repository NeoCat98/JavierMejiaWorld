/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio.EdificioDeOro;

/**
 *
 * @author javie
 */
public class NuevoEdificioDeOro implements EdificioDeOro{
    int vida = 250 ,recursoOro = 50,Tiempo = 10,costo = 100;
        
    @Override
    public void Elegir() {
        System.out.println("Se ha creado el recolector de oro con exito");
        System.out.println("Cantidad de vida: " + vida);
        System.out.println("Cantidad de recurso oro generado por turno: " + recursoOro);
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
    public int Especialidad() {
        return recursoOro;
    }

    @Override
    public int getCosto() {
        return costo;
    }
    
}
