package chapter1;

public class PhraseOMatic {
    public static void main (String[] args) {
        //make three sets of words to choose from
        String[] wordListOne = {"happy", "sad", "angry", "bewildered", "calm", "quiet"};
        String[] wordListTwo = {"dog", "cat", "bear", "lion", "fish", "ox"};
        String[] wordListThree = {"USA", "Canada", "Japan", "Sweden", "Germany"};

        //find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        //build a phrase
        String phrase = "The" + " " + wordListOne[rand1] + " " + wordListTwo[rand2] + " " + "in" + " " + wordListThree[rand3];

        //print out the phrase
        System.out.println("The random phrase is: " + phrase);
    }
}
