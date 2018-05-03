public class DiceSet {
    private int[] dices;

    public DiceSet() {
        this.dices = new int[6];
               }



    public int[] roll(){
        for (int i = 0; i <6 ; i++) {
            this.dices[i] = (int) (Math.random()*6)+1;
            }
        return dices;
    }
    public int[] getCurrent(){
        return dices;
    }

    public int getCurrent(int i){
        return dices[i];
    }

    public void reroll(){
        for (int i = 0; i <6 ; i++) {
            this.dices[i] = (int) (Math.random()*6)+1;
        }
    }

    public void reroll(int j){
        this.dices[j] = (int) (Math.random()*6)+1;
    }

}
