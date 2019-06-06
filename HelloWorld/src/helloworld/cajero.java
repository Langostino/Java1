package helloworld;
import java.util.Scanner;
/**
 *
 * @author ismael
 */
public class cajero {
    public static void main(String[] args) {
    //Variable del dinero a cambiar
    int dineros;
    //Variables de los billetes a devolver
    int billetes50=5, billetes20=6, billetes10=4, billetes5=0;
    int b50=0, b20=0, b10=0, b5=0;
    char respuesta;
    Scanner sc = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    int total=(billetes50*50)+(billetes20*20)+(billetes10*10)+(billetes5*5);
    
    System.out.println("CAJERO AUTOMÁTICO");
    System.out.println("*****************");
    System.out.println("BILLETES - CANTIDAD");
    System.out.println("50€         "+billetes50);    
    System.out.println("20€         "+billetes20);    
    System.out.println("10€         "+billetes10);    
    System.out.println("5€          "+billetes5); 
    System.out.println("El total de efectivo en el cajero es: "+total+"€");
    
    
    System.out.println("¿Quieres cambio? (s/n)");
    //Esto coge la primera letra de la respuesta y decide si seguir o salir
    respuesta = (char)sc2.next().charAt(0);
    
        if((respuesta == 's') || (respuesta == 'S'))
        {
    System.out.print("Introduce la cantidad a cambiar en euros: ");
    //Metemos el dato en la variable "dineros"
    dineros = sc.nextInt();
    
    //Si no es divisible por 5 no se puede completar el cambio
    if (dineros % 5 != 0) {
            System.err.println("ERROR: La cantidad debe ser múltiplo de 5");
        }
    else if (dineros>total){
            System.err.println("ERROR: No hay dinero suficiente");
    }
    
    else {
        //Estos while calculan la cantidad de billetes a devolver
            while (dineros>=50 && dineros-50>=0 && billetes50>0){
                dineros=dineros-50; 
                --billetes50;
                ++b50;
            }
            while (dineros>=20 && dineros-20>=0 && billetes20>0) {
                dineros=dineros-20;
                --billetes20;
                ++b20;
            }
            while (dineros>=10 && dineros-10>=0 && billetes10>0){
                dineros=dineros-10; 
                --billetes10;
                ++b10;
            }
            while (dineros>=5 && dineros-5>=0 && billetes5>0){
                dineros=dineros-5; 
                --billetes5;
                ++b5;
            }
            //Este if+else son necesarios para que el programa de error si se pide una cantidad
            //menor al total PERO no hay billetes suficientes. 
            //EJ: Sin esto, si hubieran 410€ y se pidieran 405€ pero no hubieran billetes de 5€,
            //el programa daría 400€ y no daría error.
            if (dineros != 0){
                System.err.println("ERROR: No disponemos de cambio exacto para esa cantidad");
            } else {
            System.out.println("Te corresponden "+b50+" billete(s) de 50 euros");
            System.out.println("Te corresponden "+b20+" billete(s) de 20 euros");
            System.out.println("Te corresponden "+b10+" billete(s) de 10 euros");
            System.out.println("Te corresponden "+b5+" billete(s) de 5 euros");
            System.out.println("Hasta la proxima :)");
            }
        }
    }
        else if((respuesta == 'n') || (respuesta == 'N')){
            System.out.println("Goodbye");
        }
    }
}
