
package lab3p2_jorgelopez_12141356;

public class Procoso extends Planeta{
    
    private double densidad;
    private boolean indicador_vida;

    public Procoso() {
        super();
    }

    public Procoso(double densidad, boolean indicador_vida, String nombre, double masa, double radio, double temp_promedio, double velocidad_escape) {
        super(nombre, masa, radio, temp_promedio, velocidad_escape);
        this.densidad = densidad;
        this.indicador_vida = indicador_vida;
    }
    
    public double getDensidad() {
        return densidad;
    }

    public void setDensidad(double densidad) {
        this.densidad = densidad;
    }

    public boolean isIndicador_vida() {
        return indicador_vida;
    }

    public void setIndicador_vida(boolean indicador_vida) {
        this.indicador_vida = indicador_vida;
    }

    @Override
    public String toString() {
        return "Procoso{" + "densidad=" + densidad + ", indicador_vida=" + indicador_vida + '}'+super.toString();
    }
    
    
}
