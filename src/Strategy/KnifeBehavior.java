package Strategy;

/**
 * Created by Owner on 8/14/2016.
 */
public class KnifeBehavior implements WeaponBehavior {
    @Override
    public void useWeapon() {
        System.out.println("Attack with knife!");
    }
}
