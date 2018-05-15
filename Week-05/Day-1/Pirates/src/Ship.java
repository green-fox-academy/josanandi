import java.util.ArrayList;
import java.util.List;

public class Ship {
    List<Pirate> crew;
    Pirate captain;
    int countPiratesAlive = 0;

    public Ship() {
        this.crew = new ArrayList<>();
        this.captain = new Pirate();
    }


    public void fillShip(Pirate pirate, boolean isCaptain){
        if (isCaptain && this.captain == null){
            this.captain = pirate;
        }
        else{
            this.crew.add(pirate);
        }

    }

    public int countPiratesAlive(List<Pirate> crew){
        countPiratesAlive=0;
        for (Pirate pirate: crew) {
            if (!pirate.isDead) {
                countPiratesAlive++;
            }
        }
        return countPiratesAlive;
    }
    public boolean battle(Ship ship){
        boolean conditionToCheck = false;
        int calculatedScore1 = countPiratesAlive(this.crew)- this.captain.countTheRounds;
        int calculatedScore2 = countPiratesAlive(ship.crew)-ship.captain.countTheRounds;
        if (calculatedScore1 > calculatedScore2){
            conditionToCheck = true;
        }

        if (conditionToCheck){
            int randomNumberOfRoundsOfRum = (int)((Math.random())*this.crew.size());
            for (int i = 0; i < randomNumberOfRoundsOfRum ; i++) {
                for (Pirate pirate:this.crew) {
                    pirate.drinkSomeRum();
                }
                captain.drinkSomeRum();
            }
            int randomNumberOfCasualties = (int)((Math.random())*ship.crew.size());
            for (int i = 0; i <randomNumberOfCasualties ; i++) {
                ship.crew.get(i).die();
            }


            }
        else{
            int randomNumberOfCasualties = (int)((Math.random())*crew.size());
            for (int i = 0; i <randomNumberOfCasualties ; i++) {
                crew.get(i).die();
            }
            int randomNumberOfRoundsOfRum = (int)((Math.random())*ship.crew.size());
            for (int i = 0; i < randomNumberOfRoundsOfRum ; i++) {
                for (Pirate pirate:ship.crew) {
                    pirate.drinkSomeRum();
                }
                ship.captain.drinkSomeRum();
            }
        }

        return conditionToCheck;
    }



    @Override
    public String toString() {
       countPiratesAlive(this.crew);

        if (captain.isDead){
            return "Ship contains: " + captain.name + " who is the captain. He had consumed " + captain.countTheRounds + " rounds of rum and he's dead. The crew alive is of " +
                    countPiratesAlive + " number of pirates";
        }
       else if(captain.countTheRounds>4){
            return "Ship contains: " + captain.name + " who is the captain. He had consumed " + captain.countTheRounds + " rounds of rum and he passsed out. The crew alive is of " +
                    countPiratesAlive + " number of pirates";
        }
       else if (captain.countTheRounds<4){
            return "Ship contains: " + captain.name + " who is the captain. He had consumed " + captain.countTheRounds + " rounds of rum and he is still sober. The crew alive is of " +
                    countPiratesAlive + " number of pirates";
        }
        return "Game over";
    }
}
