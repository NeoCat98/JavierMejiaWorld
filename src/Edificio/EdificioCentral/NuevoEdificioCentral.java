/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Edificio.EdificioCentral;

/**
 *
 * @author javie
 */
public class NuevoEdificioCentral implements EdificioCentral{
    int vida = 500, MaxOro = 1000, MaxMateriales = 1000, MaxComida = 200,cantidadO =500,cantidadM = 500,cantidadC = 50;
            
    @Override
    public void Elegir() {
        System.out.println("Se ha creado el edificio central con exito");
        System.out.println("Cantidad de vida actual: " + vida);
        System.out.println("Cantidad de oro: " + MaxOro);
        System.out.println("Cantidad de materiales: " + MaxMateriales);
        System.out.println("Cantidad de comida: " + MaxComida);
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public int getCantidadOroMax() {
        return MaxOro;
    }

    @Override
    public int getCantidadMaterialesMax() {
        return MaxMateriales;
    }

    @Override
    public int getCantidadComidaMax() {
        return MaxComida;
    }

    @Override
    public int getCantidadO() {
        return cantidadO;
    }

    @Override
    public int getCantidadM() {
        return cantidadM;
    }

    @Override
    public int getCantidadC() {
        return cantidadC;
    }
    
}
