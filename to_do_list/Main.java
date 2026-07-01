import java.util.ArrayList;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){

    ArrayList<String> to_do_list = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    int input = 0;
    boolean running = true;
    while (running)
    {
      System.out.println("1. Add Task\n2.View Tasks\n3.Delete Task\n4.Exit");
      input = scanner.nextInt();
      scanner.nextLine();
      switch (input) {
        case 1:
          System.out.print("Add your task: ");
          to_do_list.add(scanner.nextLine());
          break;

        case 2:
          for (int i =0; i < to_do_list.size(); i++)
          {
            System.out.println(to_do_list.get(i));
          }
          break;

        case 3:
          String target_task = scanner.nextLine();
          to_do_list.remove(target_task);
          break;
        case 4:
          running = false;
          break;


        default:
          System.out.println("Choices are 1-4");
          break;
      }

    }
    scanner.close();

  }

}
