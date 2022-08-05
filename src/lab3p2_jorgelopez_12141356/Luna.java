
package lab3p2_jorgelopez_12141356;

public class Luna {
    
    private String nombre;
    private int cant_crateres;

    public Luna() {
    }

    public Luna(String nombre) {
        this.nombre = nombre;
    }

    public Luna(String nombre, int cant_crateres) {
        this.nombre = nombre;
        this.cant_crateres = cant_crateres;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCant_crateres() {
        return cant_crateres;
    }

    public void setCant_crateres(int cant_crateres) {
        this.cant_crateres = cant_crateres;
    }

    @Override
    public String toString() {
        return "Luna{" + "nombre=" + nombre + ", cant_crateres=" + cant_crateres + '}';
    }
    
    
    
}
