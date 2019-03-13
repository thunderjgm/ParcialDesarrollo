/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafacturapeaje;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author s204e6
 */
public class SistemaFacturaPeaje {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan= new Scanner(System.in);        
        
        Vehiculo moto = new Moto("ABC-123", "AKT", 0);
        Vehiculo automovil = new Automovil("HIJ-324", "Toyota", 5000);
        Vehiculo camion = new Camion1eje("DEF-456", "FOTON", 10000);
        Vehiculo camionVariosejes = new Camionmasde2ejes("ASD-543", "Honda", 15000);
        
        System.out.println("El valor de peaje de la moto "+moto.getMarca()+" con placa "+moto.getPlaca()+" es: "+moto.getValorPeaje());
        System.out.println("El valor de peaje del automovil "+automovil.getMarca()+" con placa "+automovil.getPlaca()+" es: "+automovil.getValorPeaje());
        System.out.println("El valor de peaje del camion de un eje "+camion.getMarca()+" con placa "+camion.getPlaca()+" es: "+camion.getValorPeaje());
        System.out.println("El valor de peaje del camion de mas de 2 ejes "+camionVariosejes.getMarca()+" con placa "+camionVariosejes.getPlaca()+" es: "+camionVariosejes.getValorPeaje());
       
        
        
    }
    
}
