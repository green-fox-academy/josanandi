public class F16 extends AirCraft {

    public F16() {
        this.baseDamage =30;
    }

    public void refill(long totalAmmo){
        if (totalAmmo < 8){
            super.ammo = (int)totalAmmo;
        }
        else{
            super.ammo = 8;

        }

    }




}
