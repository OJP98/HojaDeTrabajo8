/**
 * Clase que realiza las interacciones con el usuario.
 * Algoritmos y estructura de datos - seccion 10.
 * @author: Oscar Juarez - 17315
 * @author: Guillermo Sandoval - 17577
 * @version: 23/03/18
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
                
        int decision,implementacion=1; 
        String paciente="";
        boolean power = true, inicio = true;
        Scanner teclado = new Scanner(System.in);
        Procesos procesos = new Procesos();                
                
        procesos.leerArchivo("./pacientes.txt");
        
        String listaPacientesVH = procesos.imprimirPacientesVH();
        String listaPacientesH = procesos.imprimirPacientesH();
        
        System.out.println("Bienvenido al programa!");
        System.out.println("________________________________________________________________________\n");        
        
        System.out.println("La lista de pacientes por atender implementada con VectorHeap es:\n");
        System.out.println(listaPacientesVH);
        System.out.println("\n________________________________________________________________________\n");
        
        System.out.println("La lista de pacientes por atender implementada con Heap es:\n");
        System.out.println(listaPacientesH);
        
        System.out.println("\n________________________________________________________________________\n");
        System.out.println("Ingrese la implementacion que desea utilizar:");
        System.out.println("1. VectorHeap");
        System.out.println("2. Heap con Java Collectons Framework");
        
        while (inicio) {                                    
            
            while (!teclado.hasNextInt()) {
                
                System.err.println("\nCaracter no valido"); 
                
                System.out.print("Por favor ingrese una opcion valida: ");
                teclado.next();            
        }
            
            decision = teclado.nextInt();
            
            if (decision==1) {

                implementacion=1;                
                break;

            } else if (decision==2) {

                implementacion=2;                                    
                break;
                
            } else {
                System.err.println("\nOpcion no valida"); 
                System.out.print("Por favor ingrese una opcion valida: ");
            }        
        }
        
        System.out.println("Implementacion elegida!");
        
        while (power) {
            
            System.out.println("\n________________________________________MENU________________________________________\n");
            System.out.println("Ingrese la accion que desea realizar:\n");
            System.out.println("1. Atender al proximo paciente");
            System.out.println("2. Ver el proximo paciente en la lista");
            System.out.println("3. Usar la otra implementacion");
            System.out.println("4. Salir del programa\n");       
            
            
             while (!teclado.hasNextInt()) {
                
                System.err.println("\nCaracter no valido"); 
                
                System.out.print("Por favor ingrese una opcion valida: ");
                teclado.next();          
                
            }
                        
            decision = teclado.nextInt();
            
            if (decision==1) {
                
                System.out.print("Paciente atendido: "); 
                
                paciente = procesos.atenderPaciente(implementacion);                    
                
                System.out.println(paciente);
                                
            } else if (decision==2) {
                
                System.out.println("El proximo paciente es: ");
                
                paciente = procesos.atenderPaciente(implementacion);                    
                
                System.out.println(paciente);
                                
                
            } else if (decision==3){                                
                                
                
            } else if (decision==4) {
                
                System.out.println("Gracias por usar el programa!");
                power=false;
                
            } else {
                
                System.err.println("Opcion no valida");
                
            }
            
        }
    }
}
       
