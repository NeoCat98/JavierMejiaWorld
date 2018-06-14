/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador1;

import Tropas.AbstractTropas;
import Tropas.Escuadrones.Escuadrones;
import Tropas.Especialistas.Especialistas;
import Tropas.TropasProducer;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Tropas {
    AbstractTropas tropa;
    private int vida,velocidad,ataqueEdificio,ataque,tiempo,costo;
    private boolean Disponible;
    private String nombre,objetivo;

    public AbstractTropas getTropa() {
        return tropa;
    }

    public void setTropa(AbstractTropas tropa) {
        this.tropa = tropa;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getAtaqueEdificio() {
        return ataqueEdificio;
    }

    public void setAtaqueEdificio(int ataqueEdificio) {
        this.ataqueEdificio = ataqueEdificio;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
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

    public boolean isDisponible() {
        return Disponible;
    }

    public void setDisponible(boolean Disponible) {
        this.Disponible = Disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }
    
    public Tropas(){
        this.Disponible = true;
    }
    
    public int CrearTropa(int costoC,int tiempoT){
        String opcion;
        boolean bandera = true;
        while(bandera){
            Scanner input = new Scanner(System.in);
            System.out.println("");
            System.out.println("");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||     ¿Que tropa desea crear?     |||||");
            System.out.println("|||||                                 |||||");
            System.out.println("||||| 1. Especialista                 |||||");
            System.out.println("||||| 2. Escuadrones                  |||||");
            System.out.println("||||| 3. Informacion sobre las tropas |||||");
            System.out.println("||||| 4. Salir                        |||||");
            System.out.println("|||||                                 |||||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            opcion = input.nextLine();
            System.out.println("");
            switch(opcion){
                case "1":
                    tropa = TropasProducer.getFactory("Especialista");
                    Especialistas esp = tropa.GetEspecialistas();
                    this.nombre = "Especialista";
                    this.ataque = esp.getAtaque();
                    this.ataqueEdificio = esp.getAtaqueEdificio();
                    this.velocidad = esp.getVelocidad();
                    this.vida = esp.getVida();
                    this.tiempo = esp.getTiempo() - tiempoT;
                    this.costo = 50*costoC;
                    System.out.println("Se ha creado: "+ this.nombre);
                    System.out.println("Fases para que termine de crearse: "+ this.velocidad);
                    return costo;
                case "2":
                    tropa = TropasProducer.getFactory("Escuadrones");
                    Escuadrones es = tropa.GetEscuadrones();
                    this.nombre = "Escuadrones";
                    this.ataque = es.getAtaque();
                    this.ataqueEdificio = es.getAtaqueEdificio();
                    this.velocidad = es.getVelocidad() - tiempoT;
                    this.vida = es.getVida();
                    this.tiempo = es.getTiempo();
                    this.costo = 15*costoC;
                    System.out.println("Se ha creado: "+ this.nombre);
                    System.out.println("Fases para que termine de crearse: "+ this.velocidad);
                    return costo;
                case "3":
                    tropa = TropasProducer.getFactory("Escuadrones");
                    Escuadrones e = tropa.GetEscuadrones();
                    System.out.println("");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|||||                   Escuadrones                   |||||");
                    System.out.println("||||| Vida: " + e.getVida()+ "                                        |||||");
                    System.out.println("||||| Ataque a unidades: " + e.getAtaque()+"                           |||||");
                    System.out.println("||||| Ataque a edificios: "+ e.getAtaqueEdificio()+"                          |||||" );
                    System.out.println("||||| Fases que se tarda en crear: " + (e.getVelocidad() - tiempoT)+"                  |||||");
                    System.out.println("||||| Fases que tarda en llegar a la base enemgia: 20 |||||" + e.getTiempo());
                    System.out.println("||||| Costo: " + 15*costoC+ "                                           |||||");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    tropa = TropasProducer.getFactory("Especialista");
                    Especialistas ep = tropa.GetEspecialistas();
                    System.out.println("");
                    System.out.println("");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|||||                   Escuadrones                   |||||");
                    System.out.println("||||| Vida: " + ep.getVida()+ "                                        |||||");
                    System.out.println("||||| Ataque a unidades: " + ep.getAtaque()+"                           |||||");
                    System.out.println("||||| Ataque a edificios: "+ ep.getAtaqueEdificio()+"                          |||||" );
                    System.out.println("||||| Fases que se tarda en crear: " + (ep.getVelocidad() - tiempoT)+"                  |||||");
                    System.out.println("||||| Fases que tarda en llegar a la base enemgia: 20 |||||" + ep.getTiempo());
                    System.out.println("||||| Costo: " + 50*costoC+ "                                           |||||");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
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
