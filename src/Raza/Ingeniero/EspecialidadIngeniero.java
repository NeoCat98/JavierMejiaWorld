/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza.Ingeniero;

/**
 *
 * @author javie
 */
public class EspecialidadIngeniero implements Ingeniero{
    int creacionT = 5,creacionV = 6,creacionE = 7,costoT = 4,costoV = 3,costoE = 2;
    @Override
    public void Elegir() {
        System.out.println("");
        System.out.println("------------------INGENIERO------------------");
        System.out.println("Velocidad de creacion de tropas: [IIIII-----]");
        System.out.println("Costo de las tropas: [IIIIIIII--]");
        System.out.println("Velocidad de cracion de vehiculos: [IIIIII----]");
        System.out.println("Costo de los vehiculos: [IIIIII----]");
        System.out.println("Velocidad de creacion de edificios: [IIIIIII---]");
        System.out.println("Costo de los edificios: [IIII------]");
        System.out.println("");
    }
    
    @Override
    public int getCreacionT(){
        return creacionT;
    }
    
    @Override
    public int getCreacionV(){
        return creacionV;
    }
    
    @Override
    public int getCreacionE(){
        return creacionE;
    }
    
    @Override
    public int getCostoT(){
        return costoT;
    }
    
    @Override
    public int getCostoV(){
        return costoV;
    }
    
    @Override 
    public int getCostoE(){
        return costoE;
    }
}