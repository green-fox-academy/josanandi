import java.util.ArrayList;
import java.util.List;

public class Dominoes {
    public static void main(String[] args) {
        List<Domino> dominoes = initializeDominoes();
        // You have the list of Dominoes
        // Order them into one snake where the adjacent dominoes have the same numbers on their adjacent sides
        // eg: [2, 4], [4, 3], [3, 5] ...

        System.out.println(dominoes);
        System.out.println(orderTheDominoes(dominoes));
    }

    static List<Domino> initializeDominoes() {
        List<Domino> dominoes = new ArrayList<>();
        dominoes.add(new Domino(5, 2));
        dominoes.add(new Domino(4, 6));
        dominoes.add(new Domino(1, 5));
        dominoes.add(new Domino(6, 7));
        dominoes.add(new Domino(2, 4));
        dominoes.add(new Domino(7, 1));
        return dominoes;
    }

    public static ArrayList orderTheDominoes(List<Domino> dominoes){
        ArrayList<Domino> modifiedDomino = new ArrayList<>();
        modifiedDomino.add(0,dominoes.get(0));
        dominoes.remove(0);
        int counter = 0;

        while (!dominoes.isEmpty()){
            for (int i = 0; i < dominoes.size(); i++) {
                if ( modifiedDomino.get(counter).getValues()[1] == dominoes.get(i).getValues()[0]){
                    counter++;
                    modifiedDomino.add(counter,dominoes.get(i));
                    dominoes.remove(i);
                }
            }
        }
        return modifiedDomino;
        }
    }
