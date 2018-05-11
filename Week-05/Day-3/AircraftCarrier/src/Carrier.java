import java.util.ArrayList;
import java.util.List;

public class Carrier {
    List<AirCraft> aircraftStore;
    long ammoStore;
    long healthPoints;
    long allDamageToCarrier;

    public Carrier(long ammoStore, long healthPoints) {
        this.aircraftStore = new ArrayList<>();
        this.ammoStore = ammoStore;
        this.healthPoints = healthPoints;
        long allDamageToCarrier = 0;
    }

    public void add(AirCraft aircraft){
        aircraftStore.add(aircraft);
    }
    
    public void fill() {
        long ammoToRefill = 0;

        for (AirCraft aircraft : aircraftStore) {
            if (aircraft.ammo == 0 && aircraft instanceof F16) {
                ammoToRefill += 8;
            } else if (aircraft.ammo == 0 && aircraft instanceof F35) {
                ammoToRefill += 12;
            }
        }

        if (this.ammoStore == 0) {
            System.out.println("The ammostore is empty, the refill of the aircrafts cannot be performed.");
        } else if (ammoToRefill > this.ammoStore) {
            int i = 0;
            while (this.ammoStore > 0 && i<aircraftStore.size()) {
                if (aircraftStore.get(i).isPriority(aircraftStore.get(i)) && aircraftStore.get(i).ammo == 0) {
                    ((F35) aircraftStore.get(i)).refill(this.ammoStore);
                    if (ammoStore < 12){
                        this.ammoStore =0;
                    }
                    else{
                        this.ammoStore -= 12;

                    }
                    }
                i ++;
                }
            i=0;
            while (this.ammoStore > 0 && i<aircraftStore.size()) {
                if (!aircraftStore.get(i).isPriority(aircraftStore.get(i)) && aircraftStore.get(i).ammo == 0) {
                    ((F16) aircraftStore.get(i)).refill(this.ammoStore);
                    if (ammoStore < 8){
                        this.ammoStore =0;
                    }
                    else{
                        this.ammoStore -= 8;

                    }
                    }
                i++;
                }

            }

        else {

            for (AirCraft aircraft : aircraftStore) {
                if (aircraft.getType(aircraft).equals("F16")) {
                    ((F16) aircraft).refill(this.ammoStore);
                    if (ammoStore < 8){
                        this.ammoStore =0;
                    }
                    else{
                        this.ammoStore -= 8;

                    }
                } else {
                    ((F35) aircraft).refill(this.ammoStore);
                    if (ammoStore < 12){
                        this.ammoStore =0;
                    }
                    else{
                        this.ammoStore -= 12;

                    }
                }
            }

        }

    }

    public void fight(Carrier carrier) {
        for (AirCraft aircraft: aircraftStore) {
            allDamageToCarrier += aircraft.allDamage;
            aircraft.ammo=0;
             }
        this.healthPoints -= allDamageToCarrier;

    }

    public String getStatus(){
        String output = "";
        long totalDamage =0;
        for (AirCraft aircraft: aircraftStore) {
            totalDamage += aircraft.allDamage;
        }

        if (this.healthPoints >0){
            output += "HP: " + this.healthPoints +", Aircraft count: " + aircraftStore.size()+ ", Ammo Storage: " +
                    this.ammoStore+ ", Total damage: " + totalDamage+ "\n" + "Aircrafts: \n";
            for (AirCraft aircraft:aircraftStore) {
                if (aircraft instanceof F35){
                    output +=  "Type F35, Ammo:" + aircraft.ammo +", Base Damage: " +aircraft.baseDamage+ ", All Damage: "  +aircraft.allDamage+ "\n";
                }
                else{
                    output += "Type F16, Ammo:" + aircraft.ammo +", Base Damage: " +aircraft.baseDamage+ ", All Damage: "  + aircraft.allDamage + "\n";
                }
            }
            return output;
        }
        else{
            return "It's dead Jim :(";
        }
    }
}
