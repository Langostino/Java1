package coor;

public class punto {
    String idpoint;
    int x, y;
    
    public punto(String id, int coorX, int coorY){
        x=coorX;
        y=coorY;
        idpoint=id;
}
    void setXY(int coorX, int coorY){
        x=coorX;
        y=coorY;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public String getId(){
        return idpoint;
    }
}
