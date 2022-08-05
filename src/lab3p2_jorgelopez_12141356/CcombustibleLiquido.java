
package lab3p2_jorgelopez_12141356;

import java.util.ArrayList;

public class CcombustibleLiquido extends Cohete {
    
    private double litros_gas;

    public CcombustibleLiquido() {
        super();
    }

    public CcombustibleLiquido(double litros_gas, double peso_soportable, String nombre, int num_serie, int potencia, double velocidad) {
        super(peso_soportable, nombre, num_serie, potencia, velocidad);
        this.litros_gas = litros_gas;
    }

    public double getLitros_gas() {
        return litros_gas;
    }

    public void setLitros_gas(double litros_gas) {
        this.litros_gas = litros_gas;
    }

    public ArrayList<Persona> getLista_personas() {
        return lista_personas;
    }

    public void setLista_personas(ArrayList<Persona> lista_personas) {
        this.lista_personas = lista_personas;
    }

    @Override
    public String toString() {
        return "CcombustibleLiquido{" + "litros_gas=" + litros_gas + '}';
    }
    
    
    
}
