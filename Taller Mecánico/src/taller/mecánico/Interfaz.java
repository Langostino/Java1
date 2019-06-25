
package taller.mecánico;

import java.io.IOException;
import java.util.Scanner;

public class Interfaz {
    public static void Interfaz(){
        System.out.println("\n ******** TALLER MECÁNICO ********");
        System.out.println("***********************************");
        System.out.println();
        System.out.println("1. Clientes");
        System.out.println("2. Coches");
        System.out.println("3. Servicios");
        System.out.println("4. Facturas");
        System.out.println();
        System.out.println("0. SALIR");
        System.out.print("Elija una opción: ");
        Scanner sc = new Scanner(System.in);
        int opcion = sc.nextInt();
        
        switch(opcion){
            case 0:
                break;
            case 1:
                System.out.println("1. Crear cliente");
                System.out.println("2. Modificar clientes");
                System.out.println("3. Eliminar clientes");
                System.out.println();
                System.out.println("0. SALIR");
                System.out.print("Elija una opción: ");
                
                int opcionC = sc.nextInt();
                
                switch(opcionC){
                    case 0:
                        break;
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                }
                
                break;
            case 2:
                System.out.println("1. Crear coche");
                System.out.println("2. Modificar coches");
                System.out.println("3. Eliminar coches");
                System.out.println();
                System.out.println("0. SALIR");
                System.out.print("Elija una opción: ");
                
                int opcionCH = sc.nextInt();
                
                switch(opcionCH){
                    case 0:
                        break;
                    case 1:
                        try{
                        CrearCoche.hola();                            
                        }catch (IOException e){
                            System.err.print("Error");
                        }
                        break;
                    case 2:
                        
                        break;
                    case 3:
                        
                        break;
                }
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
        }
    }  
}

