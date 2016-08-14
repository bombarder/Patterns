package Strategy;

/**
 * Created by Owner on 8/14/2016.
 */
public abstract class Character {

    WeaponBehavior weaponBehavior;
    abstract void fight();

    void setWeaponBehavior(WeaponBehavior weaponBehavior){
        this.weaponBehavior = weaponBehavior;
    }
}
