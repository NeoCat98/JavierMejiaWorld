/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Raza.Mecanico;


/**
 *
 * @author javie
 */
public class EspecialidadMecanico implements Mecanico{
    int creacionT = 2,creacionV = 9,creacionE = 6,costoT = 6,costoV = 2,costoE = 2;
    
    @Override
    public String Elegir() {
        System.out.println("");
        System.out.println("-------------------MECANICO-------------------");
        System.out.println("Velocidad de creacion de tropas: [II--------]");
        System.out.println("Costo de las tropas: [IIIIII----]");
        System.out.println("Velocidad de cracion de vehiculos: [IIIIIIIII-]");
        System.out.println("Costo de los vehiculos: [II--------]");
        System.out.println("Velocidad de creacion de edificios: [IIIIII----]");
        System.out.println("Costo de los edificios: [II--------]");
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
