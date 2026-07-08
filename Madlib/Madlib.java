import java.util.Scanner;

public class Madlib{

  static String noun1 = null;
  static String verb1 = null;

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a noun: ");
    noun1 = scanner.nextLine();
    System.out.print("Enter a verb(ing): ");
    verb1 = scanner.nextLine();






    scanner.close();
    printMessage();





    
  }
  static void printMessage(){

    System.out.println(noun1 + " is " + verb1);
  }
}
