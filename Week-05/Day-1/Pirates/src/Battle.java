public class Battle {
    public static void main(String[] args) {
        Ship ship1 = new Ship();
        Pirate pirate1 = new Pirate();
        Pirate pirate2 = new Pirate();
        Pirate pirate3 = new Pirate();
        Pirate pirate4 = new Pirate();
        Pirate pirate5 = new Pirate();
        ship1.fillShip(pirate1,false);
        ship1.fillShip(pirate2,true);
        pirate2.drinkSomeRum();
        ship1.fillShip(pirate3, false);
        ship1.fillShip(pirate4, false);
        ship1.fillShip(pirate5, false);

        Ship ship2 = new Ship();
        Pirate pirate6 = new Pirate();
        Pirate pirate7 = new Pirate();
        Pirate pirate8 = new Pirate();
        Pirate pirate9 = new Pirate();
        Pirate pirate10 = new Pirate();
        Pirate pirate11 = new Pirate();
        Pirate pirate12 = new Pirate();
        ship2.fillShip(pirate6,false);
        ship2.fillShip(pirate7,true);
        ship2.fillShip(pirate8, false);
        ship2.fillShip(pirate9, false);
        ship2.fillShip(pirate10, false);
        ship2.fillShip(pirate11, false);
        ship2.fillShip(pirate12, false);

        ship2.battle(ship1);

        System.out.println(ship1.toString());
        System.out.println(ship2.toString());

    }
}
