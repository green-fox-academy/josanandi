import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SharpieSet {
    List<Sharpie> sharpies;

    public SharpieSet() {
        sharpies = new ArrayList<>();
    }
    public void add(Sharpie sharpie){
        this.sharpies.add(sharpie);
    }



    public int countUsable(){
        int counter =0;
        for (int i = 0; i <this.sharpies.size(); i++) {
            if (this.sharpies.get(i).inkAmount > 0 ){
                counter++;
            }

        }
        return counter;
    }

    public List removeTrash() {
        for (int i = 0; i < this.sharpies.size(); i++) {
            if (this.sharpies.get(i).inkAmount == 0) {
                this.sharpies.remove(i);
            }

        }
        return this.sharpies;
    }

    @Override
    public String toString() {
        String result = "";
        for(int i = 0; i < sharpies.size(); i++) {
            result += sharpies.get(i).color + "\n";
        }
        return result;
    }

    public static void main(String[] args) {
        SharpieSet sharpies =  new SharpieSet();
        Sharpie pinkSharpie = new Sharpie("pink", (float) 0.4, (float) 0);
        sharpies.add(pinkSharpie);
        Sharpie blueSharpie = new Sharpie("blue", (float) 0.4, (float) 22);
        sharpies.add(blueSharpie);
        Sharpie greenSharpie = new Sharpie("green", (float) 0.6, (float) 0);
        sharpies.add(greenSharpie);
        Sharpie brownSharpie = new Sharpie("brown", (float) 0.2, (float) 98);
        sharpies.add(brownSharpie);
        Sharpie yellowSharpie = new Sharpie("yellow", (float) 0.8, (float) 12);
        sharpies.add(yellowSharpie);
        Sharpie blackSharpie = new Sharpie("black", (float) 0.5, (float) 0);
        sharpies.add(blackSharpie);


        System.out.println(sharpies.countUsable());
        sharpies.removeTrash();
        System.out.println("The usable ones are: \n" + sharpies.toString());

    }
    }



