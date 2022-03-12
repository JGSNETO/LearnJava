public class Main{
    public static void main(String[] args){
        String greeting = "Hello";
        String txt = "ABCDEFGH";

        System.out.println("The lenght of the txt string is: " + txt.length());
        System.out.println(txt.toUpperCase());
        System.out.println(txt.toLowerCase());
        //Concatenation
        System.out.println(greeting + " " + txt);
        System.out.println(greeting.concat(txt));
        // Backslash escape characters
        // \'->Single quote
        // \"-> Double quote
        // \\ -> Backslash

        String txt2 = "We are \"vikings\" from the north";
        System.out.println(txt2);

        /**
         * Other scapes
         * \n-> new line
         * \r -> Carriage return
         * \t -> tab
         * \b -> backspace
         * \f -> From feed
         */
    }
}