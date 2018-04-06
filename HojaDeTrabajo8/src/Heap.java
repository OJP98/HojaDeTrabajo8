/**
 * Implementacion de un heap mediante el java collections framework
 * Algoritmos y estructura de datos - seccion 10.
 * @author: Oscar Juarez - 17315
 * @author: Guillermo Sandoval - 17577
 * @version: 23/03/18
 */

import java.util.PriorityQueue;

public class Heap<E> {

    protected PriorityQueue<E> heap;

    public Heap () {
        
        heap = new PriorityQueue<E>();
        
    }
    
    public Heap(PriorityQueue<E> v) {
        
        heap = new PriorityQueue<E>(v.size());
                
        for (int i = 0; i < v.size(); i++) {
            v.poll();            
        }    
    }
    
    public void add(E value) {
        heap.add(value);
    }    
    
    public String printHeap() {
        
        String lista = "";
        int numero = heap.size();
        System.out.println(numero);
        
	for (int i=0; i<numero; i++) {
	    lista += this.heap.poll().toString();
	    lista += "\n";            
	}
        
        return lista;
    }   
    
    /**
     * Metodo que extrae un elemento del heap, si este no esta vacio
     * @return: El paciente mas proximo a atender
     */
    public String atenderPaciente(){
        
        if (!heap.isEmpty()) {
            
            return heap.poll().toString();
            
        } else {
            
            return "No hay pacientes que atender";
            
        }        
    }
    /**
     * Este metodo se encarga de dejarnos ver el ultimo elemento del vector Heap
     * es el equivalente a un peak en el stack, de hecho llamandose igual heap
     * Si esta vacio retorna que no hay un proximo paciente
    */
    public String verPaciente(){
        
        if (!heap.isEmpty()) {
            
            return heap.peek().toString();
            
        } else {
            
            return "No hay pacientes proximos";
            
        }       
        
    }
    
}
