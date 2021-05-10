/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LogicaNegocio;

/**
 *
 * @author ibago
 */
public class Jugador {
    
    String nombrejugador;

    public Jugador(){
        this.nombrejugador = "";
    }
    
    public Jugador(String nombre){
        this.nombrejugador = nombre;
    }

    public String getNombrejugador() {
        return nombrejugador;
    }

    public void setNombrejugador(String nombrejugador) {
        this.nombrejugador = nombrejugador;
    }

}
