package taller.mecánico;
public class CalcularDNI {
    
    public char CalcularDNI(int dni){
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        int modulo = dni % 23;
        char letra = caracteres.charAt(modulo);
        return letra;
    }
}
