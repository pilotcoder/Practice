package org.example;

public class Stringi {
    public static void main(String[] args) {
        String toReverse = new String("kotek");
        String nowy = reverseString(toReverse);
        System.out.println(nowy);

    }
    public static String reverseString(String toReverse){
        String reversed = "";
        for (int i = toReverse.length()-1; i >= 0; i--) {
            char temp = toReverse.charAt(i);
            reversed = reversed + temp;

        }
        return reversed;


    }

}
