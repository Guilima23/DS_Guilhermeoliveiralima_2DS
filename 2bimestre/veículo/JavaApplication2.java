/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;

/**
 *
 * @author Aluno CA
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Carro marea = new Carro("Fiat", "Marea", 2.0);

        Moto moto = new Moto("Honda", "CB500", 500);

        Caminhão caminhao = new Caminhão("Volvo", "FH", 3000);

        marea.informacoes();
        System.out.println();

        moto.informacoes();
        System.out.println();

        caminhao.informacoes();
    }
}
    

