public class F35 extends AirCraft {

    public F35() {
        this.baseDamage = 50;
    }

    public void refill(long totalAmmo){
        if (totalAmmo < 12){
            super.ammo = (int)totalAmmo;
        }
        else{
            super.ammo = 12;

        }
    }




}
