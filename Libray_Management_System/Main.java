import java.util.ArrayList;
import java.util.Scanner;


public class Main{
  static ArrayList<Book> books = new ArrayList<>();
  static Scanner scanner = new Scanner(System.in);


  public static void main(String[] args){

  boolean running = true;

    while(running){
      print_message();
      int input = scanner.nextInt();
      scanner.nextLine();

      switch (input) {
        case 1:
          add_book();
          break;
        case 2:
          borrow_book();

        case 5:
          running = false;
          break;



        default:
          System.out.println("Please choose 1-5");
          break;
      }


    }
  
    scanner.close();

  }

  public static void add_book(){
    System.out.printf("What book you want to add(type the name): ");
    String book_name = scanner.nextLine();
    System.out.printf("What the author name (type the author name): ");
    String author_name = scanner.nextLine();
    books.add(new Book(author_name, book_name));
  }

  public static void borrow_book(){
    System.out.printf("Enter the name of the book your want to borrow: ");
    String book_name = scanner.nextLine();
  }

  public static void print_message(){
    System.out.println("Libray Management System");
    System.out.println("1.Add book");
    System.out.println("2.Borrow book");
    System.out.println("3.Return book");
    System.out.println("4.List books");
    System.out.println("5.Exit");
    System.out.printf(": ");

  }


}
