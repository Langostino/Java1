package tema8;
import java.io.IOException;

public class ES {
    public static String leeDeTeclado(String inicio){
        System.out.println(inicio);
        String frase="";
        char c=' ';
        do{
            try{
                c=(char)System.in.read();
            } catch (IOException e){
                e.printStackTrace();
            }
            if((int)c!=13 && (int)c!=10){
                frase=frase+c;
            }
        }while(c!='\n');
        return frase;
    }
    
    public static void main(String[] args) throws IOException{
        String prueba;
        prueba=leeDeTeclado("Hola bro contame bro");
        System.out.println(prueba);
    }        
}
