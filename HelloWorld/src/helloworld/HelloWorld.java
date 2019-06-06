package helloworld;

import java.util.Scanner;

public class HelloWorld {
    
    
    public static void main(String[] args) {
        int hola=(int)(Math.random()*100);
        System.out.println(hola);
        int a1[]={hola};
        int a2[]={4,5,6};
        int a3[]=new int[3];
        
        for(int i=0;i<a1.length;i++){
        a3[i]=a1[i];
        }

        System.out.println(a3);
    }
}  
            

/*

for (int i = 1; i <= 10; i++) {
                        System.out.println(i);
                }

  String cosa;
        Scanner sc = new Scanner(System.in);
        System.out.println("dimne cosas bro");
                cosa = sc.next();
                System.out.println(cosa + " tu gilipollas");
*/