/**
 * Clase JUnit encargada de probar los metodos
 * Algoritmos y estructura de datos - seccion 10.
 * @author: Oscar Juarez - 17315
 * @author: Guillermo Sandoval - 17577
 * @version: 23/03/18
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class VectorHeapTest {
    
    Procesos procesos = new Procesos();
    VectorHeap<Paciente> VH = new VectorHeap<Paciente>();
    
    public VectorHeapTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void atenderPacienteTest(){
        
        procesos.leerArchivo("./pacientes.txt");
        
        String pacientes = procesos.imprimirPacientesVH();               
        
        System.out.println(pacientes);

        System.out.println("____________________________");
        
        System.out.println(VH.isEmpty());
        
    }
    
}
