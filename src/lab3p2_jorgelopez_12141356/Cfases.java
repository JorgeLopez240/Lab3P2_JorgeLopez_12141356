
package lab3p2_jorgelopez_12141356;

import java.util.ArrayList;

public class Cfases extends Cohete{
    
    private int cant_fases;
    private int cant_moteres;
    private double altura;

    public Cfases() {
        super();
    }

    public Cfases(int cant_fases, int cant_moteres, double altura, double peso_soportable, String nombre, int num_serie, int potencia, double velocidad) {
        super(peso_soportable, nombre, num_serie, potencia, velocidad);
        this.cant_fases = cant_fases;
        this.cant_moteres = cant_moteres;
        this.altura = altura;
    }

    public int getCant_fases() {
        return cant_fases;
    }

    public void setCant_fases(int cant_fases) {
        this.cant_fases = cant_fases;
    }

    public int getCant_moteres() {
        return cant_moteres;
    }

    public void setCant_moteres(int cant_moteres) {
        this.cant_moteres = cant_moteres;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public ArrayList<Persona> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(ArrayList<Persona> lista_personas) {
        this.lista_personas = lista_personas;
    }

    @Override
    public String toString() {
        return "Cfases{" + "cant_fases=" + cant_fases + ", cant_moteres=" + cant_moteres + ", altura=" + altura + '}';
    }
    
    
    
}
