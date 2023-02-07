package nursalim.dev.collection.program;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
    private boolean isPalindrome(String input){
        String temp = "";

        for (int i = input.length()-1; i >= 0; i--) {
            temp += input.charAt(i);
        }

        System.out.println(temp);
        return temp.equals(input);
    }

    private boolean isPalindrome2(String input){

        for (int i = 0; i < input.length(); i++) {
            int indexAkhir = (input.length() - i - 1);
            int indexAwal = i;

            if(input.charAt(indexAwal) != input.charAt(indexAkhir)) {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome3(String input){

        for (int i = 0; i < input.length()/2; i++) {
            int indexAkhir = (input.length() - i - 1);
            int indexAwal = i;

            if(input.charAt(indexAwal) != input.charAt(indexAkhir)) {
                return false;
            }
        }
        return true;
    }

    private boolean isPalindrome4(String input){
        return isPalindromeRecursive(input, 0);
    }

    private boolean isPalindromeRecursive(String input, int i){
        if(i < input.length()/2) {
            int indexAkhir = (input.length() - i - 1);
            int indexAwal = i;

            if(input.charAt(indexAwal) != input.charAt(indexAkhir)) {
                return false;
            }else{
                return isPalindromeRecursive(input, i++);
            }
        }else{
            return true;
        }
    }

    @Test
    void test(){
        isPalindrome2("kodok");
    }


    @Test
    void testPalindrome(){
        Assertions.assertTrue(isPalindrome2("a"));
        Assertions.assertTrue(isPalindrome2("aba"));
        Assertions.assertTrue(isPalindrome2("kodok"));
        Assertions.assertTrue(isPalindrome2(""));

        Assertions.assertFalse(isPalindrome2("ab"));
        Assertions.assertFalse(isPalindrome2("abab"));
        Assertions.assertFalse(isPalindrome2("kamu"));
        Assertions.assertFalse(isPalindrome2("aku"));
    }

}
