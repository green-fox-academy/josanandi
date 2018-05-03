import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        DiceSet diceSet = new DiceSet();
        rollUntilEveryDiceIsSix(diceSet);

    }
    public static DiceSet rollUntilEveryDiceIsSix(DiceSet diceset) {
        System.out.println(Arrays.toString(diceset.roll()));
        boolean stillHasNonSixers = true;

        while (stillHasNonSixers) {
            for (int i = 0; i < diceset.getCurrent().length; i++) {
                if (diceset.getCurrent(i) != 6) {
                    diceset.reroll(i);
                }
            }
            for (int i = 0; i < diceset.getCurrent().length; i++) {
                if (diceset.getCurrent(i) != 6){
                    break;
            }
                if (i == 5 && diceset.getCurrent(i)==6 ){
                    stillHasNonSixers=false;
                }
            }

            System.out.println(Arrays.toString(diceset.getCurrent()));

        }

        return diceset;
    }
}
