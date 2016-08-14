package Strategy;

public class Main {

    public static void main(String[] args) {
        Character kingCharacter = new King();
        kingCharacter.setWeaponBehavior(new SwordBehavior());
        kingCharacter.fight();
    }
}
