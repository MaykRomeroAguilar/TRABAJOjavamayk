/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Jhonder
 */
public class NewClass {
 
    public static void main(String[] args) {
        String nombreCliente, operacion1, operacion2;
        double monto1, monto2, total;
       

        Scanner lector = new Scanner(System.in);

        // Entrada de datos
        System.out.println("Ingresa nombre del cliente:");
        nombreCliente = lector.nextLine();

        // OperaciÃ³n 1
        System.out.println("Ingrese tipo de operaciÃ³n 1 :");
        operacion1 = lector.nextLine();
        System.out.println("Ingrese el monto de la operacion 1:");
        monto1 = lector.nextDouble();
        

        lector.nextLine(); // Limpiar buffer

        // OperaciÃ³n 2
        System.out.println("Ingrese tipo de  operaciÃ³n 2 :");
        operacion2 = lector.nextLine();
        System.out.println("Ingrese el monto por operacion2:");
        monto2 = lector.nextDouble();
        

        lector.close(); // Cerrar el scanner

        // Calcular total
        total = monto1+monto2;

        // Formato de boleta
        String boleta =
            "############################################\n" +
            "             AGENCIA BANCARIA ABC\n" +
            "############################################\n" +
            "CLIENTE: %s\n" +
            "############################################\n" +
            "OPERACIONES REALIZADAS:\n\n" +
            "%-15s           S/. %6.2f\n" +
            "%-15s           S/. %6.2f\n" +
            "--------------------------------------------\n" +
            "TOTAL MOVIMIENTO:      S/. %6.2f\n" +
            "############################################\n" +
            "         Â¡Gracias por su visita!\n" +
            "############################################\n";

        System.out.printf(boleta, nombreCliente,
                operacion1, monto1,
                operacion2, monto2,
                total);
  }
 }