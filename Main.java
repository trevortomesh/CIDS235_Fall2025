import java.util.Scanner;
import java.util.ArrayList;
public final class Main {
    public static void main(String[] args) {


            GeometricObject o1 = new ComparableRectangle(3.4,5.4);
            GeometricObject o2 = new ComparableRectangle(13.24, 55.4);
            GeometricObject o3 = new ComparableRectangle(7.4, 35.4);
            GeometricObject o4 = new ComparableRectangle(1.4, 25.4);
            GeometricObject o5 = new ComparableCircle(40.4);
            GeometricObject o6 = new ComparableCircle(8);
            GeometricObject o7 = new ComparableCircle(35);
            GeometricObject o8 = new ComparableCircle(17.2);
            GeometricObject[] geoObs = {o1,o2,o3,o4,o5,o6,o7,o8};

            java.util.Arrays.sort(geoObs);
            for(GeometricObject ob : geoObs){
                System.out.println(ob);
            }

        // ComparableRectangle[] rectangles = {
        //     new ComparableRectangle(3.4,5.4),
        //     new ComparableRectangle(13.24, 55.4),
        //     new ComparableRectangle(7.4, 35.4),
        //     new ComparableRectangle(1.4, 25.4)
        // };

        // java.util.Arrays.sort(rectangles);
        // for(Rectangle rectangle:rectangles){
        //     System.out.print(rectangle + " ");
        //     System.out.println();
        // }

        // ComparableCircle[] circles = {
        //     new ComparableCircle(40.4),
        //     new ComparableCircle(8),
        //     new ComparableCircle(35),
        //     new ComparableCircle(17.2)
        // };

        // java.util.Arrays.sort(circles);
        // for(Circle circle : circles){
        //     System.out.print(circle + " ");
        //     System.out.println();
        // }

        // String[] cities = {"Savannah", "Boston", "Atlanta", "Tampa"};

        // java.util.Arrays.sort(cities);
        // for(String city: cities){
        //     System.out.print(city+ " ");
        // System.out.println();    
        // }

        // Object[] objects = {new Tiger(), new Chicken(), new Apple()};

        // for(int i = 0; i < objects.length; i++){
        //     if(objects[i] instanceof Edible){
        //         System.out.println(((Edible)objects[i]).howToEat());
        //     }

        //     if(objects[i] instanceof Animal){
        //         System.out.println(((Animal)objects[i]).sound());
        //     }
        // }

        // objects[0] = new Tiger();
        // objects[1] = new Chicken();
        // objects[2] = new Apple();


        // GeometricObject geoObject1 = new Circle(5);
        // GeometricObject geoObject2 = new Rectangle(5,3);
        // System.out.println(equalArea(geoObject1, geoObject2));

        // GeometricObject[] objects = new GeometricObject[10];
        // objects[0] = new Circle();

        // Integer x = 5;
        // Double y = 3.2;
        // System.out.println(x.floatValue());
        // System.out.println(y.floatValue());


        // GeometricObject thingie = new GeometricObject();
        // System.out.println(thingie.toString());

        // int age = 45;
        // byte newAge = (byte)age;
        // System.out.println(newAge);

        // Object o = new Circle();
        // Circle c = (Circle)o; 
        // Circle d = new Circle(3.2);
        // System.out.println(o.equals(c));
        // c.setRadius(25);
        // System.out.println(c.equals(o));
        // System.out.println(c.equals(d));

        // Circle myCircle = new Circle(12);
        // Rectangle recty = new Rectangle(6,7);
        // Object myObject;
        // Student s = new Student();
        // Circle c = new Circle();
        // myObject = c;
        // displayObject(myObject);
        // displayObject(s);
        // displayObject(recty);

        // displayGeoObject((GeometricObject)myObject);
        // displayGeoObject(myCircle);
        // displayGeoObject(recty);

        /* OLD CODE -------------------------------------
        // m(new GraduateStudent());
        // m(new Student());
        // m(new Person());
        // m(new Object());

        // Object o = new Student();
        // Student b = (Student) o;

        // double x = 5.2;
        // int y = (int) x;
        // System.out.println(x);
        // System.out.println(y);



         //Object myObject = new Circle();
        // //System.out.println(nullGuy);

        // Object o = new GeometricObject();
        // System.out.println(myObject.toString());

        //GeometricObject g = new Object();

        // Circle bob = new Circle(7.0);
        // Rectangle steve = new Rectangle();

        // displayGeoObject(bob);
        // displayGeoObject(steve);


       // System.out.println(bob.toString());
        //Person steve = new Person();
        //System.out.println(steve.toString());
        //Circle joe = bob;
       // System.out.println(joe.equals(bob));

        //bob.printCircle();
        //System.out.println(bob.toString());
        //Faculty drt = new Faculty();
        // Rectangle r1 = new Rectangle(2,4,"Blue",true);
        // System.out.println(r1.toString());
        // System.out.println(r1.getArea());
        // Circle circle1 = new Circle();
        // System.out.println(circle1.getColor());

        // String s1 = "It's string time!";
        // String s2 = "It's string time again!";
        // String s3 = "it's string time again!";

        // String s4 = "Java";
        // s4 = "HTML";

        // System.out.println(s4);
        // //System.out.println(s1.charAt(3));
        // System.out.println(s2.compareToIgnoreCase(s3));

        // String s5 = "This is Halloween!";
        // String s6 = new String("Have a Holly Jolly Christmas!");
        // String s7 = "This is Halloween!";
        // String s8 = new String("Have a Holly Jolly Christmas!");

        // System.out.println(s5 == s7);
        // System.out.println(s6 == s8);


        // ArrayList<Circle> list = new ArrayList<>();
        // list.add(new Circle(2));
        // list.add(new Circle(3));

        // for(int i = 0; i < 10; i++){
        //     list.add(new Circle(i+1));
        // }

        // for(int i = 0; i < list.size(); i++){
        //     System.out.println("Area is: " + list.get(i).getArea());
        // }
    

        // ArrayList<String> cityList = new ArrayList<>();

        // cityList.add("Milwaukee");
        // cityList.add("Cameron");
        // cityList.add("Hudson");
        // cityList.add("Prior Lake");
        // cityList.add("Shokopee");
        // cityList.remove("Cameron");

        // System.out.println(cityList);

        // System.out.println(cityList.get(0));
        // System.out.println(cityList.contains("Barron"));
        // System.out.println(cityList.size());

        // Integer x1 = 32;
        // System.out.println(x1.doubleValue());       
        // System.out.println(x1); 

        //System.out.println(x.getValue());
        // StackOfIntegers stack = new StackOfIntegers();
        // System.out.println(stack.empty());


        // for(int i = 0; i < 10; i++){
        //     stack.push(i);
        // }
        // System.out.println("Is empty? " + stack.empty());
        // System.out.println(stack.peek());

        //  while(!stack.empty()){
        //      System.out.print(stack.pop());
        //  }

        //  System.out.println(stack.empty());

        //  System.out.println(stack.peek());
        // Course course1 = new Course("Programming Paradigms");
        // Course course2 = new Course("Operating Systems Programming");

        // Student student1 = new Student("Peter Griffin");
        // Student student2 = new Student("Erik Cartman");
        // Student student3 = new Student("Bob Dylan");
        // Student student4 = new Student("Bojack Horseman");
        // Student student5 = new Student("Rick Sanchez");
        // Student student6 = new Student("Morty Smith");


        // course1.addStudent(student1.getName());
        // course1.addStudent(student2.getName());
        // course1.addStudent(student3.getName());

        // course2.addStudent(student4.getName());
        // course2.addStudent(student5.getName());
        // course2.addStudent(student6.getName());

        // System.out.println("Number of students in course1: " +
        // course1.getNumberOfStudents());
        // String[] students = course1.getStudents();

        // for(int i = 0; i < course1.getNumberOfStudents(); i++){
        //     System.out.print(students[i] + ", ");
        // }

        // System.out.println();
        // System.out.println("Number of students in course2: "
        // + course2.getNumberOfStudents());
        // Scanner input = new Scanner(System.in);

        // System.out.print("Enter annual interest rate, for example, 8.25: ");
        // double annualInterestRate = input.nextDouble();

        // System.out.print("Enter number of years as an integer: ");
        // int numberOfYears = input.nextInt();

        // System.out.print("Enter loan amount, for example, 120000.95: ");
        // double loanAmount = input.nextDouble();

        // Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // System.out.printf("The loan was created on %s\n" + 
        //     "The monthly payment is %.2f\nThe total payment is %.2f\n",
        //     loan.getLoanDate().toString(), loan.getMonthlyPayment(), loan.getTotalPayment());

        // Circle c1 = new Circle(3.2);

        // System.out.println(c1.getRadius());
        // System.out.println(Circle.getNumberOfObjects());

        // int i = 5;
        // myMethod(i);
        // System.out.println("i is " + i + " in the main.");

        // Circle[] circleArray = new Circle[10];
        // for(int i = 0; i < circleArray.length; i++){
        //     circleArray[i] = new Circle();
        // }

        // System.out.println(circleArray);
        // System.out.println(circleArray[0]);
        // System.out.println(circleArray[0].getRadius());

        // printCircleArray(circleArray);
     */

}


    public static boolean equalArea(GeometricObject object1, 
    GeometricObject object2){
        return object1.getArea() == object2.getArea();
    }

    public static void displayObject(Object object){
        if(object instanceof Circle){
            System.out.println("The cirle area is " + 
            ((Circle)object).getArea());
            System.out.println("The circle diameter is " + 
            ((Circle)object).getRadius()*2);
        }else if(object instanceof Rectangle){
            System.out.println("The rectangle area is " + 
            ((Rectangle)object).getArea());
        }else{
            System.out.println(object.toString());
        }
    }

    public static void m(Object x){
        System.out.println(x.toString());
    }

    public static void myMethod(int i){
        i = 99;
        System.out.println("i is " + i + " in the method!");
    }

    public static void printCircleArray(Circle[] circleArray){
        for(int i = 0; i < circleArray.length; i++){
            System.out.println("circleArray["+i+"]" + " is " + circleArray[i]);
            System.out.println("radius: " + circleArray[i].getRadius());
        }
    }
    public static void printAreas(Circle c, int times){
        System.out.println("Radius \t\tArea");
        while(times >= 1){
            System.out.println(c.getRadius() + "\t\t" + c.getArea());
            c.setRadius(c.getRadius() + 1);
            times--;
        }
    }
    public static void printCircle(Circle c){
        System.out.println("The area of the circle of radius " 
        + c.getRadius() + " is " + c.getArea());
        c.setRadius(12.0);
    }

    public static void displayGeoObject(GeometricObject object){
        System.out.println("Created on " + object.getDateCreated() +
            ". Color is " + object.getColor());

        if(object instanceof Circle){
            System.out.println("The circle area is " + 
            ((Circle)object).getArea() + " radius is " + 
            ((Circle)object).getRadius());
        }
    }

    // public boolean equals(Object obj){
    //     return this == obj;
    // }

}

