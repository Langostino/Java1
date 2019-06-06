package coor;

public class cuadrado {
    String idCuad;
    punto p1,p2,p3,p4;
    
    public cuadrado(String id, punto p1, punto p2, punto p3, punto p4){
        idCuad=id;
        this.p1=p1;
        this.p2=p2;
        this.p3=p3;
        this.p4=p4;
    }
    
    public float calcArea(){
        float base, altura, area;
        base=(float)Math.sqrt(Math.pow(Math.abs(p1.getX()-p4.getX()), 2)+Math.pow(Math.abs(p1.getY()-p4.getY()), 2));
        altura=(float)Math.sqrt(Math.pow(Math.abs(p1.getX()-p2.getX()), 2)+Math.pow(Math.abs(p1.getY()-p2.getY()), 2));
        area=base*altura;
        return area;
    }
    public String getIdCuadrado(){
        return idCuad;
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
    public void setP4(punto p4){
        this.p4=p4;
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
    public punto getP4(){
        return p4;
    }
}
