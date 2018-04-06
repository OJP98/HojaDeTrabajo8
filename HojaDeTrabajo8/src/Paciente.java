/**
 * Clase que realiza las interacciones con el usuario.
 * Algoritmos y estructura de datos - seccion 10.
 * @author: Oscar Juarez - 17315
 * @author: Guillermo Sandoval - 17577
 * @version: 23/03/18
 */

public class Paciente implements Comparable<Paciente>{
    /**
     * Lleva un constructor del paciente que esta vacio y otro que lleva los
     * parametros necesarios
     * Tales como el nombre, la condicion del paciente y la prioridad en el codigo fijado
     * es decir A es alta prioridad y para abajo es menor prioridad.
     * Podemos obtener cada dato individual con Gets y los podemos modificar con Sets
     */
    
    private String nombre, condicion, codigo;

    public Paciente() {}        

    public Paciente(String nombre, String condicion, String codigo) {
        this.nombre = nombre;        
        this.condicion = condicion;
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return nombre + ", " + condicion + ", " + codigo;
    }    

    @Override
    public int compareTo(Paciente t) {
        return this.getCodigo().compareTo(t.getCodigo());
    }           
}
