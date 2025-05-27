public class Area {
    public static void main(String[] args) {
        double R=7.0;
        double r=6.0;

        double sum=Math.PI*(R*R -r*r);

        System.out.println("Circle Area inner and outer value :"+sum);

    }
    
}
// Ring (Concentric Circles) 

 class Area1 {
public static void main(String[] args) {
    double R =7;
    double r=8;

    double sum = Math.PI*(R*R-r*r);
    System.out.println("Ring concetric circles :"+sum);
}
    
}

// Square Frame (Hollow Square) 

 class Area2 {

    public static void main(String[] args) {
        int outer=10;
        int inner=5;

        int area=(outer * outer)-(inner * inner);
        System.out.println("Square frame area :"+area);
    }
}

// Rectangle Frame (Hollow Rectangle)

class Area3{
    public static void main(String[] args) {
        int L=10,B=10;
        int l=9,b=6;

        int area=(L *B)-(l*b);
        System.out.println("Rectangle frame area :"+area);
    }
}

//  Equilateral Triangle Frame

class Area4{
    public static void main(String[] args) {
        double a=10;
        double b=6;

        double area=(Math.sqrt(3)/4)*(a*a-b*b);

        System.out.println("Equilateral triangle area:"+area);
    }
}

//  Regular Hexagon Frame

class Area5{
    public static void main(String[] args) {
        double R =10;
        double r=6;

        double area = ((3*Math.sqrt(3)/2) * (R * R-r * r));

        System.out.println("Reguler Hexagon from value :"+area);
    }
}