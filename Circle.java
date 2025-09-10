public class Circle {
    double radius = 1;

    Circle(){
        //System.out.println("This is the default constructor");
        //System.out.println("No argument given -- the radius is: " + radius);
    }

    Circle(double newRadius){
        //System.out.println("This is the parameterized constructor");
        radius = newRadius;
    }

    double getArea(){
        return Math.PI * radius * radius;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }
}
