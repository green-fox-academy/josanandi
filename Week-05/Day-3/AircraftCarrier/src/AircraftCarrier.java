import java.util.Arrays;

public class AircraftCarrier {
    public static void main(String[] args) {
        F35 f35first = new F35();
        F16 f16first = new F16();
        F35 f35second = new F35();
        F16 f16second = new F16();

        Carrier carrier1 = new Carrier(34, 2300);
        carrier1.add(f16first);
        carrier1.add(f16second);
        carrier1.add(f35first);
        carrier1.add(f35second);

        carrier1.fill();
        System.out.println(carrier1.getStatus());

        F35 f35third = new F35();
        F16 f16third = new F16();

        Carrier carrier2 = new Carrier(30, 1800);
        carrier2.aircraftStore.addAll(Arrays.asList( f16third,f35third));
        carrier2.fill();
        System.out.println(carrier2.getStatus());

        ((AirCraft)f16first).fight();
        ((AirCraft)f16third).fight();
        System.out.println(((AirCraft) f16first).getStatus(f16first));
        System.out.println(((AirCraft) f16third).getStatus(f16third));

        System.out.println(carrier1.getStatus());
        System.out.println(carrier2.getStatus());

        carrier1.fight(carrier2);
        System.out.println(carrier1.getStatus());
    }
}
