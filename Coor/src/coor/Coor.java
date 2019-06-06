package coor;

public class Coor {

    public static void main(String[] args) {
        punto pun1=new punto("pun1",1,2);
        punto pun2=new punto("pun2",5,2);
        linea l1=new linea("L1", pun1, pun2);
        linea l2=new linea("L2", new punto("punto1",3,2), new punto("punto2",7,8));
        
        System.out.println("Linea "+l1.getIdLinea()+":\n*********************************");
        System.out.println("\tPunto1\tX: "+l1.getP1().getX()+"\tY: "+l1.getP1().getY());
        System.out.println("\tPunto2\tX: "+l1.getP2().getX()+"\tY: "+l1.getP2().getY());
        System.out.println("Longitud: "+l1.calcularLong()+"\n");
        
        System.out.println("Linea "+l2.getIdLinea()+":\n*********************************");
        System.out.println("\tPunto1\tX: "+l2.getP1().getX()+"\tY: "+l2.getP1().getY());
        System.out.println("\tPunto2\tX: "+l2.getP2().getX()+"\tY: "+l2.getP2().getY());
        System.out.println("Longitud: "+l2.calcularLong()+"\n"); 
        
        punto pun3=new punto("pun3",3,7);
        triangulo t1=new triangulo("T1",pun1,pun2,pun3);
        System.out.println("Triangulo "+t1.getIdTriangulo()+":\n*********************************");
        System.out.println("\tPunto1\tX :"+t1.getP1().getX()+"\tY: "+t1.getP1().getY());
        System.out.println("\tPunto1\tX :"+t1.getP2().getX()+"\tY: "+t1.getP2().getY());
        System.out.println("\tPunto1\tX :"+t1.getP3().getX()+"\tY: "+t1.getP3().getY());
        System.out.println("El area de "+t1.getIdTriangulo()+" es de:"+t1.calcArea()+"\n");
        
        cuadrado c1=new cuadrado("C1", new punto("point1",0,0), new punto("point2",5,0), new punto("point3",0,5), new punto("point4",5,5));
        System.out.println("Cuadrado "+c1.getIdCuadrado()+":\n*********************************");
        System.out.println("\tPunto1\tX :"+c1.getP1().getX()+"\tY: "+c1.getP1().getY());
        System.out.println("\tPunto1\tX :"+c1.getP2().getX()+"\tY: "+c1.getP2().getY());
        System.out.println("\tPunto1\tX :"+c1.getP3().getX()+"\tY: "+c1.getP3().getY());
        System.out.println("\tPunto1\tX :"+c1.getP4().getX()+"\tY: "+c1.getP4().getY());
        System.out.println("El area de "+c1.getIdCuadrado()+" es de:"+c1.calcArea()+"\n");       
    }
}
