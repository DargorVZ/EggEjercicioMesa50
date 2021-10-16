
package main;

/**
 *
 * @author Dario
 */
public class ClaseGato {
   
    private Integer edad;
    private String nombre;
    private String raza;
    private String color;

    public ClaseGato() {
    }

    public ClaseGato(Integer edad, String nombre, String raza, String color) {
        this.edad = edad;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "ClaseGato{" + "edad=" + edad + ", nombre=" + nombre + ", raza=" + raza + ", color=" + color + '}';
    }
    
    
    
}
