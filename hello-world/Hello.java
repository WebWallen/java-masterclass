// If file name is uppercase, the class name must be as well!
public class Hello {
// Public is an access modifier that allows us to define scope (public gives full access)
    public static void main(String[] args) {
        // The main method is entry point of our program
        System.out.println("Hello World");

        // Must specify variable type unlike other languages
        int myFirstNumber = 5;
        System.out.println(myFirstNumber);

        int mySecondNumber = 6;
        int myThirdNumber = 7;
        System.out.println(mySecondNumber + myThirdNumber);
    }    
}