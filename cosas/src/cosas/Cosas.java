package cosas;

import java.util.Scanner;

public class Cosas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a;
        String r1 = "encender";
        String r2 = "apagar";
        String r3 = "correr";
        
        cosas2 c1=new cosas2("megane", 5, 4);
        System.out.println("El modelo es "+c1.modelo);
        System.out.println("La gasolina es "+c1.fuel);
        System.out.println("El coche tiene "+c1.ruedas+" ruedas");
        System.out.println("Y esta en estado "+c1.encendido);
        c1.encender();
        System.out.println("Y esta en estado "+c1.encendido);
        c1.correr();
        c1.apagar();
        c1.correr();
        System.out.print("QUUEE QUIERES HACEREERRRERER??");
        while(c1.fuel>0){
        a = sc.next();
            if(a.equals(r1)){
            c1.encender();
        }else if(a.equals(r2)){
            c1.apagar();
        }else if(a.equals(r3)){
            c1.correr();
        }else{
            System.out.println("nose");
        }
        }
    }
    
}
