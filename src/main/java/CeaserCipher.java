public class CeaserCipher {
 private String word;
 private int key;
 public String newWord = "";
 public CeaserCipher(String word,int key){
  this.word = word;
  this.key = key;
 }
 // use get method to access private properties word and key;
 public String getWord(){
  return this.word;
 }
 public int getKey(){
  return this.key;
 }
 // created a method that gives a string as an output;
 public String cipheredWord() {
  for (int i = 0; i < this.word.length(); ++i) {
   int newValue = ((int) ((word.charAt(i))) + key - 65) % 26 + 65;
   char charValue = (char) (newValue);
   newWord += charValue;
  }
  return newWord;
 }
}
