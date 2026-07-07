import java.util.Scanner;

public class Main{


  static Scanner scanner = new Scanner(System.in);
  static int characterChoice = 0;
  public static void main(String[] args){

    welcomeMessage();
    chooseCharacter();
    confirmCharacter(characterChoice);





  }
    public static void welcomeMessage(){
    System.out.print("\033[H\033[2J");
    System.out.flush();
    System.out.println("RPG Battle Game!!!!!");

    }
    public static void chooseCharacter(){
      while (characterChoice != 1 && characterChoice!= 2 && characterChoice !=3){
      System.out.println("Choose Character");
      System.out.println("1.Iroha");
      System.out.println("2.Kaguya");
      System.out.println("3.Yachiyo");
      System.out.printf(": ");
      characterChoice = scanner.nextInt();
      scanner.nextLine();
        }
    }

    public static void confirmCharacter(int characterChoice){
      switch (characterChoice) {
        case 1:
          
          break;

        default:
          break;
      }
    }
}

