/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio.CreacionDeTropas;

/**
 *
 * @author javie
 */
public class NuevoEdificioDeTropas implements CreacionDeTropas{
    int vida = 300, Tropas = 5,tiempo = 10,costo = 200;
    @Override
    public void Elegir() {
        System.out.println("Se ha creado el edificio de tropas con exito");
        System.out.println("Cantidad de vida actual: " + vida);
        System.out.println("Cantidad de tropas que puede tener: " + Tropas);
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getTiempoEnConstruir() {
        return tiempo;
    }

    @Override
    public int getEspecialidad() {
        return Tropas;
    }

    @Override
    public int getCosto() {
        return costo;
    }
    
}
