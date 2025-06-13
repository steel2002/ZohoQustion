// Class and Object-Oriented Programming in Java


class Rectangle {

    int length;
    int widhth;

    void getDetails(int l,int w)
    {
        length = l;
        widhth = w;
    }

    int area()
    {
        return length * widhth;
    
    }
}

public class Oops {
    
    public static void main(String[] args) 
    {
        Rectangle r1 = new Rectangle();
        r1.getDetails(10, 20);
        System.out.println("Area of Rectangle: " + r1.area());
    }
    
}


// Data Hiding  getters and setters  private variables class values get pannum 

class Rectangle1 {

    private int length;
    private int width;

    // getters and setters function

    int getlength() {
        return length;
    }

    int getwidth() {
        return width;
    }
    void setlength(int l) {
        if(l>0)
         length = l;
         else 
            System.out.println("Length should be greater than 0");
    }
    void  setwidth(int w) {
        if(w>0)
         width = w;
         else
            System.out.println("Width should be greater than 0");
    }
    int area()
    {
        return length * width;
    }
}

class Oops1 {

    public static void main(String[] args)
    {
        Rectangle1 r1 = new Rectangle1();
        r1.setlength(-10);
        r1.setwidth(20);

        System.out.println("Area of Rectangle: " + r1.area());
        System.out.println("Length of Rectangle: " + r1.getlength());
        System.out.println("Width of Rectangle: " + r1.getwidth());
        
    }

}