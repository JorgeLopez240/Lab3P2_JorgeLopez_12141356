
package lab3p2_jorgelopez_12141356;

import java.util.ArrayList;

public class Cfases extends Cohete{
    
    private int cant_fases;
    private int cant_motores;
    private double altura;

    public Cfases() {
        super();
    }

    public Cfases(int cant_fases, int cant_motores, double altura, double peso_soportable, String nombre, int num_serie, int potencia, double velocidad) {
        super(peso_soportable, nombre, num_serie, potencia, velocidad);
        this.cant_fases = cant_fases;
        this.cant_motores = cant_moteres;
        this.altura = altura;
    }

    public int getCant_fases() {
        return cant_fases;
    }

    public void setCant_fases(int cant_fases) {
        this.cant_fases = cant_fases;
    }

    public int getCant_motores() {
        return cant_motores;
    }

    public void setCant_motores(int cant_motores) {
        this.cant_motores = cant_motores;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Cfases{" + "cant_fases=" + cant_fases + ", cant_moteres=" + cant_motores + ", altura=" + altura + '}'+super.toString();
    }
    
    
    
}
