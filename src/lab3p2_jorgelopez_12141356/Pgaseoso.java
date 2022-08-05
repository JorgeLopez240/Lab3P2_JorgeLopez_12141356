
package lab3p2_jorgelopez_12141356;

public class Pgaseoso extends Planeta{
    
    private double presion;
    private int cant_anillos;

    public Pgaseoso() {
        super();
    }

    public Pgaseoso(double presion, int cant_anillos, String nombre, double masa, double radio, double temp_promedio, double velocidad_escape) {
        super(nombre, masa, radio, temp_promedio, velocidad_escape);
        this.presion = presion;
        this.cant_anillos = cant_anillos;
    }

    public double getPresion() {
        return presion;
    }

    public void setPresion(double presion) {
        this.presion = presion;
    }

    public int getCant_anillos() {
        return cant_anillos;
    }

    public void setCant_anillos(int cant_anillos) {
        this.cant_anillos = cant_anillos;
    }

    @Override
    public String toString() {
        return "Pgaseoso{" + "presion=" + presion + ", cant_anillos=" + cant_anillos + '}'+super.toString();
    }
    
    
    
}
