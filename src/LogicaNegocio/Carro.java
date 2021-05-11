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
public class Carro {
    
    int numeroCarro;

    public Carro() {
        this.numeroCarro = -1;
    }
    
    public Carro(int numero) {
        this.numeroCarro = numero;
    }

    public int getNumeroCarro() {
        return numeroCarro;
    }

    public void setNumeroCarro(int numeroCarro) {
        this.numeroCarro = numeroCarro;
    }
    
    public int avanzar(){
        int dado = (int)(Math.random()*6+1);
        int avenceCarro = dado*100;
        return avenceCarro;
    }
    
}
