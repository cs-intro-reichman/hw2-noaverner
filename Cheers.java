//feedback

/*
Great work Noa! (Boaz you are also ok)
*/

// Prints a crowd cheering output.
public class Cheers {
        private static final String AN_LETTERS = "AEFHILMNORSX";

        public static void main(String[] args) {
                int reps = Integer.parseInt(args[1]);
                String name = args[0];
                String upper_name = name.toUpperCase();
                int len = name.length();
                int c = 0;
                while (c < len) 
                {
                        char letter = upper_name.charAt(c);
                        if (AN_LETTERS.indexOf(letter) != -1)
                        {
                                System.out.println("Give me an " + letter + ": " + letter + "!");
                        } 
                        else
                        {
                                System.out.println("Give me a  " + letter + ": " + letter + "!");
                        }
                        c = c + 1;
                }
                System.out.println("What does that spell?");
                int c2 = 0;
                while (c2 < reps)
                {
                        System.out.println(upper_name + "!!!");
                        c2 = c2 + 1;
                }
        

        }
}