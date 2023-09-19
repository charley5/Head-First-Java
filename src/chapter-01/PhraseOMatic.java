public class PhraseOMatic {
    public static void main (String args[]) {
        // make three sets of words to choose from
        String[] cities = {"Tokyo", "Osaka", "Fukuoka", "Yokohama", "Nagoya", "Sapporo", "Kobe", "Kawasaki", "Kyoto", "Saitama", "Hiroshia", "Sendai", "Chiba", "Kitakyushu"};
        String[] food = {"Sushi", "Udon", "Tofu", "Tenpura", "Yakitori", "Sashimi", "Ramen", "Donburimono", "Natto", "Oden", "Tamagoyaki" , "Soba", "Tonkatsu", "Melonpan"};
        String[] seasons ={"Natsu", "Aki", "Haru", "Fuyu"};

        // find out how many words are in each list
        int oneLength = cities.length;
        int twoLength = food.length;
        int threeLength = seasons.length;

        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);

        // build a phrase
        String phrase = cities[rand1] + " "+ food[rand2] + " " + seasons[rand3];

        System.out.println(phrase);
    }
}