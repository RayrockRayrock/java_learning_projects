class Character{
  private String name;
  private int hp;
  private int attack;


  Character(String name, int hp, int attack){
    this.name = name;
    this.hp = hp;
    this.attack = attack;
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




}
