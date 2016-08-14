package Strategy;

/**
 * Created by Owner on 8/14/2016.
 */
public class SwordBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Axe attack!");
    }
}
