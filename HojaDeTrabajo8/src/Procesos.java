/**
 * Clase que realiza las interacciones con el usuario.
 * Algoritmos y estructura de datos - seccion 10.
 * @author: Oscar Juarez - 17315
 * @author: Guillermo Sandoval - 17577
 * @version: 23/03/18
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.PriorityQueue;

public class Procesos {        
    
    VectorHeap<Paciente> vectorHeap = new VectorHeap<Paciente>() {};
    
    /**
     * Metodo que permite que se abra el archivo txt que contiene la cadena.
     * @param cadena: la ubicacion del archivo txt
     * @return: La cadena postfix como un string
     */
    public void leerArchivo(String cadena) {                
                        
        File f;
        FileReader fr;
        BufferedReader br;

        String nombre="", condicion="", codigo="", parte1="";
        int posicion1;        

       //Este bloque de codigo tiene como objetivo leer la cadena de texto que
       //el usuario haya establecido previamente
        try {

            f = new File (cadena);            
            fr = new FileReader(f);
            br = new BufferedReader(fr);      
            
            String linea, listado="";

            while( (linea = br.readLine()) != null) {  
                
                posicion1 = linea.indexOf(",");     
                
                nombre = linea.substring(0, posicion1);
                
                parte1 = linea.substring(posicion1 + 2, linea.length());
                
                condicion = parte1.substring(0, parte1.indexOf(","));                                
                
                codigo = linea.substring(linea.length()-1, linea.length());
                
                //Agrega al paciente al VectorHeap
                Paciente paciente = new Paciente(nombre, condicion, codigo);                  
                vectorHeap.add(paciente);                
            }                                          
            
            br.close();
            fr.close();

        }
        //Si el archivo se modifica manualmente o sucede cualquier otros tipo de
        //error, este sera comunicado con el usuario
        catch (Exception e) {

            System.err.println("Se produjo un error: " + e);                 

        }                        
    }
  
    public String imprimirPacientesVH(){
        
       return vectorHeap.printHeap();
        
    }
    
}
