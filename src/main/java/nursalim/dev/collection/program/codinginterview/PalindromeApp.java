package nursalim.dev.collection.program.codinginterview;

public class PalindromeApp {
    public static void main(String[] args) {

    }

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
}
