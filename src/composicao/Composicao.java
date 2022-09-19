/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicao;

/**
 *
 * @author adriano.camargo
 */
public class Composicao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // primeira Forma de charmar os Construtores
        /*
        Carro carro = new Carro();
        Carro carro2 = new Carro(2000);
*/
        
        Carro carro3 = new Carro();
        carro3.ligarCarro(2000);
    }
    
}
