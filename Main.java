public class Main {
    public static void main(String[] args) {

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        System.out.println("Circle1 has a radius of: " + circle1.radius);
        System.out.println("Circle2 has a radius of: "+ circle2.radius);
       // System.out.println("The area of circle2 is: " + (Math.PI * circle2.radius * circle2.radius));
        System.out.println("The area of circle2 is: " + circle2.getArea());
    }
}
