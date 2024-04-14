package week4;

import java.util.Arrays;

public class FrequencyOfChar {

    public static void main(String[] args) {
        String someLetter = "AAABBCDDD";
        frequencyChar(someLetter);
    }

    public static void frequencyChar(String letters){
    int count = 0;
   // char tmp;
    char [] letter = letters.toCharArray();

    for(int i = 0; i < letter.length-1; i++){
          if(letter[i] == letter[i+1]) {
              //char tmp = letter[i];
              count++;
          }
              System.out.println(letter[i] +""+ count);

    }


    }
}
