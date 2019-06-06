package cosas;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.io.IOException;


public class files {
    public static File abrirFichero(String ruta){
        //Abre fichero
        File f = new File(ruta);
        return f;
    }
    
    public static void getList(File directorio){
        //Tonteridas
        int i=0;
        File lista[];
        lista=directorio.listFiles();
        System.out.println("Contenido del directorio '"+directorio.getPath()+':');
        for(i=0;i<lista.length;i++){
            System.out.println(lista[i].getName()+"\t"+lista[i].length()+" bytes\t");
        }
    }
    
    public static void main(String[] args){
        File fichero=files.abrirFichero("hola.txt");
        files.getList(fichero);
        FileWriter fuk=new FileWriter("fichero.txt");
        String cad="";
        Scanner kb=new Scanner(System.in);
        
        
    }
}
