/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemafacturapeaje;

import static java.lang.System.console;
import java.util.ArrayList;
import static java.util.Collections.list;
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
        ArrayList<Vehiculo> listaVehiculos= new ArrayList<Vehiculo>();
        
        Vehiculo moto = new Moto("ABC-123", "AKT", 0);
        Vehiculo automovil = new Automovil("HIJ-324", "Toyota", 5000);
        Vehiculo camion = new Camion1eje("DEF-456", "FOTON", 10000);
        Vehiculo camionVariosejes = new Camionmasde2ejes("ASD-543", "Honda", 15000);
       
        listaVehiculos.add(moto);
        listaVehiculos.add(automovil);
        listaVehiculos.add(camion);
        listaVehiculos.add(camionVariosejes);
        
        for (Vehiculo listaVehiculo : listaVehiculos) {
            System.out.print("Placa del vehículo ("+ listaVehiculo.getClass().getSimpleName()+"): "+listaVehiculo.getPlaca()+" Marca: "+listaVehiculo.getMarca()+" Valor del peaje: "+listaVehiculo.getValorPeaje()+"\n");
        }
        
        
    }
    
}
