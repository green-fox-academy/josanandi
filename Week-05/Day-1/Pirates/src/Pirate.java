public class Pirate {
    String name;
    int countTheRounds;
    boolean isDead;


    public void Pirate(String name){
        this.name=name;
        this.countTheRounds=0;
        this.isDead = false;
    }

    public void drinkSomeRum(){
        if(!isDead){
            this.countTheRounds++;
        }
        else{
            System.out.println("he's dead");
        }
    }

    public void howsItGoingMate(){
        if(!isDead){
            if (countTheRounds <= 4){
                System.out.println("Pour me anudder!");
            }
            else{
                System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
                this.passesOut();
            }
        }
        else{
            System.out.println("he's dead");
        }
    }

    public void passesOut(){
        System.out.println("I'm sleeping it off.");
    }
    public void die(){
       isDead = true;
        }

    public void brawl(Pirate pirate){
        if (!pirate.isDead){
            int chance = (int)(Math.random()*3 );
            if (chance ==0){
                this.die();
            }
            else if(chance == 1){
                pirate.die();
            }
            else{
                this.passesOut();
                pirate.passesOut();
            }
        }
    }

    }

