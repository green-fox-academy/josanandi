public class TakesLonger {
    public static void main(String... args){
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
        // When saving this quote a disk error has occured. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)
        String theMissingPart = "always takes longer than";
        int indexOfIt = quote.indexOf("It ");
        int indexOfYou = quote.indexOf("you");

       // for ( String character: theMissingPart) {
         //   for ( String charInQuote: quote) {
           //     if (character == charInQuote ) {
             //       quote1 += charInQuote;
           //     }

         //   }
       // }
        //quote = quote1 +quote2;

        //System.out.println(quote);
    }
}
