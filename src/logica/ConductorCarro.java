/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author ibago
 */
public class ConductorCarro {
    
    private Jugador condutor;
    private Carro carroConductor;

    public ConductorCarro() {
        this.condutor = new Jugador();
        this.carroConductor = new Carro();
    }
    
}
