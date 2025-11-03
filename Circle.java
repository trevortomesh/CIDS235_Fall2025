public class Circle extends GeometricObject {
    private double radius;
    private static int numberOfObjects = 0;
    
    public Circle(){
        this(1.0);
    }

    public Circle(double radius){
        //System.out.println("This is the parameterized constructor");
        this.radius = radius;
        numberOfObjects++;
    }

    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter(){
        return 2 * this.radius * Math.PI;
    }

    
    public static int getNumberOfObjects(){
        System.out.println(Circle.numberOfObjects);
        return numberOfObjects;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        if(radius > 0.0){
            this.radius = radius;
        } else{
            this.radius = 1.0;
        }
    }

    public void printCircle(){
        System.out.println("The circle was created on " +
        super.getDateCreated() + " and the radius is " + radius);
    }

    @Override
    public String toString(){
        return super.toString() + "\nradius is " + radius;
    }


}
