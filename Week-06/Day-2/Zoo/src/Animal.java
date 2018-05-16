abstract public class Animal  {
    private String name;
    int age;
    private String gender;

    public Animal(String name) {
        this.name = name;
        this.age = 0;
        this.gender = "female";
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    abstract public String breed();
    abstract public String haveSkin();







}
