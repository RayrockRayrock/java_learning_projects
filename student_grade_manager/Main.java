import java.util.Scanner;
import java.util.Collections;
import java.util.Hashtable;
import java.util.Map;

public class Main{
  public static void main(String[] args){
    boolean running = true;
    Scanner scanner = new Scanner(System.in);
    Hashtable<String, Integer> students = new Hashtable<>();
    int input = 0;




    while(running)
    {
      System.out.println("1.Add student\n2.Show all students\n3.Calculate average\n4.Find highest grade\n5.Exit");
      input = scanner.nextInt();
      scanner.nextLine();
      switch (input) {
        case 1:
          
          students.put(scanner.nextLine(), scanner.nextInt());
          break;

        case 2:
          students.forEach((name, grade)->{
            System.out.println(name + " : " + grade);
          });
          break;

        case 3:
          double all_students_grade = 0;
          for (int grade : students.values()){
            all_students_grade += grade;
          }
          double average_grade = all_students_grade / students.size();
          System.out.println("The average grade is " + average_grade);
          break;
        case 4:
          int highest_grade = Collections.max(students.values());
          String highest_person = null;
          for (Map.Entry<String, Integer> entry : students.entrySet()){
            if (entry.getValue() == highest_grade){
              highest_person = entry.getKey();
              break;
            }
          }
          System.out.println("The highest_grade is " + highest_person + " with :" + highest_grade );
          break;

        case 5:
          running = false;
          break;
        default:
          System.out.println("1-5");
          break;
      }

    }
    scanner.close();
  }
}
