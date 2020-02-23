// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
    /*
    Dog dog = new Dog("Spike");
    System.out.println(dog.getName() + " says " + dog.speak());
    System.out.println();
    */

    Dog yorkshire = new Yorkshire("Yorky");
    System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
    System.out.println(yorkshire.getName() + " weighs " + yorkshire.avgBreedWeight() + " lbs");
    System.out.println();


    Dog labrador = new Labrador("Labby", "yellow");
    System.out.println(labrador.getName() + " says " + labrador.speak());
    System.out.println(labrador.getName() + " weighs " + labrador.avgBreedWeight() + " lbs");
    }
}