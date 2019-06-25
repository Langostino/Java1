package taller.mecánico;

import java.io.IOException;

public class Coche {
    private String Marca;
    private String Modelo;
    private int km;
    private Fecha FechaMatricula;
    private String Matricula;
    private int DNI;
    
    public Coche(String Marca, String Modelo, String Matricula, int km, Fecha Fechamatricula, int DNI){
        this.Marca=Marca.toUpperCase();
        this.Modelo=Modelo.toUpperCase();
        this.Matricula=Matricula;
        this.FechaMatricula=Fechamatricula;
        if(String.valueOf(DNI).length()<9){
            this.DNI=DNI;
        }else{
            System.err.println("El DNI debe tener 8 caracteres");
        }

        if(String.valueOf(km).length()<7){
            this.km = km;
        }else{
            System.out.println("Un coche no puede sobrepasar el máximo kilometraje (999.999 km)");
        }
    }
    
    public String getMatricula(){
        return Matricula;
    }
    
    public void setMatricula(String m){
        Matricula = m;
    }
    public String getMarca(){
        return Marca;
    }
    
    public void setMarca(String m){
        Marca = m.toUpperCase();
    }
    
    public int getDNI(){
        return DNI;
    }
    
    public void getDatos(){
        System.out.println("Coche con propietario con DNI: " + DNI);
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Matricula: " + Matricula);
        System.out.println("Kilometraje: " + km);
        System.out.println("Fecha de matriculación: " + FechaMatricula);
        
    }
    public static void main(String[] args) {

        
    }
}