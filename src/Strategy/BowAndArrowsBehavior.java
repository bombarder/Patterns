package Strategy;

public class BowAndArrowsBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Bow and Arrows in use!");
    }
}
