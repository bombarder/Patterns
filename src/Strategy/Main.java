package Strategy;

public class Main {

    public static void main(String[] args) {

        Character king = new King();
        king.setWeapon(new SwordBehavior());
        king.fight();
        king.setWeapon(new KnifeBehavior());
        king.fight();

        Character queen = new Queen();
        queen.setWeapon(new BowAndArrowsBehavior());
        queen.fight();
    }
}
