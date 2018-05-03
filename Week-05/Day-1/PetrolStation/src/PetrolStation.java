public class PetrolStation {
    public static void main(String[] args) {

    Station mol = new Station(123456789);
    Car mazda = new Car();

    mol.refill(mazda);
    System.out.println(mazda.gasAmount);
    System.out.println(mol.gasAmount);

    }


}
