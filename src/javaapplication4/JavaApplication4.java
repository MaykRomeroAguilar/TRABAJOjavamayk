/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author Jhonder
 */
import java.util.Scanner;

public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        // Crear un objeto Scanner para leer datos desde el teclado
        //Pedir y definir las variables que se van a usar para almacenar los datos

        System.out.println("Ingrese su nombre");
        String name = lector.nextLine();
        System.out.println("Ingrese el número de su DNI");
        int dni = lector.nextInt();
        System.out.println("Ingrese su edad");
        int edad = lector.nextInt();
        System.out.println("Ingrese 1 si pasajero es Adulto o 2 si es niño");
        byte tp= lector.nextByte();
        System.out.println("Ingrese precio del boleto");
        float precio = lector.nextFloat();

        //sacar IGV
        double igv = precio * 0.18;
        System.out.println("El pago es con tarjeta?(True/False)");
        boolean pcont = lector.nextBoolean();
        System.out.println("Su clase es A-Premiun o B-Normal");
        char clase = lector.next().charAt(0);
        System.out.println("===================================");
        System.out.println("       AGENCIA MOVILSUR S.A.C");
        System.out.println("     .............................");
        System.out.println("           RUC:201322722418");
        System.out.println("     .............................");
        System.out.println(" TRANSPORTES Y PASEOS DE TURISMO");
        System.out.println("     INTERPROVINCIALES PERÚ");
        System.out.println("     .............................");
        System.out.println("     Av. Giron Ricardo Palma");
        System.out.println("\n");
        System.out.println("     BOLETA VENTA ELECTRONICA");
        System.out.println("\n");
        System.out.println("===================================");
        
        // Imprimir detalles del pasajero
        System.out.printf("Pasajero: %-20s DNI: %-6d\n", name, dni); 
        System.out.printf("Edad: %-5d Tipo de pasajero: %-10S\n", edad, (tp == 1 ? "Adulto" : "Niño"));
        System.out.printf("Pago con tarjeta: %-5b\n", pcont);
        System.out.printf("Clase: %-10c\n", clase);

        System.out.println("\n");
        System.out.println("###################################");
        System.out.println(" DESCRIPCIÓN      CANT       PRECIO");
        System.out.println("-----------------------------------");
        System.out.printf("SRV TRANSPORTE     %-10d %.2f\n", 1, precio);  
        System.out.printf("IGV(18%%)           %-10d %.2f\n", 1, igv);  
        System.out.println("###################################");

        // Cerrar el Scanner
        lector.close();

        
    }

}
