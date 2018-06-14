/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza.Militar;

/**
 *
 * @author javie
 */
public class EspecialidadMilitar implements Militar {
    int creacionT = 9,creacionV = 6,creacionE = 2,costoT = 3,costoV = 5,costoE = 7;
    
    @Override
    public String Elegir() {
        System.out.println("");
        System.out.println("--------------------MILITAR--------------------");
        System.out.println("Velocidad de creacion de tropas: [IIIIIIIII-]");
        System.out.println("Costo de las tropas: [III-------]");
        System.out.println("Velocidad de cracion de vehiculos: [IIIIII----]");
        System.out.println("Costo de los vehiculos: [IIIII-----]");
        System.out.println("Velocidad de creacion de edificios: [II--------]");
        System.out.println("Costo de los edificios: [IIIIIII---]");
        System.out.println("");
        return "hola";
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
