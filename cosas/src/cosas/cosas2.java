package cosas;

public class cosas2 {
    boolean encendido;
    String modelo;
    int ruedas, fuel=3;

    cosas2(String modelo, int fuel, int ruedas){
        this.modelo=modelo;
        this.fuel=fuel;
        this.ruedas=ruedas;
        encendido=false;
    }
    
    void encender(){
        if (fuel>0){
            if (encendido==true){
                System.out.println("ya esta encendido bro");
            }else{
                encendido=true;
                System.out.println("coche encendido");
            }
        }else{
            System.out.println("echale gasolina bro");
        }
    }
    
    void apagar(){
        if (encendido==false){
            System.out.println("ya esta apagado bro");
        }else{
            encendido=false;
            System.out.println("coche apagado");
        }
    }
    
        void correr(){
            if (encendido==true){
                if (fuel>0){
                    fuel--;
                    System.out.println("el coche corre y le quedan "+fuel+" litros");
                }else{
                    encendido=false;
                    System.out.println("no tienes gasolina pa correr bro y ademas te apagao el coche");
                }
            }else{
                System.out.println("estaria bien que encendieras el coche");
            }
    }
}
