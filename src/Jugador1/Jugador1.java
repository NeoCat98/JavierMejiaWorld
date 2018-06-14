/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador1;

import Raza.AbstractRaza;
import Raza.Ingeniero.Ingeniero;
import Raza.Mecanico.Mecanico;
import Raza.Militar.Militar;
import Raza.RazaProducer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class Jugador1 {
    //Variables de estado
    AbstractRaza Raza;
    private int creacionT,creacionV,creacionE,costoT,costoV,costoE;
    private ArrayList<EdificioCP> edificio = new ArrayList<>();
    private ArrayList<Tropas> TropaT = new ArrayList<>();
    private ArrayList<Tropas> TropaMandadas = new ArrayList<>();
    private ArrayList<Vehiculos> vehiculoT = new ArrayList<>();
    ArrayList<Tropas> TropasAliadas = new ArrayList<>();
    private ArrayList<Tropas> TropasEnemigas = new ArrayList<>();
    /*Cosas que va a hacer el jugador
    MENU CON OPCIONES PARA:
    CREACION DE LA RAZA- DANDOLE LAS ESTADISTICAS AL JUGADOR.
    CREACION DE EDIFICIOS.
    DAR A LAS TROPAS EL VEHICULO PARA LLEGAR AL OBJETIVO MAS RAPIDO.
    */
    
    //FALTA BORRAR LOS VEHICULOS QUE SE ENVIAN Y CREO QUE LAS TROPAS

    public AbstractRaza getRaza() {
        return Raza;
    }

    public void setRaza(AbstractRaza Raza) {
        this.Raza = Raza;
    }

    public ArrayList<Tropas> getTropasAliadas() {
        return TropasAliadas;
    }

    public void setTropasAliadas(ArrayList<Tropas> TropasAliadas) {
        this.TropasAliadas = TropasAliadas;
    }
    
    public int getCreacionT() {
        return creacionT;
    }

    public void setCreacionT(int creacionT) {
        this.creacionT = creacionT;
    }

    public int getCreacionV() {
        return creacionV;
    }

    public void setCreacionV(int creacionV) {
        this.creacionV = creacionV;
    }

    public int getCreacionE() {
        return creacionE;
    }

    public void setCreacionE(int creacionE) {
        this.creacionE = creacionE;
    }

    public int getCostoT() {
        return costoT;
    }

    public void setCostoT(int costoT) {
        this.costoT = costoT;
    }

    public int getCostoV() {
        return costoV;
    }

    public void setCostoV(int costoV) {
        this.costoV = costoV;
    }

    public int getCostoE() {
        return costoE;
    }

    public void setCostoE(int costoE) {
        this.costoE = costoE;
    }

    public ArrayList<EdificioCP> getEdificio() {
        return edificio;
    }

    public void setEdificio(ArrayList<EdificioCP> edificio) {
        this.edificio = edificio;
    }

    public ArrayList<Tropas> getTropaT() {
        return TropaT;
    }

    public void setTropaT(ArrayList<Tropas> TropaT) {
        this.TropaT = TropaT;
    }

    public ArrayList<Tropas> getTropaMandadas() {
        return TropaMandadas;
    }

    public void setTropaMandadas(ArrayList<Tropas> TropaMandadas) {
        this.TropaMandadas = TropaMandadas;
    }

    public ArrayList<Vehiculos> getVehiculoT() {
        return vehiculoT;
    }

    public void setVehiculoT(ArrayList<Vehiculos> vehiculoT) {
        this.vehiculoT = vehiculoT;
    }

    public ArrayList<Tropas> getTropasEnemigas() {
        return TropasEnemigas;
    }

    public void setTropasEnemigas(ArrayList<Tropas> TropasEnemigas) {
        this.TropasEnemigas = TropasEnemigas;
    }
    
    public Jugador1(){
        EdificioCP n = new EdificioCP();
        n.EdificioC();
        edificio.add(n);
    }
    
    //Escoger Raza
    public void Inicio(){
        Scanner input = new Scanner(System.in);
        String raza;
        boolean bandera = true;
        while(bandera){
            System.out.println("");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||           ¿Que clase desea?           |||||");
            System.out.println("|||||                                       |||||");
            System.out.println("||||| 1. Ingeniero                          |||||");
            System.out.println("||||| 2. Militar                            |||||");
            System.out.println("||||| 3. Mecanico                           |||||");
            System.out.println("||||| 4. Mostrar informacion de cada clase  |||||");
            System.out.println("|||||                                       |||||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            raza = input.nextLine();
            System.out.println("");
            System.out.println("");
            switch(raza){
                case "1":    
                    Raza = RazaProducer.getFactory("Ingeniero");
                    Ingeniero ing = Raza.GetIngeniero("");
                    this.creacionT = ing.getCreacionT();
                    this.creacionV = ing.getCreacionV();
                    this.creacionE = ing.getCreacionE();
                    this.costoT = ing.getCostoT();
                    this.costoV = ing.getCostoV();
                    this.costoE = ing.getCostoE();
                    bandera = false;                    
                    break;
                case "2":
                    Raza = RazaProducer.getFactory("Militar");
                    Militar mil = Raza.GetMilitar("");
                    this.creacionT = mil.getCreacionT();
                    this.creacionV = mil.getCreacionV();
                    this.creacionE = mil.getCreacionE();
                    this.costoT = mil.getCostoT();
                    this.costoV = mil.getCostoV();
                    this.costoE = mil.getCostoE();
                    bandera = false;                    
                    break;
                case "3":
                    Raza = RazaProducer.getFactory("Mecanico");
                    Mecanico mec = Raza.GetMecanico("");
                    this.creacionT = mec.getCreacionT();
                    this.creacionV = mec.getCreacionV();
                    this.creacionE = mec.getCreacionE();
                    this.costoT = mec.getCostoT();
                    this.costoV = mec.getCostoV();
                    this.costoE = mec.getCostoE();
                    bandera = false;
                    break;
                case "4":
                    Clases();
                    break;                
                default:
                    System.out.println("Ha ingresado datos invalidos. ");
                    break;
            }
        }
    }
    
    public void Clases(){
        Scanner input = new Scanner(System.in);
        String raza;
        boolean bandera = true;
        while(bandera){
            System.out.println("");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||                                       |||||");
            System.out.println("||||| 1. Ver estadisticas del militar       |||||");
            System.out.println("||||| 2. Ver estadisticas del mecanico      |||||");
            System.out.println("||||| 3. Ver estadisticas del ingeniero     |||||");
            System.out.println("||||| 4. Salir                              |||||");
            System.out.println("|||||                                       |||||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            raza = input.nextLine();
            System.out.println("");
            switch(raza){
                case "1":
                    System.out.println("");
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|||||                        MILITAR                     |||||");
                    System.out.println("||||| Velocidad de creacion de tropas: [IIIIIIIII-]      |||||");
                    System.out.println("||||| Costo de las tropas: [III-------]                  |||||");
                    System.out.println("||||| Velocidad de cracion de vehiculos: [IIIIII----]    |||||");
                    System.out.println("||||| Costo de los vehiculos: [IIIII-----]               |||||");
                    System.out.println("||||| Velocidad de creacion de edificios: [II--------]   |||||");
                    System.out.println("||||| Costo de los edificios: [IIIIIII---]               |||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("");
                    System.out.println("");
                    break;
                case "2":
                    System.out.println("");
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|||||                      MECANICO                      |||||");
                    System.out.println("||||| Velocidad de creacion de tropas: [II--------]      |||||");
                    System.out.println("||||| Costo de las tropas: [IIIIII----]                  |||||");
                    System.out.println("||||| Velocidad de cracion de vehiculos: [IIIIIIIII-]    |||||");
                    System.out.println("||||| Costo de los vehiculos: [II--------]               |||||");
                    System.out.println("||||| Velocidad de creacion de edificios: [IIIIII----]   |||||");
                    System.out.println("||||| Costo de los edificios: [II--------]               |||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("");
                    System.out.println("");
                    break;
                case "3":
                    System.out.println("");
                    System.out.println("");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("|||||                      INGENIERO                     |||||");
                    System.out.println("||||| Velocidad de creacion de tropas: [III-------]      |||||");
                    System.out.println("||||| Costo de las tropas: [IIIII-----]                  |||||");
                    System.out.println("||||| Velocidad de cracion de vehiculos: [IIIIII----]    |||||");
                    System.out.println("||||| Costo de los vehiculos: [IIIII-----]               |||||");
                    System.out.println("||||| Velocidad de creacion de edificios: [IIIIIII---]   |||||");
                    System.out.println("||||| Costo de los edificios: [III-------]               |||||");
                    System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("");
                    System.out.println("");
                    break;
                case "4":
                    bandera = false;
                    break;
                default:
                    System.out.println("Ha ingresado un dato invalido.");
                    break;
            }
        }
    }
    
    
    //Metodo en donde estan todos los comados que puede realizar el jugador.            
    public void MenuEdificio(){
        boolean bandera = true;
        int nivel = 1;
        Scanner input = new Scanner(System.in);
        int costo;
        String opcion;
        while(bandera){
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||       Ha ingresado al comando Edificio       |||||");
            System.out.println("|||||                                              |||||");
            System.out.println("||||| 1. Crear un edificio                         |||||");
            System.out.println("||||| 2. Mejorar el edificio central               |||||");
            System.out.println("||||| 3. Construir un vehiculo                     |||||");
            System.out.println("||||| 4. Entrenar un soldado                       |||||");
            System.out.println("||||| 5. Mostrar cantidad de cada recurso          |||||");
            System.out.println("||||| 6. Recolectar oro                            |||||");
            System.out.println("||||| 7. Recolectar materia prima                  |||||");
            System.out.println("||||| 8. Recolectar comida                         |||||");
            System.out.println("||||| 9. Mostrar edificios creados                 |||||");
            System.out.println("||||| 10.Regresar                                 |||||");
            System.out.println("|||||                                              |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            opcion = input.nextLine();
            System.out.println("");
            switch(opcion){
                case "1":
                    EdificioCP n = new EdificioCP();
                    costo = n.CrearEdificio(edificio.get(0).getCantidadM(),this.costoE);
                    if(n.getNombre() != null){
                        n.setVelocidad( n.getVelocidad() - creacionE);
                        System.out.println("El edificio tardara " + n.getVelocidad() + " fases en crearse.");
                        edificio.get(0).setCantidadM(edificio.get(0).getCantidadM() - costo);
                        edificio.add(n);
                    }
                    break;
                case "2":
                    System.out.println("");
                    if(edificio.get(0).MejorarEdificio(nivel)){
                        nivel++;
                    }
                    break;                    
                case "3":
                    System.out.println("");
                    int contador = 0;
                    boolean edificioLleno = false;
                    for(int x = 0 ;x<edificio.size(); x++){
                        if("Fabrica de vehiculos".equals(edificio.get(x).getNombre()) && edificio.get(x).getVelocidad() == 0){
                            if(edificio.get(x).getEspecialidad() > 0){
                                edificioLleno = false;
                                //crear vehivulo
                                costo = edificio.get(x).ConstruirVehiculo(edificio.get(0).getCantidadO(),this.costoV,this.creacionV);
                                if(costo != 0){    
                                    edificio.get(x).setEspecialidad(edificio.get(x).getEspecialidad() - 1);
                                }
                                edificio.get(0).setCantidadO(edificio.get(0).getCantidadO() - costo); 
                            }
                            else{
                                edificioLleno = true;
                            }
                            contador++;
                        }
                    }
                    if(contador == 0){
                        System.out.println("No ha creado el edificio");
                    }
                    if(edificioLleno){
                        System.out.println("No puede tener mas vehiculos en el edificio, este esta lleno.");
                    }
                    System.out.println("");
                    break;
                case "4":
                    System.out.println("");
                    int contador2 = 0;
                    boolean edificioLleno2 = false;
                    for(int x = 0 ;x<edificio.size(); x++){
                        if("Cuartel de tropas".equals(edificio.get(x).getNombre()) && edificio.get(x).getVelocidad() == 0){
                            if(edificio.get(x).getEspecialidad() > 0){
                                edificioLleno2 = false;
                                //crear tropa
                                costo = edificio.get(x).ReclutarTropa(edificio.get(0).getCantidadC(),this.costoT,this.creacionT);
                                if(costo!=0){
                                    edificio.get(x).setEspecialidad(edificio.get(x).getEspecialidad() - 1);
                                }
                                edificio.get(0).setCantidadC(edificio.get(0).getCantidadC() - costo);
                            }
                            else{
                                edificioLleno2 = true;
                            }
                            contador2++;
                        }
                    }
                    if(contador2 == 0){
                        System.out.println("No ha creado el edificio");
                    }
                    if(edificioLleno2){
                        System.out.println("No puede tener mas tropas en el edificio, este esta lleno.");
                    }
                    System.out.println("");
                    break;
                case "5":
                    System.out.println("");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("||||| Cantiad de oro: " + edificio.get(0).getCantidadO() + "            ||||||");
                    System.out.println("||||| Cantidad de materia prima: " + edificio.get(0).getCantidadM()+ " ||||||");
                    System.out.println("||||| Cantidad de comida: " + edificio.get(0).getCantidadC()+"         ||||||");
                    System.out.println("|||||||||||||||||||||||||||||||||||||||||||");
                    System.out.println("");
                    break;
                case "6":
                    int contadorEoro = 0;
                    for(int x = 0 ;x<edificio.size(); x++){
                        if("Recolector de Oro".equals(edificio.get(x).getNombre()) && edificio.get(x).getVelocidad() == 0 ){
                            if(edificio.get(x).getEspecialidad() != 0){
                                edificio.get(0).setCantidadO(edificio.get(0).getCantidadO() + edificio.get(x).getEspecialidad());
                                if(edificio.get(0).getCantidadO() > edificio.get(0).getMaxOro()){
                                    edificio.get(0).setCantidadO(edificio.get(0).getMaxOro());
                                }
                                edificio.get(x).setEspecialidad(0);
                                System.out.println(contadorEoro + " " + edificio.get(x).getNombre());
                                System.out.println("Se recolecto el oro.");
                                System.out.println("La cantidad de oro actual es: "+ edificio.get(0).getCantidadO());
                            }
                            else{
                                System.out.println("Ya recolecto el oro");
                            }
                            contadorEoro++;
                        }
                    }
                    if(contadorEoro == 0){
                        System.out.println("El edificio no ha sido creado");
                    }
                    break;
                case "7":
                    int contadorEmaterial =0;
                    for(int x = 0 ;x<edificio.size(); x++){
                        if("Recolector de materia prima".equals(edificio.get(x).getNombre()) && edificio.get(x).getVelocidad() == 0 ){
                            if(edificio.get(x).getEspecialidad() != 0){
                                edificio.get(0).setCantidadM(edificio.get(0).getCantidadM() + edificio.get(x).getEspecialidad());
                                if(edificio.get(0).getCantidadM() > edificio.get(0).getMaxMateriales()){
                                    edificio.get(0).setCantidadM(edificio.get(0).getMaxMateriales());
                                }
                                edificio.get(x).setEspecialidad(0);
                                System.out.println(contadorEmaterial + " " + edificio.get(x).getNombre());
                                System.out.println("Se recolecto la materia prima.");
                                System.out.println("La cantidad de materia prima actual es: "+ edificio.get(0).getCantidadM());
                            }
                            else{
                                System.out.println("Ya recolecto la materia prima");
                            }
                            contadorEmaterial++;
                        }
                    }
                    if(contadorEmaterial == 0){
                        System.out.println("El edificio no ha sido creado");                            
                    }
                    break;
                case "8":
                    int contadorEcomida = 0;
                    for(int x = 0 ;x<edificio.size(); x++){
                        if("Recolector de comida".equals(edificio.get(x).getNombre()) && edificio.get(x).getVelocidad() == 0 ){
                            if(edificio.get(x).getEspecialidad() != 0){
                                edificio.get(0).setCantidadC(edificio.get(0).getCantidadC() + edificio.get(x).getEspecialidad());
                                if(edificio.get(0).getCantidadC() > edificio.get(0).getMaxComida()){
                                    edificio.get(0).setCantidadC(edificio.get(0).getMaxComida());
                                }
                                edificio.get(x).setEspecialidad(0);
                                System.out.println(contadorEcomida + " " + edificio.get(x).getNombre());
                                System.out.println("Se recolecto la comida.");
                                System.out.println("La cantidad de comida actual es: "+ edificio.get(0).getCantidadC());
                            }
                            else{
                                System.out.println("Ya recolecto la comida");
                            }
                            contadorEcomida++;
                        }
                    }
                    if(contadorEcomida == 0){
                        System.out.println("El edificio no ha sido creado");                            
                    }
                    break;
                case "10":
                    bandera = false;
                    break;
                case "9":
                    System.out.println("");
                    for (int y = 0;y < edificio.size();y++){
                        System.out.println((y+1) +" "+edificio.get(y).getNombre());
                        for (int x = 0; x<edificio.get(y).getTropa().size();x++){
                            System.out.println("Tropa" + edificio.get(y).getTropa().get(x).getNombre());
                        }
                    }
                    System.out.println("");
                    break;
                default:
                    System.out.println("Ha ingresado un dato invalido");
                    break;
            }
        }
    }

    //Cada fase vera los cambios hechos por cada jugador y dira cuantos turnos faltan para la creacion de edificios,tropas ademas si las tropas llegan al territorio enemigo 
    public void CambioDeFase(){
        for(int x = 0 ; x < edificio.size() ; x++){
            //Para los edificios que se esten creando
            if(edificio.get(x).getVelocidad() != 0){
                edificio.get(x).setVelocidad(edificio.get(x).getVelocidad() - 1);
                System.out.println("Para que el "+edificio.get(x).getNombre() + " termine de crearse faltan " + edificio.get(x).getVelocidad()+ " fases");
            }
            //Para los que no tengan vida
            if(edificio.get(x).getVida() <= 0){
                System.out.println("se ha destruido " + edificio.get(x).getNombre());
                edificio.remove(x);
            }
            //Para las tropas/vehiculos
            if(edificio.get(x).Tropa.size()>0){
                for(int y = 0 ; y < edificio.get(x).Tropa.size();y++){
                    if(edificio.get(x).Tropa.get(y).getVelocidad() != 0){
                        System.out.println("Para que la tropa " + edificio.get(x).Tropa.get(y).getNombre() + " termine de crearse faltan " + edificio.get(x).Tropa.get(y).getVelocidad() + " fases");
                        edificio.get(x).Tropa.get(y).setVelocidad(edificio.get(x).Tropa.get(y).getVelocidad() - 1);
                        
                    }
                    else{
                        TropaT.add(edificio.get(x).Tropa.get(y));
                        System.out.println("La tropa: " + (edificio.get(x).Tropa.get(y).getNombre())+" ya esta lista para usarse");
                        edificio.get(x).Tropa.remove(y);
                    }
                }
            }
            if(!edificio.get(x).vehiculo.isEmpty()){
                for(int y = 0 ; y < edificio.get(x).vehiculo.size();y++){
                    if(edificio.get(x).vehiculo.get(y).getVelocidad() != 0){
                        System.out.println("Para que el vehiculo "+edificio.get(x).vehiculo.get(y).getNombre() +" termine de crearse faltan "+edificio.get(x).vehiculo.get(y).getVelocidad() +" fases");
                        edificio.get(x).vehiculo.get(y).setVelocidad(edificio.get(x).vehiculo.get(y).getVelocidad() - 1); 
                        
                    }
                    else{
                        vehiculoT.add(edificio.get(x).vehiculo.get(y));
                        System.out.println("El vehiculo: " + (edificio.get(x).vehiculo.get(y).getNombre()) + " ya esta listo para usarse");
                        edificio.get(x).vehiculo.remove(y);
                    }
                }
            }
            //Para los edificios que son recolectores.
            if(edificio.get(x).getNombre().equals("Recolector de comida") || edificio.get(x).getNombre().equals("Recolector de Oro") || edificio.get(x).getNombre().equals("Recolector de materia prima")){
                edificio.get(x).setEspecialidad(edificio.get(x).getEspecialidad() + 50);
            }
        }
        for(int x = 0; x < TropaMandadas.size() ; x++){
            if(TropaMandadas.get(x).getTiempo() != 0){
                System.out.println("Para que la tropa "+ TropaMandadas.get(x).getNombre() + " llegue a la base enemiga faltan " + TropaMandadas.get(x).getTiempo() + "fases");
                TropaMandadas.get(x).setTiempo(TropaMandadas.get(x).getTiempo() - 1);
                
            }
            else{
                TropasAliadas.add(TropaMandadas.get(x));
                System.out.println("La tropa: " + TropaMandadas.get(x)+" ha llegado a la base enemiga");
                TropaMandadas.remove(x);
            }
        }
    }
    
    //Cada fase que el enenemigo este en tu zona pasa esto.
    public void TeAtacan(){
        for(int x = 0; x<TropasEnemigas.size();x++){
            if(edificio.size() == 1){
                edificio.get(0).setVida(edificio.get(0).getVida() - TropasEnemigas.get(x).getAtaqueEdificio());
                System.out.println("Te atacan! " + edificio.get(0).getNombre() +" vida: " + edificio.get(0).getVida());
            }
            else{
                if(EdificioAtacado(TropasEnemigas.get(x).getObjetivo(),TropasEnemigas.get(x).getAtaqueEdificio())== 10){
                    EdificioAtacadoAleatorio(TropasEnemigas.get(x).getAtaqueEdificio());
                }
            }
        }

    }
    
    //Se ataca un edificio aleatorio
    public int EdificioAtacadoAleatorio(int ataque){
        for(int x = 1; x<edificio.size();x++){
            edificio.get(x).setVida(edificio.get(x).getVida() - ataque);
            System.out.println("Te atacan! " + edificio.get(x).getNombre() +" vida: " + edificio.get(x).getVida());
            if(edificio.get(x).getVida()<=0){
                System.out.println("Se ha destruido el "+edificio.get(x).getNombre());
                edificio.remove(x);
            }
            return 0;
        }
        return 0;
    }
    
    //Se ataca el edificio del objetivo del man;
    private int EdificioAtacado(String ObjetivoEdificio,int ataque){
        for(int x = 1; x<edificio.size();x++){
            if(edificio.get(x).getNombre().equals(ObjetivoEdificio)){
                edificio.get(x).setVida(edificio.get(x).getVida() - ataque);
                System.out.println("Te atacan! " + edificio.get(x).getNombre() +" vida: " + edificio.get(x).getVida());
                if(edificio.get(x).getVida()<=0){
                    System.out.println("Se ha destruido el "+edificio.get(x).getNombre());
                    edificio.remove(x);
                }
                return 0;
            }
        }
        return 10;
    }
    
    //Para perder el juego
    public boolean GameOver(){
        return edificio.get(0).getVida() <= 0;
    }
    
    //Es llamado por otra clase
    public void AtacarDefender(int cantidad){
        System.out.println("");
        System.out.println("");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||                                                 |||||");
        System.out.println("|||||    Ha ingresado en el comado Atacar/Defender    |||||");
        System.out.println("|||||                                                 |||||");
        System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
        Scanner input = new Scanner(System.in);
        String opcion;
        boolean bandera = true;
        while(bandera){
            System.out.println("");
            System.out.println("");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||     ¿Que accion desea realizar?     |||||");
            System.out.println("|||||                                     |||||");
            System.out.println("||||| 1. Atacar                           |||||");
            System.out.println("||||| 2. Defender                         |||||");
            System.out.println("||||| 3. Regresar                         |||||");
            System.out.println("|||||                                     |||||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            opcion = input.nextLine();
            System.out.println("");
            switch(opcion){
                case "1":
                    Atacar(cantidad);
                    break;
                case "2":
                    Defender();
                    break;
                case "3":
                    bandera = false;
                    break;
                default:
                    System.out.println("Ha ingresado un dato invalido");
                    break;
            }
        }
    }

    //Es llamado por Atacar y defender
    private void MostrarTropasDisponibles(){
        if(TropaT.isEmpty()){
            System.out.println("No tiene ninguna tropa");
        }
        for(int x = 0 ; x < TropaT.size() ; x++){
            System.out.println("Nombre: " + TropaT.get(x).getNombre());
            System.out.println("Ataque: " + TropaT.get(x).getAtaque());
            System.out.println("Ataque a edificios: " + TropaT.get(x).getAtaqueEdificio());
            System.out.println("Tiempo que tardara en llegar a la base enemiga: " + TropaT.get(x).getTiempo());
        }
        
    }
    
    //Es llamado por Atacar
    private void MostrarVehiculosDisponibles(){
        for(int x = 0 ; x < vehiculoT.size() ; x++){
            System.out.println("Nombre: " + vehiculoT.get(x).getNombre());
            System.out.println("Cantidad de tropas que esta puede cargar: " + vehiculoT.get(x).getCantidad());
            System.out.println("Tiempo que tardara en llegar a la base enemiga: " + vehiculoT.get(x).getTiempo());
        }
        if(vehiculoT.isEmpty()){
            System.out.println("No tiene ningun vehiculo disponible");
        }
    }
   
    //Es llamado por Atacar
    private void ElegirTropa(int cantidad){
        Scanner input = new Scanner(System.in);
        String opcion;
        boolean bandera = true;
        while(bandera){
            System.out.println("|||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||  ¿Cual tropa desea enviar? |||||");
            System.out.println("|||||                            |||||");
            System.out.println("||||| 1. Especialista            |||||");
            System.out.println("||||| 2. Escuadrones             |||||");
            System.out.println("||||| 3. Salir                   |||||");
            System.out.println("|||||                            |||||");
            System.out.println("|||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            opcion = input.nextLine();
            System.out.println("");
            switch(opcion){
                case "1":
                    EnviarTropa("Especialista",cantidad);
                    break;
                case "2":
                    EnviarTropa("Escuadrones",cantidad);
                    break;
                case "3":
                    bandera =  false;
                    break;
                default:
                    System.out.println("ha ingresado un dato invalido");
                    break;
            }
        }
    }
    
    //Es llamado por Elegir Tropa
    private int EnviarTropa(String nombre,int Cantidad){
        for (int x = 0; x < TropaT.size();x++){
            if(TropaT.get(x).isDisponible()){
                TropaT.get(x).setDisponible(false);
                TropaT.get(x).setObjetivo(Objetivo(Cantidad));
                System.out.println("Ha mandado con exito a la tropa");
                System.out.println("fases para que llegue: " + TropaT.get(x).getTiempo());
                TropaMandadas.add(TropaT.get(x));
                TropaT.remove(x);
                return 0;
            }
        }
        System.out.println("No hay tropas "+nombre+" disponibles");
        return 0;
    }
    
    //Establece el objetivo de la tropa
    private String Objetivo(int cantidadEdificios){
        Scanner input = new Scanner(System.in);
        String opcion;
        boolean bandera = true;
        while(bandera){
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||                       ¿Que edificio desea atacar?                        |||||");
            System.out.println("|||||                                                                          |||||");
            System.out.println("||||| 1. Centro de mando                                                       |||||");
            System.out.println("||||| 2. Recolector de oro                                                     |||||");
            System.out.println("||||| 3. Recolector de materia prima                                           |||||");
            System.out.println("||||| 4. Recolector de comida                                                  |||||");
            System.out.println("||||| 5. Fabrica de vehiculos                                                  |||||");
            System.out.println("||||| 6. Cuartel de tropas                                                     |||||");
            System.out.println("||||| 7.Culaquiera(excluyendo al centro de mando a menos que sea el unico)     |||||");
            System.out.println("||||| **En caso que el edificio seleccionado no este sera aleatorio**          |||||");
            System.out.println("|||||                                                                          |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            opcion = input.nextLine();
            System.out.println("");
            switch(opcion){
                case "1":
                    if(cantidadEdificios == 1){
                        return "Edificio Central";
                    }
                    else{
                        System.out.println("Solo se puede atacar el edificio central si es el unico edificio");
                    }
                    break;
                case "2":
                    return "Recolector de Oro";
                case "3":
                    return "Recolector de materia prima";
                case "4":
                    return "Recolector de comida";
                case "5":
                    return "Fabrica de vehiculos";
                case "6":
                    return "Cuartel de tropas";
                case "7":
                    return "Aleatorio";
                default:
                    System.out.println("Ha ingresado datos invalidos");
                    break;
            }
        }
        return "Aleatorio";
    }
    
    //Es llamado por MandarVehiculo
    private int EnviarVehiculo(String nombre,int cantidad){
        String obj;
        for (int x = 0; x < vehiculoT.size();x++){
            if(vehiculoT.get(x).isDisponible() && vehiculoT.get(x).getNombre().equals(nombre)){
                vehiculoT.get(x).setDisponible(false);
                obj = Objetivo(cantidad);
                SubirAlVehiculo(vehiculoT.get(x).getTiempo(),vehiculoT.get(x).getCantidad(),obj);
                System.out.println("Ha mandado con exito al vehiculo");
                System.out.println("fases para que llegue: " + vehiculoT.get(x).getTiempo());
                return 0;
            }
        }
        System.out.println("No hay tropas "+nombre+" disponibles");
        return 0;
    }
    
    // Es llamdo por EnviarVehiculo
    private void SubirAlVehiculo(int tiempo,int cantidad, String obj){
        Scanner input = new Scanner(System.in);
        String opcion;
        boolean bandera = true;
        while(bandera){
            if(cantidad>0){
                System.out.println("");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("|||||   ¿Que tropa desea enviar junto al vehiculo?   |||||");
                System.out.println("|||||                                                |||||");
                System.out.println("||||| 1. Especialista                                |||||");
                System.out.println("||||| 2. Escuadrones                                 |||||");
                System.out.println("||||| 3. Salir                                       |||||");
                System.out.println("|||||                                                |||||");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("");
                System.out.println("");
                opcion = input.nextLine();
                System.out.println("");
                switch(opcion){
                    case "1":
                        if(SubirTropa("Especialista", tiempo,obj) && cantidad > 0 ){
                            cantidad--;
                        }
                        break;
                    case "2":
                        if(SubirTropa("Escuadrones",tiempo, obj)&& cantidad > 0){
                            cantidad--;
                        }
                        break;
                    case "3":
                        cantidad = 0;
                        break;
                    default:
                        System.out.println("ha ingresado un dato invalido");
                        break;
                }
            }
            bandera = false;
        }
    }

    // Es llamado por SubirAlVehiculo
    private boolean SubirTropa(String nombre,int tiempo,String obj){
        for (int x = 0; x < TropaT.size();x++){
            if(TropaT.get(x).isDisponible()){
                TropaT.get(x).setDisponible(false);
                TropaT.get(x).setObjetivo(obj);
                System.out.println("Ha subido la tropa al vehiculo");
                TropaT.get(x).setTiempo(tiempo);
                System.out.println("fases para que llegue: " + TropaT.get(x).getTiempo());
                TropaMandadas.add(TropaT.get(x));
            }
       }  
        System.out.println("No hay tropas " + nombre + " disponible");
        return false;
    }

    // es llamado por atacar
    private void MandarVehiculo(int cantidad){
        Scanner input = new Scanner(System.in);
        String opcion;
        boolean bandera = true;
        while(bandera){
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||      ¿Cual de los vehiculos desea enviar?      |||||");
            System.out.println("|||||                                                |||||");
            System.out.println("||||| 1. Carro                                       |||||");
            System.out.println("||||| 2. Avion                                       |||||");
            System.out.println("||||| 3. Salir                                       |||||");
            System.out.println("|||||                                                |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            opcion = input.nextLine();
            System.out.println("");
            switch(opcion){
                case "1":
                    EnviarVehiculo("Carro",cantidad);
                    break;
                case "2":
                    EnviarVehiculo("Avion",cantidad);
                    break;
                case "3":
                    bandera =  false;
                    break;
                default:
                    System.out.println("ha ingresado un dato invalido");
                    break;
            }
        }
    }

    //Es llamado por AtacarDefender
    private void Atacar(int cantidad){
        Scanner input = new Scanner(System.in);
        String opcion;
        boolean bandera = true;
        System.out.println("");
        System.out.println("");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("|||||    Ha ingresado en la accion atacar    |||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("");
        while(bandera){
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||                                    |||||");
            System.out.println("||||| 1. Elegir tropa                    |||||");
            System.out.println("||||| 2. Mandar vehiculo                 |||||");
            System.out.println("||||| 3. Mostrar tropas                  |||||");
            System.out.println("||||| 4. Mostrar vehiculos               |||||");
            System.out.println("||||| 5. Salir                           |||||");
            System.out.println("|||||                                    |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            opcion = input.nextLine();
            System.out.println("");
            switch(opcion){
                case "1":
                    ElegirTropa(cantidad);
                    break;
                case "2":
                    MandarVehiculo(cantidad);
                    break;
                case "3":
                    MostrarTropasDisponibles();
                    break;
                case "4":
                    MostrarVehiculosDisponibles();
                    break;
                case "5":
                    bandera = false;
                    break;
                default:
                    System.out.println("ha ingresado un dato invalido");
                    break;
            }
        }
        
    }
 
    //Es llamado por AtacarDefender
    private void Defender(){
        Scanner input = new Scanner(System.in);
        String opcion;
        System.out.println("");
        System.out.println("");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");        
        System.out.println("|||||    Ha ingresado en la accion defender  |||||");
        System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
        System.out.println("");
        boolean bandera = true;
        boolean hasdefendido = false;
        if(bajoAtaque()){
            while(bandera){
                System.out.println("");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("|||||                                        |||||");
                System.out.println("||||| 1. Defender con tus tropas             |||||");
                System.out.println("||||| 2. Mostrar tropas                      |||||");
                System.out.println("||||| 3. Salir                               |||||");
                System.out.println("|||||                                        |||||");
                System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||");
                System.out.println("");
                System.out.println("");
                opcion = input.nextLine();
                System.out.println("");
                switch(opcion){
                    case "1":
                        if(!hasdefendido){
                            hasdefendido = Protect();
                        }
                        else{
                            System.out.println("Ya has usado tus tropas.");
                        }
                        break;
                    case "2":
                        MostrarTropasDisponibles();
                        break;
                    case "3":
                        bandera = false;
                        break;
                    default:
                        System.out.println("ha ingresado un dato invalido");
                        break;
                }
            }
        }
        else{
            System.out.println("El enemigo no lo esta atacando");
        }
    }
 
    //Es llamado por Defender
    public boolean bajoAtaque(){
        return !TropasEnemigas.isEmpty();
    }
 
    //Es llamado por Defender
    private boolean Protect(){
        if(TropaT.isEmpty()){
            System.out.println("No tienes tropas disponibles ");
        }
        else{
            for (int x = 0; x < TropaT.size();x++){
                if(TropaT.get(x).isDisponible()){
                    int ataque = TropaT.get(x).getAtaque();
                    if(AtacarTropasEnemigas(ataque)==0){
                        System.out.println("Has atacado a las tropas enemigas con exito");
                    }
                    else{
                        System.out.println("Ya no quedan unidades enemigas");
                        x = TropaT.size();
                    }
                }
            }
            return true;
        }
        return false;
    }
  
    //Es llamada protect
    private int AtacarTropasEnemigas(int ataque){
        for(int x = 0 ; x < TropasEnemigas.size();x++){
            TropasEnemigas.get(x).setVida(TropasEnemigas.get(x).getVida() - ataque);
            System.out.println("Has atacado a la tropa " + TropasEnemigas.get(x).getNombre() + " su vida actual es de " + TropasEnemigas.get(x).getVida());
            if(TropasEnemigas.get(x).getVida() <= 0){
                TropasEnemigas.remove(x);
                System.out.println("Has matado una unidad enemiga");
            }
            return 0;
        } 
        return 20;
    }
}