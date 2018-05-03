public class Station {
    long gasAmount;

    public Station(long gasAmount) {
        this.gasAmount = gasAmount;
    }

    public void refill(Car car){
        this.gasAmount  -= car.capacity;
        car.gasAmount += car.capacity;

    }

}
