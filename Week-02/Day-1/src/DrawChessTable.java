public class DrawChessTable {
    public static void main(String[] args) {
        // Create a program that draws a chess board
        String row = "";
        for(int j = 0; j< 8; j++){
            if (j % 2 ==0 ){
                for (int i = 0; i<4; i++) {
                    row += "% ";               }
            }
            else{
                for (int i = 0; i<4; i++) {
                    row += " %";
                }
            }
            System.out.println(row);
            row ="";

        }
    }
}
