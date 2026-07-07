import java.util.Scanner;
import java.util.Random;





public class Main{


  static Scanner scanner = new Scanner(System.in);
  static int characterChoice = 0;
  static Character player;
  static Character enemey;
  static boolean blockPass;
  static Random random = new Random();
  static int lastEnemy = -1;
  public static void main(String[] args){
    boolean running = true;

    welcomeMessage();
    chooseCharacter();
    confirmCharacter(characterChoice);
    System.out.print("\033[H\033[2J");
    System.out.flush();
    printCharacterInfo();

    while(running){
    try{
    Thread.sleep(2000);
    }
    catch (InterruptedException e){
      System.out.println(e);
    }

    randomEnemy();
    fightOrFlight(enemey.getName());
    if (!checkIfPlayerDead()){
    System.out.printf("Q to quit\nY to continue\n: ");
    if (scanner.nextLine().charAt(0) == 'q' || scanner.nextLine().charAt(0) == 'Q'){
      running = false;
    }}
    if (checkIfPlayerDead()) break;
     
  }




    scanner.close();
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
          player = new Character("Iroha", 1000, 20, 50);
          break;
        case 2:
          player = new Character("Kaguya", 2000, 10, 20);
          break;
        case 3:
          player = new Character("Yachiyo", 1500, 50, 100);
          break;

        default:
          break;
      }
    }
    public static void printCharacterInfo(){
      System.out.println("You: " + player.getName());
      System.out.println("HP: " + player.getHp());
      System.out.println("Attack: " + player.getAttack());
      System.out.println("Speed: " + player.getSpeed());
    }
    public static void meetEnemy(String enemeyName, int enemeyHP, int enemyAttack, int enemySpeed){
      System.out.print("\033[H\033[2J");
      System.out.flush();
      System.out.println("You encounter " + enemeyName);
      enemey = new Character(enemeyName, enemeyHP, enemyAttack, enemySpeed);
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
          Fighting();
          break;
        case 2:
         System.out.print("\033[H\033[2J");
         System.out.flush();
          if (RunAway())return;
          Fighting();

          break;

        default:
          break;
        }
      }
    }
    public static void printEnemeyInfo()
    {
      System.out.println("Enemy: " + enemey.getName());
      System.out.println("HP: " + enemey.getHp());
      System.out.println("Attack: " + enemey.getAttack());
      System.out.println("Speed: " + enemey.getSpeed());

    }

    public static boolean runAwaySuccesOrNot(){
      if ( player.getSpeed() > enemey.getSpeed()) return true;
      return false;

    }

    public static void printFightingMenu(){
      System.out.println("\n");
      System.out.println("1.Attack\t2.Defense\t3.Heal\t\t4.RunAway");

    }
    public static boolean RunAway(){

          if (runAwaySuccesOrNot()){
            System.out.println("You run away from " + enemey.getName());
            return true;
          }
          System.out.println(enemey.getName() + " is faster than you");
          System.out.println("Run away fail");
          System.out.println("Prepare to fight!");
          return false;
    }
    public static void getPlayerChoice(){
      int playerChoice = 0;
      while (playerChoice != 1 && playerChoice !=2 && playerChoice != 3 && playerChoice !=4){
      System.out.printf(": ");
      System.out.flush();
      playerChoice = scanner.nextInt();
      scanner.nextLine();
      switch (playerChoice) {
        case 1:
          player.Attack(enemey);
          printEnemeyInfo();
          break;
        case 2:
          blockPass = player.BlockAttack();
          break;
        case 3:
          player.GainHP();
          printCharacterInfo();
          break;
        case 4:
          RunAway();
          break;

        default:
          break;
      }
     }
    }
    public static boolean checkIfPlayerDead(){
      if (player.getHp() <= 0) return true;
      return false;
    }
    public static void Fighting(){

          try {
            Thread.sleep(2000);
          } catch (Exception e) {
            System.out.println(e);
          }
          System.out.print("\033[H\033[2J");
          System.out.flush();
          printCharacterInfo();
          System.out.println();
          printEnemeyInfo();
          while (enemey.getHp() > 0){
          printFightingMenu();
          getPlayerChoice();
          if (enemey.getHp() <= 0){
            System.out.println("You win!!!");
            return;
          }
          System.out.println();
          System.out.println();
          System.out.println();
          if (!blockPass){ enemey.Attack(player);

          System.out.println(enemey.getName() + " is attacking you!");
            }
          blockPass = false;
          System.out.println();
          System.out.println();
          printCharacterInfo();
          if (checkIfPlayerDead()){
            System.out.println("You died");
            return;
          }
          }
    }
    public static void randomEnemy(){
      int a;

      do{
        a = random.nextInt(3);
      }while ( a == lastEnemy);
      lastEnemy = a;

      switch (a) {
        case 0:
          meetEnemy("N-Daguva-Zeba", 3000, 20, 50);
          break;
        case 1:
          meetEnemy("Shadow Moon", 2000, 10, 25);
          break;
        case 2:
          meetEnemy("Decade the destroyer of the worlds", 1000, 5, 10);

      }


    }
}

