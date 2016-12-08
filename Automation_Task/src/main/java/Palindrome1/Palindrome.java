package Palindrome1;

public class Palindrome {

    public static void main(String[] args) {

        String word = "AAAAAAAA";
        int n = word.length();
        String[] letters = word.split("");
        int count = 0;

       for (int i = 0; i < n/2; i++ ){
           if (letters[i].equalsIgnoreCase(letters[n-1-i]))
               count++;
       }

       if (!(count == n/2))
           System.out.println(word + " - not palindrome");
       else
           System.out.println( word + " - palindrome");


    }

}
