/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jugador1;

import Edificio.AbstractEdificio;
import Edificio.CreacionDeTropas.CreacionDeTropas;
import Edificio.CreacionDeVehiculos.CreacionDeVehiculos;
import Edificio.EdificioCentral.EdificioCentral;
import Edificio.EdificioDeComida.EdificioDeComida;
import Edificio.EdificioDeMateriales.EdificioDeMateriales;
import Edificio.EdificioDeOro.EdificioDeOro;
import Edificio.EdificioProducer;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author javie
 */
public class EdificioCP {
    AbstractEdificio Edificio;
        
    private int vida,velocidad,costoM,especialidad,MaxOro,MaxMateriales,MaxComida,cantidadO,cantidadM,cantidadC;
    private String nombre;
    ArrayList<Tropas> Tropa = new ArrayList<>();
    ArrayList<Vehiculos> vehiculo = new ArrayList<>();
        /*
        Cada edificio tiene una especialidad diferente:
        -Edificio de tropas hace referencia a la cantidad de tropas que puede tener.
        -Edificio de vehiculos hace referencia a la cantidad de vehiculos que puede tener.
        -Edificio recolector de oro,materia prima,comida  hace  referencia a la cantidad de oro/materia prima/comida
        que este genera por cada fase esta se va sumando si el usuario no lo agarra. 
        */ 

    public AbstractEdificio getEdificio() {
        return Edificio;
    }

    public void setEdificio(AbstractEdificio Edificio) {
        this.Edificio = Edificio;
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

    public int getCostoM() {
        return costoM;
    }

    public void setCostoM(int costoM) {
        this.costoM = costoM;
    }

    public int getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(int especialidad) {
        this.especialidad = especialidad;
    }

    public int getMaxOro() {
        return MaxOro;
    }

    public void setMaxOro(int MaxOro) {
        this.MaxOro = MaxOro;
    }

    public int getMaxMateriales() {
        return MaxMateriales;
    }

    public void setMaxMateriales(int MaxMateriales) {
        this.MaxMateriales = MaxMateriales;
    }

    public int getMaxComida() {
        return MaxComida;
    }

    public void setMaxComida(int MaxComida) {
        this.MaxComida = MaxComida;
    }

    public int getCantidadO() {
        return cantidadO;
    }

    public void setCantidadO(int cantidadO) {
        this.cantidadO = cantidadO;
    }

    public int getCantidadM() {
        return cantidadM;
    }

    public void setCantidadM(int cantidadM) {
        this.cantidadM = cantidadM;
    }

    public int getCantidadC() {
        return cantidadC;
    }

    public void setCantidadC(int cantidadC) {
        this.cantidadC = cantidadC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Tropas> getTropa() {
        return Tropa;
    }

    public void setTropa(ArrayList<Tropas> Tropa) {
        this.Tropa = Tropa;
    }

    public ArrayList<Vehiculos> getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(ArrayList<Vehiculos> vehiculo) {
        this.vehiculo = vehiculo;
    }
    
    public EdificioCP(){}
        
    public int CrearEdificio(int cantidadM,int costoE){
        String opcion;
        Scanner input = new Scanner(System.in);
        boolean bandera = true;
        while(bandera){
            System.out.println("");
            System.out.println("");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("|||||        ¿Que edificio desea crear?        |||||");
            System.out.println("|||||                                          |||||");
            System.out.println("||||| 1. Edificio de creacion de tropas        |||||");
            System.out.println("||||| 2. Edificio de creacion de vehiculos     |||||");
            System.out.println("||||| 3. Edificio recolector de oro            |||||");
            System.out.println("||||| 4. Edificio recolector de materia prima  |||||");
            System.out.println("||||| 5. Edificio recolector de comida         |||||");
            System.out.println("||||| 6. Salir                                 |||||");
            System.out.println("|||||                                          |||||");
            System.out.println("||||||||||||||||||||||||||||||||||||||||||||||||||||");
            System.out.println("");
            System.out.println("");
            opcion = input.nextLine();
            System.out.println("");
            switch(opcion){
                case "1":        
                    Edificio = EdificioProducer.getFactory("Creacion de tropas");
                    CreacionDeTropas ET = Edificio.GetCreacionDeTropas();
                    this.costoM = ET.getCosto()*costoE;
                    if(cantidadM >= this.costoM){
                        this.nombre = "Cuartel de tropas";
                        this.vida = ET.getVida();
                        this.velocidad = ET.getTiempoEnConstruir();
                        this.especialidad = ET.getEspecialidad();
                        ET.Elegir();
                        return this.costoM;
                    }
                    else{
                        System.out.println("La cantidad de materia prima no es suficiente para construir el edificio.");
                        System.out.println("Cantidad de materia prima: " + cantidadM);
                        System.out.println("Costo del edificio: " + this.costoM);
                    }
                    break;
                case "2":
                    Edificio = EdificioProducer.getFactory("Creacion de vehiculos");
                    CreacionDeVehiculos EV = Edificio.GetCreacionDeVehiculos();
                    this.costoM = EV.getCosto()*costoE;
                    if(cantidadM >= this.costoM){
                        this.nombre = "Fabrica de vehiculos";
                        this.vida = EV.getVida();
                        this.velocidad = EV.getTiempoEnConstruir();
                        this.especialidad = EV.Especialidad();
                        EV.Elegir();
                        return this.costoM;
                    }
                    else{
                        System.out.println("La cantidad de materia prima no es suficiente para construir el edificio.");
                        System.out.println("Cantidad de materia prima: " + cantidadM);
                        System.out.println("Costo del edificio: " + this.costoM);
                    }
                    break;
                case "3":
                    Edificio = EdificioProducer.getFactory("Edificio de Oro");
                    EdificioDeOro EO = Edificio.GetEdificioDeOro();
                    this.costoM = EO.getCosto()*costoE;
                    if(cantidadM >= this.costoM){
                        this.nombre = "Recolector de Oro";
                        this.vida = EO.getVida();
                        this.velocidad = EO.getTiempoEnConstruir();
                        this.especialidad = EO.Especialidad();
                        EO.Elegir();
                        return this.costoM;
                    }
                    else{
                        System.out.println("La cantidad de materia prima no es suficiente para construir el edificio.");
                        System.out.println("Cantidad de materia prima: " + cantidadM);
                        System.out.println("Costo del edificio: " + this.costoM);
                    }
                    break;
                case "4":
                    Edificio = EdificioProducer.getFactory("Edificio de Materiales");
                    EdificioDeMateriales EM = Edificio.GetEdificioDeMateriales();
                    this.costoM = EM.getCosto()*costoE;
                    if(cantidadM >= this.costoM){
                        this.nombre = "Recolector de materia prima";
                        this.vida = EM.getVida();
                        this.velocidad = EM.getTiempoEnConstruir();
                        this.especialidad = EM.getEspecialidad();
                        EM.Elegir();
                        return this.costoM;
                    }
                    else{
                        System.out.println("La cantidad de materia prima no es suficiente para construir el edificio.");
                        System.out.println("Cantidad de materia prima: " + cantidadM);
                        System.out.println("Costo del edificio: " + this.costoM);
                    }
                    break;
                case "5":
                    Edificio = EdificioProducer.getFactory("Edificio de Comida");
                    EdificioDeComida EC = Edificio.GetEdificioDeComida();
                    this.costoM = EC.getCosto()*costoE;
                    if(cantidadM >= this.costoM){
                        this.nombre = "Recolector de comida";
                        this.vida = EC.getVida();
                        this.velocidad = EC.getTiempoEnCronstruir();
                        this.especialidad = EC.getEspecialidad();
                        EC.Elegir();
                        return this.costoM;
                    }
                    else{
                        System.out.println("La cantidad de materia prima no es suficiente para construir el edificio.");
                        System.out.println("Cantidad de materia prima: " + cantidadM);
                        System.out.println("Costo del edificio: " + this.costoM);
                    }
                    break;
                case "6":
                    bandera = false;
                    break;
                default:
                    System.out.println("Ha ingresado un dato invalido");
                    break;
                }
            }
            return 0;
        }
        
    public void EdificioC(){
        Edificio = EdificioProducer.getFactory("Edificio central");
        EdificioCentral EC = Edificio.GetEdificioCentral();
        this.nombre = "Edificio Central";
        this.vida = EC.getVida();
        this.MaxOro = EC.getCantidadOroMax();
        this.MaxMateriales = EC.getCantidadMaterialesMax();
        this.MaxComida = EC.getCantidadComidaMax();
        this.cantidadO = EC.getCantidadO();
        this.cantidadM = EC.getCantidadM();
        this.cantidadC = EC.getCantidadC();
    }
        
    private double CostoEdificioCentral(){
        double NuevoCosto =  0.25 * (this.MaxOro + this.MaxComida + this.MaxMateriales);
        return NuevoCosto;
    }
        
    private boolean SMejorar(){
        int costoUnitario = (int)(CostoEdificioCentral() / 3);
        if(costoUnitario < this.cantidadO && costoUnitario < this.cantidadM && costoUnitario < this.cantidadC){
            this.cantidadO = this.cantidadO - costoUnitario;
            this.cantidadC = this.cantidadC - costoUnitario;
            this.cantidadM = this.cantidadM - costoUnitario;
            return true;
        }
        else{
            System.out.println("Para mejorar el centro de mando se necesita " + costoUnitario + " de cada recurso. ");
        }
        return false;
    }
    
    public boolean MejorarEdificio(int nivel){
        switch(nivel){
            case 1:
                if(SMejorar()){
                    this.MaxOro = (int)(this.MaxOro*1.10);
                    this.MaxMateriales = (int)(this.MaxMateriales * 1.10);
                    this.MaxComida = (int)(this.MaxComida * 1.10);
                    return true;
                }
                return false;
            case 2:
                if(SMejorar()){
                    this.MaxOro = (int)(this.MaxOro*1.30);
                    this.MaxMateriales = (int)(this.MaxMateriales * 1.30);
                    this.MaxComida = (int)(this.MaxComida * 1.30);
                    return true;
                }
                return false;
            case 3:
                if(SMejorar()){
                    this.MaxOro = (int)(this.MaxOro*1.50);
                    this.MaxMateriales = (int)(this.MaxMateriales * 1.50);
                    this.MaxComida = (int)(this.MaxComida * 1.50);
                    return true;
                }
                return false;
            default:
                System.out.println("El edificio ya se enceuntra en el nivel max.");
                return false;                
        }
    }
        
    public int ReclutarTropa(int CantidadC, int costoC, int tiempoT){
        Tropas n = new Tropas();
        n.CrearTropa(costoC,tiempoT);
        if(CantidadC >= n.getCosto()){    
            Tropa.add(n);
            return n.getCosto();
        }
        else{
            System.out.println("No tiene suficiente comida.");
            System.out.println("Cantidad actual de comida: " + CantidadC );
            System.out.println("Cantidad que necesita: " + n.getCosto());
        }
        return 0;
    }
     
    public int ConstruirVehiculo(int cantidadO,int costoO, int tiempoV){
        Vehiculos n = new Vehiculos();
        n.CrearVehiculo(costoO,tiempoV);
        if(cantidadO >= n.getCosto()){    
            vehiculo.add(n);
            return n.getCosto();
        }
        else{
            System.out.println("No tiene suficiente oro.");
            System.out.println("Cantidad actual de oro: " + cantidadO );
            System.out.println("Cantidad que necesita: " + n.getCosto());
        }
        return 0;
    }
}
