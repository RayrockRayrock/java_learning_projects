import java.util.Random;

class Character{
  private String name;
  private int hp;
  private int attack;
  private int speed;


  Character(String name, int hp, int attack,int speed){
    this.name = name;
    this.hp = hp;
    this.attack = attack;
    this.speed = speed;
  }



  public String getName(){
    return name;
  }
  public int getHp(){
    return hp;
  }
  public int getAttack(){
    return attack;
  }
  public int getSpeed(){
    return speed;
  }

  public void Attack(Character target){
    Random random = new Random();
    target.hp -= attack * random.nextInt(1, 21);

  }

  public void GainHP(){
    hp += 200;
  }

  public boolean BlockAttack(){
    Random random = new Random();
    if (random.nextInt(0,2) == 1){

      System.out.println("Block successs take no damange");
      return true;
    }
    System.out.println("Block fail ready to take damage");
    return false;

  }


}
