
package main;

/**
 *
 * @author Mariano_mdz
 */
public class ClasePerro {
    
    private Integer edad;
    private String nombre;
    private String raza;

    public ClasePerro(Integer edad, String nombre, String raza) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
    }

    public ClasePerro() {
    }

    @Override
    public String toString() {
        return "ClasePerro{" + "edad=" + edad + ", nombre=" + nombre + ", raza=" + raza + '}';
    }
    
    
    
}
