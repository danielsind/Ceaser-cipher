public class CeaserDecipher {
    private String word;
    private int key;

    public CeaserDecipher(String word, int key) {
        this.word = word;
        this.key = key;
    }

    String getWord() {
      return this.word;
    }

    int getKey() {
      return this.key;
    }
}
