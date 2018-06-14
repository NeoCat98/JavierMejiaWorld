/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador1;

import Vehiculos.AbstractVehiculos;
import Vehiculos.Avion.Avion;
import Vehiculos.Carro.Carro;
import Vehiculos.VehiculosProducer;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Vehiculos {
    AbstractVehiculos vehiculos;
    private int velocidad,cantidad,tiempo,costo;
    private String nombre;
    private boolean Disponible;
    
    public Vehiculos(){
        this.Disponible = true;
    }

    public AbstractVehiculos getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(AbstractVehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }
    
    public int CrearVehiculo(int costoO,int tiempoV){
        String opcion;
        boolean bandera = true;
        Scanner input = new Scanner(System.in);
        while(bandera){
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||     ¿Que vehiculo desea crear?    |||||");
            System.out.println("|||||                                   |||||");
            System.out.println("||||| 1. Carro                          |||||");
            System.out.println("||||| 2. Avion                          |||||");
            System.out.println("||||| 3. Informacio sobre los vehiculos |||||");
            System.out.println("||||| 4. Salir                          |||||");
            System.out.println("|||||                                   |||||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            opcion = input.nextLine();
            System.out.println("");
            switch(opcion){
                case "1": 
                    vehiculos = VehiculosProducer.getFactory("Carro");
                    Carro carro = vehiculos.GetCarro("");
                    this.nombre = "Carro";
                    this.velocidad = carro.getVelocidad() - tiempoV;
                    this.tiempo = carro.getTiempo();
                    this.cantidad = carro.getCantidadT();
                    this.costo = costoO*carro.getCosto();
                    return costo;
                case "2":
                    vehiculos = VehiculosProducer.getFactory("Avion");
                    Avion av = vehiculos.GetAvion("");
                    this.nombre = "Avion";
                    this.velocidad = av.getVelocidad() - tiempoV;
                    this.tiempo = av.getTiempo();
                    this.cantidad = av.getCantidadT();
                    this.costo = costoO*av.getCosto();
                    return costo;
                case "3":
                    vehiculos = VehiculosProducer.getFactory("Avion");
                    Avion a = vehiculos.GetAvion("");
                    System.out.println("");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|||||                     Avion            |||||");
                    System.out.println("||||| Costo: " + a.getCosto()*costoO+ "                          |||||");
                    System.out.println("||||| Fases en crear: " + (a.getVelocidad() - tiempoV)+"                   |||||");
                    System.out.println("||||| Fases en llegar a la base enemiga: " + a.getTiempo()+" |||||");
                    System.out.println("||||| cantidad de pasajeros: " + a.getCantidadT()+"            |||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
                    vehiculos = VehiculosProducer.getFactory("Carro");
                    Carro c = vehiculos.GetCarro("");
                    System.out.println("");
                    System.out.println("");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|||||                    Carro            |||||");
                    System.out.println("||||| Costo: " + a.getCosto()*costoO+ "                           |||||");
                    System.out.println("||||| Fases en crear: " + (a.getVelocidad() - tiempoV)+"                  |||||");
                    System.out.println("||||| Fases en llegar a la base enemiga: " + a.getTiempo()+" |||||");
                    System.out.println("||||| cantidad de pasajeros: " + a.getCantidadT()+"             |||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("");
                    break;
                case "4":
                    bandera = false;
                    break;
                default:
                    System.out.println("Ha ingresado un dato invalido");
                    break;
            }
        }
        return 0;
    }
}
