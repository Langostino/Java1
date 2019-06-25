package taller.mecánico;

import java.util.ArrayList;

public class Cliente{
    private String nombre;
    private String Apellidos;
    private Fecha FechaNacimiento;
    private int DNI;
    ArrayList<Coche> Coches = new ArrayList<>(); //Arraylist de los coches a nombre del cliente
    
    public Cliente(String n, String ap, Fecha f, int DNI){
        
    }
    
    //Método para añadir un coche a un cliente. 
    //Sólo lo añade en el caso de que el DNI coincida y no se repita el coche en el array.
    public void addCoche(Coche c){
        if(c.getDNI()!=this.DNI){
            System.err.println("El coche no pertenece a este cliente");
        }else if(Coches.indexOf(c)==-1){
            Coches.add(c);
        }
    }
    
    public char CalcularDNI(int dni){
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = dni % 23;
        char letra = caracteres.charAt(modulo);
        return letra;
    }
    public String getDNI(){
        char x = CalcularDNI(DNI);
        String DNIc = String.valueOf(DNI) + x;
        return  DNIc;
    }
}
