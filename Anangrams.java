// java program to check two strings are anangrams are not
import java.util.*;
public class Anangrams {
    static void anagram(String str1, String str2){

        char[] charArray1 = str1.toLowerCase().toCharArray();
        char[] charArray2 = str2.toLowerCase().toCharArray();

        // check if length is same
        if(charArray1.length == charArray2.length){

            // sort the char array
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // if sorted char arrays are same then the string is anagram
            boolean status = Arrays.equals(charArray1, charArray2);
            if(status) {
                System.out.println(str1 + " and " + str2 + " are anagram.");
            }
            else {
                System.out.println(str1 + " and " + str2 + " are not anagram.");
            }
        }
        else{
            System.out.println(str1 + " and " + str2 + " are not anagram.");
        }
    }
 public static void main(String[] args) {
    anagram("Race","Care");
    anagram("Hello", "Holla");
 }   
}