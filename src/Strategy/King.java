package Strategy;

public class King extends Character {
    @Override
    void fight() {
        System.out.print(this.getClass().getSimpleName() + " ");
        weapon.useWeapon();
    }
}
