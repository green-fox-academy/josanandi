public class TeacherAndStudents {
    public static void main(String[] args) {
        Student jancsi = new Student();
        Teacher gizikeNeni = new Teacher();

        gizikeNeni.teach(jancsi);
        jancsi.learn();
        jancsi.question(gizikeNeni);
        gizikeNeni.answer();

    }
}
