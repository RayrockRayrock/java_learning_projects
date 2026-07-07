import java.util.Scanner;





public class Main{


  static Scanner scanner = new Scanner(System.in);
  static int characterChoice = 0;
  static Character player;
  static Character enemey;
  public static void main(String[] args){

    welcomeMessage();
    chooseCharacter();
    confirmCharacter(characterChoice);
    printCharacterInfo();
    try{
    Thread.sleep(2000);
    }
    catch (InterruptedException e){
      System.out.println(e);
    }
    meetEnemey("N-Daguva-Zeba", 1000, 20);
    fightOrFlight("N-Daguva-Zeba");
    





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
          player = new Character("Iroha", 100, 20);
          break;
        case 2:
          player = new Character("Kaguya", 200, 10);
          break;
        case 3:
          player = new Character("Yachiyo", 50, 50);
          break;

        default:
          break;
      }
    }
    public static void printCharacterInfo(){
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.println("You: " + player.getName());
      System.out.println("HP: " + player.getHp());
      System.out.println("Attack: " + player.getAttack());
    }
    public static void meetEnemey(String enemeyName, int enemeyHP, int enemyAttack){
      System.out.println("You encounter " + enemeyName);
      enemey = new Character(enemeyName, enemeyHP, enemyAttack);
    }
    public static void fightOrFlight(String enemeyName){
      characterChoice = 0;
      while (characterChoice != 1 && characterChoice != 2) {
        
        System.out.println("1.Fight");
        System.out.println("2.Run");
        System.out.printf(": ");
        characterChoice = scanner.nextInt();
        scanner.nextLine();
        switch (characterChoice) {
        case 1:
          System.out.println("You choose to fight " + enemeyName);
          try {
            Thread.sleep(2000);
          } catch (Exception e) {
            System.out.println(e);
          }
          printCharacterInfo();
          printEnemeyInfo();
          
          break;

        default:
          break;
        }
      }
    }
    public static void printEnemeyInfo()
    {
      System.out.println("Enemy" + enemey.getName());
      System.out.println("HP: " + enemey.getHp());
      System.out.println("Attack: " + enemey.getAttack());

    }
}

