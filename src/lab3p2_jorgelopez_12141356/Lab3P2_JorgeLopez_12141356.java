package lab3p2_jorgelopez_12141356;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab3P2_JorgeLopez_12141356 {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String[] args) {
        
        //System.out.println("ran: "+(5000+r.nextInt(15000)));
        
        ArrayList<Cohete> cohetes = new ArrayList();
        ArrayList<Planeta> planetas = new ArrayList();
        
        boolean flag = true;
        while(flag == true){
            System.out.println();
            System.out.println("0. Salir");
            System.out.println("1. Crear Cohete");
            System.out.println("2. Crear Planeta");
            System.out.println("3. Editar Cohete");
            System.out.println("4. Editar Planeta");
            System.out.println("5. Listar Cohetes");
            System.out.println("6. Listar Planetas");
            System.out.println("7. Probar Cohete");
            System.out.print("Ingrese la opción: ");
            int op = lea.nextInt();
            System.out.println();
            switch(op){
                case 0:{
                    flag=false;
                }
                break;
                case 1:{
                    System.out.print("Peso Soportable: ");
                    double peso = lea.nextDouble();
                    System.out.print("Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    System.out.print("Serie: ");
                    int num_serie = lea.nextInt();
                    System.out.print("Potencia [1-9]: ");
                    int potencia = lea.nextInt();
                    int ran = 5000+r.nextInt(15000);
                    double velocidad = potencia*ran;
                    System.out.println();
                    System.out.println("1. Liquido" + "\n"+
                                        "2. De Fases" + "\n" +
                                            "3. Solido");
                    System.out.print("Tipo: ");
                    int tipo = lea.nextInt();
                    switch(tipo){
                        case 1:{
                            System.out.print("Litros: ");
                            double litros = lea.nextInt();
                            cohetes.add(new CcombustibleLiquido(litros, peso, nombre, num_serie, potencia, velocidad));
                            System.out.println();
                            System.out.println("Cohete agregado exitosamente!");
                        }
                        break;
                        case 2:{
                            System.out.print("Fases: ");
                            int fases=lea.nextInt();
                            System.out.print("Motores: ");
                            int motores = lea.nextInt();
                            System.out.print("Altura: ");
                            double altura = lea.nextDouble();
                            cohetes.add(new Cfases(fases, motores, altura, peso, nombre, num_serie, potencia, velocidad));
                            System.out.println();
                            System.out.println("Cohete agregado exitosamente!");
                        }
                        break;
                        case 3:{
                            System.out.print("kilos: ");
                            double combustible = lea.nextDouble();
                            System.out.print("Material: ");
                            lea.nextLine();
                            String nombreMat = lea.nextLine();
                            cohetes.add(new CcombustibleSolido(combustible, nombreMat, peso, nombre, num_serie, potencia, velocidad));
                            System.out.println();
                            System.out.println("Cohete agregado exitosamente!");
                        }
                        break;
                    }
                    
                }
                break;
                case 2:{ // Crear planeta
                    double g2 = Math.pow(10, -11);
                    double g1 = 6.67*g2;
                    
                    System.out.print("Nombre: ");
                    lea.nextLine();
                    String nombre = lea.nextLine();
                    System.out.print("Masa: ");
                    double masa = lea.nextDouble();
                    System.out.print("Radio: ");
                    double radio = lea.nextDouble();
                    double velocidad = Math.sqrt((2*g1*masa)/radio);
                    System.out.print("Temperatura: ");
                    double temp = lea.nextDouble();
                    System.out.println("1. Rocoso"+"\n"+
                                     "2. Gaseoso");
                    System.out.print("Tipo: ");
                    int tipo = lea.nextInt();
                    switch(tipo){
                        case 1:{
                            System.out.print("Densidad: ");
                            double densidad = lea.nextDouble();
                            System.out.print("Hay vida [no = 0 / si =1]: ");
                            int v = lea.nextInt();
                            boolean vida=false;
                            switch(v){
                                case 0:{
                                    vida = false;
                                }
                                break;
                                case 1:{
                                    vida = true;
                                }
                                break;
                            }
                            planetas.add(new Procoso(densidad, vida, nombre, masa, radio, temp, velocidad));
                            System.out.println();
                            System.out.println("Planeta creado exitosamente!");
                        }
                        break;
                        case 2:{
                            System.out.print("Presión: ");
                            double presion = lea.nextDouble();
                            System.out.print("Cantidad de anillos: ");
                            int anillos = lea.nextInt();
                            planetas.add(new Pgaseoso(presion, anillos, nombre, masa, radio, temp, velocidad));
                            System.out.println();
                            System.out.println("Planeta creado exitosamente!");
                        }
                        break;
                    }
                }
                break;
                case 3:{ // Editar cohete
                     if(cohetes.isEmpty()){
                         System.out.println("No hay cohetes agregados.");
                     } else if(!(cohetes.isEmpty())){
                         System.out.print("Ingrese la posición: ");
                         int pos = lea.nextInt();
                         if(pos>=0 && pos<cohetes.size()){
                             Object x =cohetes.get(pos);
                             if(x instanceof Procoso){
                                 System.out.println("si es");   
                             }
                         } else{
                             System.out.println("Posición invalida.");
                         }
                     }
                }
                break;
                case 4:{ // Editar planeta
                    
                }
                break;
                case 5:{ //Listar cohetes
                    String salida ="";
                    for (Cohete c : cohetes) {
                        salida += cohetes.indexOf(c) + " -> "+c + "\n";
                    }
                    System.out.println("Lista de cohetes: ");
                    System.out.println();
                    System.out.print(salida);
                }
                break;
                case 6:{ //Listar planetas
                    String salida = "";
                    for (Planeta p : planetas) {
                        salida += planetas.indexOf(p) + " -> "+p + "\n";
                    }
                    System.out.println("Lista de cohetes: ");
                    System.out.println();
                    System.out.print(salida);
                }
                break;
                case 7:{
                    
                }
                break;
            }
        }
    }
    
}
