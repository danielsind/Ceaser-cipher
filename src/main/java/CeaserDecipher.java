public class CeaserDecipher {
    private String word;
    private int key;
    private String newDecipheredWord = "";

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
   String decipheredWord(){
       int newValue = ((int) ((word.charAt(0))) +(26 -key) - 65)% 26 + 65;
       char charValue = (char) (newValue);
       newDecipheredWord += charValue;
       return newDecipheredWord;
    }
}
