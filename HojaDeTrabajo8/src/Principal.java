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
                
        int decision;
        boolean power = true;
        Scanner teclado = new Scanner(System.in);
        Procesos procesos = new Procesos();                
                
        procesos.leerArchivo("./pacientes.txt");
        
        String listaPacientes = procesos.imprimirPacientesVH();
        
        System.out.println("Bienvenido al programa!\n");
        
        System.out.println("La lista de pacientes por atender implementada con VectorHeap es:\n");
        System.out.println(listaPacientes);
    }    
}
