public class FleetOfThings {

    public static void main(String[] args) {
        Fleet fleet = new Fleet();

        Thing thing1 = new Thing("Get milk", false);
        fleet.add(thing1);
        Thing thing2 = new Thing("Remove the obstacles", false);
        fleet.add(thing2);
        Thing thing3 = new Thing("Stand up", true);
        fleet.add(thing3);
        Thing thing4 = new Thing("Eat lunch", true);
        fleet.add(thing4);

        // Create a fleet of things to have this output:
        // 1. [ ] Get milk
        // 2. [ ] Remove the obstacles
        // 3. [x] Stand up
        // 4. [x] Eat lunch

        System.out.println(fleet);
        for (Thing t : fleet.getThings()) {
            t.printAllFields();
        }
    }
}