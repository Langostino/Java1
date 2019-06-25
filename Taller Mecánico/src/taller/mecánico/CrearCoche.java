package taller.mecánico;

import java.util.Scanner;
import java.io.IOException;

public class CrearCoche {
    public static void hola() throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Registro de coches");
        System.out.println("Marca: ");
        String Marca = sc.nextLine();
        
        System.out.println("Modelo: ");
        String Modelo = sc.nextLine();
        
        System.out.println("Matricula: ");
        String Matricula = sc.nextLine();
        
        System.out.println("Kilometraje: ");
        int Kilometraje = sc.nextInt();
        
        System.out.println("Fecha de matriculación (Año): ");
        int anyo = sc.nextInt();
        
        System.out.println("Fecha de matriculación (Mes): ");
        int mes = sc.nextInt();
        
        System.out.println("Fecha de matriculación (Dia): ");
        int dia = sc.nextInt();
        
        Fecha F = new Fecha(dia, mes, anyo);
        System.out.println("DNI: ");
        int dni = sc.nextInt();
        System.out.println("Codigo para el coche: ");
        int codigo = sc.nextInt();
        
        Coche c = new Coche(Marca, Modelo, Matricula, Kilometraje, F, dni);
}
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Registro de coches");
        System.out.println("Marca: ");
        String Marca = sc.nextLine();
        System.out.println("Modelo: ");
        String Modelo = sc.nextLine();
        System.out.println("Matricula: ");
        String Matricula = sc.nextLine();
        System.out.println("Kilometraje: ");
        int Kilometraje = sc.nextInt();
        System.out.println("Fecha de matriculación (Año): ");
        int anyo = sc.nextInt();
        System.out.println("Fecha de matriculación (Mes): ");
        int mes = sc.nextInt();
        System.out.println("Fecha de matriculación (Dia): ");
        int dia = sc.nextInt();
        
        Fecha F = new Fecha(dia, mes, anyo);
        System.out.println("DNI: ");
        int dni = sc.nextInt();
        
        Coche c = new Coche(Marca, Modelo, Matricula, Kilometraje, F, dni);
        
    }              
}