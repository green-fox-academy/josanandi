
public class Todo implements Comparable<Todo> {
    private String name;
    private boolean completed;

    public Todo(String name) {
        this.name = name;
    }

    public void complete() {
        this.completed = true;
    }

    public Todo(String name, boolean completed) {
        this.name = name;
        this.completed = completed;
    }

    @Override
    public String toString() {
        return (completed ? "[x] " : "[ ] ") + name ;
    }

    @Override
    public int compareTo(Todo task) {
        if (task.completed == this.completed){
            return task.name.compareTo(this.name);
        }
        else if (this.completed){
            return -1;
        }
        else if(!this.completed){
            return 1;
        }

        else{return 0;}
    }
}
