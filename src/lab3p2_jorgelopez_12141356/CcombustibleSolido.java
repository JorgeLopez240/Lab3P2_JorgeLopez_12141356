
package lab3p2_jorgelopez_12141356;

import java.util.ArrayList;

public class CcombustibleSolido extends Cohete{
    
    private double kilos_gas;
    private String nombre_material;

    public CcombustibleSolido() {
        super();
    }

    public CcombustibleSolido(double kilos_gas, String nombre_material, double peso_soportable, String nombre, int num_serie, int potencia, double velocidad) {
        super(peso_soportable, nombre, num_serie, potencia, velocidad);
        this.kilos_gas = kilos_gas;
        this.nombre_material = nombre_material;
    }

    public double getKilos_gas() {
        return kilos_gas;
    }

    public void setKilos_gas(double kilos_gas) {
        this.kilos_gas = kilos_gas;
    }

    public String getNombre_material() {
        return nombre_material;
    }

    public void setNombre_material(String nombre_material) {
        this.nombre_material = nombre_material;
    }

    public ArrayList<Persona> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(ArrayList<Persona> lista_personas) {
        this.lista_personas = lista_personas;
    }

    @Override
    public String toString() {
        return "CcombustibleSolido{" + "kilos_gas=" + kilos_gas + ", nombre_material=" + nombre_material + '}';
    }
    
    
    
}
