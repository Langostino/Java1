package tema8;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.*;

public class Tema8 {
    public static void main(String[] args) {
        URL direccion;
        
        try{
            direccion = new URL("http://www.twitter.com");
            String s = new String(); String html = new String();
            BufferedReader br = new BufferedReader(new InputStreamReader( direccion.openStream()));
            while((s = br.readLine()) != null){
                html += s + "\n";
            }
            br.close();
            System.out.println(html);
        } catch (MalformedURLException e1){
            System.err.print("bruh..");
            e1.printStackTrace();
        } catch (FileNotFoundException e){
            System.err.println(e);
        } catch (IOException e){
            System.err.println(e);
    }
}
}
