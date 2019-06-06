package coor;

public class linea {
    String idLinea;
    punto p1,p2;
    
    public linea(String id, punto p1, punto p2){
        idLinea=id;
        this.p1=p1;
        this.p2=p2;
    }
    public float calcularLong(){
        float longitud;
        longitud=(float)Math.sqrt(Math.pow(p1.getX()-p2.getX(), 2)+Math.pow(p1.getY()-p2.getY(), 2));
        return longitud;
    }
    public String getIdLinea(){
        return idLinea;
    }
    public void setIdLinea(String idLinea){
        this.idLinea=idLinea;
    }
    public punto getP1(){
        return p1;
    }
    public punto getP2(){
        return p2;
    }
    public void setP1(punto p1){
        this.p1=p1;
    }
    public void setP2(punto p2){
        this.p2=p2;
    }
}
