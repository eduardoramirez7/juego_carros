/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import LogicaNegocio.Carro;
import LogicaNegocio.ConductorCarro;
import LogicaNegocio.Jugador;
import LogicaNegocio.Pista;
import java.awt.SystemColor;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ibago
 */
public class Main {
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        ConductorCarro conductor_carro = new ConductorCarro();
        List<List<String>> listaJugadores = new ArrayList<List<String>>();
        Jugador conductor = new Jugador();
        Carro carro = new Carro();
        Pista pista = new Pista();
        
        
        
        //menu
        int opcion = -1;
        
        do{
            opcion = menu();
            
            switch(opcion){
                case 1:

                    String nombrejugador = "";
                    
                    System.out.print("Numero de jugadores: ");
                    int numJugadores = s.nextInt();
                    
                    System.out.print("Digite la distancia de la pista: ");
                    int distanciaPista = s.nextInt();
                    pista.setDistanciapista(distanciaPista);
                    
                    System.out.println("El numero de carriles a sido configurado de acuerdo al numero de jugadores");               
                    
                    for (int i = 0; i < 4; i++) {
                        listaJugadores.add(new ArrayList<String>());
                    }
                    
                    for (int i = 0; i < numJugadores; i++) {
                        
                        System.out.print("Nombre del jugador "+ (i+1) +": ");
                        nombrejugador = s.next();
                        conductor.setNombrejugador(nombrejugador);
                        carro.setNumeroCarro(i+1);
                        pista.setNumeroCarriles(i+1);
                                        
                        listaJugadores.get(0).add(conductor.getNombrejugador());
                        listaJugadores.get(1).add(Integer.toString(carro.getNumeroCarro()));
                        listaJugadores.get(2).add(Integer.toString(pista.getNumeroCarriles()));
                        listaJugadores.get(3).add(Integer.toString(pista.getDistanciapista()));

                    }
                        
                    conductor_carro.asociarConductorCarro(listaJugadores);
                        
                    //Inicio de la carrera
                    

                    break;
                case 2:
                    System.out.println("case 2");
                    break;
                case 3:
                    System.out.println("Gracias por jugar");
                    break;
                default:
                    System.out.println("Opcion no valida, intente nuevamente");
                    break;
            }
                   
        }while(opcion!=3);
        
        
        
    }
    
    public static int menu(){
        Scanner s = new Scanner(System.in);
        System.out.println("\t BIENVENIDOS AL JUEGO DE CARROS");
        System.out.println("\n MENU DE OPCIONES");
        System.out.println("1. Iniciar carrera");
        System.out.println("2. Mostrar Resultados");
        System.out.println("3. Salir");
        System.out.print("Escriba su opcion: ");
        int opcion = s.nextInt();
        return opcion;
    }
    
}
