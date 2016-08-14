package Strategy;

/**
 * Created by Owner on 8/14/2016.
 */
public class BowAndArrowsBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Bow and Arrows in use!");
    }
}
