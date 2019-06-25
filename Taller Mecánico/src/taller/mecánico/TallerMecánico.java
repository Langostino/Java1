package taller.mecánico;

public class TallerMecánico {

    public static void main(String[] args) {
        Fecha fecha1=new Fecha(29,2,1998);
        Fecha fecha2=new Fecha(30,8,2003);
        Fecha fecha3=new Fecha(2,5,2015);
        Fecha fecha4=new Fecha(9,1,1995);
        
        fecha1.getFecha();
        
        Coche c1 = new Coche("renault", "megane", "9234OOP", 1, fecha1, 1234);
        Coche c2 = new Coche("peugeot", "402", "2834IGF", 402253, fecha2, 1234);
        Coche c3 = new Coche("ford", "mustanf", "9283LPF", 19223, fecha3, 1234);
        Coche c4 = new Coche("mercedes", "benz", "1232CCB", 21223, fecha4, 1234);
        
        c1.getDatos();
    }
}
