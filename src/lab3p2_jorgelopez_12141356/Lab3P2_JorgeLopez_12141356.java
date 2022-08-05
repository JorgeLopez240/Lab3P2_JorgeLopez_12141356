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
                         System.out.println();
                         if(pos>=0 && pos<cohetes.size()){
                             if(cohetes.get(pos) instanceof CcombustibleLiquido){
                                 System.out.println("1. Peso Soportable");
                                 System.out.println("2. Nombre");
                                 System.out.println("3. Serie");
                                 System.out.println("4. Potencia");
                                 System.out.println("5. Litros");
                                 System.out.print("Ingrese la opción que desea modificar: ");
                                 int op2 = lea.nextInt();
                                 switch(op2){
                                     case 1:{
                                         System.out.print("Peso nuevo: ");
                                         double peso = lea.nextDouble();
                                         cohetes.get(pos).setPeso_soportable(peso);
                                     }
                                     break;
                                     case 2:{
                                         System.out.print("Nombre nuevo: ");
                                         lea.nextLine();
                                         String nombre = lea.nextLine();
                                         cohetes.get(pos).setNombre(nombre);
                                     }
                                     break;
                                     case 3:{
                                         System.out.print("Serie nueva: ");
                                         int serie = lea.nextInt();
                                         cohetes.get(pos).setNum_serie(serie);
                                     }
                                     break;
                                     case 4:{
                                         System.out.print("Potencia nueva [1-9]: ");
                                         int potencia = lea.nextInt();
                                         cohetes.get(pos).setPotencia(potencia);
                                     }
                                     break;
                                     case 5:{
                                         System.out.print("Litros nuevos: ");
                                         double litros = lea.nextInt();
                                         ((CcombustibleLiquido)cohetes.get(pos)).setLitros_gas(litros);
                                     }
                                     break;
                                 }
                             } else if(cohetes.get(pos) instanceof Cfases){
                                 System.out.println("1. Peso Soportable");
                                 System.out.println("2. Nombre");
                                 System.out.println("3. Serie");
                                 System.out.println("4. Potencia");
                                 System.out.println("5. Cantidad de fases");
                                 System.out.println("6. Cantidad de motores");
                                 System.out.println("7. Altura");
                                 System.out.print("Ingrese la opción que desea modificar: ");
                                 int op2 = lea.nextInt();
                                 switch(op2){
                                     case 1:{
                                         System.out.print("Peso nuevo: ");
                                         double peso = lea.nextDouble();
                                         cohetes.get(pos).setPeso_soportable(peso);
                                     }
                                     break;
                                     case 2:{
                                         System.out.print("Nombre nuevo: ");
                                         lea.nextLine();
                                         String nombre = lea.nextLine();
                                         cohetes.get(pos).setNombre(nombre);
                                     }
                                     break;
                                     case 3:{
                                         System.out.print("Serie nueva: ");
                                         int serie = lea.nextInt();
                                         cohetes.get(pos).setNum_serie(serie);
                                     }
                                     break;
                                     case 4:{
                                         System.out.print("Potencia nueva [1-9]: ");
                                         int potencia = lea.nextInt();
                                         cohetes.get(pos).setPotencia(potencia);
                                     }
                                     break;
                                     case 5:{
                                         System.out.print("Cantidad de fases: ");
                                         int cant_fases = lea.nextInt();
                                         ((Cfases)cohetes.get(pos)).setCant_fases(cant_fases);
                                     }
                                     break;
                                     case 6:{
                                         System.out.print("Cantidad de motores: ");
                                         int cant_motores =lea.nextInt();
                                         ((Cfases)cohetes.get(pos)).setCant_motores(cant_motores);
                                     }
                                     break;
                                     case 7:{
                                         System.out.print("Altura nueva: ");
                                         double altura = lea.nextDouble();
                                         ((Cfases)cohetes.get(pos)).setAltura(altura);
                                     }
                                     break;
                                 }
                             } else if(cohetes.get(pos) instanceof CcombustibleSolido){
                                 System.out.println("1. Peso Soportable");
                                 System.out.println("2. Nombre");
                                 System.out.println("3. Serie");
                                 System.out.println("4. Potencia");
                                 System.out.println("5. Kilos de combustible");
                                 System.out.println("6. Nombre de material");
                                 System.out.print("Ingrese la opción que desea modificar: ");
                                 int op2 = lea.nextInt();
                                 switch(op2){
                                     case 1:{
                                         System.out.print("Peso nuevo: ");
                                         double peso = lea.nextDouble();
                                         cohetes.get(pos).setPeso_soportable(peso);
                                     }
                                     break;
                                     case 2:{
                                         System.out.print("Nombre nuevo: ");
                                         lea.nextLine();
                                         String nombre = lea.nextLine();
                                         cohetes.get(pos).setNombre(nombre);
                                     }
                                     break;
                                     case 3:{
                                         System.out.print("Serie nueva: ");
                                         int serie = lea.nextInt();
                                         cohetes.get(pos).setNum_serie(serie);
                                     }
                                     break;
                                     case 4:{
                                         System.out.print("Potencia nueva [1-9]: ");
                                         int potencia = lea.nextInt();
                                         cohetes.get(pos).setPotencia(potencia);
                                     }
                                     break;
                                     case 5:{
                                         System.out.print("Kilos de combustible: ");
                                         double kilos = lea.nextDouble();
                                         ((CcombustibleSolido)cohetes.get(pos)).setKilos_gas(kilos);
                                     }
                                     break;
                                     case 6:{
                                         System.out.print("Nombre de material: ");
                                         lea.nextLine();
                                         String material = lea.nextLine();
                                         ((CcombustibleSolido)cohetes.get(pos)).setNombre_material(material);
                                     }
                                     break;
                                 }
                             }
                         } else{
                             System.out.println("Posición invalida.");
                         }
                     }
                }
                break;
                case 4:{ // Editar planeta
                    if(planetas.isEmpty()){
                        System.out.println("No hay planetas agregados.");
                    } else if(!(planetas.isEmpty())){
                        System.out.print("Ingrese la posición: ");
                        int pos = lea.nextInt();
                        System.out.println();
                        if(pos>=0 && pos<planetas.size()){
                            System.out.println("1. Nombre");
                            System.out.println("2. Masa");
                            System.out.println("3. Radio");
                            System.out.println("4. Temperatura");
                            if(planetas.get(pos) instanceof Procoso){
                                System.out.println("5. Densidad");
                                System.out.println("6. Vida");
                            } else if(planetas.get(pos) instanceof Pgaseoso){
                                System.out.println("5. Presión");
                                System.out.println("6. Cantidad de Anillos");
                            }
                            System.out.print("Ingrese la opción: ");
                            int op2 = lea.nextInt();
                            if(op2==1){
                                System.out.print("Nombre nuevo: ");
                                lea.nextLine();
                                String nombre = lea.nextLine();
                                planetas.get(pos).setNombre(nombre);
                            } else if(op2==2){
                                System.out.print("Masa nueva: ");
                                double masa = lea.nextDouble();
                                planetas.get(pos).setMasa(masa);
                            } else if(op2 ==3){
                                System.out.print("Radio nuevo: ");
                                double radio = lea.nextDouble();
                                planetas.get(pos).setRadio(radio);
                            } else if(op2 ==4){
                                System.out.print("Temperatura nueva: ");
                                double temp = lea.nextDouble();
                                planetas.get(pos).setTemp_promedio(temp);
                            } else if(op2 ==5 && (planetas.get(pos)instanceof Procoso)){
                                System.out.print("Densidad nueva: ");
                                double den = lea.nextDouble();
                                ((Procoso)planetas.get(pos)).setDensidad(den);
                            } else if(op2 ==6 && (planetas.get(pos)instanceof Procoso)){
                                System.out.println("Vida [no =0 / si =1]:");
                                int v = lea.nextInt();
                                boolean vida =false;
                                switch(v){
                                    case 0:{
                                        vida=false;
                                    }
                                    break;
                                    case 1:{
                                        vida = true;
                                    }
                                    break;
                                }
                                ((Procoso)planetas.get(pos)).setIndicador_vida(vida);
                            } else if(op2 ==5 && (planetas.get(pos) instanceof Pgaseoso)){
                                System.out.print("Presión nueva: ");
                                double presion = lea.nextDouble();
                                ((Pgaseoso)planetas.get(pos)).setPresion(presion);
                            }
                            else if(op2 ==6 &&(planetas.get(pos) instanceof Pgaseoso)){
                                System.out.print("Cantidad de anillos: ");
                                int cant_anillos=lea.nextInt();
                                ((Pgaseoso)planetas.get(pos)).setCant_anillos(cant_anillos);
                            }
                        } else{
                            System.out.println("Posicón invalida.");
                        }
                    }
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
                case 7:{ // Probar cohete
                    System.out.print("Ingrese la posición del planeta a probar: ");
                    int pos = lea.nextInt();
                    if(planetas.isEmpty()){
                        System.out.println("No hay planetas agregados para probar.");
                    } else if(!(planetas.isEmpty())){
                        if(pos>=0 && pos<planetas.size()){
                            System.out.println("1. Lanzar un solo cohete" +" \n"+
                                            "2. Lanzar todos los cohetes");
                            System.out.print("Ingrese la opción: ");
                            int op2 = lea.nextInt();
                            int good=0;
                            int bad=0;
                            switch(op2){
                                case 1:{
                                    if(cohetes.isEmpty()){
                                        System.out.println("No hay cohetes.");
                                    } else if(!(cohetes.isEmpty())){
                                        System.out.print("Ingrese la posición del cohete que desea lanzar: ");
                                        int pos2 = lea.nextInt();
                                        if(pos2>=0 &&pos2<cohetes.size()){
                                            if((planetas.get(pos).getVelocidad_escape())>(cohetes.get(pos2).getVelocidad())){
                                                bad++;
                                            } else{
                                                good++;
                                            }
                                        } else{
                                            System.out.println("Posición invalida.");
                                        }
                                    }
                                }
                                break;
                                case 2:{
                                    if(cohetes.isEmpty()){
                                        System.out.println("No hay cohetes.");
                                    } else if(!(cohetes.isEmpty())){
                                        System.out.print("Ingrese la posición del cohete que desea lanzar: ");
                                        int pos2 = lea.nextInt();
                                        if(pos2>=0 &&pos2<cohetes.size()){
                                            for (Cohete c : cohetes) {
                                                if((planetas.get(pos).getVelocidad_escape())>(c.getVelocidad())){
                                                    bad++;
                                                } else{
                                                    good++;
                                                }
                                            }
                                        } else{
                                            System.out.println("Posición invalida.");
                                        }
                                    }
                                }
                                break;
                            }
                            System.out.println("Cohetes exitosos: "+good);
                            System.out.println("Cohetes fallidos: "+bad);
                        } else{
                            System.out.println("Posicion invalida.");
                        }
                    }
                    
                }
                break;
            }
        }
    }
    
}
