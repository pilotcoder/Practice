package org.example;

public class Stringi {
    public static void main(String[] args) {
        String toReverse = new String("kotek");
        String palindrome = new String("lot");
        String nowy = reverseString(toReverse);
        System.out.println(nowy);
        System.out.println(isPalindrome(palindrome));
//        ------
    }
    public static String reverseString(String toReverse){
        String reversed = "";
        for (int i = toReverse.length()-1; i >= 0; i--) {
            char temp = toReverse.charAt(i);
            reversed = reversed + temp;

        }
        return reversed;
    }
//    sprawdzenie palindromu
    public static boolean isPalindrome(String string){
        boolean test = true;
        for (int i = 0; i < (string.length()-1)/2; i++) {
            if (string.charAt(i) != string.charAt(string.length()-1-i) ){
                test = false;
            }

        }
        return test;
    }

}
