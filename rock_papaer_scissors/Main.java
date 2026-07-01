import java.util.Random;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    int input = 0;
    String player_choice = "";
    String emeny_choice = "";
    Scanner scanner = new Scanner(System.in);


    System.out.println("1.Rock\n2.Paper\n3.Scissors\n0.Exit");
    while(true)
    {
      input = scanner.nextInt();
      if (input == 0) break;
      

      switch (input) {
        case 1:
          player_choice = "Rock";
          emeny_choice = Get_Enm_Choice();
          Choose_Winner(player_choice, emeny_choice);
          break;
        case 2:
          player_choice = "Paper";
          emeny_choice = Get_Enm_Choice();
          Choose_Winner(player_choice, emeny_choice);
          break;
        case 3:
          player_choice = "Scissors";
          emeny_choice = Get_Enm_Choice();
          Choose_Winner(player_choice, emeny_choice);
          break;
          
          

        default:
          System.out.println("Please choose 1-3");
          break;
      }
    }

          scanner.close();

  }

  public static String Get_Enm_Choice()
  {

    Random rand = new Random();
    int rand_num = rand.nextInt(1,4);
    String choice = "";
    switch (rand_num) {
      case 1:
        choice = "Rock";
        break;
      case 2:
        choice = "Paper";
        break;
      case 3:
        choice = "Scissors";
        break;
        

    }
    return choice;
  }

  public static void Choose_Winner(String player, String enemy)
  {
    if (player.equals(enemy))
    {
      System.out.println("No one win");
    }

    else if (player.equals("Rock") && enemy.equals("Paper")) System.out.println("You lose sucker");
    else if (player.equals("Paper") && enemy.equals("Scissors")) System.out.println("You lose sucker");
    else if (player.equals("Scissors") && enemy.equals("Rock")) System.out.println("You lose sucker");
    else
    {
      System.out.println("You won!");
    }

  }

}
