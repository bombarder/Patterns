package Strategy;

public class Queen extends Character{
    @Override
    void fight() {
        System.out.print(this.getClass().getSimpleName() + " ");
        weapon.useWeapon();
    }
}
