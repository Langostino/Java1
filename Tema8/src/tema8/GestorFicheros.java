package tema8;

import java.io.IOException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
public class GestorFicheros {
    
    public static File abrirFichero(String name){
        //Abre un archivo dada una ruta
        File f=new File(name);
        System.out.println("El fichero "+name+" ha sido abierto correctamente");
        return f;
    }
    
    public static void getInfo(File f){
        //Te de la info de un archivo abierto
            System.out.println("Info de "+f.getName());
            System.out.println("Ruta: "+f.getAbsolutePath());
            System.out.println("Tamaño: "+f.length());
            System.out.println("Permite - Leer: "+f.canRead()+", Escribir: "+f.canWrite()+", Ejecutar: "+f.canExecute());
    }
    
    public static void getList(File f){
        //Le das una ruta y te dice los archivos que hay dentro y su info
        int i;
        File lista[];
        lista=f.listFiles();
        System.out.println("Contenido del archivo "+f.getPath()+" :");
        for(i=0;i<lista.length;i++)
        {
            System.out.println(lista[i].getName()+"\t"+lista[i].length()+" bytes\t"+"R: "+
                    lista[i].canRead()+"\tW: "+lista[i].canWrite()+"\tX: "+lista[i].canExecute());
        }
    }
    
    public static void leerFicheroTxt(File f) throws IOException{
        String cad;
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        System.out.println("El contenido del fichero es:\n");
        while((cad=br.readLine())!=null)
        {
            System.out.println(cad);
        }
    }
    
    public static void escribirFicheroTxt(File f, boolean agregar) throws IOException{
        FileWriter fw=new FileWriter(f, agregar);
        String cad;
        do{
            cad=ES.leeDeTeclado("Escribe exit para salir:");
            fw.write(cad+"\n");
        }while(!cad.equals("exit"));
        fw.close();
    }
    
    
    public static void main(String[] args) throws IOException{
        File f = abrirFichero("hola.txt");
        escribirFicheroTxt(f, false);
        leerFicheroTxt(f);
    }
}
