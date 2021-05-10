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
public class ConductorCarro {
    
    private Jugador condutor;
    private Carro carroConductor;
    private Pista pistaCarrera;

    public ConductorCarro() {
        this.condutor = new Jugador();
        this.carroConductor = new Carro();
        this.pistaCarrera = new Pista();
    }
    
    public void asociarConductorCarro(){
        String nombreConductor = condutor.getNombrejugador();
        int numeroCarro = carroConductor.getNumeroCarro();
        int carril = pistaCarrera.getNumeroCarriles();
        
        System.out.println("El conductor "+nombreConductor+" tiene asociado el carro numero"
                + " "+numeroCarro+", ubicado en el carril "+carril);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String nombreConductor = condutor.getNombrejugador();
        int numeroCarro = carroConductor.getNumeroCarro();
        int carril = pistaCarrera.getNumeroCarriles();
        
        sb.append("\nNombre: ");
        sb.append(condutor.nombrejugador);    
        return sb.toString();
    }
    
    
}
