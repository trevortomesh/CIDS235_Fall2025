public class Circle {
    private double radius = 1.0;
    static int numberOfObjects = 0;
    Circle(){
        //System.out.println("This is the default constructor");
        //System.out.println("No argument given -- the radius is: " + radius);
        numberOfObjects++;
        
    }

    Circle(double newRadius){
        //System.out.println("This is the parameterized constructor");
        radius = newRadius;
        numberOfObjects++;
    }

    double getArea(){
        return Math.PI * radius * radius;
    }

    double getPerimeter(){
        return 2 * radius * Math.PI;
    }

    static int getNumberOfObjects(){
        System.out.println(Circle.numberOfObjects);
        return numberOfObjects;
    }

    double getRadius(){
        return radius;
    }
}
