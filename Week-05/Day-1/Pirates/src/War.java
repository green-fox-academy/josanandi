import java.util.Arrays;

public class War {
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

        Ship ship3 = new Ship();
        Pirate pirate13 = new Pirate();
        Pirate pirate14 = new Pirate();
        Pirate pirate15 = new Pirate();
        Pirate pirate16 = new Pirate();
        ship3.fillShip(pirate13,true);
        ship3.fillShip(pirate14, false);
        ship3.fillShip(pirate15, false);
        ship3.fillShip(pirate16, false);

        Armada armada1 = new Armada();
        armada1.shipList.addAll(Arrays.asList(ship1, ship2, ship3));

        Ship ship4 = new Ship();
        Pirate pirate17 = new Pirate();
        Pirate pirate18 = new Pirate();
        Pirate pirate19 = new Pirate();
        Pirate pirate20 = new Pirate();
        Pirate pirate21 = new Pirate();
        Pirate pirate22 = new Pirate();
        ship4.fillShip(pirate17,false);
        ship4.fillShip(pirate18,true);
        pirate18.drinkSomeRum();
        ship4.fillShip(pirate19, false);
        ship4.fillShip(pirate20, false);
        ship4.fillShip(pirate21, false);
        ship4.fillShip(pirate22, false);

        Ship ship5 = new Ship();
        Pirate pirate23 = new Pirate();
        Pirate pirate24 = new Pirate();
        Pirate pirate25 = new Pirate();
        Pirate pirate26 = new Pirate();
        Pirate pirate27 = new Pirate();
        ship5.fillShip(pirate23,false);
        ship5.fillShip(pirate24,true);
        ship5.fillShip(pirate25, false);
        ship5.fillShip(pirate26, false);
        ship5.fillShip(pirate27, false);

        Ship ship6 = new Ship();
        Pirate pirate28 = new Pirate();
        Pirate pirate29 = new Pirate();
        Pirate pirate30 = new Pirate();
        Pirate pirate31 = new Pirate();
        Pirate pirate32 = new Pirate();
        Pirate pirate33 = new Pirate();
        ship6.fillShip(pirate28,true);
        ship6.fillShip(pirate29, false);
        ship6.fillShip(pirate30, false);
        ship6.fillShip(pirate31, false);
        ship6.fillShip(pirate32, false);
        ship6.fillShip(pirate33, false);

        Armada armada2 = new Armada();
        armada2.shipList.addAll(Arrays.asList(ship3, ship4, ship5));

        System.out.println(armada2.war(armada1));
    }
}
