package taller.mecánico;

public class Fecha {
    int mes,dia,anyo;
    String Array[]={"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre",};

    public Fecha(int dia, int mes, int anyo){
        this.dia=dia;
        this.mes=mes;
        this.anyo=anyo;
    }
        public boolean isfechaOk(){
            boolean ok=false;
            if((mes >= 13||mes <= 0)||(dia >= 32||dia <= 0)||((anyo > 9999)||(anyo < 1900))){
            ok=false;}
            else{
                switch (mes) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    ok=true;
                    break;
                case 2:
                    if(dia<=29){
                        ok=true;
                    }break;
                default:
                    if(dia<=30){
                        ok=true;
                    }break;
                }
            }
            return ok;
        }
        
        public void getFechaLetra(){
            if(isfechaOk()==true){
            System.out.println("La fecha es: "+dia+"/"+Array[mes-1]+"/"+anyo);
        }else{
                System.err.println("La fecha es incorrecta");
            }
        }

        public void getFecha(){
            if(isfechaOk()==false){
            System.err.println("La fecha es incorrecta");
        }else{System.out.println("La fecha es: "+dia+"/"+mes+"/"+anyo);
        }
    }
            public static void main(String[] args) {
        Fecha fecha1=new Fecha(29,13,1990);
        fecha1.getFecha(); 
        fecha1.getFechaLetra();
    }
}
