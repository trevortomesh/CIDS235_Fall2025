public class Main {
    public static void main(String[] args) {

        System.out.println(Circle.getNumberOfObjects());

         Circle c1 = new Circle(5.0);
         System.out.println(c1.getArea());
         System.out.println(c1.numberOfObjects);

         Circle c2 = new Circle(3.0);
         System.out.println(c2.getPerimeter());
        System.out.println(c2.numberOfObjects);



 


        // java.util.Random generator1 = new java.util.Random(215);
        // System.out.print("From generator1: ");
        //     for(int i = 0; i < 10; i++){
        //         System.out.print(generator1.nextInt(27) + " ");
        //     }

        // java.util.Random generator2 = new java.util.Random(215);
        // System.out.print("\nFrom generator2: ");
        //     for(int i = 0; i < 10; i++){
        //         System.out.print(generator2.nextInt(1000) + " ");
        //     }

        // int i = 5;
        // int j = 2;
        // i = j;
        // System.out.println("i is " + i);
        // System.out.println("j is " + j);

        // //Student student1 = new Student();
        // Circle c1 = new Circle(5);
        // Circle c2 = new Circle(9);
        // c1 = c2;


        // System.out.println(c1.radius);
        // System.out.println(c2.radius);

        // c2.radius = 37;
        // System.out.println(c1.radius);
        // System.out.println(c2.radius);


        // System.out.println(student1);

        // System.out.println("student1.name is : " + student1.name);
        // student1.name = "Ethan";
        // System.out.println("student1.name is : " + student1.name);
        // System.out.println("student1.wnumber is: " + student1.wnumber);
        // student1.wnumber = "w10101010";
        // System.out.println("student1.wnumber is: " + student1.wnumber);
        // System.out.println("student1.age: " + student1.age);
        // student1.age = 21;
        // System.out.println("student1.age: " + student1.age);
        
        // student1.isCSMajor = true;
        // student1.sex = 'M';


        // Circle circle1;
        // Circle circle2 = new Circle(5);
        // circle1 = circle2;

        // circle2.radius = 3.4;
        // System.out.println(circle2);
        // System.out.println(circle1);

    //     System.out.println("Circle1 has a radius of: " + circle1.radius);
    //     System.out.println("Circle2 has a radius of: "+ circle2.radius);
    //    // System.out.println("The area of circle2 is: " + (Math.PI * circle2.radius * circle2.radius));
    //     System.out.println("The area of circle2 is: " + circle2.getArea());
    //     System.out.println("The circumference of circle1 is " + circle1.getPerimeter());
    }
}

