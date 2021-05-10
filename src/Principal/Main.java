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
import java.util.Scanner;

/**
 *
 * @author ibago
 */
public class Main {
    
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        ConductorCarro conductor_carro = new ConductorCarro();
        ArrayList<ConductorCarro> condCarro = new ArrayList();
        Jugador conductor = new Jugador();
        Carro carro = new Carro();
        Pista pista = new Pista();
        
        
        
        //menu
        int opcion = -1;
        
        do{
            opcion = menu();
            
            switch(opcion){
                case 1:
                    ConductorCarro aux;
                    String nombrejugador = "";
                    
                    System.out.print("Numero de jugadores: ");
                    int numJugadores = s.nextInt();
                    
                    System.out.print("Digite la distancia de la pista: ");
                    int distanciaPista = s.nextInt();
                    pista.setDistanciapista(distanciaPista);
                    
                    System.out.println("El numero de carriles a sido configurado de acuerdo al numero de jugadores");
                    pista.setNumeroCarriles(numJugadores);
                    
                    for (int i = 1; i <= numJugadores; i++) {
                        System.out.print("Nombre del jugador "+ i +": ");
                        nombrejugador = s.next();
                        conductor.setNombrejugador(nombrejugador);
                        carro.setNumeroCarro(i);
                    }

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
