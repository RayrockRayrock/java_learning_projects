import java.util.Scanner;
import java.util.Random;

public class Main{
    static char[][] board = {{' ', ' ', ' '},
                      {' ', ' ', ' '},
                      {' ', ' ', ' '}
    };
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);
    char player_choice;
    boolean running = true;
    System.out.print("X or O: ");
    player_choice = scanner.next().charAt(0);
    int cpu_row = 0;
    int cpu_column = 0;
    int player_row = 0;
    int player_column = 0;

    while(running){
      print_board();
      if (check_winner()) break;
    if (player_choice == 'X' || player_choice == 'x')
    {
      System.out.println("Enter Row then column");
      System.out.print("Row: ");
      player_row = scanner.nextInt() - 1;
      System.out.print("Column: ");
      player_column = scanner.nextInt() - 1;


      board[player_row][player_column] = 'X';

      cpu_row = cpu_choice();
      cpu_column = cpu_choice();


      while(board[cpu_row][cpu_column] == ' ' || board[cpu_row][cpu_column] == 'X'){
        cpu_row = cpu_choice();
        cpu_column = cpu_choice();
      if (board[cpu_row][cpu_column] != 'X'){
        board[cpu_row][cpu_column] = 'O';
      }
      }
    }

    if (player_choice == 'o' || player_choice == 'O')
    {
      System.out.println("Enter Row then column");
      System.out.print("Row: ");
      player_row = scanner.nextInt() - 1;
      System.out.print("Column: ");
      player_column = scanner.nextInt() - 1;
      board[player_row][player_column] = 'O';
      cpu_row = cpu_choice();
      cpu_column = cpu_choice();
      while(board[cpu_row][cpu_column] == ' ' || board[cpu_row][cpu_column] == 'O'){
      if (board[cpu_row][cpu_column] != 'O'){
        board[cpu_row][cpu_column] = 'X';
      }
      }
    }
    }
    scanner.close();
  }
  
  public static int cpu_choice(){
    Random rand = new Random();
    return rand.nextInt(3);

  }
  public static boolean check_winner(){
    if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X'){
      System.out.println("X won");
      return true;

    }

    if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O'){
      System.out.println("O won");
      return true;

    }

    if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X'){
      System.out.println("X won");
      return true;

    }

    if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O'){
      System.out.println("O won");
      return true;

    }

    if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X'){
      System.out.println("X won");
      return true;

    }

    if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O'){
      System.out.println("O won");
      return true;

    }
    if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'){
      System.out.println("X won");
      return true;

    }
    if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O'){
      System.out.println("O won");
      return true;

    }
    if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O'){
      System.out.println("O won");
      return true;

    }
    if (board[0][1] == 'X' && board[1][0] == 'X' && board[2][0] == 'X'){
      System.out.println("X won");
      return true;

    }
    if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O'){
      System.out.println("O won");
      return true;

    }
    if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X'){
      System.out.println("X won");
      return true;

    }
  
    if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O'){
      System.out.println("o won");
      return true;

    }
    if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X'){
      System.out.println("X won");
      return true;

    }
    return false;
  }


  public static void print_board(){

    System.out.println(board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
    System.out.println("---------");
    System.out.println(board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
    System.out.println("---------");
    System.out.println(board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
  }
}
