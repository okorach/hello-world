public class HelloWorld extends Object {

    public static void main(String[] args) {
    System.out.println("Hello World !");
    System.out.println("Hello World !");
    System.out.println("Hello World !");
    System.out.println("Hello World !");
    System.out.println("Hello World !");
    
    System.out.println("Hello World in PR !");
    
    System.out.println("Test PR analysis !");
    System.out.println("Test PR analysis !");
    System.out.println("Test PR analysis !");
        System.out.println("Test PR analysis !");
            System.out.println("Test PR analysis !");
    System.out.println("Test PR analysis !");
    }

public void doSomething(String [] strings) {
  for (int i = 0; i < strings.length; i--) { // Noncompliant;
    String string = strings[i];  // ArrayIndexOutOfBoundsException when i reaches -1
    //...
  }
  
}
