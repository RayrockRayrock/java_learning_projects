import java.util.ArrayList;
import java.util.Scanner;


public class Main{
  static ArrayList<Book> books = new ArrayList<>();
  static Scanner scanner = new Scanner(System.in);
  static ArrayList<Book> borrowed_books = new ArrayList<>();


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
          break;
        case 3:
          return_book();
          break;


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
    System.out.printf("Book name: ");
    String book_name = scanner.nextLine();
    System.out.printf("Author name: ");
    String author_name = scanner.nextLine();
    books.add(new Book(author_name, book_name));
    System.out.println("You add "+book_name+" to the libray");
  }

  public static void borrow_book(){
    System.out.printf("Book name: ");
    String target_book = scanner.nextLine();
    for (int i = 0; i < books.size(); i++)
    {
      if (target_book.equalsIgnoreCase(books.get(i).get_book_name()))
      {
        borrowed_books.add(books.remove(i));
        System.out.println("You borrow " + target_book + " from the libray");
        return;

      }

    }

    System.out.println(target_book + " is not in libray");
  }


  public static void return_book(){
    System.out.print("Book name: ");
    String target_book = scanner.nextLine();
    for (int i = 0; i < borrowed_books.size(); i++)
    {
      if (target_book.equalsIgnoreCase(borrowed_books.get(i).get_book_name()))
      {
        books.add(borrowed_books.remove(i));
        System.out.println("You return "+ target_book + " to the libray");
        return;
      }
    }
    System.out.println(target_book + " has not been borrow yet");
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
