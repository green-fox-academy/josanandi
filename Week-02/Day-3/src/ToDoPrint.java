public class ToDoPrint {
    public static void main(String... args){
        String todoText = " - Buy milk\n";


        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected outpt:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      -

        todoText = "My todo:\n" + todoText;
        todoText += " - Download games\n";
        todoText += "\t - Diablo";
        System.out.println(todoText);
    }
}

