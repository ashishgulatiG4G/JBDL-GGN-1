import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {


    public static void main(String[] args) throws Exception {



        // Always program to an interface, rather than implementation

        Map<Integer, Integer> m = new HashMap<>();


        Car mycar = new Car("cx245", "e12ts", "HRxxxxxxx", "black");
		System.out.println(mycar.getColor());


        // 2 types of constructor ->
        // 1. Default const
        // 2. Parametrised constructor

        //Polymorphism
        // Run time polymorphism -> Function overriding


        //Inheritence

        // super keyword

        // final keyword

        /*
        	final variable -> You can't modify
        */
        final String name = "Ashish";


        // final method -> You Can't override
        // final class -> You can't extend it

        Vehicle bike = new Bike();
        Scooter scooter = new Scooter();

        System.out.println(scooter.switch_engine());
        System.out.println(bike.switch_engine());


//        List


        // Abstraction ->
            // Abstract classes
            // Interfaces

        /*

         	Difference
         1. Abstract class can have abstract and non-abstract methods
         2. Using interface, multiple inheritance is possible
         3. abstract class/ interface
         4. interface -> public abstract, abstract -> private, public, protected
         5. interface -> implement, abstract -> extends

         */



        // Encapsulation




    }
}