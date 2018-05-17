public class Animal {

    int hunger;
    int thirst;

    public Animal() {
        this.hunger = 50;
        this.thirst = 50;
    }

    public void eat() {
        if (this.hunger == 0) {
            System.out.println("Can't eat more. I'm full");
        } else {
            this.hunger--;
        }
    }

    public void drink(){
        if (this.thirst == 0){
            System.out.println("Can't drink more. I'm full");
        }
        else{
            this.thirst--;
        }
    }
    public void play(){
        this.thirst++;
        this.hunger++;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal();
        System.out.println("The animal is this hungry: "+ animal1.hunger + " and this thirsty: " + animal1.thirst);
        animal1.eat();
        animal1.play();
        System.out.println("The animal is this hungry: "+ animal1.hunger + " and this thirsty: " + animal1.thirst);
        animal1.play();
        animal1.drink();
        System.out.println("The animal is this hungry: "+ animal1.hunger + " and this thirsty: " + animal1.thirst);

    }
}