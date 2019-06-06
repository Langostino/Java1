package coor;

public class triangulo {
    String idTrian;
    punto p1,p2,p3;
    
    public triangulo(String id, punto p1, punto p2, punto p3){
        idTrian=id;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;   
    }
    
    public float calcArea(){
        float base, altura, area;
        base=(float)Math.sqrt(Math.pow(Math.abs(p1.getX()-p2.getX()), 2)+Math.pow(Math.abs(p1.getY()-p2.getY()), 2));
        altura=(float)Math.abs(p1.getY()-p3.getY());
        area=base*altura/2;
        return area;
    }
    public void setP1(punto p1){
        this.p1=p1;
    }
    public void setP2(punto p2){
        this.p2=p2;
    }
    public void setP3(punto p3){
        this.p3=p3;
    }
    public String getIdTriangulo(){
        return idTrian;
    }
    public punto getP1(){
        return p1;
    }
    public punto getP2(){
        return p2;
    }
    public punto getP3(){
        return p3;
    }
}
