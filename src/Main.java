import java.util.List;


public class Main {
    public static void main(String[] args){
        /*
        List<String> topWords = TopWords.topWords(Stream
                .of("In a village of La Mancha, the name of which I have no desire to call to",
                        "mind, there lived not long since one of those gentlemen that keep a lance",
                        "in the lance-rack, an old buckler, a lean hack, and a greyhound for",
                        "coursing. An olla of rather more beef than mutton, a salad on most",
                        "nights, scraps on Saturdays, lentils on Fridays, and a pigeon or so extra",
                        "on Sundays, made away with three-quarters of his income.")
                .collect(Collectors.joining("\n")));
         */
        List<String> topWords = TopWords.topWords("  //wont won't won't ");
        for (final String word : topWords){
            System.out.print(word + " ");
        }
        System.out.println();
        System.out.println(topWords.getClass());
    }

}
