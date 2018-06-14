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
    int creacionT = 7,creacionV = 6,creacionE = 5,costoT = 2,costoV = 3,costoE = 4;
    
    @Override
    public String Elegir() {
        System.out.println("");
        System.out.println("--------------------MILITAR--------------------");
        System.out.println("Velocidad de creacion de tropas: [IIIIIII---]");
        System.out.println("Costo de las tropas: [IIIIII----]");
        System.out.println("Velocidad de cracion de vehiculos: [IIII------]");
        System.out.println("Costo de los vehiculos: [IIIIII----]");
        System.out.println("Velocidad de creacion de edificios: [IIIII-----]");
        System.out.println("Costo de los edificios: [IIIIIIII--]");
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
