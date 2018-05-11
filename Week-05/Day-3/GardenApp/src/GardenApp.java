public class GardenApp {
    public static void main(String[] args) {
        Garden andisGarden = new Garden();

        Flower flower1 = new Flower();
        Flower flower2 = new Flower("blue");
        andisGarden.allPlants.add(flower1);
        andisGarden.allPlants.add(flower2);

        Tree tree1 = new Tree();
        Tree tree2 = new Tree("orange");
        andisGarden.allPlants.add(tree1);
        andisGarden.allPlants.add(tree2);

        System.out.println(andisGarden.toString());
        andisGarden.waterPlants(40);
        System.out.println(andisGarden.toString());
        andisGarden.waterPlants(70);
        System.out.println(andisGarden.toString());


    }
}
