//define package in which our class lives. 
package codemude;

//Declare public class named NewClass
public class NewClass {
    //Declare public static function
    //returning void named main
    //with parameter of strings array type.
    //This method will be called by JVM
    //to start program. 
    public static void main(String[] initial) {
        //Call static method of static field 
        //of System class with string argument
        //to print message
        System.out.println("Hello, dude");
    }
}
