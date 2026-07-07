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




}
