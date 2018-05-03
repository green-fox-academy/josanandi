public class Counter {
    int counter;

    public Counter() {
        this.counter = 0;
    }

    public void add(){
        this.counter++;
    }
    public void add(int number){
        this.counter += number;
    }
    public int get(){
        return this.counter;
    }
    public int reset(){
        return this.counter = 0;
    }
}
