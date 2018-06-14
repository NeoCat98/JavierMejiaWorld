/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javiermejia.s.world;

import Jugador1.Jugador1;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Menu {
    Jugador1 jugadorA = new Jugador1();
    Jugador1 jugadorB = new Jugador1();
    
    
    private static Menu menu;

    private Menu() {
    }

    public static Menu getInstance() {
        if (menu == null) {
            menu = new Menu();
        }
        return menu;
    }
    public void Inicio(){
        boolean bandera = true;
        Scanner input = new Scanner(System.in);
        String opcion;
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("||||                                      ||||");
        System.out.println("||||   BIENVENIDO A JAVIERMEJIA'S WORLD   ||||");
        System.out.println("||||                                      ||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("");
        System.out.println("");
        while(bandera){
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||                                    |||||");
            System.out.println("||||| 1. Iniciar el juego                |||||");
            System.out.println("||||| 2. instrucciones                   |||||");
            System.out.println("||||| 3. Salir                           |||||");
            System.out.println("|||||                                    |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            opcion = input.nextLine();
            System.out.println("");
            System.out.println("");
            switch(opcion){
                case "1":
                    decidirOrden();
                    break;
                case "2":
                    instrucciones();
                    break;
                case "3":
                    bandera = false;
                    break;
            }
        }
    }
    
    private void instrucciones(){
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||||                                                                                 |||||||");
        System.out.println("|||||||                                  INSTRUCCIONES                                  |||||||");
        System.out.println("||||||| 1. Cada jugador elige entre una clase                                           |||||||");   
        System.out.println("||||||| 2. El turno de cada jugador se elige aleatoriamente                             |||||||");
        System.out.println("||||||| 3. El jugador decide las acciones que desea realizar                            |||||||");
        System.out.println("||||||| 4. El puede crear edificios, crear tropas, etc.                                 |||||||");
        System.out.println("||||||| 5. El turno no termina hasta que el jugador lo decida                           |||||||");
        System.out.println("||||||| 6. Una vez que el utimo jugador termine su turno se pasa a la siguiente fase    |||||||");
        System.out.println("||||||| 7. El juego termiana cuando uno de los dos jugadores este sin edificios         |||||||");
        System.out.println("|||||||                                                                                 |||||||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("");
        System.out.println("");
    }
    
    private void decidirOrden(){
        EscogerRaza();
        int turno = (int) (Math.random() * 2) + 1;
        if(turno == 1){
            JuegoA();
        }
        else{
            JuegoB();
        }
    }
    
    private void EscogerRaza(){
        //Escoger Raza
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||                     ESCOGER RAZA                   |||||");
        System.out.println("|||||                 TURNO DEL JUGADOR #1               |||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        jugadorA.Inicio();
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||            FIN DEL TURNO DEL JUGADOR #1            |||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println(" ");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||                     ESCOGER RAZA                   |||||");
        System.out.println("|||||                 TURNO DEL JUGADOR #2               |||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        jugadorB.Inicio();
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||            FIN DEL TURNO DEL JUGADOR #2            |||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
    }
    
    private void JuegoB(){
        boolean GameOver = false;
        int fase = 1;        
        //Comienza el modo de batalla
        while(!GameOver){
            boolean turnoA = true,turnoB = true;
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||             LA FASE #" + fase + " HA COMENZADO                |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||                TURNO DEL JUGADOR #2                |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            while(turnoB){
                String B;
                Scanner input = new Scanner(System.in);
                System.out.println("");
                System.out.println("");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("|||||    Eliga uno de los siguientes comandos:     |||||");
                System.out.println("|||||                                              |||||");
                System.out.println("||||| 1. Edificios                                 |||||");
                System.out.println("||||| 2. Atacar / Defender                         |||||");
                System.out.println("||||| 3. Terminar turno                            |||||");
                System.out.println("|||||                                              |||||");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("");
                System.out.println("");
                B = input.nextLine();
                switch(B){
                    case "1":
                        jugadorB.MenuEdificio();
                        break;
                    case "2":
                        jugadorB.AtacarDefender(jugadorA.getEdificio().size());
                        break;
                    case "3":
                        turnoB = false;
                        break;
                    default:
                        System.out.println("Ha ingresado datos invalidos");
                        break;
                }
            }
            System.out.println("");
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||||             FIN DEL TURNO DEL JUGADOR #1          |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||                TURNO DEL JUGADOR #2                |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            while(turnoA){
                String A;
                Scanner input = new Scanner(System.in);
                System.out.println("");
                System.out.println("");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("|||||    Eliga uno de los siguientes comandos:     |||||");
                System.out.println("|||||                                              |||||");
                System.out.println("||||| 1. Edificios                                 |||||");
                System.out.println("||||| 2. Atacar / Defender                         |||||");
                System.out.println("||||| 3. Terminar turno                            |||||");
                System.out.println("|||||                                              |||||");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("");
                System.out.println("");
                A = input.nextLine();
                switch(A){
                    case "1":
                        jugadorA.MenuEdificio();
                        break;
                    case "2":
                        jugadorA.AtacarDefender(jugadorB.getEdificio().size());
                        break;
                    case "3":
                        turnoA = false;
                        break;
                    default:
                        System.out.println("Ha ingresado datos invalidos");
                        break;
                }
            }
            System.out.println("");
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||||             FIN DEL TURNO DEL JUGADOR #1          |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            System.out.println("Jugador #1");
            jugadorA.CambioDeFase();
            System.out.println("");
            System.out.println("");
            System.out.println("Jugador #2");
            jugadorB.CambioDeFase();
            //Verifican si las tropas ya llegaron al objetivo
            jugadorB.setTropasEnemigas(jugadorA.getTropasAliadas());
            jugadorA.setTropasEnemigas(jugadorB.getTropasAliadas());
            jugadorB.TeAtacan();
            jugadorA.TeAtacan();
            if(jugadorA.GameOver() && jugadorB.GameOver()){
                System.out.println("El juego ha terminado los dos equipos han perdido");
                GameOver = true;
            }
            if(jugadorA.GameOver() && !jugadorB.GameOver()){
                System.out.println("El juego ha terminado");
                System.out.println("JUGADOR B WIN");
                GameOver = true;
            }
            if(!jugadorA.GameOver() && jugadorB.GameOver()){
                System.out.println("El juego ha terminado");
                System.out.println("JUGADOR A WIN");
                GameOver = true;
            }
            fase++;
            System.out.println("");
        }
    }
    
    
    private void JuegoA(){
        boolean GameOver = false;
        int fase = 1;        
        //Comienza el modo de batalla
        while(!GameOver){
            boolean turnoA = true,turnoB = true;
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||             LA FASE #" + fase + " HA COMENZADO                |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||                TURNO DEL JUGADOR #1                |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            while(turnoA){
                String A;
                Scanner input = new Scanner(System.in);
                System.out.println("");
                System.out.println("");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("|||||    Eliga uno de los siguientes comandos:     |||||");
                System.out.println("|||||                                              |||||");
                System.out.println("||||| 1. Edificios                                 |||||");
                System.out.println("||||| 2. Atacar / Defender                         |||||");
                System.out.println("||||| 3. Terminar turno                            |||||");
                System.out.println("|||||                                              |||||");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("");
                System.out.println("");
                A = input.nextLine();
                switch(A){
                    case "1":
                        jugadorA.MenuEdificio();
                        break;
                    case "2":
                        jugadorA.AtacarDefender(jugadorB.getEdificio().size());
                        break;
                    case "3":
                        turnoA = false;
                        break;
                    default:
                        System.out.println("Ha ingresado datos invalidos");
                        break;
                }
            }
            System.out.println("");
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||||             FIN DEL TURNO DEL JUGADOR #1          |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||                TURNO DEL JUGADOR #2                |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            while(turnoB){
                String B;
                Scanner input = new Scanner(System.in);
                System.out.println("");
                System.out.println("");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("|||||    Eliga uno de los siguientes comandos:     |||||");
                System.out.println("|||||                                              |||||");
                System.out.println("||||| 1. Edificios                                 |||||");
                System.out.println("||||| 2. Atacar / Defender                         |||||");
                System.out.println("||||| 3. Terminar turno                            |||||");
                System.out.println("|||||                                              |||||");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("");
                System.out.println("");
                B = input.nextLine();
                switch(B){
                    case "1":
                        jugadorB.MenuEdificio();
                        break;
                    case "2":
                        jugadorB.AtacarDefender(jugadorA.getEdificio().size());
                        break;
                    case "3":
                        turnoB = false;
                        break;
                    default:
                        System.out.println("Ha ingresado datos invalidos");
                        break;
                }
            }
            System.out.println("");
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("||||||             FIN DEL TURNO DEL JUGADOR #1          |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            System.out.println("Jugador #1");
            jugadorA.CambioDeFase();
            System.out.println("");
            System.out.println("");
            System.out.println("Jugador #2");
            jugadorB.CambioDeFase();
            //Verifican si las tropas ya llegaron al objetivo
            jugadorB.setTropasEnemigas(jugadorA.getTropasAliadas());
            jugadorA.setTropasEnemigas(jugadorB.getTropasAliadas());
            jugadorA.TeAtacan();
            jugadorB.TeAtacan();
            if(jugadorA.GameOver() && jugadorB.GameOver()){
                System.out.println("El juego ha terminado los dos equipos han perdido");
                GameOver = true;
            }
            if(jugadorA.GameOver() && !jugadorB.GameOver()){
                System.out.println("El juego ha terminado");
                System.out.println("JUGADOR B WIN");
                GameOver = true;
            }
            if(!jugadorA.GameOver() && jugadorB.GameOver()){
                System.out.println("El juego ha terminado");
                System.out.println("JUGADOR A WIN");
                GameOver = true;
            }
            fase++;
            System.out.println("");
        }
    }
}
