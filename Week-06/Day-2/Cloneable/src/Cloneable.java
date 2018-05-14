public class Cloneable {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student("John", 20, "male", "BME");
        Student student2 =  (Student)student1.clone();

        System.out.println(student2.name);

        System.out.println(student1);


    }
}
