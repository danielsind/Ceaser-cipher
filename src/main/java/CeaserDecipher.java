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
   String decipheredWord() {
        for (int i = 0; i < word.length(); ++i) {
            if (Character.isUpperCase(this.word.charAt(i))) {
                int newValue = ((int) ((word.charAt(i))) + (26 - key) - 65) % 26 + 65;
                char charValue = (char) (newValue);
                newDecipheredWord += charValue;
            }
            else if(Character.isLowerCase(this.word.charAt(i))) {
                int newValue = ((int) ((word.charAt(i))) + (26 - key) - 97) % 26 + 97;
                char charValue = (char) (newValue);
                newDecipheredWord += charValue;
            }
            else{
                newDecipheredWord += this.word.charAt(i);
            }
            }
       return newDecipheredWord;
        }
   }
