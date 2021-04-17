

class Main {

  public static void main(String[] args) {

   Character queen = new Queen();
   Character king = new King();
   Character troll = new Troll();
   Character knight = new Knight();


    king.introduce();
    king.run();

    System.out.println("\n");

    queen.introduce();
    queen.crouch();

    System.out.println("\n");

    knight.setWeaponBehavior(new SwordBehavior());
    knight.introduce();
    knight.fight();

    System.out.println("\n");

    troll.setWeaponBehavior(new AxeBehavior());
    troll.introduce();
    troll.fight();
  }
}

