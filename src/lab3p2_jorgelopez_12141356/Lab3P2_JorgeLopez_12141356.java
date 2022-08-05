package lab3p2_jorgelopez_12141356;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Lab3P2_JorgeLopez_12141356 {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
    
    public static void main(String[] args) {
        
        System.out.println("hola");
        System.out.println("ran: "+(15000+r.nextInt(5000)));
        
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
            System.out.println("Ingrese la opción: ");
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
                    
                    System.out.println();
                    System.out.println("1. Liquido" +
                                        "2. De Fases" +
                                            "3. Solido");
                    System.out.print("Tipo: ");
                    int tipo = lea.nextInt();
                    switch(tipo){
                        case 1:{
                            System.out.print("Litros: ");
                            double litros = lea.nextInt();
                            //cohetes.add(new CcombustibleLiquido(litros, peso, nombre, num_serie, potencia, ));
                        }
                        break;
                        case 2:{
                            System.out.print("Fases: ");
                            int fases=lea.nextInt();
                            System.out.print("Motores: ");
                            int motores = lea.nextInt();
                            System.out.print("Altura: ");
                            double altura = lea.nextDouble();
                        }
                        break;
                        case 3:{
                            System.out.print("Combustible: ");
                            double combustible = lea.nextDouble();
                            System.out.print("Material: ");
                            lea.nextLine();
                            String nombreMat = lea.nextLine();
                        }
                        break;
                    }
                    
                }
                break;
                case 2:{
                    
                }
                break;
                case 3:{
                     
                }
                break;
                case 4:{
                    
                }
                break;
                case 5:{
                    
                }
                break;
                case 6:{
                    
                }
                break;
                case 7:{
                    
                }
                break;
            }
        }
    }
    
}
