public abstract class Character {

    private WeaponBehavior weaponBehavior;

    public abstract void introduce();  
    
    public abstract void run();
    public abstract void crouch();

    public void fight(){
        weaponBehavior.useWeapon();
    };

    public WeaponBehavior getWeaponBehavior() {
        return weaponBehavior;
    }

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }
}