//feedback

/*
Great work Noa! (Boaz you are also ok)
*/

// Prints a crowd cheering output.
public class Cheers {
        private static final String AN_LETTERS = "AEFHILMNORSX";

        public static void main(String[] args) {
                String word = args[0].toUpperCase();
                int repeats = Integer.parseInt(args[1]);

                for (int i = 0; i < word.length(); i++) {
                        char currentLetter = word.charAt(i);

                        String article;
                        if (AN_LETTERS.indexOf(currentLetter) != -1) {
                                article = "an";
                        } else {
                                article = "a";
                        }

                        System.out.println("Give me " + article + " " + currentLetter + ": " + currentLetter + "!");
                }

                System.out.println("What does that spell?");

                for (int i = 0; i < repeats; i++) {
                        System.out.println(word + "!!!");
                }
        }
}
