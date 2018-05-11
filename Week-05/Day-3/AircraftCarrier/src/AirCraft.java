public class AirCraft{
    int ammo;
    long allDamage;
    int baseDamage;


    public AirCraft() {
        this.ammo =0;
        this.allDamage = 0;
    }

    public String getType(AirCraft aircraft) {
        if (aircraft instanceof F35){
            return "F35";
        }
        else{
            return "F16";
        }
    }

    public String getStatus(AirCraft aircraft){
        if (aircraft instanceof F35){
            return "Type F35, Ammo:" + ammo +", Base Damage: " +baseDamage+ ", All Damage: "  + allDamage;
        }
        else{
            return "Type F16, Ammo:" + ammo +", Base Damage: " +baseDamage+ ", All Damage: "  + allDamage;
        }
    }
    public long fight(){
        this.allDamage=ammo*baseDamage;
        ammo=0;
        return this.allDamage;
    }

    public boolean isPriority(AirCraft aircraft){
        if (aircraft instanceof F35){
            return true;
        }
        else{
            return false;
        }

    }



}
