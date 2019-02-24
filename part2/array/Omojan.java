import java.util.Random;

class Omojan {

    public static void main (String[] args) {
        
        String[] words = {
            "ブルータス","お前もか","サイは","投げられた","社員は","悪くありません","女王の","教室",
        };

        Random rand = new Random();

        String word1 = words[rand.nextInt(words.length)];
        String word2 = words[rand.nextInt(words.length)];

        System.out.println(word1 + " " + word2);
    }
}