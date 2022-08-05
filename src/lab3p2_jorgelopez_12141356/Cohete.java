
package lab3p2_jorgelopez_12141356;

import java.util.ArrayList;

public class Cohete {
    
    private double peso_soportable;
    private String nombre;
    private int num_serie;
    private int potencia;
    private double velocidad;
    ArrayList<Persona> lista_personas = new ArrayList();

    public Cohete() {
    }

    public Cohete(double peso_soportable, String nombre, int num_serie, int potencia, double velocidad) {
        this.peso_soportable = peso_soportable;
        this.nombre = nombre;
        this.num_serie = num_serie;
        this.potencia = potencia;
        this.velocidad = velocidad;
    }

    public double getPeso_soportable() {
        return peso_soportable;
    }

    public void setPeso_soportable(double peso_soportable) {
        this.peso_soportable = peso_soportable;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNum_serie() {
        return num_serie;
    }

    public void setNum_serie(int num_serie) {
        this.num_serie = num_serie;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public ArrayList<Persona> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(ArrayList<Persona> lista_personas) {
        this.lista_personas = lista_personas;
    }

    @Override
    public String toString() {
        return "Cohete{" + "peso_soportable=" + peso_soportable + ", nombre=" + nombre + ", num_serie=" + num_serie + ", potencia=" + potencia + ", velocidad=" + velocidad + ", lista_personas=" + lista_personas + '}';
    }
    
    
    
}
