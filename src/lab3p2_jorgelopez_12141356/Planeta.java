
package lab3p2_jorgelopez_12141356;

import java.util.ArrayList;

public class Planeta {
    
    private String nombre;
    private double masa;
    private double radio;
    private double temp_promedio;
    private double velocidad_escape;
    private ArrayList<Luna> lista_lunas = new ArrayList();

    public Planeta() {
    }

    public Planeta(String nombre, double masa, double radio, double temp_promedio, double velocidad_escape) {
        this.nombre = nombre;
        this.masa = masa;
        this.radio = radio;
        this.temp_promedio = temp_promedio;
        this.velocidad_escape = velocidad_escape;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMasa() {
        return masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getTemp_promedio() {
        return temp_promedio;
    }

    public void setTemp_promedio(double temp_promedio) {
        this.temp_promedio = temp_promedio;
    }

    public double getVelocidad_escape() {
        return velocidad_escape;
    }

    public void setVelocidad_escape(double velocidad_escape) {
        this.velocidad_escape = velocidad_escape;
    }

    public ArrayList<Luna> getLista_lunas() {
        return lista_lunas;
    }

    public void setLista_lunas(ArrayList<Luna> lista_lunas) {
        this.lista_lunas = lista_lunas;
    }

    @Override
    public String toString() {
        return "Planeta{" + "nombre=" + nombre + ", masa=" + masa + ", radio=" + radio + ", temp_promedio=" + temp_promedio + ", velocidad_escape=" + velocidad_escape + ", lista_lunas=" + lista_lunas + '}';
    }
    
    
    
}
